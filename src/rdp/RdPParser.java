// $ANTLR 3.3 Nov 30, 2010 12:45:30 /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g 2012-11-16 12:46:34

	package rdp;
	import java.util.ArrayList;
	import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class RdPParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "NUM", "WS", "'#place'", "'mk'", "'('", "'<..>'", "')'", "'#trans'", "'#endtr'", "'{'", "':'", "';'", "'}'"
    };
    public static final int EOF=-1;
    public static final int T__7=7;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int ID=4;
    public static final int NUM=5;
    public static final int WS=6;

    // delegates
    // delegators


        public RdPParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public RdPParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return RdPParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g"; }


    	boolean ok = true;
    	ArrayList<String> place = new ArrayList<String>();
    	ArrayList<Integer> marquage = new ArrayList<Integer>();
    	ArrayList<String> transition = new ArrayList<String>();
    	ArrayList<ArrayList<Integer>> pre = new ArrayList<ArrayList<Integer>>();
    	ArrayList<ArrayList<Integer>> post = new ArrayList<ArrayList<Integer>>();
    	HashMap<String,Integer> tablePlace = new HashMap<String,Integer>();
    	HashMap<String,Integer> tableTransition = new HashMap<String,Integer>();



    // $ANTLR start "start"
    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:23:1: start : ( place | transition )* ;
    public final void start() throws RecognitionException {
        try {
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:23:8: ( ( place | transition )* )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:23:10: ( place | transition )*
            {
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:23:10: ( place | transition )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==7) ) {
                    alt1=1;
                }
                else if ( (LA1_0==12) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:23:11: place
            	    {
            	    pushFollow(FOLLOW_place_in_start33);
            	    place();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:23:19: transition
            	    {
            	    pushFollow(FOLLOW_transition_in_start37);
            	    transition();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "start"

    public static class place_return extends ParserRuleReturnScope {
        public String nom;
        public int m;
    };

    // $ANTLR start "place"
    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:26:1: place returns [String nom, int m] : '#place' ID ( ( NUM )? 'mk' '(' '<..>' ')' )? ;
    public final RdPParser.place_return place() throws RecognitionException {
        RdPParser.place_return retval = new RdPParser.place_return();
        retval.start = input.LT(1);

        Token ID1=null;

        try {
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:27:2: ( '#place' ID ( ( NUM )? 'mk' '(' '<..>' ')' )? )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:27:4: '#place' ID ( ( NUM )? 'mk' '(' '<..>' ')' )?
            {
            match(input,7,FOLLOW_7_in_place55); 
            ID1=(Token)match(input,ID,FOLLOW_ID_in_place57); 

            		retval.nom = (ID1!=null?ID1.getText():null);
            		retval.m = 0;
            	
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:32:2: ( ( NUM )? 'mk' '(' '<..>' ')' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==NUM||LA3_0==8) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:32:3: ( NUM )? 'mk' '(' '<..>' ')'
                    {
                    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:32:3: ( NUM )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==NUM) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:32:3: NUM
                            {
                            match(input,NUM,FOLLOW_NUM_in_place65); 

                            }
                            break;

                    }

                    match(input,8,FOLLOW_8_in_place68); 
                    match(input,9,FOLLOW_9_in_place70); 
                    match(input,10,FOLLOW_10_in_place72); 
                    match(input,11,FOLLOW_11_in_place74); 
                     
                    		retval.m = 1;
                    	

                    }
                    break;

            }


            		if (tablePlace.get(retval.nom) == null) {
            			place.add(retval.nom);
            			marquage.add(retval.m);
            			tablePlace.put(retval.nom,tablePlace.size());
            		}
            		else {
            			ok = false;
            			System.err.println((ID1!=null?ID1.getLine():0) + ":" +(ID1!=null?ID1.getCharPositionInLine():0) + " Place \"" + (ID1!=null?ID1.getText():null) + "\" deja definie ");
            		}
            	

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "place"


    // $ANTLR start "transition"
    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:51:1: transition : '#trans' id= ID in= ID v1= vecteur out= ID v2= vecteur '#endtr' ;
    public final void transition() throws RecognitionException {
        Token id=null;
        Token in=null;
        Token out=null;
        ArrayList<Integer> v1 = null;

        ArrayList<Integer> v2 = null;


        try {
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:51:13: ( '#trans' id= ID in= ID v1= vecteur out= ID v2= vecteur '#endtr' )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:51:14: '#trans' id= ID in= ID v1= vecteur out= ID v2= vecteur '#endtr'
            {
            match(input,12,FOLLOW_12_in_transition96); 
            id=(Token)match(input,ID,FOLLOW_ID_in_transition100); 
            in=(Token)match(input,ID,FOLLOW_ID_in_transition104); 
            pushFollow(FOLLOW_vecteur_in_transition108);
            v1=vecteur();

            state._fsp--;

            out=(Token)match(input,ID,FOLLOW_ID_in_transition112); 
            pushFollow(FOLLOW_vecteur_in_transition116);
            v2=vecteur();

            state._fsp--;

            match(input,13,FOLLOW_13_in_transition118); 

            		if (!(in!=null?in.getText():null).equals("in")) {
            			ok = false;
            			System.err.println((in!=null?in.getLine():0) + ":" +(in!=null?in.getCharPositionInLine():0) + " in attendu");		
            		}

            		if (!(out!=null?out.getText():null).equals("out")) {
            			ok = false;
            			System.err.println((out!=null?out.getLine():0) + ":" +(out!=null?out.getCharPositionInLine():0) + " out attendu");		
            		}

            		if (tableTransition.get((id!=null?id.getText():null)) == null) {
            			transition.add((id!=null?id.getText():null));
            			pre.add(v1);
            			post.add(v2);
            			tableTransition.put((id!=null?id.getText():null),tableTransition.size());
            		}
            		else {
            			ok = false;
            			System.err.println((id!=null?id.getLine():0) + ":" +(id!=null?id.getCharPositionInLine():0) + " Transition \"" + (id!=null?id.getText():null) + "\" deja definie ");
            		}
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "transition"


    // $ANTLR start "vecteur"
    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:76:1: vecteur returns [ArrayList<Integer> vecteur] : '{' ( ID ':' '<..>' ';' )* '}' ;
    public final ArrayList<Integer> vecteur() throws RecognitionException {
        ArrayList<Integer> vecteur = null;

        Token ID2=null;

        try {
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:77:2: ( '{' ( ID ':' '<..>' ';' )* '}' )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:77:4: '{' ( ID ':' '<..>' ';' )* '}'
            {
            match(input,14,FOLLOW_14_in_vecteur138); 

            		vecteur = new ArrayList<Integer>();
            	
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:81:2: ( ID ':' '<..>' ';' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:81:3: ID ':' '<..>' ';'
            	    {
            	    ID2=(Token)match(input,ID,FOLLOW_ID_in_vecteur146); 
            	    match(input,15,FOLLOW_15_in_vecteur148); 
            	    match(input,10,FOLLOW_10_in_vecteur151); 
            	    match(input,16,FOLLOW_16_in_vecteur153); 

            	    		Integer n = tablePlace.get((ID2!=null?ID2.getText():null));
            	    		if (n!=null) {
            	    			if (vecteur.contains(n)) {
            	    				ok = false;
            	    				System.err.println((ID2!=null?ID2.getLine():0) + ":" +(ID2!=null?ID2.getCharPositionInLine():0) + " Place \"" + (ID2!=null?ID2.getText():null) + "\" deja utilisee ");			
            	    			}
            	    			else
            	    				vecteur.add(n);
            	    		}
            	    		else {
            	    			ok = false;
            	    			System.err.println((ID2!=null?ID2.getLine():0) + ":" +(ID2!=null?ID2.getCharPositionInLine():0) + " Place \"" + (ID2!=null?ID2.getText():null) + "\" non definie ");
            	    		}
            	    	

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match(input,17,FOLLOW_17_in_vecteur164); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return vecteur;
    }
    // $ANTLR end "vecteur"

    // Delegated rules


 

    public static final BitSet FOLLOW_place_in_start33 = new BitSet(new long[]{0x0000000000001082L});
    public static final BitSet FOLLOW_transition_in_start37 = new BitSet(new long[]{0x0000000000001082L});
    public static final BitSet FOLLOW_7_in_place55 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_place57 = new BitSet(new long[]{0x0000000000000122L});
    public static final BitSet FOLLOW_NUM_in_place65 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_place68 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_place70 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_place72 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_place74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_transition96 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_transition100 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_transition104 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_vecteur_in_transition108 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_transition112 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_vecteur_in_transition116 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_transition118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_vecteur138 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ID_in_vecteur146 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_vecteur148 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_vecteur151 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_vecteur153 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_vecteur164 = new BitSet(new long[]{0x0000000000000002L});

}