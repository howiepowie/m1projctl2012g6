// $ANTLR 3.3 Nov 30, 2010 12:45:30 /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g 2012-11-16 11:44:44
 package CTL; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CTLLexer extends Lexer {
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

    public CTLLexer() {;} 
    public CTLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CTLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g"; }

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:5:6: ( '||' )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:5:8: '||'
            {
            match("||"); 


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
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:6:6: ( '<->' )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:6:8: '<->'
            {
            match("<->"); 


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
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:7:6: ( '->' )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:7:8: '->'
            {
            match("->"); 


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
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:8:7: ( '&&' )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:8:9: '&&'
            {
            match("&&"); 


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
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:9:7: ( '!' )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:9:9: '!'
            {
            match('!'); 

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
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:10:7: ( 'E' )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:10:9: 'E'
            {
            match('E'); 

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
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:11:7: ( 'F' )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:11:9: 'F'
            {
            match('F'); 

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
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:12:7: ( 'G' )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:12:9: 'G'
            {
            match('G'); 

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
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:13:7: ( 'X' )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:13:9: 'X'
            {
            match('X'); 

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
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:14:7: ( 'A' )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:14:9: 'A'
            {
            match('A'); 

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
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:15:7: ( '(' )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:15:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:16:7: ( 'U' )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:16:9: 'U'
            {
            match('U'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:17:7: ( ')' )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:17:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:18:7: ( 'dead' )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:18:9: 'dead'
            {
            match("dead"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:19:7: ( 'initial' )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:19:9: 'initial'
            {
            match("initial"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:20:7: ( 'enable' )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:20:9: 'enable'
            {
            match("enable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:21:7: ( 'true' )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:21:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:22:7: ( 'false' )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:22:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:163:4: ( '$' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:163:6: '$' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            match('$'); 
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:163:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:
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
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:166:5: ( ( '0' .. '9' )+ )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:166:6: ( '0' .. '9' )+
            {
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:166:6: ( '0' .. '9' )+
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
            	    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:166:7: '0' .. '9'
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
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:169:3: ( ( ' ' | '\\t' | '\\n' )+ )
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:169:5: ( ' ' | '\\t' | '\\n' )+
            {
            // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:169:5: ( ' ' | '\\t' | '\\n' )+
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
            	    // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:
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
        // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:1:8: ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | ID | NUM | WS )
        int alt4=21;
        switch ( input.LA(1) ) {
        case '|':
            {
            alt4=1;
            }
            break;
        case '<':
            {
            alt4=2;
            }
            break;
        case '-':
            {
            alt4=3;
            }
            break;
        case '&':
            {
            alt4=4;
            }
            break;
        case '!':
            {
            alt4=5;
            }
            break;
        case 'E':
            {
            alt4=6;
            }
            break;
        case 'F':
            {
            alt4=7;
            }
            break;
        case 'G':
            {
            alt4=8;
            }
            break;
        case 'X':
            {
            alt4=9;
            }
            break;
        case 'A':
            {
            alt4=10;
            }
            break;
        case '(':
            {
            alt4=11;
            }
            break;
        case 'U':
            {
            alt4=12;
            }
            break;
        case ')':
            {
            alt4=13;
            }
            break;
        case 'd':
            {
            alt4=14;
            }
            break;
        case 'i':
            {
            alt4=15;
            }
            break;
        case 'e':
            {
            alt4=16;
            }
            break;
        case 't':
            {
            alt4=17;
            }
            break;
        case 'f':
            {
            alt4=18;
            }
            break;
        case '$':
            {
            alt4=19;
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
        case '8':
        case '9':
            {
            alt4=20;
            }
            break;
        case '\t':
        case '\n':
        case ' ':
            {
            alt4=21;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 4, 0, input);

            throw nvae;
        }

        switch (alt4) {
            case 1 :
                // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:1:10: T__7
                {
                mT__7(); 

                }
                break;
            case 2 :
                // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:1:15: T__8
                {
                mT__8(); 

                }
                break;
            case 3 :
                // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:1:20: T__9
                {
                mT__9(); 

                }
                break;
            case 4 :
                // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:1:25: T__10
                {
                mT__10(); 

                }
                break;
            case 5 :
                // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:1:31: T__11
                {
                mT__11(); 

                }
                break;
            case 6 :
                // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:1:37: T__12
                {
                mT__12(); 

                }
                break;
            case 7 :
                // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:1:43: T__13
                {
                mT__13(); 

                }
                break;
            case 8 :
                // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:1:49: T__14
                {
                mT__14(); 

                }
                break;
            case 9 :
                // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:1:55: T__15
                {
                mT__15(); 

                }
                break;
            case 10 :
                // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:1:61: T__16
                {
                mT__16(); 

                }
                break;
            case 11 :
                // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:1:67: T__17
                {
                mT__17(); 

                }
                break;
            case 12 :
                // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:1:73: T__18
                {
                mT__18(); 

                }
                break;
            case 13 :
                // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:1:79: T__19
                {
                mT__19(); 

                }
                break;
            case 14 :
                // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:1:85: T__20
                {
                mT__20(); 

                }
                break;
            case 15 :
                // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:1:91: T__21
                {
                mT__21(); 

                }
                break;
            case 16 :
                // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:1:97: T__22
                {
                mT__22(); 

                }
                break;
            case 17 :
                // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:1:103: T__23
                {
                mT__23(); 

                }
                break;
            case 18 :
                // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:1:109: T__24
                {
                mT__24(); 

                }
                break;
            case 19 :
                // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:1:115: ID
                {
                mID(); 

                }
                break;
            case 20 :
                // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:1:118: NUM
                {
                mNUM(); 

                }
                break;
            case 21 :
                // /Users/couvreur/Personnel/enseignement/M1-Logique/dev/petri/src/rdp/CTL.g:1:122: WS
                {
                mWS(); 

                }
                break;

        }

    }


 

}