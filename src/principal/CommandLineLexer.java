// $ANTLR 3.4 /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g 2012-12-04 15:25:26

	package principal;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class CommandLineLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int CHAR=4;
    public static final int CTL=5;
    public static final int CTLTODOT=6;
    public static final int ESC_SEQ=7;
    public static final int EXPONENT=8;
    public static final int EXT_DOT=9;
    public static final int EXT_NET=10;
    public static final int FILENAME=11;
    public static final int GRAPHE=12;
    public static final int HEX_DIGIT=13;
    public static final int JUSTIFIE=14;
    public static final int JUSTIFIETODOT=15;
    public static final int LETTER=16;
    public static final int LOAD=17;
    public static final int LOOK=18;
    public static final int NEWLINE=19;
    public static final int OCTAL_ESC=20;
    public static final int STRING=21;
    public static final int STRING_FILE_DOT=22;
    public static final int STRING_FILE_NET=23;
    public static final int SUCC=24;
    public static final int TODOT=25;
    public static final int UNICODE_ESC=26;
    public static final int WS=27;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public CommandLineLexer() {} 
    public CommandLineLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CommandLineLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g"; }

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:11:7: ( '.' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:11:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:12:7: ( '../' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:12:9: '../'
            {
            match("../"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:13:7: ( './' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:13:9: './'
            {
            match("./"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:14:7: ( '/' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:14:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:15:7: ( '=' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:15:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "LOAD"
    public final void mLOAD() throws RecognitionException {
        try {
            int _type = LOAD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:167:8: ( 'load' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:167:10: 'load'
            {
            match("load"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LOAD"

    // $ANTLR start "GRAPHE"
    public final void mGRAPHE() throws RecognitionException {
        try {
            int _type = GRAPHE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:168:9: ( 'graphe' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:168:11: 'graphe'
            {
            match("graphe"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GRAPHE"

    // $ANTLR start "LOOK"
    public final void mLOOK() throws RecognitionException {
        try {
            int _type = LOOK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:169:8: ( 'look' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:169:10: 'look'
            {
            match("look"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LOOK"

    // $ANTLR start "SUCC"
    public final void mSUCC() throws RecognitionException {
        try {
            int _type = SUCC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:170:8: ( 'succ' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:170:10: 'succ'
            {
            match("succ"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SUCC"

    // $ANTLR start "CTLTODOT"
    public final void mCTLTODOT() throws RecognitionException {
        try {
            int _type = CTLTODOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:171:11: ( 'ctltodot' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:171:13: 'ctltodot'
            {
            match("ctltodot"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CTLTODOT"

    // $ANTLR start "CTL"
    public final void mCTL() throws RecognitionException {
        try {
            int _type = CTL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:172:7: ( 'ctl' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:172:9: 'ctl'
            {
            match("ctl"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CTL"

    // $ANTLR start "JUSTIFIETODOT"
    public final void mJUSTIFIETODOT() throws RecognitionException {
        try {
            int _type = JUSTIFIETODOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:173:15: ( 'Justifietodot' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:173:17: 'Justifietodot'
            {
            match("Justifietodot"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "JUSTIFIETODOT"

    // $ANTLR start "JUSTIFIE"
    public final void mJUSTIFIE() throws RecognitionException {
        try {
            int _type = JUSTIFIE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:174:11: ( 'Justifie' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:174:13: 'Justifie'
            {
            match("Justifie"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "JUSTIFIE"

    // $ANTLR start "TODOT"
    public final void mTODOT() throws RecognitionException {
        try {
            int _type = TODOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:175:8: ( 'todot' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:175:10: 'todot'
            {
            match("todot"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TODOT"

    // $ANTLR start "EXT_DOT"
    public final void mEXT_DOT() throws RecognitionException {
        try {
            int _type = EXT_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:176:10: ( 'dot' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:176:12: 'dot'
            {
            match("dot"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXT_DOT"

    // $ANTLR start "EXT_NET"
    public final void mEXT_NET() throws RecognitionException {
        try {
            int _type = EXT_NET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:177:10: ( 'net' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:177:12: 'net'
            {
            match("net"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXT_NET"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:178:10: ( ';' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:178:12: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:182:9: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "FILENAME"
    public final void mFILENAME() throws RecognitionException {
        try {
            int _type = FILENAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:183:11: ( ( LETTER | '_' | '-' )+ )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:183:13: ( LETTER | '_' | '-' )+
            {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:183:13: ( LETTER | '_' | '-' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='-'||(LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FILENAME"

    // $ANTLR start "STRING_FILE_DOT"
    public final void mSTRING_FILE_DOT() throws RecognitionException {
        try {
            int _type = STRING_FILE_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:185:17: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )+ '.' EXT_DOT '\"' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:185:19: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )+ '.' EXT_DOT '\"'
            {
            match('\"'); 

            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:185:23: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='.') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='d') ) {
                        int LA2_4 = input.LA(3);

                        if ( (LA2_4=='o') ) {
                            int LA2_5 = input.LA(4);

                            if ( (LA2_5=='t') ) {
                                int LA2_6 = input.LA(5);

                                if ( ((LA2_6 >= '\u0000' && LA2_6 <= '!')||(LA2_6 >= '#' && LA2_6 <= '\uFFFF')) ) {
                                    alt2=2;
                                }


                            }
                            else if ( ((LA2_5 >= '\u0000' && LA2_5 <= '!')||(LA2_5 >= '#' && LA2_5 <= 's')||(LA2_5 >= 'u' && LA2_5 <= '\uFFFF')) ) {
                                alt2=2;
                            }


                        }
                        else if ( ((LA2_4 >= '\u0000' && LA2_4 <= '!')||(LA2_4 >= '#' && LA2_4 <= 'n')||(LA2_4 >= 'p' && LA2_4 <= '\uFFFF')) ) {
                            alt2=2;
                        }


                    }
                    else if ( ((LA2_1 >= '\u0000' && LA2_1 <= '!')||(LA2_1 >= '#' && LA2_1 <= 'c')||(LA2_1 >= 'e' && LA2_1 <= '\uFFFF')) ) {
                        alt2=2;
                    }


                }
                else if ( (LA2_0=='\\') ) {
                    alt2=1;
                }
                else if ( ((LA2_0 >= '\u0000' && LA2_0 <= '!')||(LA2_0 >= '#' && LA2_0 <= '-')||(LA2_0 >= '/' && LA2_0 <= '[')||(LA2_0 >= ']' && LA2_0 <= '\uFFFF')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:185:24: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:185:34: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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


            match('.'); 

            mEXT_DOT(); 


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_FILE_DOT"

    // $ANTLR start "STRING_FILE_NET"
    public final void mSTRING_FILE_NET() throws RecognitionException {
        try {
            int _type = STRING_FILE_NET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:186:17: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )+ '.' EXT_NET '\"' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:186:19: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )+ '.' EXT_NET '\"'
            {
            match('\"'); 

            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:186:23: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='.') ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1=='n') ) {
                        int LA3_4 = input.LA(3);

                        if ( (LA3_4=='e') ) {
                            int LA3_5 = input.LA(4);

                            if ( (LA3_5=='t') ) {
                                int LA3_6 = input.LA(5);

                                if ( ((LA3_6 >= '\u0000' && LA3_6 <= '!')||(LA3_6 >= '#' && LA3_6 <= '\uFFFF')) ) {
                                    alt3=2;
                                }


                            }
                            else if ( ((LA3_5 >= '\u0000' && LA3_5 <= '!')||(LA3_5 >= '#' && LA3_5 <= 's')||(LA3_5 >= 'u' && LA3_5 <= '\uFFFF')) ) {
                                alt3=2;
                            }


                        }
                        else if ( ((LA3_4 >= '\u0000' && LA3_4 <= '!')||(LA3_4 >= '#' && LA3_4 <= 'd')||(LA3_4 >= 'f' && LA3_4 <= '\uFFFF')) ) {
                            alt3=2;
                        }


                    }
                    else if ( ((LA3_1 >= '\u0000' && LA3_1 <= '!')||(LA3_1 >= '#' && LA3_1 <= 'm')||(LA3_1 >= 'o' && LA3_1 <= '\uFFFF')) ) {
                        alt3=2;
                    }


                }
                else if ( (LA3_0=='\\') ) {
                    alt3=1;
                }
                else if ( ((LA3_0 >= '\u0000' && LA3_0 <= '!')||(LA3_0 >= '#' && LA3_0 <= '-')||(LA3_0 >= '/' && LA3_0 <= '[')||(LA3_0 >= ']' && LA3_0 <= '\uFFFF')) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:186:24: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:186:34: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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


            match('.'); 

            mEXT_NET(); 


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_FILE_NET"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:188:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:188:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:196:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:196:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:196:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\\') ) {
                    alt4=1;
                }
                else if ( ((LA4_0 >= '\u0000' && LA4_0 <= '!')||(LA4_0 >= '#' && LA4_0 <= '[')||(LA4_0 >= ']' && LA4_0 <= '\uFFFF')) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:196:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:196:24: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:199:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:199:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 

            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:199:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\\') ) {
                alt5=1;
            }
            else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '&')||(LA5_0 >= '(' && LA5_0 <= '[')||(LA5_0 >= ']' && LA5_0 <= '\uFFFF')) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:199:15: ESC_SEQ
                    {
                    mESC_SEQ(); 


                    }
                    break;
                case 2 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:199:25: ~ ( '\\'' | '\\\\' )
                    {
                    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:204:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:204:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:204:22: ( '+' | '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='+'||LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:204:33: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:207:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:211:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt8=1;
                    }
                    break;
                case 'u':
                    {
                    alt8=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt8=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:211:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 

                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:212:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 


                    }
                    break;
                case 3 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:213:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:218:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\\') ) {
                int LA9_1 = input.LA(2);

                if ( ((LA9_1 >= '0' && LA9_1 <= '3')) ) {
                    int LA9_2 = input.LA(3);

                    if ( ((LA9_2 >= '0' && LA9_2 <= '7')) ) {
                        int LA9_4 = input.LA(4);

                        if ( ((LA9_4 >= '0' && LA9_4 <= '7')) ) {
                            alt9=1;
                        }
                        else {
                            alt9=2;
                        }
                    }
                    else {
                        alt9=3;
                    }
                }
                else if ( ((LA9_1 >= '4' && LA9_1 <= '7')) ) {
                    int LA9_3 = input.LA(3);

                    if ( ((LA9_3 >= '0' && LA9_3 <= '7')) ) {
                        alt9=2;
                    }
                    else {
                        alt9=3;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:218:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:219:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 3 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:220:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:225:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:225:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 

            match('u'); 

            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_ESC"

    public void mTokens() throws RecognitionException {
        // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:8: ( T__28 | T__29 | T__30 | T__31 | T__32 | LOAD | GRAPHE | LOOK | SUCC | CTLTODOT | CTL | JUSTIFIETODOT | JUSTIFIE | TODOT | EXT_DOT | EXT_NET | NEWLINE | FILENAME | STRING_FILE_DOT | STRING_FILE_NET | WS | STRING | CHAR )
        int alt10=23;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:10: T__28
                {
                mT__28(); 


                }
                break;
            case 2 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:16: T__29
                {
                mT__29(); 


                }
                break;
            case 3 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:22: T__30
                {
                mT__30(); 


                }
                break;
            case 4 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:28: T__31
                {
                mT__31(); 


                }
                break;
            case 5 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:34: T__32
                {
                mT__32(); 


                }
                break;
            case 6 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:40: LOAD
                {
                mLOAD(); 


                }
                break;
            case 7 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:45: GRAPHE
                {
                mGRAPHE(); 


                }
                break;
            case 8 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:52: LOOK
                {
                mLOOK(); 


                }
                break;
            case 9 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:57: SUCC
                {
                mSUCC(); 


                }
                break;
            case 10 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:62: CTLTODOT
                {
                mCTLTODOT(); 


                }
                break;
            case 11 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:71: CTL
                {
                mCTL(); 


                }
                break;
            case 12 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:75: JUSTIFIETODOT
                {
                mJUSTIFIETODOT(); 


                }
                break;
            case 13 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:89: JUSTIFIE
                {
                mJUSTIFIE(); 


                }
                break;
            case 14 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:98: TODOT
                {
                mTODOT(); 


                }
                break;
            case 15 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:104: EXT_DOT
                {
                mEXT_DOT(); 


                }
                break;
            case 16 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:112: EXT_NET
                {
                mEXT_NET(); 


                }
                break;
            case 17 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:120: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 18 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:128: FILENAME
                {
                mFILENAME(); 


                }
                break;
            case 19 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:137: STRING_FILE_DOT
                {
                mSTRING_FILE_DOT(); 


                }
                break;
            case 20 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:153: STRING_FILE_NET
                {
                mSTRING_FILE_NET(); 


                }
                break;
            case 21 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:169: WS
                {
                mWS(); 


                }
                break;
            case 22 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:172: STRING
                {
                mSTRING(); 


                }
                break;
            case 23 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:179: CHAR
                {
                mCHAR(); 


                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\uffff\1\23\2\uffff\10\15\10\uffff\10\15\3\uffff\4\15\1\62\2\15"+
        "\1\65\1\66\5\uffff\1\74\1\75\1\15\1\77\1\15\1\uffff\2\15\11\uffff"+
        "\1\15\1\uffff\2\15\1\112\4\uffff\1\116\2\15\5\uffff\2\15\3\uffff"+
        "\1\130\1\132\3\uffff\1\15\1\uffff\3\15\1\137\1\uffff";
    static final String DFA10_eofS =
        "\140\uffff";
    static final String DFA10_minS =
        "\1\11\1\56\2\uffff\1\157\1\162\1\165\1\164\1\165\2\157\1\145\2\uffff"+
        "\1\0\5\uffff\2\141\1\143\1\154\1\163\1\144\2\164\1\42\1\0\1\uffff"+
        "\1\144\1\153\1\160\1\143\1\55\1\164\1\157\2\55\1\0\1\60\3\0\2\55"+
        "\1\150\1\55\1\157\1\uffff\1\151\1\164\2\uffff\1\60\4\0\2\uffff\1"+
        "\145\1\uffff\1\144\1\146\1\55\1\60\3\0\1\55\1\157\1\151\1\uffff"+
        "\1\60\2\0\1\uffff\1\164\1\145\1\0\2\uffff\2\55\3\uffff\1\157\1\uffff"+
        "\1\144\1\157\1\164\1\55\1\uffff";
    static final String DFA10_maxS =
        "\1\172\1\57\2\uffff\1\157\1\162\1\165\1\164\1\165\2\157\1\145\2"+
        "\uffff\1\uffff\5\uffff\1\157\1\141\1\143\1\154\1\163\1\144\2\164"+
        "\1\165\1\uffff\1\uffff\1\144\1\153\1\160\1\143\1\172\1\164\1\157"+
        "\2\172\1\uffff\1\146\3\uffff\2\172\1\150\1\172\1\157\1\uffff\1\151"+
        "\1\164\2\uffff\1\146\4\uffff\2\uffff\1\145\1\uffff\1\144\1\146\1"+
        "\172\1\146\3\uffff\1\172\1\157\1\151\1\uffff\1\146\2\uffff\1\uffff"+
        "\1\164\1\145\1\uffff\2\uffff\2\172\3\uffff\1\157\1\uffff\1\144\1"+
        "\157\1\164\1\172\1\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\4\1\5\10\uffff\1\21\1\22\1\uffff\1\25\1\27\1\2\1\3\1"+
        "\1\12\uffff\1\26\23\uffff\1\13\2\uffff\1\17\1\20\5\uffff\1\6\1\10"+
        "\1\uffff\1\11\12\uffff\1\16\3\uffff\1\7\3\uffff\1\23\1\24\2\uffff"+
        "\1\23\1\24\1\12\1\uffff\1\15\4\uffff\1\14";
    static final String DFA10_specialS =
        "\16\uffff\1\2\16\uffff\1\12\12\uffff\1\7\1\uffff\1\10\1\16\1\13"+
        "\13\uffff\1\0\1\17\1\6\1\4\10\uffff\1\14\1\5\1\3\5\uffff\1\15\1"+
        "\1\3\uffff\1\11\16\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\17\2\uffff\1\17\22\uffff\1\17\1\uffff\1\16\4\uffff\1\20\5"+
            "\uffff\1\15\1\1\1\2\12\15\1\uffff\1\14\1\uffff\1\3\3\uffff\11"+
            "\15\1\10\20\15\4\uffff\1\15\1\uffff\2\15\1\7\1\12\2\15\1\5\4"+
            "\15\1\4\1\15\1\13\4\15\1\6\1\11\6\15",
            "\1\21\1\22",
            "",
            "",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "",
            "",
            "\42\35\1\36\71\35\1\34\uffa3\35",
            "",
            "",
            "",
            "",
            "",
            "\1\37\15\uffff\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50\4\uffff\1\50\10\uffff\4\52\4\53\44\uffff\1\50\5\uffff"+
            "\1\50\3\uffff\1\50\7\uffff\1\50\3\uffff\1\50\1\uffff\1\50\1"+
            "\51",
            "\42\35\1\36\13\35\1\54\55\35\1\34\uffa3\35",
            "",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\15\2\uffff\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\23\15"+
            "\1\61\6\15",
            "\1\63",
            "\1\64",
            "\1\15\2\uffff\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\1\15\2\uffff\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\42\35\1\36\13\35\1\54\55\35\1\34\uffa3\35",
            "\12\67\7\uffff\6\67\32\uffff\6\67",
            "\42\35\1\36\13\35\1\54\1\35\10\70\44\35\1\34\uffa3\35",
            "\42\35\1\36\13\35\1\54\1\35\10\71\44\35\1\34\uffa3\35",
            "\42\35\1\36\13\35\1\54\55\35\1\34\7\35\1\72\11\35\1\73\uff91"+
            "\35",
            "\1\15\2\uffff\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\1\15\2\uffff\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\1\76",
            "\1\15\2\uffff\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\1\100",
            "",
            "\1\101",
            "\1\102",
            "",
            "",
            "\12\103\7\uffff\6\103\32\uffff\6\103",
            "\42\35\1\36\13\35\1\54\1\35\10\104\44\35\1\34\uffa3\35",
            "\42\35\1\36\13\35\1\54\55\35\1\34\uffa3\35",
            "\42\35\1\36\13\35\1\54\55\35\1\34\22\35\1\105\uff90\35",
            "\42\35\1\36\13\35\1\54\55\35\1\34\10\35\1\106\uff9a\35",
            "",
            "",
            "\1\107",
            "",
            "\1\110",
            "\1\111",
            "\1\15\2\uffff\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\12\113\7\uffff\6\113\32\uffff\6\113",
            "\42\35\1\36\13\35\1\54\55\35\1\34\uffa3\35",
            "\42\35\1\36\13\35\1\54\55\35\1\34\27\35\1\114\uff8b\35",
            "\42\35\1\36\13\35\1\54\55\35\1\34\27\35\1\115\uff8b\35",
            "\1\15\2\uffff\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\1\117",
            "\1\120",
            "",
            "\12\121\7\uffff\6\121\32\uffff\6\121",
            "\42\35\1\122\13\35\1\54\55\35\1\34\uffa3\35",
            "\42\35\1\123\13\35\1\54\55\35\1\34\uffa3\35",
            "",
            "\1\124",
            "\1\125",
            "\42\35\1\36\13\35\1\54\55\35\1\34\uffa3\35",
            "",
            "",
            "\1\15\2\uffff\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\1\15\2\uffff\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\23\15"+
            "\1\131\6\15",
            "",
            "",
            "",
            "\1\133",
            "",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\15\2\uffff\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__28 | T__29 | T__30 | T__31 | T__32 | LOAD | GRAPHE | LOOK | SUCC | CTLTODOT | CTL | JUSTIFIETODOT | JUSTIFIE | TODOT | EXT_DOT | EXT_NET | NEWLINE | FILENAME | STRING_FILE_DOT | STRING_FILE_NET | WS | STRING | CHAR );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_56 = input.LA(1);

                        s = -1;
                        if ( ((LA10_56 >= '0' && LA10_56 <= '7')) ) {s = 68;}

                        else if ( (LA10_56=='.') ) {s = 44;}

                        else if ( (LA10_56=='\\') ) {s = 28;}

                        else if ( ((LA10_56 >= '\u0000' && LA10_56 <= '!')||(LA10_56 >= '#' && LA10_56 <= '-')||LA10_56=='/'||(LA10_56 >= '8' && LA10_56 <= '[')||(LA10_56 >= ']' && LA10_56 <= '\uFFFF')) ) {s = 29;}

                        else if ( (LA10_56=='\"') ) {s = 30;}

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA10_77 = input.LA(1);

                        s = -1;
                        if ( (LA10_77=='\"') ) {s = 83;}

                        else if ( (LA10_77=='.') ) {s = 44;}

                        else if ( (LA10_77=='\\') ) {s = 28;}

                        else if ( ((LA10_77 >= '\u0000' && LA10_77 <= '!')||(LA10_77 >= '#' && LA10_77 <= '-')||(LA10_77 >= '/' && LA10_77 <= '[')||(LA10_77 >= ']' && LA10_77 <= '\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA10_14 = input.LA(1);

                        s = -1;
                        if ( (LA10_14=='\\') ) {s = 28;}

                        else if ( ((LA10_14 >= '\u0000' && LA10_14 <= '!')||(LA10_14 >= '#' && LA10_14 <= '[')||(LA10_14 >= ']' && LA10_14 <= '\uFFFF')) ) {s = 29;}

                        else if ( (LA10_14=='\"') ) {s = 30;}

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA10_70 = input.LA(1);

                        s = -1;
                        if ( (LA10_70=='t') ) {s = 77;}

                        else if ( (LA10_70=='.') ) {s = 44;}

                        else if ( (LA10_70=='\\') ) {s = 28;}

                        else if ( ((LA10_70 >= '\u0000' && LA10_70 <= '!')||(LA10_70 >= '#' && LA10_70 <= '-')||(LA10_70 >= '/' && LA10_70 <= '[')||(LA10_70 >= ']' && LA10_70 <= 's')||(LA10_70 >= 'u' && LA10_70 <= '\uFFFF')) ) {s = 29;}

                        else if ( (LA10_70=='\"') ) {s = 30;}

                        if ( s>=0 ) return s;
                        break;

                    case 4 : 
                        int LA10_59 = input.LA(1);

                        s = -1;
                        if ( (LA10_59=='e') ) {s = 70;}

                        else if ( (LA10_59=='.') ) {s = 44;}

                        else if ( (LA10_59=='\\') ) {s = 28;}

                        else if ( ((LA10_59 >= '\u0000' && LA10_59 <= '!')||(LA10_59 >= '#' && LA10_59 <= '-')||(LA10_59 >= '/' && LA10_59 <= '[')||(LA10_59 >= ']' && LA10_59 <= 'd')||(LA10_59 >= 'f' && LA10_59 <= '\uFFFF')) ) {s = 29;}

                        else if ( (LA10_59=='\"') ) {s = 30;}

                        if ( s>=0 ) return s;
                        break;

                    case 5 : 
                        int LA10_69 = input.LA(1);

                        s = -1;
                        if ( (LA10_69=='t') ) {s = 76;}

                        else if ( (LA10_69=='.') ) {s = 44;}

                        else if ( (LA10_69=='\\') ) {s = 28;}

                        else if ( ((LA10_69 >= '\u0000' && LA10_69 <= '!')||(LA10_69 >= '#' && LA10_69 <= '-')||(LA10_69 >= '/' && LA10_69 <= '[')||(LA10_69 >= ']' && LA10_69 <= 's')||(LA10_69 >= 'u' && LA10_69 <= '\uFFFF')) ) {s = 29;}

                        else if ( (LA10_69=='\"') ) {s = 30;}

                        if ( s>=0 ) return s;
                        break;

                    case 6 : 
                        int LA10_58 = input.LA(1);

                        s = -1;
                        if ( (LA10_58=='o') ) {s = 69;}

                        else if ( (LA10_58=='.') ) {s = 44;}

                        else if ( (LA10_58=='\\') ) {s = 28;}

                        else if ( ((LA10_58 >= '\u0000' && LA10_58 <= '!')||(LA10_58 >= '#' && LA10_58 <= '-')||(LA10_58 >= '/' && LA10_58 <= '[')||(LA10_58 >= ']' && LA10_58 <= 'n')||(LA10_58 >= 'p' && LA10_58 <= '\uFFFF')) ) {s = 29;}

                        else if ( (LA10_58=='\"') ) {s = 30;}

                        if ( s>=0 ) return s;
                        break;

                    case 7 : 
                        int LA10_40 = input.LA(1);

                        s = -1;
                        if ( (LA10_40=='.') ) {s = 44;}

                        else if ( (LA10_40=='\\') ) {s = 28;}

                        else if ( ((LA10_40 >= '\u0000' && LA10_40 <= '!')||(LA10_40 >= '#' && LA10_40 <= '-')||(LA10_40 >= '/' && LA10_40 <= '[')||(LA10_40 >= ']' && LA10_40 <= '\uFFFF')) ) {s = 29;}

                        else if ( (LA10_40=='\"') ) {s = 30;}

                        if ( s>=0 ) return s;
                        break;

                    case 8 : 
                        int LA10_42 = input.LA(1);

                        s = -1;
                        if ( ((LA10_42 >= '0' && LA10_42 <= '7')) ) {s = 56;}

                        else if ( (LA10_42=='.') ) {s = 44;}

                        else if ( (LA10_42=='\\') ) {s = 28;}

                        else if ( ((LA10_42 >= '\u0000' && LA10_42 <= '!')||(LA10_42 >= '#' && LA10_42 <= '-')||LA10_42=='/'||(LA10_42 >= '8' && LA10_42 <= '[')||(LA10_42 >= ']' && LA10_42 <= '\uFFFF')) ) {s = 29;}

                        else if ( (LA10_42=='\"') ) {s = 30;}

                        if ( s>=0 ) return s;
                        break;

                    case 9 : 
                        int LA10_81 = input.LA(1);

                        s = -1;
                        if ( (LA10_81=='.') ) {s = 44;}

                        else if ( (LA10_81=='\\') ) {s = 28;}

                        else if ( ((LA10_81 >= '\u0000' && LA10_81 <= '!')||(LA10_81 >= '#' && LA10_81 <= '-')||(LA10_81 >= '/' && LA10_81 <= '[')||(LA10_81 >= ']' && LA10_81 <= '\uFFFF')) ) {s = 29;}

                        else if ( (LA10_81=='\"') ) {s = 30;}

                        if ( s>=0 ) return s;
                        break;

                    case 10 : 
                        int LA10_29 = input.LA(1);

                        s = -1;
                        if ( (LA10_29=='.') ) {s = 44;}

                        else if ( (LA10_29=='\\') ) {s = 28;}

                        else if ( ((LA10_29 >= '\u0000' && LA10_29 <= '!')||(LA10_29 >= '#' && LA10_29 <= '-')||(LA10_29 >= '/' && LA10_29 <= '[')||(LA10_29 >= ']' && LA10_29 <= '\uFFFF')) ) {s = 29;}

                        else if ( (LA10_29=='\"') ) {s = 30;}

                        if ( s>=0 ) return s;
                        break;

                    case 11 : 
                        int LA10_44 = input.LA(1);

                        s = -1;
                        if ( (LA10_44=='d') ) {s = 58;}

                        else if ( (LA10_44=='.') ) {s = 44;}

                        else if ( (LA10_44=='\\') ) {s = 28;}

                        else if ( (LA10_44=='n') ) {s = 59;}

                        else if ( ((LA10_44 >= '\u0000' && LA10_44 <= '!')||(LA10_44 >= '#' && LA10_44 <= '-')||(LA10_44 >= '/' && LA10_44 <= '[')||(LA10_44 >= ']' && LA10_44 <= 'c')||(LA10_44 >= 'e' && LA10_44 <= 'm')||(LA10_44 >= 'o' && LA10_44 <= '\uFFFF')) ) {s = 29;}

                        else if ( (LA10_44=='\"') ) {s = 30;}

                        if ( s>=0 ) return s;
                        break;

                    case 12 : 
                        int LA10_68 = input.LA(1);

                        s = -1;
                        if ( (LA10_68=='.') ) {s = 44;}

                        else if ( (LA10_68=='\\') ) {s = 28;}

                        else if ( ((LA10_68 >= '\u0000' && LA10_68 <= '!')||(LA10_68 >= '#' && LA10_68 <= '-')||(LA10_68 >= '/' && LA10_68 <= '[')||(LA10_68 >= ']' && LA10_68 <= '\uFFFF')) ) {s = 29;}

                        else if ( (LA10_68=='\"') ) {s = 30;}

                        if ( s>=0 ) return s;
                        break;

                    case 13 : 
                        int LA10_76 = input.LA(1);

                        s = -1;
                        if ( (LA10_76=='\"') ) {s = 82;}

                        else if ( (LA10_76=='.') ) {s = 44;}

                        else if ( (LA10_76=='\\') ) {s = 28;}

                        else if ( ((LA10_76 >= '\u0000' && LA10_76 <= '!')||(LA10_76 >= '#' && LA10_76 <= '-')||(LA10_76 >= '/' && LA10_76 <= '[')||(LA10_76 >= ']' && LA10_76 <= '\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;

                    case 14 : 
                        int LA10_43 = input.LA(1);

                        s = -1;
                        if ( ((LA10_43 >= '0' && LA10_43 <= '7')) ) {s = 57;}

                        else if ( (LA10_43=='.') ) {s = 44;}

                        else if ( (LA10_43=='\\') ) {s = 28;}

                        else if ( ((LA10_43 >= '\u0000' && LA10_43 <= '!')||(LA10_43 >= '#' && LA10_43 <= '-')||LA10_43=='/'||(LA10_43 >= '8' && LA10_43 <= '[')||(LA10_43 >= ']' && LA10_43 <= '\uFFFF')) ) {s = 29;}

                        else if ( (LA10_43=='\"') ) {s = 30;}

                        if ( s>=0 ) return s;
                        break;

                    case 15 : 
                        int LA10_57 = input.LA(1);

                        s = -1;
                        if ( (LA10_57=='.') ) {s = 44;}

                        else if ( (LA10_57=='\\') ) {s = 28;}

                        else if ( ((LA10_57 >= '\u0000' && LA10_57 <= '!')||(LA10_57 >= '#' && LA10_57 <= '-')||(LA10_57 >= '/' && LA10_57 <= '[')||(LA10_57 >= ']' && LA10_57 <= '\uFFFF')) ) {s = 29;}

                        else if ( (LA10_57=='\"') ) {s = 30;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}