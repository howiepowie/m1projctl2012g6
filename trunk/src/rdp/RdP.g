grammar RdP;

@header {
	package rdp;
	import java.util.ArrayList;
	import java.util.HashMap;
}

@lexer::header{ package rdp; }


@members {
	boolean ok = true;
	ArrayList<String> place = new ArrayList<String>();
	ArrayList<Integer> marquage = new ArrayList<Integer>();
	ArrayList<String> transition = new ArrayList<String>();
	ArrayList<ArrayList<Integer>> pre = new ArrayList<ArrayList<Integer>>();
	ArrayList<ArrayList<Integer>> post = new ArrayList<ArrayList<Integer>>();
	HashMap<String,Integer> tablePlace = new HashMap<String,Integer>();
	HashMap<String,Integer> tableTransition = new HashMap<String,Integer>();
}

start 	: (place | transition)*
	;

place 	returns [String nom, int m]
	: '#place' ID 
	{
		$nom = $ID.text;
		$m = 0;
	}
	(NUM? 'mk' '(' '<..>' ')'
	{ 
		$m = 1;
	}
	)?
	{
		if (tablePlace.get($nom) == null) {
			place.add($nom);
			marquage.add($m);
			tablePlace.put($nom,tablePlace.size());
		}
		else {
			ok = false;
			System.err.println($ID.line + ":" +$ID.pos + " Place \"" + $ID.text + "\" deja definie ");
		}
	} 

	;

transition 	:'#trans' id=ID in=ID v1=vecteur out=ID v2=vecteur '#endtr'
	{
		if (!$in.text.equals("in")) {
			ok = false;
			System.err.println($in.line + ":" +$in.pos + " in attendu");		
		}

		if (!$out.text.equals("out")) {
			ok = false;
			System.err.println($out.line + ":" +$out.pos + " out attendu");		
		}

		if (tableTransition.get($id.text) == null) {
			transition.add($id.text);
			pre.add($v1.vecteur);
			post.add($v2.vecteur);
			tableTransition.put($id.text,tableTransition.size());
		}
		else {
			ok = false;
			System.err.println($id.line + ":" +$id.pos + " Transition \"" + $id.text + "\" deja definie ");
		}
	}
	;	
	
vecteur returns [ArrayList<Integer> vecteur]
	: '{' 
	{
		vecteur = new ArrayList<Integer>();
	}
	(ID ':'  '<..>' ';'
	{
		Integer n = tablePlace.get($ID.text);
		if (n!=null) {
			if (vecteur.contains(n)) {
				ok = false;
				System.err.println($ID.line + ":" +$ID.pos + " Place \"" + $ID.text + "\" deja utilisee ");			
			}
			else
				vecteur.add(n);
		}
		else {
			ok = false;
			System.err.println($ID.line + ":" +$ID.pos + " Place \"" + $ID.text + "\" non definie ");
		}
	}
	
	)* '}'
	;
		
ID	: ('a'..'z'|'A'..'Z'| '_') ('a'..'z'|'A'..'Z'| '_'|'0'..'9')*
	;
	
NUM	:('0'..'9')+
 	;

WS: (' '|'\t'|'\n')+  {$channel=HIDDEN;}
	;	
	
