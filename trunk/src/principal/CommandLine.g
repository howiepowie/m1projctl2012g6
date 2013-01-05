grammar CommandLine;

options{
	output = AST;
	language = Java;
}

tokens{
	NEG;
	EF;
	EG;
	EX;
	AF;
	AG;
	AX;
	EU;
	AU;
	DEAD;
	INITIAL;
	ENABLE;
	TRUE;
	FALSE;
}

@header{
	package principal;
}

@lexer::header{
	package principal;
}

@members{
	private ICallback callback;
	private boolean programDeclDone;
	private boolean usesDeclAllowed;
	
	public CommandLineParser(final ICallback callback) {
		super(null);
		this.callback = callback;
		programDeclDone = false;
		usesDeclAllowed = true;
	}
	
	private void onLoad(final String filename) {
		callback.load(filename);
	}
	
	private void onGraphe() {
		callback.graphe();
	}
	
	private void onLook(final int etat) {
		callback.look(etat);
	}
	
	private void onSucc(final int etat) {
		callback.succ(etat);
	}
	
	private void onToDot(final String filename) {
		callback.toDot(filename);
	}
	
	private void onCtl(final Tree formule) {
		callback.ctl(formule);
	}
	
	private void onCtl(final Tree formule, final int etat) {
		callback.ctl(formule, etat);
	}
	
	private void onCtlToDot(final Tree formule, final String filename) {
		callback.ctlToDot(formule, filename);
	}
	
	private void onJustifie(final Tree formule, final int etat) {
		callback.justifie(formule, etat);
	}
	
	private void onJustifieToDot(final Tree formule, final int etat, final String filename) {
		callback.justifieToDot(formule, etat, filename);
	}
	
	private void onStop() {
		callback.stop();
	}

	public void process(String source) throws Exception {
		ANTLRStringStream in = new ANTLRStringStream(source);
		CommandLineLexer lexer = new CommandLineLexer(in);
 		CommonTokenStream tokens = new CommonTokenStream(lexer);
 		super.setTokenStream(tokens);
 		this.start();
	} 
	
	private Tree formule(final Object f) {
		return (Tree) f;
	}
	
	private int etat(final String e) {
		return Integer.parseInt(e);
	}
		
	public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
		String hdr = getErrorHeader(e);
		String msg = getErrorMessage(e, tokenNames);
		System.out.println(hdr + " " + msg);
	}
}

start
	: instruction (';' { System.out.println("\n"); } instruction)*
	;

instruction
	: load
	| graphe
	| look
	| succ
	| todot
	| ctl
	| ctltodot
	| justifie
	| justifietodot
	| stop
	;

load
	: 'load' p1=file_net { onLoad($p1.text); }
	;
	
graphe
	: 'graphe' { onGraphe(); }
	;
	
look
	: 'look' p1=etat {onLook(etat($p1.text)); }
	;
	
succ
	: 'succ' p1=etat { onSucc(etat($p1.text)); }
	;
	
todot
	: 'todot' p1=file_dot { onToDot($p1.text); }
	;
	
ctl
	: 'ctl' p1=formule (
		p2=etat { onCtl(formule($p1.tree), etat($p2.text)); }
		| { onCtl(formule($p1.tree)); }
	)
	;
	
ctltodot
	: 'ctltodot' p1=formule p2=file_dot { onCtlToDot(formule($p1.tree), $p2.text); }
	;
	
justifie
	: 'Justifie' p1=formule p2=etat { onJustifie(formule($p1.tree), etat($p2.text)); }
	;
	
justifietodot
	: 'Justifietodot' p1=formule p2=etat p3=file_dot { onJustifieToDot(formule($p1.tree), etat($p2.text), $p3.text); }
	;
	
stop
	: 'stop' { onStop(); }
	;
	
file_net
	: p=STRING_FILE_NET { $p.setText($p.text.substring(1, $p.text.length() - 1)); }
	| filename 'net'
	;
	
file_dot
	: p=STRING_FILE_DOT { $p.setText( $p.text.substring(1, $p.text.length() - 1)); }
	| filename 'dot'
	;
		
filename
	: path_modifier? (LETTER | '_' | '-')+ (
		'.'
		| '/' filename
	)
	;
	
path_modifier
	: './'
	| '../'
	;

/* Formule */
formule
	: term3 (OR^ term3)*
	;

term3
	: term2 (EQUIV^ term2)*
	;

term2
	: term1 (IMPLY^ term1)? 
	;

term1
	: term0 (AND^ term0)* 
	;
	
term0
	: atom
	| '!' atom -> ^(NEG atom)
	| 'EF' atom -> ^(EF atom)
	| 'EG' atom -> ^(EG atom)
	| 'EX' atom -> ^(EX atom)
	| 'AF' atom -> ^(AF atom)
	| 'AG' atom -> ^(AG atom)
	| 'AX' atom -> ^(AX atom)
	| 'E' '(' formule 'U' formule ')' -> ^(EU formule formule)
	| 'A' '(' formule 'U' formule ')' -> ^(AU formule formule)
	;
	
atom
	: p=ATOM { $p.setText($p.text.substring(1)); }
	| 'dead' -> DEAD
	| 'initial' -> INITIAL
	| 'enable' '(' ATOM ')' -> ^(ENABLE ATOM)
	| 'true' -> TRUE
	| 'false' -> FALSE
	| '('! formule ')'!
	;
	
/* Etat */
etat
	: NUMBER+
	;

ATOM			: '$' ('a'..'z'|'A'..'Z'| '_') ('a'..'z'|'A'..'Z'| '_'|'0'..'9')*;
AND			: '&&';
OR			: '||';
IMPLY			: '->';
EQUIV			: '<->';

STRING_FILE_DOT	: '"' (ESC_SEQ | ~('\\'|'"') )+ '.dot' '"';
STRING_FILE_NET	: '"' (ESC_SEQ | ~('\\'|'"') )+ '.net' '"';
    
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
    
NUMBER		: '0' .. '9';
LETTER		: 'a' .. 'z' | 'A' .. 'Z' | NUMBER;
