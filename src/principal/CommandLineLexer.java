// $ANTLR 3.4 /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g 2013-01-05 12:18:25

	package principal;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class CommandLineLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int AF=4;
    public static final int AG=5;
    public static final int AND=6;
    public static final int ATOM=7;
    public static final int AU=8;
    public static final int AX=9;
    public static final int CHAR=10;
    public static final int DEAD=11;
    public static final int EF=12;
    public static final int EG=13;
    public static final int ENABLE=14;
    public static final int EQUIV=15;
    public static final int ESC_SEQ=16;
    public static final int EU=17;
    public static final int EX=18;
    public static final int EXPONENT=19;
    public static final int FALSE=20;
    public static final int HEX_DIGIT=21;
    public static final int IMPLY=22;
    public static final int INITIAL=23;
    public static final int LETTER=24;
    public static final int NEG=25;
    public static final int NUMBER=26;
    public static final int OCTAL_ESC=27;
    public static final int OR=28;
    public static final int STRING=29;
    public static final int STRING_FILE_DOT=30;
    public static final int STRING_FILE_NET=31;
    public static final int TRUE=32;
    public static final int UNICODE_ESC=33;
    public static final int WS=34;

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

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:11:7: ( '!' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:11:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:12:7: ( '(' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:12:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:13:7: ( ')' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:13:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:14:7: ( '-' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:14:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:15:7: ( '.' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:15:9: '.'
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
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:16:7: ( '../' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:16:9: '../'
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
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:17:7: ( './' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:17:9: './'
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
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:18:7: ( '/' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:18:9: '/'
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
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:19:7: ( ';' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:19:9: ';'
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
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:20:7: ( 'A' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:20:9: 'A'
            {
            match('A'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:21:7: ( 'AF' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:21:9: 'AF'
            {
            match("AF"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:22:7: ( 'AG' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:22:9: 'AG'
            {
            match("AG"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:23:7: ( 'AX' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:23:9: 'AX'
            {
            match("AX"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:24:7: ( 'E' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:24:9: 'E'
            {
            match('E'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:25:7: ( 'EF' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:25:9: 'EF'
            {
            match("EF"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:26:7: ( 'EG' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:26:9: 'EG'
            {
            match("EG"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:27:7: ( 'EX' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:27:9: 'EX'
            {
            match("EX"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:28:7: ( 'Justifie' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:28:9: 'Justifie'
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
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:29:7: ( 'Justifietodot' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:29:9: 'Justifietodot'
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
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:30:7: ( 'U' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:30:9: 'U'
            {
            match('U'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:31:7: ( '_' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:31:9: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:32:7: ( 'ctl' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:32:9: 'ctl'
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
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:33:7: ( 'ctltodot' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:33:9: 'ctltodot'
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
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:34:7: ( 'dead' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:34:9: 'dead'
            {
            match("dead"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:35:7: ( 'dot' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:35:9: 'dot'
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
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:36:7: ( 'enable' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:36:9: 'enable'
            {
            match("enable"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:37:7: ( 'false' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:37:9: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:38:7: ( 'graphe' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:38:9: 'graphe'
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
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:39:7: ( 'initial' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:39:9: 'initial'
            {
            match("initial"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:40:7: ( 'load' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:40:9: 'load'
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
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:41:7: ( 'look' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:41:9: 'look'
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
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:42:7: ( 'net' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:42:9: 'net'
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
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:43:7: ( 'shell' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:43:9: 'shell'
            {
            match("shell"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:44:7: ( 'stop' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:44:9: 'stop'
            {
            match("stop"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:45:7: ( 'succ' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:45:9: 'succ'
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
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:46:7: ( 'todot' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:46:9: 'todot'
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
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:47:7: ( 'true' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:47:9: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "ATOM"
    public final void mATOM() throws RecognitionException {
        try {
            int _type = ATOM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:248:8: ( '$' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:248:10: '$' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            match('$'); 

            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:248:39: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ATOM"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:249:7: ( '&&' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:249:9: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:250:6: ( '||' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:250:8: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "IMPLY"
    public final void mIMPLY() throws RecognitionException {
        try {
            int _type = IMPLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:251:9: ( '->' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:251:11: '->'
            {
            match("->"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IMPLY"

    // $ANTLR start "EQUIV"
    public final void mEQUIV() throws RecognitionException {
        try {
            int _type = EQUIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:252:9: ( '<->' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:252:11: '<->'
            {
            match("<->"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUIV"

    // $ANTLR start "STRING_FILE_DOT"
    public final void mSTRING_FILE_DOT() throws RecognitionException {
        try {
            int _type = STRING_FILE_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:254:17: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )+ '.dot' '\"' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:254:19: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )+ '.dot' '\"'
            {
            match('\"'); 

            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:254:23: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )+
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
            	    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:254:24: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:254:34: ~ ( '\\\\' | '\"' )
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


            match(".dot"); 



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
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:255:17: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )+ '.net' '\"' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:255:19: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )+ '.net' '\"'
            {
            match('\"'); 

            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:255:23: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )+
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
            	    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:255:24: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:255:34: ~ ( '\\\\' | '\"' )
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


            match(".net"); 



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
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:257:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:257:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:265:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:265:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:265:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
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
            	    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:265:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:265:24: ~ ( '\\\\' | '\"' )
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
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:268:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:268:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 

            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:268:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
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
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:268:15: ESC_SEQ
                    {
                    mESC_SEQ(); 


                    }
                    break;
                case 2 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:268:25: ~ ( '\\'' | '\\\\' )
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
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:273:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:273:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:273:22: ( '+' | '-' )?
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


            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:273:33: ( '0' .. '9' )+
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
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:276:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
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
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:280:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
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
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:280:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:281:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 


                    }
                    break;
                case 3 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:282:9: OCTAL_ESC
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
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:287:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
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
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:287:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
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
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:288:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
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
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:289:9: '\\\\' ( '0' .. '7' )
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
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:294:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:294:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:296:9: ( '0' .. '9' )
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            int _type = LETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:297:9: ( 'a' .. 'z' | 'A' .. 'Z' | NUMBER )
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    public void mTokens() throws RecognitionException {
        // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:8: ( T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | ATOM | AND | OR | IMPLY | EQUIV | STRING_FILE_DOT | STRING_FILE_NET | WS | STRING | CHAR | NUMBER | LETTER )
        int alt10=49;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:10: T__35
                {
                mT__35(); 


                }
                break;
            case 2 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:16: T__36
                {
                mT__36(); 


                }
                break;
            case 3 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:22: T__37
                {
                mT__37(); 


                }
                break;
            case 4 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:28: T__38
                {
                mT__38(); 


                }
                break;
            case 5 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:34: T__39
                {
                mT__39(); 


                }
                break;
            case 6 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:40: T__40
                {
                mT__40(); 


                }
                break;
            case 7 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:46: T__41
                {
                mT__41(); 


                }
                break;
            case 8 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:52: T__42
                {
                mT__42(); 


                }
                break;
            case 9 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:58: T__43
                {
                mT__43(); 


                }
                break;
            case 10 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:64: T__44
                {
                mT__44(); 


                }
                break;
            case 11 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:70: T__45
                {
                mT__45(); 


                }
                break;
            case 12 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:76: T__46
                {
                mT__46(); 


                }
                break;
            case 13 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:82: T__47
                {
                mT__47(); 


                }
                break;
            case 14 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:88: T__48
                {
                mT__48(); 


                }
                break;
            case 15 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:94: T__49
                {
                mT__49(); 


                }
                break;
            case 16 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:100: T__50
                {
                mT__50(); 


                }
                break;
            case 17 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:106: T__51
                {
                mT__51(); 


                }
                break;
            case 18 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:112: T__52
                {
                mT__52(); 


                }
                break;
            case 19 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:118: T__53
                {
                mT__53(); 


                }
                break;
            case 20 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:124: T__54
                {
                mT__54(); 


                }
                break;
            case 21 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:130: T__55
                {
                mT__55(); 


                }
                break;
            case 22 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:136: T__56
                {
                mT__56(); 


                }
                break;
            case 23 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:142: T__57
                {
                mT__57(); 


                }
                break;
            case 24 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:148: T__58
                {
                mT__58(); 


                }
                break;
            case 25 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:154: T__59
                {
                mT__59(); 


                }
                break;
            case 26 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:160: T__60
                {
                mT__60(); 


                }
                break;
            case 27 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:166: T__61
                {
                mT__61(); 


                }
                break;
            case 28 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:172: T__62
                {
                mT__62(); 


                }
                break;
            case 29 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:178: T__63
                {
                mT__63(); 


                }
                break;
            case 30 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:184: T__64
                {
                mT__64(); 


                }
                break;
            case 31 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:190: T__65
                {
                mT__65(); 


                }
                break;
            case 32 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:196: T__66
                {
                mT__66(); 


                }
                break;
            case 33 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:202: T__67
                {
                mT__67(); 


                }
                break;
            case 34 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:208: T__68
                {
                mT__68(); 


                }
                break;
            case 35 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:214: T__69
                {
                mT__69(); 


                }
                break;
            case 36 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:220: T__70
                {
                mT__70(); 


                }
                break;
            case 37 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:226: T__71
                {
                mT__71(); 


                }
                break;
            case 38 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:232: ATOM
                {
                mATOM(); 


                }
                break;
            case 39 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:237: AND
                {
                mAND(); 


                }
                break;
            case 40 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:241: OR
                {
                mOR(); 


                }
                break;
            case 41 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:244: IMPLY
                {
                mIMPLY(); 


                }
                break;
            case 42 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:250: EQUIV
                {
                mEQUIV(); 


                }
                break;
            case 43 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:256: STRING_FILE_DOT
                {
                mSTRING_FILE_DOT(); 


                }
                break;
            case 44 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:272: STRING_FILE_NET
                {
                mSTRING_FILE_NET(); 


                }
                break;
            case 45 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:288: WS
                {
                mWS(); 


                }
                break;
            case 46 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:291: STRING
                {
                mSTRING(); 


                }
                break;
            case 47 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:298: CHAR
                {
                mCHAR(); 


                }
                break;
            case 48 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:303: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 49 :
                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:1:310: LETTER
                {
                mLETTER(); 


                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\4\uffff\1\41\1\44\2\uffff\1\50\1\54\1\37\2\uffff\12\37\53\uffff"+
        "\1\114\34\uffff\1\143\4\uffff";
    static final String DFA10_eofS =
        "\144\uffff";
    static final String DFA10_minS =
        "\1\11\3\uffff\1\76\1\56\2\uffff\2\106\1\165\2\uffff\1\164\1\145"+
        "\1\156\1\141\1\162\1\156\1\157\1\145\1\150\1\157\4\uffff\1\0\21"+
        "\uffff\1\163\1\uffff\1\154\6\uffff\1\141\6\uffff\1\42\1\0\2\uffff"+
        "\2\164\2\uffff\1\0\1\60\3\0\1\151\2\uffff\1\60\4\0\1\146\1\60\3"+
        "\0\1\151\1\60\2\0\1\145\1\0\2\uffff\1\164\4\uffff";
    static final String DFA10_maxS =
        "\1\174\3\uffff\1\76\1\57\2\uffff\2\130\1\165\2\uffff\1\164\1\157"+
        "\1\156\1\141\1\162\1\156\1\157\1\145\1\165\1\162\4\uffff\1\uffff"+
        "\21\uffff\1\163\1\uffff\1\154\6\uffff\1\157\6\uffff\1\165\1\uffff"+
        "\2\uffff\2\164\2\uffff\1\uffff\1\146\3\uffff\1\151\2\uffff\1\146"+
        "\4\uffff\2\146\3\uffff\1\151\1\146\2\uffff\1\145\1\uffff\2\uffff"+
        "\1\164\4\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\1\3\2\uffff\1\10\1\11\3\uffff\1\24\1\25\12\uffff"+
        "\1\46\1\47\1\50\1\52\1\uffff\1\55\1\57\1\60\1\61\1\51\1\4\1\6\1"+
        "\7\1\5\1\13\1\14\1\15\1\12\1\17\1\20\1\21\1\16\1\uffff\1\24\1\uffff"+
        "\1\30\1\31\1\32\1\33\1\34\1\35\1\uffff\1\40\1\41\1\42\1\43\1\44"+
        "\1\45\2\uffff\1\56\1\60\2\uffff\1\36\1\37\6\uffff\1\27\1\26\20\uffff"+
        "\1\53\1\54\1\uffff\1\53\1\54\1\23\1\22";
    static final String DFA10_specialS =
        "\33\uffff\1\5\42\uffff\1\6\6\uffff\1\7\1\uffff\1\10\1\2\1\1\4\uffff"+
        "\1\17\1\3\1\16\1\11\2\uffff\1\0\1\14\1\12\2\uffff\1\15\1\13\1\uffff"+
        "\1\4\7\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\34\2\uffff\1\34\22\uffff\1\34\1\1\1\33\1\uffff\1\27\1\uffff"+
            "\1\30\1\35\1\2\1\3\3\uffff\1\4\1\5\1\6\12\36\1\uffff\1\7\1\32"+
            "\4\uffff\1\10\3\37\1\11\4\37\1\12\12\37\1\13\5\37\4\uffff\1"+
            "\14\1\uffff\2\37\1\15\1\16\1\17\1\20\1\21\1\37\1\22\2\37\1\23"+
            "\1\37\1\24\4\37\1\25\1\26\6\37\1\uffff\1\31",
            "",
            "",
            "",
            "\1\40",
            "\1\42\1\43",
            "",
            "",
            "\1\45\1\46\20\uffff\1\47",
            "\1\51\1\52\20\uffff\1\53",
            "\1\55",
            "",
            "",
            "\1\57",
            "\1\60\11\uffff\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70\13\uffff\1\71\1\72",
            "\1\73\2\uffff\1\74",
            "",
            "",
            "",
            "",
            "\42\76\1\77\71\76\1\75\uffa3\76",
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
            "",
            "",
            "",
            "",
            "\1\101",
            "",
            "\1\102",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\103\15\uffff\1\104",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\105\4\uffff\1\105\10\uffff\4\107\4\110\44\uffff\1\105\5"+
            "\uffff\1\105\3\uffff\1\105\7\uffff\1\105\3\uffff\1\105\1\uffff"+
            "\1\105\1\106",
            "\42\76\1\77\13\76\1\111\55\76\1\75\uffa3\76",
            "",
            "",
            "\1\112",
            "\1\113",
            "",
            "",
            "\42\76\1\77\13\76\1\111\55\76\1\75\uffa3\76",
            "\12\115\7\uffff\6\115\32\uffff\6\115",
            "\42\76\1\77\13\76\1\111\1\76\10\116\44\76\1\75\uffa3\76",
            "\42\76\1\77\13\76\1\111\1\76\10\117\44\76\1\75\uffa3\76",
            "\42\76\1\77\13\76\1\111\55\76\1\75\7\76\1\120\11\76\1\121\uff91"+
            "\76",
            "\1\122",
            "",
            "",
            "\12\123\7\uffff\6\123\32\uffff\6\123",
            "\42\76\1\77\13\76\1\111\1\76\10\124\44\76\1\75\uffa3\76",
            "\42\76\1\77\13\76\1\111\55\76\1\75\uffa3\76",
            "\42\76\1\77\13\76\1\111\55\76\1\75\22\76\1\125\uff90\76",
            "\42\76\1\77\13\76\1\111\55\76\1\75\10\76\1\126\uff9a\76",
            "\1\127",
            "\12\130\7\uffff\6\130\32\uffff\6\130",
            "\42\76\1\77\13\76\1\111\55\76\1\75\uffa3\76",
            "\42\76\1\77\13\76\1\111\55\76\1\75\27\76\1\131\uff8b\76",
            "\42\76\1\77\13\76\1\111\55\76\1\75\27\76\1\132\uff8b\76",
            "\1\133",
            "\12\134\7\uffff\6\134\32\uffff\6\134",
            "\42\76\1\135\13\76\1\111\55\76\1\75\uffa3\76",
            "\42\76\1\136\13\76\1\111\55\76\1\75\uffa3\76",
            "\1\137",
            "\42\76\1\77\13\76\1\111\55\76\1\75\uffa3\76",
            "",
            "",
            "\1\142",
            "",
            "",
            "",
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
            return "1:1: Tokens : ( T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | ATOM | AND | OR | IMPLY | EQUIV | STRING_FILE_DOT | STRING_FILE_NET | WS | STRING | CHAR | NUMBER | LETTER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_84 = input.LA(1);

                        s = -1;
                        if ( (LA10_84=='.') ) {s = 73;}

                        else if ( (LA10_84=='\\') ) {s = 61;}

                        else if ( ((LA10_84 >= '\u0000' && LA10_84 <= '!')||(LA10_84 >= '#' && LA10_84 <= '-')||(LA10_84 >= '/' && LA10_84 <= '[')||(LA10_84 >= ']' && LA10_84 <= '\uFFFF')) ) {s = 62;}

                        else if ( (LA10_84=='\"') ) {s = 63;}

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA10_73 = input.LA(1);

                        s = -1;
                        if ( (LA10_73=='d') ) {s = 80;}

                        else if ( (LA10_73=='n') ) {s = 81;}

                        else if ( (LA10_73=='.') ) {s = 73;}

                        else if ( (LA10_73=='\\') ) {s = 61;}

                        else if ( ((LA10_73 >= '\u0000' && LA10_73 <= '!')||(LA10_73 >= '#' && LA10_73 <= '-')||(LA10_73 >= '/' && LA10_73 <= '[')||(LA10_73 >= ']' && LA10_73 <= 'c')||(LA10_73 >= 'e' && LA10_73 <= 'm')||(LA10_73 >= 'o' && LA10_73 <= '\uFFFF')) ) {s = 62;}

                        else if ( (LA10_73=='\"') ) {s = 63;}

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA10_72 = input.LA(1);

                        s = -1;
                        if ( ((LA10_72 >= '0' && LA10_72 <= '7')) ) {s = 79;}

                        else if ( (LA10_72=='.') ) {s = 73;}

                        else if ( (LA10_72=='\\') ) {s = 61;}

                        else if ( ((LA10_72 >= '\u0000' && LA10_72 <= '!')||(LA10_72 >= '#' && LA10_72 <= '-')||LA10_72=='/'||(LA10_72 >= '8' && LA10_72 <= '[')||(LA10_72 >= ']' && LA10_72 <= '\uFFFF')) ) {s = 62;}

                        else if ( (LA10_72=='\"') ) {s = 63;}

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA10_79 = input.LA(1);

                        s = -1;
                        if ( (LA10_79=='.') ) {s = 73;}

                        else if ( (LA10_79=='\\') ) {s = 61;}

                        else if ( ((LA10_79 >= '\u0000' && LA10_79 <= '!')||(LA10_79 >= '#' && LA10_79 <= '-')||(LA10_79 >= '/' && LA10_79 <= '[')||(LA10_79 >= ']' && LA10_79 <= '\uFFFF')) ) {s = 62;}

                        else if ( (LA10_79=='\"') ) {s = 63;}

                        if ( s>=0 ) return s;
                        break;

                    case 4 : 
                        int LA10_92 = input.LA(1);

                        s = -1;
                        if ( (LA10_92=='.') ) {s = 73;}

                        else if ( (LA10_92=='\\') ) {s = 61;}

                        else if ( ((LA10_92 >= '\u0000' && LA10_92 <= '!')||(LA10_92 >= '#' && LA10_92 <= '-')||(LA10_92 >= '/' && LA10_92 <= '[')||(LA10_92 >= ']' && LA10_92 <= '\uFFFF')) ) {s = 62;}

                        else if ( (LA10_92=='\"') ) {s = 63;}

                        if ( s>=0 ) return s;
                        break;

                    case 5 : 
                        int LA10_27 = input.LA(1);

                        s = -1;
                        if ( (LA10_27=='\\') ) {s = 61;}

                        else if ( ((LA10_27 >= '\u0000' && LA10_27 <= '!')||(LA10_27 >= '#' && LA10_27 <= '[')||(LA10_27 >= ']' && LA10_27 <= '\uFFFF')) ) {s = 62;}

                        else if ( (LA10_27=='\"') ) {s = 63;}

                        if ( s>=0 ) return s;
                        break;

                    case 6 : 
                        int LA10_62 = input.LA(1);

                        s = -1;
                        if ( (LA10_62=='.') ) {s = 73;}

                        else if ( (LA10_62=='\\') ) {s = 61;}

                        else if ( ((LA10_62 >= '\u0000' && LA10_62 <= '!')||(LA10_62 >= '#' && LA10_62 <= '-')||(LA10_62 >= '/' && LA10_62 <= '[')||(LA10_62 >= ']' && LA10_62 <= '\uFFFF')) ) {s = 62;}

                        else if ( (LA10_62=='\"') ) {s = 63;}

                        if ( s>=0 ) return s;
                        break;

                    case 7 : 
                        int LA10_69 = input.LA(1);

                        s = -1;
                        if ( (LA10_69=='.') ) {s = 73;}

                        else if ( (LA10_69=='\\') ) {s = 61;}

                        else if ( ((LA10_69 >= '\u0000' && LA10_69 <= '!')||(LA10_69 >= '#' && LA10_69 <= '-')||(LA10_69 >= '/' && LA10_69 <= '[')||(LA10_69 >= ']' && LA10_69 <= '\uFFFF')) ) {s = 62;}

                        else if ( (LA10_69=='\"') ) {s = 63;}

                        if ( s>=0 ) return s;
                        break;

                    case 8 : 
                        int LA10_71 = input.LA(1);

                        s = -1;
                        if ( ((LA10_71 >= '0' && LA10_71 <= '7')) ) {s = 78;}

                        else if ( (LA10_71=='.') ) {s = 73;}

                        else if ( (LA10_71=='\\') ) {s = 61;}

                        else if ( ((LA10_71 >= '\u0000' && LA10_71 <= '!')||(LA10_71 >= '#' && LA10_71 <= '-')||LA10_71=='/'||(LA10_71 >= '8' && LA10_71 <= '[')||(LA10_71 >= ']' && LA10_71 <= '\uFFFF')) ) {s = 62;}

                        else if ( (LA10_71=='\"') ) {s = 63;}

                        if ( s>=0 ) return s;
                        break;

                    case 9 : 
                        int LA10_81 = input.LA(1);

                        s = -1;
                        if ( (LA10_81=='e') ) {s = 86;}

                        else if ( (LA10_81=='.') ) {s = 73;}

                        else if ( (LA10_81=='\\') ) {s = 61;}

                        else if ( ((LA10_81 >= '\u0000' && LA10_81 <= '!')||(LA10_81 >= '#' && LA10_81 <= '-')||(LA10_81 >= '/' && LA10_81 <= '[')||(LA10_81 >= ']' && LA10_81 <= 'd')||(LA10_81 >= 'f' && LA10_81 <= '\uFFFF')) ) {s = 62;}

                        else if ( (LA10_81=='\"') ) {s = 63;}

                        if ( s>=0 ) return s;
                        break;

                    case 10 : 
                        int LA10_86 = input.LA(1);

                        s = -1;
                        if ( (LA10_86=='t') ) {s = 90;}

                        else if ( (LA10_86=='.') ) {s = 73;}

                        else if ( (LA10_86=='\\') ) {s = 61;}

                        else if ( ((LA10_86 >= '\u0000' && LA10_86 <= '!')||(LA10_86 >= '#' && LA10_86 <= '-')||(LA10_86 >= '/' && LA10_86 <= '[')||(LA10_86 >= ']' && LA10_86 <= 's')||(LA10_86 >= 'u' && LA10_86 <= '\uFFFF')) ) {s = 62;}

                        else if ( (LA10_86=='\"') ) {s = 63;}

                        if ( s>=0 ) return s;
                        break;

                    case 11 : 
                        int LA10_90 = input.LA(1);

                        s = -1;
                        if ( (LA10_90=='\"') ) {s = 94;}

                        else if ( (LA10_90=='.') ) {s = 73;}

                        else if ( (LA10_90=='\\') ) {s = 61;}

                        else if ( ((LA10_90 >= '\u0000' && LA10_90 <= '!')||(LA10_90 >= '#' && LA10_90 <= '-')||(LA10_90 >= '/' && LA10_90 <= '[')||(LA10_90 >= ']' && LA10_90 <= '\uFFFF')) ) {s = 62;}

                        if ( s>=0 ) return s;
                        break;

                    case 12 : 
                        int LA10_85 = input.LA(1);

                        s = -1;
                        if ( (LA10_85=='t') ) {s = 89;}

                        else if ( (LA10_85=='.') ) {s = 73;}

                        else if ( (LA10_85=='\\') ) {s = 61;}

                        else if ( ((LA10_85 >= '\u0000' && LA10_85 <= '!')||(LA10_85 >= '#' && LA10_85 <= '-')||(LA10_85 >= '/' && LA10_85 <= '[')||(LA10_85 >= ']' && LA10_85 <= 's')||(LA10_85 >= 'u' && LA10_85 <= '\uFFFF')) ) {s = 62;}

                        else if ( (LA10_85=='\"') ) {s = 63;}

                        if ( s>=0 ) return s;
                        break;

                    case 13 : 
                        int LA10_89 = input.LA(1);

                        s = -1;
                        if ( (LA10_89=='\"') ) {s = 93;}

                        else if ( (LA10_89=='.') ) {s = 73;}

                        else if ( (LA10_89=='\\') ) {s = 61;}

                        else if ( ((LA10_89 >= '\u0000' && LA10_89 <= '!')||(LA10_89 >= '#' && LA10_89 <= '-')||(LA10_89 >= '/' && LA10_89 <= '[')||(LA10_89 >= ']' && LA10_89 <= '\uFFFF')) ) {s = 62;}

                        if ( s>=0 ) return s;
                        break;

                    case 14 : 
                        int LA10_80 = input.LA(1);

                        s = -1;
                        if ( (LA10_80=='o') ) {s = 85;}

                        else if ( (LA10_80=='.') ) {s = 73;}

                        else if ( (LA10_80=='\\') ) {s = 61;}

                        else if ( ((LA10_80 >= '\u0000' && LA10_80 <= '!')||(LA10_80 >= '#' && LA10_80 <= '-')||(LA10_80 >= '/' && LA10_80 <= '[')||(LA10_80 >= ']' && LA10_80 <= 'n')||(LA10_80 >= 'p' && LA10_80 <= '\uFFFF')) ) {s = 62;}

                        else if ( (LA10_80=='\"') ) {s = 63;}

                        if ( s>=0 ) return s;
                        break;

                    case 15 : 
                        int LA10_78 = input.LA(1);

                        s = -1;
                        if ( ((LA10_78 >= '0' && LA10_78 <= '7')) ) {s = 84;}

                        else if ( (LA10_78=='.') ) {s = 73;}

                        else if ( (LA10_78=='\\') ) {s = 61;}

                        else if ( ((LA10_78 >= '\u0000' && LA10_78 <= '!')||(LA10_78 >= '#' && LA10_78 <= '-')||LA10_78=='/'||(LA10_78 >= '8' && LA10_78 <= '[')||(LA10_78 >= ']' && LA10_78 <= '\uFFFF')) ) {s = 62;}

                        else if ( (LA10_78=='\"') ) {s = 63;}

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