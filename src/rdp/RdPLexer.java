// $ANTLR 3.3 Nov 30, 2010 12:45:30 /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g 2012-11-16 12:46:35
 package rdp; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class RdPLexer extends Lexer {
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

    public RdPLexer() {;} 
    public RdPLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public RdPLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g"; }

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:5:6: ( '#place' )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:5:8: '#place'
            {
            match("#place"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__7"

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:6:6: ( 'mk' )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:6:8: 'mk'
            {
            match("mk"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:7:6: ( '(' )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:7:8: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:8:7: ( '<..>' )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:8:9: '<..>'
            {
            match("<..>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:9:7: ( ')' )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:9:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:10:7: ( '#trans' )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:10:9: '#trans'
            {
            match("#trans"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:11:7: ( '#endtr' )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:11:9: '#endtr'
            {
            match("#endtr"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:12:7: ( '{' )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:13:7: ( ':' )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:13:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:14:7: ( ';' )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:14:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:15:7: ( '}' )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:15:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:101:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:101:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:101:31: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "NUM"
    public final void mNUM() throws RecognitionException {
        try {
            int _type = NUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:104:5: ( ( '0' .. '9' )+ )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:104:6: ( '0' .. '9' )+
            {
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:104:6: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:104:7: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUM"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:107:3: ( ( ' ' | '\\t' | '\\n' )+ )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:107:5: ( ' ' | '\\t' | '\\n' )+
            {
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:107:5: ( ' ' | '\\t' | '\\n' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\t' && LA3_0<='\n')||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:1:8: ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | ID | NUM | WS )
        int alt4=14;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:1:10: T__7
                {
                mT__7(); 

                }
                break;
            case 2 :
                // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:1:15: T__8
                {
                mT__8(); 

                }
                break;
            case 3 :
                // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:1:20: T__9
                {
                mT__9(); 

                }
                break;
            case 4 :
                // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:1:25: T__10
                {
                mT__10(); 

                }
                break;
            case 5 :
                // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:1:31: T__11
                {
                mT__11(); 

                }
                break;
            case 6 :
                // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:1:37: T__12
                {
                mT__12(); 

                }
                break;
            case 7 :
                // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:1:43: T__13
                {
                mT__13(); 

                }
                break;
            case 8 :
                // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:1:49: T__14
                {
                mT__14(); 

                }
                break;
            case 9 :
                // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:1:55: T__15
                {
                mT__15(); 

                }
                break;
            case 10 :
                // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:1:61: T__16
                {
                mT__16(); 

                }
                break;
            case 11 :
                // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:1:67: T__17
                {
                mT__17(); 

                }
                break;
            case 12 :
                // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:1:73: ID
                {
                mID(); 

                }
                break;
            case 13 :
                // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:1:76: NUM
                {
                mNUM(); 

                }
                break;
            case 14 :
                // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/RdP.g:1:80: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\2\uffff\1\12\15\uffff\1\21\1\uffff";
    static final String DFA4_eofS =
        "\22\uffff";
    static final String DFA4_minS =
        "\1\11\1\145\1\153\15\uffff\1\60\1\uffff";
    static final String DFA4_maxS =
        "\1\175\1\164\1\153\15\uffff\1\172\1\uffff";
    static final String DFA4_acceptS =
        "\3\uffff\1\3\1\4\1\5\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\1\1\6"+
        "\1\7\1\uffff\1\2";
    static final String DFA4_specialS =
        "\22\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\14\25\uffff\1\14\2\uffff\1\1\4\uffff\1\3\1\5\6\uffff\12\13"+
            "\1\7\1\10\1\4\4\uffff\32\12\4\uffff\1\12\1\uffff\14\12\1\2\15"+
            "\12\1\6\1\uffff\1\11",
            "\1\17\12\uffff\1\15\3\uffff\1\16",
            "\1\20",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | ID | NUM | WS );";
        }
    }
 

}