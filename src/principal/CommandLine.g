grammar CommandLine;

options{
	output = AST;
	language = Java;
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
	
	private void onLook(final Object etat) {
		callback.look(etat);
	}
	
	private void onSucc(final Object etat) {
		callback.succ(etat);
	}
	
	private void onToDot(final String filename) {
		callback.toDot(filename);
	}
	
	private void onCtl(final Object formule) {
		callback.ctl(formule);
	}
	
	private void onCtl(final Object formule, final Object etat) {
		callback.ctl(formule, etat);
	}
	
	private void onCtlToDot(final Object formule, final String filename) {
		callback.ctlToDot(formule, filename);
	}
	
	private void onJustifie(final Object formule, final Object etat) {
		callback.justifie(formule, etat);
	}
	
	private void onJustifieToDot(final Object formule, final Object etat, final String filename) {
		callback.justifieToDot(formule, etat, filename);
	}

	public void process(String source) throws Exception {
		ANTLRStringStream in = new ANTLRStringStream(source);
		CommandLineLexer lexer = new CommandLineLexer(in);
 		CommonTokenStream tokens = new CommonTokenStream(lexer);
 		super.setTokenStream(tokens);
 		this.start();
	} 
	
	private Object formule(final Object f) {
		return null;
	}
	
	private Object etat(final Object e) {
		return null;
	}
}

start
	: instruction
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
	;

load
	: LOAD p1=file_net { onLoad($p1.text); }
	;
	
graphe
	: GRAPHE { onGraphe(); }
	;
	
look
	: LOOK p1=etat {onLook(etat($p1.tree)); }
	;
	
succ
	: SUCC p1=etat { onSucc(etat($p1.tree)); }
	;
	
todot
	: TODOT p1=file_dot { onToDot($p1.text); }
	;
	
ctl
	: CTL p1=formule p2=etat { onCtl(formule($p1.tree), etat($p2.tree)); }
	;
	
ctltodot
	: CTLTODOT p1=formule p2=file_dot { onCtlToDot(formule($p1.tree), $p2.text); }
	;
	
justifie
	: JUSTIFIE p1=formule p2=etat { onJustifie(formule($p1.tree), etat($p2.tree)); }
	;
	
justifietodot
	: JUSTIFIETODOT p1=formule p2=etat p3=file_dot { onJustifieToDot(formule($p1.tree), etat($p2.tree), $p3.text); }
	;
	
file_net
	: p=STRING_FILE_NET { $p.setText($p.text.substring(1, $p.text.length() - 1)); }
	| filename EXT_NET
	;
	
file_dot
	: p=STRING_FILE_DOT { $p.setText( $p.text.substring(1, $p.text.length() - 1)); }
	| filename EXT_DOT
	;
		
filename
	: path_modifier?FILENAME (
		'.'
		| '/' filename
	)
	;
	
path_modifier
	: './'
	| '../'
	;
	
formule
	: '='
	;
	
etat
	: '='
	;

LOAD			: 'load';
GRAPHE		: 'graphe';
LOOK			: 'look';
SUCC			: 'succ';
CTLTODOT		: 'ctltodot';
CTL			: 'ctl';
JUSTIFIETODOT	: 'Justifietodot';
JUSTIFIE		: 'Justifie';
TODOT		: 'todot';
EXT_DOT		: 'dot';
EXT_NET		: 'net';
NEWLINE		: ';';

fragment
LETTER		: 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9';

FILENAME		: (LETTER | '_' | '-')+;

STRING_FILE_DOT	: '"' (ESC_SEQ | ~('\\'|'"') )+ '.' EXT_DOT '"';
STRING_FILE_NET	: '"' (ESC_SEQ | ~('\\'|'"') )+ '.' EXT_NET '"';
    
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
