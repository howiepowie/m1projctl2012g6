// $ANTLR 3.3 Nov 30, 2010 12:45:30 /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g 2012-11-16 11:44:44

	package CTL;
	import java.util.ArrayList;
import java.util.HashMap;


import org.antlr.runtime.*;

import rdp.RdP;

import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CTLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "NUM", "WS", "'||'", "'<->'", "'->'", "'&&'", "'!'", "'E'", "'F'", "'G'", "'X'", "'A'", "'('", "'U'", "')'", "'dead'", "'initial'", "'enable'", "'true'", "'false'"
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
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int ID=4;
    public static final int NUM=5;
    public static final int WS=6;

    // delegates
    // delegators


        public CTLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public CTLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return CTLParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g"; }


    	public boolean ok = true;
    	public String res;
    	RdP rdp;
    	
    	public CTLParser(TokenStream input, RdP rdp) {
            	super(input);
            	this.rdp = rdp;
            }
      



    // $ANTLR start "start"
    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:23:1: start : formule ;
    public final void start() throws RecognitionException {
        String formule1 = null;


        try {
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:23:8: ( formule )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:23:10: formule
            {
            pushFollow(FOLLOW_formule_in_start31);
            formule1=formule();

            state._fsp--;


            		res = formule1;
            	

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


    // $ANTLR start "formule"
    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:29:1: formule returns [String s] : t= term3 ( '||' t1= term3 )* ;
    public final String formule() throws RecognitionException {
        String s = null;

        String t = null;

        String t1 = null;


        try {
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:30:2: (t= term3 ( '||' t1= term3 )* )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:30:4: t= term3 ( '||' t1= term3 )*
            {
            pushFollow(FOLLOW_term3_in_formule52);
            t=term3();

            state._fsp--;


            		s = t;
            	
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:34:2: ( '||' t1= term3 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==7) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:34:3: '||' t1= term3
            	    {
            	    match(input,7,FOLLOW_7_in_formule59); 
            	    pushFollow(FOLLOW_term3_in_formule63);
            	    t1=term3();

            	    state._fsp--;


            	    		s = "|| " + s + " " + t1;
            	    	

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
        return s;
    }
    // $ANTLR end "formule"


    // $ANTLR start "term3"
    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:41:1: term3 returns [String s] : t= term2 ( '<->' t1= term2 )* ;
    public final String term3() throws RecognitionException {
        String s = null;

        String t = null;

        String t1 = null;


        try {
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:42:2: (t= term2 ( '<->' t1= term2 )* )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:42:4: t= term2 ( '<->' t1= term2 )*
            {
            pushFollow(FOLLOW_term2_in_term388);
            t=term2();

            state._fsp--;


            		s = t;
            	
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:46:2: ( '<->' t1= term2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==8) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:46:3: '<->' t1= term2
            	    {
            	    match(input,8,FOLLOW_8_in_term396); 
            	    pushFollow(FOLLOW_term2_in_term3100);
            	    t1=term2();

            	    state._fsp--;


            	    		s = "<-> " + s + " " + t1;
            	    	

            	    }
            	    break;

            	default :
            	    break loop2;
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
        return s;
    }
    // $ANTLR end "term3"


    // $ANTLR start "term2"
    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:53:1: term2 returns [String s] : t= term1 ( '->' t1= term1 )? ;
    public final String term2() throws RecognitionException {
        String s = null;

        String t = null;

        String t1 = null;


        try {
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:54:2: (t= term1 ( '->' t1= term1 )? )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:54:4: t= term1 ( '->' t1= term1 )?
            {
            pushFollow(FOLLOW_term1_in_term2125);
            t=term1();

            state._fsp--;


            		s = t;
            	
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:58:2: ( '->' t1= term1 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==9) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:58:3: '->' t1= term1
                    {
                    match(input,9,FOLLOW_9_in_term2133); 
                    pushFollow(FOLLOW_term1_in_term2137);
                    t1=term1();

                    state._fsp--;


                    		s = "-> " + s + " " + t1;
                    	

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return s;
    }
    // $ANTLR end "term2"


    // $ANTLR start "term1"
    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:65:1: term1 returns [String s] : t= term0 ( '&&' t1= term0 )* ;
    public final String term1() throws RecognitionException {
        String s = null;

        String t = null;

        String t1 = null;


        try {
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:66:2: (t= term0 ( '&&' t1= term0 )* )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:66:4: t= term0 ( '&&' t1= term0 )*
            {
            pushFollow(FOLLOW_term0_in_term1163);
            t=term0();

            state._fsp--;


            		s = t;
            	
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:70:2: ( '&&' t1= term0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==10) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:70:3: '&&' t1= term0
            	    {
            	    match(input,10,FOLLOW_10_in_term1171); 
            	    pushFollow(FOLLOW_term0_in_term1175);
            	    t1=term0();

            	    state._fsp--;


            	    		s = "&& " + s + " " + t1;
            	    	

            	    }
            	    break;

            	default :
            	    break loop4;
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
        return s;
    }
    // $ANTLR end "term1"


    // $ANTLR start "term0"
    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:76:1: term0 returns [String s] : ( atom | '!' atom | 'E' 'F' atom | 'E' 'G' atom | 'E' 'X' atom | 'A' 'F' atom | 'A' 'G' atom | 'A' 'X' atom | 'E' '(' f0= formule 'U' f1= formule ')' | 'A' '(' f0= formule 'U' f1= formule ')' );
    public final String term0() throws RecognitionException {
        String s = null;

        String f0 = null;

        String f1 = null;

        String atom2 = null;

        String atom3 = null;

        String atom4 = null;

        String atom5 = null;

        String atom6 = null;

        String atom7 = null;

        String atom8 = null;

        String atom9 = null;


        try {
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:77:2: ( atom | '!' atom | 'E' 'F' atom | 'E' 'G' atom | 'E' 'X' atom | 'A' 'F' atom | 'A' 'G' atom | 'A' 'X' atom | 'E' '(' f0= formule 'U' f1= formule ')' | 'A' '(' f0= formule 'U' f1= formule ')' )
            int alt5=10;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:77:4: atom
                    {
                    pushFollow(FOLLOW_atom_in_term0199);
                    atom2=atom();

                    state._fsp--;


                    		s = atom2;
                    	

                    }
                    break;
                case 2 :
                    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:81:4: '!' atom
                    {
                    match(input,11,FOLLOW_11_in_term0208); 
                    pushFollow(FOLLOW_atom_in_term0210);
                    atom3=atom();

                    state._fsp--;


                    		s = "! " + atom3;
                    	

                    }
                    break;
                case 3 :
                    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:85:4: 'E' 'F' atom
                    {
                    match(input,12,FOLLOW_12_in_term0219); 
                    match(input,13,FOLLOW_13_in_term0221); 
                    pushFollow(FOLLOW_atom_in_term0223);
                    atom4=atom();

                    state._fsp--;


                    		s = "EF " + atom4;
                    	

                    }
                    break;
                case 4 :
                    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:89:4: 'E' 'G' atom
                    {
                    match(input,12,FOLLOW_12_in_term0232); 
                    match(input,14,FOLLOW_14_in_term0234); 
                    pushFollow(FOLLOW_atom_in_term0236);
                    atom5=atom();

                    state._fsp--;


                    		s = "EG " + atom5;
                    	

                    }
                    break;
                case 5 :
                    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:93:4: 'E' 'X' atom
                    {
                    match(input,12,FOLLOW_12_in_term0245); 
                    match(input,15,FOLLOW_15_in_term0247); 
                    pushFollow(FOLLOW_atom_in_term0249);
                    atom6=atom();

                    state._fsp--;


                    		s = "EX " + atom6;
                    	

                    }
                    break;
                case 6 :
                    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:97:4: 'A' 'F' atom
                    {
                    match(input,16,FOLLOW_16_in_term0257); 
                    match(input,13,FOLLOW_13_in_term0259); 
                    pushFollow(FOLLOW_atom_in_term0261);
                    atom7=atom();

                    state._fsp--;


                    		s = "AF " + atom7;
                    	

                    }
                    break;
                case 7 :
                    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:101:4: 'A' 'G' atom
                    {
                    match(input,16,FOLLOW_16_in_term0270); 
                    match(input,14,FOLLOW_14_in_term0272); 
                    pushFollow(FOLLOW_atom_in_term0274);
                    atom8=atom();

                    state._fsp--;


                    		s = "AG " + atom8;
                    	

                    }
                    break;
                case 8 :
                    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:105:4: 'A' 'X' atom
                    {
                    match(input,16,FOLLOW_16_in_term0283); 
                    match(input,15,FOLLOW_15_in_term0285); 
                    pushFollow(FOLLOW_atom_in_term0287);
                    atom9=atom();

                    state._fsp--;


                    		s = "AX " + atom9;
                    	

                    }
                    break;
                case 9 :
                    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:109:4: 'E' '(' f0= formule 'U' f1= formule ')'
                    {
                    match(input,12,FOLLOW_12_in_term0295); 
                    match(input,17,FOLLOW_17_in_term0297); 
                    pushFollow(FOLLOW_formule_in_term0301);
                    f0=formule();

                    state._fsp--;

                    match(input,18,FOLLOW_18_in_term0303); 
                    pushFollow(FOLLOW_formule_in_term0307);
                    f1=formule();

                    state._fsp--;

                    match(input,19,FOLLOW_19_in_term0309); 

                    		s = "EU " + f0 + " " + f1;
                    	

                    }
                    break;
                case 10 :
                    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:113:4: 'A' '(' f0= formule 'U' f1= formule ')'
                    {
                    match(input,16,FOLLOW_16_in_term0317); 
                    match(input,17,FOLLOW_17_in_term0319); 
                    pushFollow(FOLLOW_formule_in_term0323);
                    f0=formule();

                    state._fsp--;

                    match(input,18,FOLLOW_18_in_term0325); 
                    pushFollow(FOLLOW_formule_in_term0329);
                    f1=formule();

                    state._fsp--;

                    match(input,19,FOLLOW_19_in_term0331); 

                    		s = "AU " + f0 + " " + f1;
                    	

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return s;
    }
    // $ANTLR end "term0"


    // $ANTLR start "atom"
    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:119:1: atom returns [String s] : ( ID | 'dead' | 'initial' | 'enable' '(' ID ')' | 'true' | 'false' | '(' formule ')' );
    public final String atom() throws RecognitionException {
        String s = null;

        Token ID10=null;
        Token ID11=null;
        String formule12 = null;


        try {
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:120:2: ( ID | 'dead' | 'initial' | 'enable' '(' ID ')' | 'true' | 'false' | '(' formule ')' )
            int alt6=7;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case 21:
                {
                alt6=3;
                }
                break;
            case 22:
                {
                alt6=4;
                }
                break;
            case 23:
                {
                alt6=5;
                }
                break;
            case 24:
                {
                alt6=6;
                }
                break;
            case 17:
                {
                alt6=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:120:4: ID
                    {
                    ID10=(Token)match(input,ID,FOLLOW_ID_in_atom350); 

                    		Integer n = rdp.tablePlace.get((ID10!=null?ID10.getText():null).substring(1));
                    		if (n != null)
                    			s = "place " + n;
                    		else {
                    			ok = false;
                    			System.err.println((ID10!=null?ID10.getLine():0) + ":" +(ID10!=null?ID10.getCharPositionInLine():0) + ":" + (ID10!=null?ID10.getText():null).substring(1) + " est une place non definie");				
                    		}
                    	

                    }
                    break;
                case 2 :
                    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:131:4: 'dead'
                    {
                    match(input,20,FOLLOW_20_in_atom360); 

                    		s = "dead";
                    	

                    }
                    break;
                case 3 :
                    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:135:4: 'initial'
                    {
                    match(input,21,FOLLOW_21_in_atom369); 

                    		s = "initial";
                    	

                    }
                    break;
                case 4 :
                    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:139:4: 'enable' '(' ID ')'
                    {
                    match(input,22,FOLLOW_22_in_atom378); 
                    match(input,17,FOLLOW_17_in_atom380); 
                    ID11=(Token)match(input,ID,FOLLOW_ID_in_atom382); 
                    match(input,19,FOLLOW_19_in_atom384); 

                    		Integer n = rdp.tableTransition.get((ID11!=null?ID11.getText():null).substring(1));
                    		if (n != null)
                    		s = "enable transition " + n;
                    		else {
                    			ok = false;
                    			System.err.println((ID11!=null?ID11.getLine():0) + ":" +(ID11!=null?ID11.getCharPositionInLine():0) + ":" + (ID11!=null?ID11.getText():null).substring(1) + " est une transition non definie");				
                    		}
                    	

                    }
                    break;
                case 5 :
                    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:149:4: 'true'
                    {
                    match(input,23,FOLLOW_23_in_atom393); 

                    		s = "true";
                    	

                    }
                    break;
                case 6 :
                    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:153:4: 'false'
                    {
                    match(input,24,FOLLOW_24_in_atom402); 

                    		s = "false";
                    	

                    }
                    break;
                case 7 :
                    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:157:4: '(' formule ')'
                    {
                    match(input,17,FOLLOW_17_in_atom410); 
                    pushFollow(FOLLOW_formule_in_atom412);
                    formule12=formule();

                    state._fsp--;

                    match(input,19,FOLLOW_19_in_atom414); 

                    		s = formule12;
                    	

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return s;
    }
    // $ANTLR end "atom"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\15\uffff";
    static final String DFA5_eofS =
        "\15\uffff";
    static final String DFA5_minS =
        "\1\4\2\uffff\2\15\10\uffff";
    static final String DFA5_maxS =
        "\1\30\2\uffff\2\21\10\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\2\2\uffff\1\3\1\4\1\5\1\11\1\6\1\7\1\10\1\12";
    static final String DFA5_specialS =
        "\15\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\6\uffff\1\2\1\3\3\uffff\1\4\1\1\2\uffff\5\1",
            "",
            "",
            "\1\5\1\6\1\7\1\uffff\1\10",
            "\1\11\1\12\1\13\1\uffff\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "76:1: term0 returns [String s] : ( atom | '!' atom | 'E' 'F' atom | 'E' 'G' atom | 'E' 'X' atom | 'A' 'F' atom | 'A' 'G' atom | 'A' 'X' atom | 'E' '(' f0= formule 'U' f1= formule ')' | 'A' '(' f0= formule 'U' f1= formule ')' );";
        }
    }
 

    public static final BitSet FOLLOW_formule_in_start31 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term3_in_formule52 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_7_in_formule59 = new BitSet(new long[]{0x0000000001F31810L});
    public static final BitSet FOLLOW_term3_in_formule63 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_term2_in_term388 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_8_in_term396 = new BitSet(new long[]{0x0000000001F31810L});
    public static final BitSet FOLLOW_term2_in_term3100 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_term1_in_term2125 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_9_in_term2133 = new BitSet(new long[]{0x0000000001F31810L});
    public static final BitSet FOLLOW_term1_in_term2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term0_in_term1163 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_term1171 = new BitSet(new long[]{0x0000000001F31810L});
    public static final BitSet FOLLOW_term0_in_term1175 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_atom_in_term0199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_term0208 = new BitSet(new long[]{0x0000000001F20010L});
    public static final BitSet FOLLOW_atom_in_term0210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_term0219 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_term0221 = new BitSet(new long[]{0x0000000001F20010L});
    public static final BitSet FOLLOW_atom_in_term0223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_term0232 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_term0234 = new BitSet(new long[]{0x0000000001F20010L});
    public static final BitSet FOLLOW_atom_in_term0236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_term0245 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_term0247 = new BitSet(new long[]{0x0000000001F20010L});
    public static final BitSet FOLLOW_atom_in_term0249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_term0257 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_term0259 = new BitSet(new long[]{0x0000000001F20010L});
    public static final BitSet FOLLOW_atom_in_term0261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_term0270 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_term0272 = new BitSet(new long[]{0x0000000001F20010L});
    public static final BitSet FOLLOW_atom_in_term0274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_term0283 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_term0285 = new BitSet(new long[]{0x0000000001F20010L});
    public static final BitSet FOLLOW_atom_in_term0287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_term0295 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_term0297 = new BitSet(new long[]{0x0000000001F31810L});
    public static final BitSet FOLLOW_formule_in_term0301 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_term0303 = new BitSet(new long[]{0x0000000001F31810L});
    public static final BitSet FOLLOW_formule_in_term0307 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_term0309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_term0317 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_term0319 = new BitSet(new long[]{0x0000000001F31810L});
    public static final BitSet FOLLOW_formule_in_term0323 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_term0325 = new BitSet(new long[]{0x0000000001F31810L});
    public static final BitSet FOLLOW_formule_in_term0329 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_term0331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_atom360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_atom369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_atom378 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_atom380 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_atom382 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_atom384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_atom393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_atom402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_atom410 = new BitSet(new long[]{0x0000000001F31810L});
    public static final BitSet FOLLOW_formule_in_atom412 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_atom414 = new BitSet(new long[]{0x0000000000000002L});

}