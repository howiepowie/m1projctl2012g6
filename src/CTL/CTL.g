grammar CTL;

@header {
	package rdp;
	import java.util.ArrayList;
	import java.util.HashMap;
}

@lexer::header{ package rdp; }

@members {
	boolean ok = true;
	String res;
	RdP rdp;
	
	public CTLParser(TokenStream input, RdP rdp) {
        	super(input);
        	this.rdp = rdp;
        }
  
}

start 	: formule
	{
		res = $formule.s;
	}
	;
	
formule	returns [String s]
	: t=term3
	{
		$s = $t.s;
	}
	('||' t1=term3
	{
		$s = "|| " + $s + " " + $t1.s;
	}
	)* 
	;

term3	returns [String s]
	: t=term2 
	{
		$s = $t.s;
	}
	('<->' t1=term2
	{
		$s = "<-> " + $s + " " + $t1.s;
	}
	)* 
	;

term2	returns [String s]
	: t=term1 
	{
		$s = $t.s;
	}
	('->' t1=term1
	{
		$s = "-> " + $s + " " + $t1.s;
	}	
	)? 
	;

term1	returns [String s]
	: t=term0 
	{
		$s = $t.s;
	}
	('&&' t1=term0
	{
		$s = "&& " + $s + " " + $t1.s;
	}	
	)* 
	;
term0 	returns [String s]
	: atom 
	{
		$s = $atom.s;
	}
	| '!' atom 
	{
		$s = "! " + $atom.s;
	}
	| 'E' 'F' atom 
	{
		$s = "EF " + $atom.s;
	}
	| 'E' 'G' atom 
	{
		$s = "EG " + $atom.s;
	}
	| 'E' 'X' atom
	{
		$s = "EX " + $atom.s;
	}
	| 'A' 'F' atom 
	{
		$s = "AF " + $atom.s;
	}
	| 'A' 'G' atom 
	{
		$s = "AG " + $atom.s;
	}
	| 'A' 'X' atom
	{
		$s = "AX " + $atom.s;
	}
	| 'E' '(' f0=formule 'U' f1=formule ')'
	{
		$s = "EU " + $f0.s + " " + $f1.s;
	}
	| 'A' '(' f0=formule 'U' f1=formule ')'
	{
		$s = "AU " + $f0.s + " " + $f1.s;
	}
	;
	
atom	returns [String s]
	: ID 
	{
		Integer n = rdp.tablePlace.get($ID.text.substring(1));
		if (n != null)
			$s = "place " + n;
		else {
			ok = false;
			System.err.println($ID.line + ":" +$ID.pos + ":" + $ID.text.substring(1) + " est une place non definie");				
		}
	}

	| 'dead' 
	{
		$s = "dead";
	}
	| 'initial' 
	{
		$s = "initial";
	}
	| 'enable' '(' ID ')' 
	{
		Integer n = rdp.tableTransition.get($ID.text.substring(1));
		if (n != null)
		$s = "enable transition " + n;
		else {
			ok = false;
			System.err.println($ID.line + ":" +$ID.pos + ":" + $ID.text.substring(1) + " est une transition non definie");				
		}
	}
	| 'true' 
	{
		$s = "true";
	}
	| 'false'
	{
		$s = "false";
	}
	| '(' formule ')'
	{
		$s = $formule.s;
	}
	;
	
ID	: '$' ('a'..'z'|'A'..'Z'| '_') ('a'..'z'|'A'..'Z'| '_'|'0'..'9')*
	;
	
NUM	:('0'..'9')+
 	;

WS: (' '|'\t'|'\n')+  {$channel=HIDDEN;}
	;	
	
