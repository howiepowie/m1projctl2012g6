// $ANTLR 3.4 /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g 2013-01-24 11:30:43

	package principal;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class CommandLineParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AF", "AG", "AND", "ATOM", "AU", "AX", "CHAR", "DEAD", "EF", "EG", "ENABLE", "EQUIV", "ESC_SEQ", "EU", "EX", "EXPONENT", "FALSE", "HEX_DIGIT", "IMPLY", "INITIAL", "LETTER", "NEG", "NUMBER", "OCTAL_ESC", "OR", "STRING", "STRING_FILE_DOT", "STRING_FILE_NET", "TRUE", "UNICODE_ESC", "WS", "'!'", "'('", "')'", "'-'", "'.'", "'../'", "'./'", "'/'", "';'", "'A'", "'AF'", "'AG'", "'AX'", "'E'", "'EF'", "'EG'", "'EX'", "'Justifie'", "'Justifietodot'", "'U'", "'_'", "'ctl'", "'ctltodot'", "'dead'", "'dot'", "'enable'", "'false'", "'graphe'", "'initial'", "'load'", "'look'", "'net'", "'shell'", "'stop'", "'succ'", "'todot'", "'true'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public CommandLineParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public CommandLineParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return CommandLineParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g"; }


    	private ICallback callback;
    	private boolean programDeclDone;
    	private boolean usesDeclAllowed;
    	
    	public CommandLineParser(final ICallback callback) {
    		super(null);
    		this.callback = callback;
    		programDeclDone = false;
    		usesDeclAllowed = true;
    	}
    	
    	private void onShell() {
    		callback.shell();
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


    public static class start_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:116:1: start : instruction ( ';' instruction )* ;
    public final CommandLineParser.start_return start() throws RecognitionException {
        CommandLineParser.start_return retval = new CommandLineParser.start_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal2=null;
        CommandLineParser.instruction_return instruction1 =null;

        CommandLineParser.instruction_return instruction3 =null;


        Object char_literal2_tree=null;

        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:117:2: ( instruction ( ';' instruction )* )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:117:4: instruction ( ';' instruction )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_instruction_in_start111);
            instruction1=instruction();

            state._fsp--;

            adaptor.addChild(root_0, instruction1.getTree());

            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:117:16: ( ';' instruction )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==43) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:117:17: ';' instruction
            	    {
            	    char_literal2=(Token)match(input,43,FOLLOW_43_in_start114); 
            	    char_literal2_tree = 
            	    (Object)adaptor.create(char_literal2)
            	    ;
            	    adaptor.addChild(root_0, char_literal2_tree);


            	    pushFollow(FOLLOW_instruction_in_start116);
            	    instruction3=instruction();

            	    state._fsp--;

            	    adaptor.addChild(root_0, instruction3.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "start"


    public static class instruction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instruction"
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:120:1: instruction : ( shell | load | graphe | look | succ | todot | ctl | ctltodot | justifie | justifietodot | stop );
    public final CommandLineParser.instruction_return instruction() throws RecognitionException {
        CommandLineParser.instruction_return retval = new CommandLineParser.instruction_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        CommandLineParser.shell_return shell4 =null;

        CommandLineParser.load_return load5 =null;

        CommandLineParser.graphe_return graphe6 =null;

        CommandLineParser.look_return look7 =null;

        CommandLineParser.succ_return succ8 =null;

        CommandLineParser.todot_return todot9 =null;

        CommandLineParser.ctl_return ctl10 =null;

        CommandLineParser.ctltodot_return ctltodot11 =null;

        CommandLineParser.justifie_return justifie12 =null;

        CommandLineParser.justifietodot_return justifietodot13 =null;

        CommandLineParser.stop_return stop14 =null;



        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:121:2: ( shell | load | graphe | look | succ | todot | ctl | ctltodot | justifie | justifietodot | stop )
            int alt2=11;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt2=1;
                }
                break;
            case 64:
                {
                alt2=2;
                }
                break;
            case 62:
                {
                alt2=3;
                }
                break;
            case 65:
                {
                alt2=4;
                }
                break;
            case 69:
                {
                alt2=5;
                }
                break;
            case 70:
                {
                alt2=6;
                }
                break;
            case 56:
                {
                alt2=7;
                }
                break;
            case 57:
                {
                alt2=8;
                }
                break;
            case 52:
                {
                alt2=9;
                }
                break;
            case 53:
                {
                alt2=10;
                }
                break;
            case 68:
                {
                alt2=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:121:4: shell
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_shell_in_instruction129);
                    shell4=shell();

                    state._fsp--;

                    adaptor.addChild(root_0, shell4.getTree());

                    }
                    break;
                case 2 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:122:4: load
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_load_in_instruction134);
                    load5=load();

                    state._fsp--;

                    adaptor.addChild(root_0, load5.getTree());

                    }
                    break;
                case 3 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:123:4: graphe
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_graphe_in_instruction139);
                    graphe6=graphe();

                    state._fsp--;

                    adaptor.addChild(root_0, graphe6.getTree());

                    }
                    break;
                case 4 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:124:4: look
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_look_in_instruction144);
                    look7=look();

                    state._fsp--;

                    adaptor.addChild(root_0, look7.getTree());

                    }
                    break;
                case 5 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:125:4: succ
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_succ_in_instruction149);
                    succ8=succ();

                    state._fsp--;

                    adaptor.addChild(root_0, succ8.getTree());

                    }
                    break;
                case 6 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:126:4: todot
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_todot_in_instruction154);
                    todot9=todot();

                    state._fsp--;

                    adaptor.addChild(root_0, todot9.getTree());

                    }
                    break;
                case 7 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:127:4: ctl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ctl_in_instruction159);
                    ctl10=ctl();

                    state._fsp--;

                    adaptor.addChild(root_0, ctl10.getTree());

                    }
                    break;
                case 8 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:128:4: ctltodot
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ctltodot_in_instruction164);
                    ctltodot11=ctltodot();

                    state._fsp--;

                    adaptor.addChild(root_0, ctltodot11.getTree());

                    }
                    break;
                case 9 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:129:4: justifie
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_justifie_in_instruction169);
                    justifie12=justifie();

                    state._fsp--;

                    adaptor.addChild(root_0, justifie12.getTree());

                    }
                    break;
                case 10 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:130:4: justifietodot
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_justifietodot_in_instruction174);
                    justifietodot13=justifietodot();

                    state._fsp--;

                    adaptor.addChild(root_0, justifietodot13.getTree());

                    }
                    break;
                case 11 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:131:4: stop
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_stop_in_instruction179);
                    stop14=stop();

                    state._fsp--;

                    adaptor.addChild(root_0, stop14.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instruction"


    public static class shell_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "shell"
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:134:1: shell : 'shell' ;
    public final CommandLineParser.shell_return shell() throws RecognitionException {
        CommandLineParser.shell_return retval = new CommandLineParser.shell_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal15=null;

        Object string_literal15_tree=null;

        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:135:2: ( 'shell' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:135:4: 'shell'
            {
            root_0 = (Object)adaptor.nil();


            string_literal15=(Token)match(input,67,FOLLOW_67_in_shell191); 
            string_literal15_tree = 
            (Object)adaptor.create(string_literal15)
            ;
            adaptor.addChild(root_0, string_literal15_tree);


             onShell(); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "shell"


    public static class load_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "load"
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:138:1: load : 'load' p1= file_net ;
    public final CommandLineParser.load_return load() throws RecognitionException {
        CommandLineParser.load_return retval = new CommandLineParser.load_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal16=null;
        CommandLineParser.file_net_return p1 =null;


        Object string_literal16_tree=null;

        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:139:2: ( 'load' p1= file_net )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:139:4: 'load' p1= file_net
            {
            root_0 = (Object)adaptor.nil();


            string_literal16=(Token)match(input,64,FOLLOW_64_in_load204); 
            string_literal16_tree = 
            (Object)adaptor.create(string_literal16)
            ;
            adaptor.addChild(root_0, string_literal16_tree);


            pushFollow(FOLLOW_file_net_in_load208);
            p1=file_net();

            state._fsp--;

            adaptor.addChild(root_0, p1.getTree());

             onLoad((p1!=null?input.toString(p1.start,p1.stop):null)); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "load"


    public static class graphe_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "graphe"
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:142:1: graphe : 'graphe' ;
    public final CommandLineParser.graphe_return graphe() throws RecognitionException {
        CommandLineParser.graphe_return retval = new CommandLineParser.graphe_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal17=null;

        Object string_literal17_tree=null;

        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:143:2: ( 'graphe' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:143:4: 'graphe'
            {
            root_0 = (Object)adaptor.nil();


            string_literal17=(Token)match(input,62,FOLLOW_62_in_graphe222); 
            string_literal17_tree = 
            (Object)adaptor.create(string_literal17)
            ;
            adaptor.addChild(root_0, string_literal17_tree);


             onGraphe(); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "graphe"


    public static class look_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "look"
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:146:1: look : 'look' p1= etat ;
    public final CommandLineParser.look_return look() throws RecognitionException {
        CommandLineParser.look_return retval = new CommandLineParser.look_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal18=null;
        CommandLineParser.etat_return p1 =null;


        Object string_literal18_tree=null;

        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:147:2: ( 'look' p1= etat )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:147:4: 'look' p1= etat
            {
            root_0 = (Object)adaptor.nil();


            string_literal18=(Token)match(input,65,FOLLOW_65_in_look236); 
            string_literal18_tree = 
            (Object)adaptor.create(string_literal18)
            ;
            adaptor.addChild(root_0, string_literal18_tree);


            pushFollow(FOLLOW_etat_in_look240);
            p1=etat();

            state._fsp--;

            adaptor.addChild(root_0, p1.getTree());

            onLook(etat((p1!=null?input.toString(p1.start,p1.stop):null))); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "look"


    public static class succ_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "succ"
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:150:1: succ : 'succ' p1= etat ;
    public final CommandLineParser.succ_return succ() throws RecognitionException {
        CommandLineParser.succ_return retval = new CommandLineParser.succ_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal19=null;
        CommandLineParser.etat_return p1 =null;


        Object string_literal19_tree=null;

        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:151:2: ( 'succ' p1= etat )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:151:4: 'succ' p1= etat
            {
            root_0 = (Object)adaptor.nil();


            string_literal19=(Token)match(input,69,FOLLOW_69_in_succ254); 
            string_literal19_tree = 
            (Object)adaptor.create(string_literal19)
            ;
            adaptor.addChild(root_0, string_literal19_tree);


            pushFollow(FOLLOW_etat_in_succ258);
            p1=etat();

            state._fsp--;

            adaptor.addChild(root_0, p1.getTree());

             onSucc(etat((p1!=null?input.toString(p1.start,p1.stop):null))); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "succ"


    public static class todot_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "todot"
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:154:1: todot : 'todot' p1= file_dot ;
    public final CommandLineParser.todot_return todot() throws RecognitionException {
        CommandLineParser.todot_return retval = new CommandLineParser.todot_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal20=null;
        CommandLineParser.file_dot_return p1 =null;


        Object string_literal20_tree=null;

        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:155:2: ( 'todot' p1= file_dot )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:155:4: 'todot' p1= file_dot
            {
            root_0 = (Object)adaptor.nil();


            string_literal20=(Token)match(input,70,FOLLOW_70_in_todot272); 
            string_literal20_tree = 
            (Object)adaptor.create(string_literal20)
            ;
            adaptor.addChild(root_0, string_literal20_tree);


            pushFollow(FOLLOW_file_dot_in_todot276);
            p1=file_dot();

            state._fsp--;

            adaptor.addChild(root_0, p1.getTree());

             onToDot((p1!=null?input.toString(p1.start,p1.stop):null)); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "todot"


    public static class ctl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ctl"
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:158:1: ctl : 'ctl' p1= formule (p2= etat |) ;
    public final CommandLineParser.ctl_return ctl() throws RecognitionException {
        CommandLineParser.ctl_return retval = new CommandLineParser.ctl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal21=null;
        CommandLineParser.formule_return p1 =null;

        CommandLineParser.etat_return p2 =null;


        Object string_literal21_tree=null;

        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:159:2: ( 'ctl' p1= formule (p2= etat |) )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:159:4: 'ctl' p1= formule (p2= etat |)
            {
            root_0 = (Object)adaptor.nil();


            string_literal21=(Token)match(input,56,FOLLOW_56_in_ctl290); 
            string_literal21_tree = 
            (Object)adaptor.create(string_literal21)
            ;
            adaptor.addChild(root_0, string_literal21_tree);


            pushFollow(FOLLOW_formule_in_ctl294);
            p1=formule();

            state._fsp--;

            adaptor.addChild(root_0, p1.getTree());

            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:159:21: (p2= etat |)
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==NUMBER) ) {
                alt3=1;
            }
            else if ( (LA3_0==EOF||LA3_0==43) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:160:3: p2= etat
                    {
                    pushFollow(FOLLOW_etat_in_ctl302);
                    p2=etat();

                    state._fsp--;

                    adaptor.addChild(root_0, p2.getTree());

                     onCtl(formule((p1!=null?((Object)p1.tree):null)), etat((p2!=null?input.toString(p2.start,p2.stop):null))); 

                    }
                    break;
                case 2 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:161:5: 
                    {
                     onCtl(formule((p1!=null?((Object)p1.tree):null))); 

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ctl"


    public static class ctltodot_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ctltodot"
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:165:1: ctltodot : 'ctltodot' p1= formule p2= file_dot ;
    public final CommandLineParser.ctltodot_return ctltodot() throws RecognitionException {
        CommandLineParser.ctltodot_return retval = new CommandLineParser.ctltodot_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal22=null;
        CommandLineParser.formule_return p1 =null;

        CommandLineParser.file_dot_return p2 =null;


        Object string_literal22_tree=null;

        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:166:2: ( 'ctltodot' p1= formule p2= file_dot )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:166:4: 'ctltodot' p1= formule p2= file_dot
            {
            root_0 = (Object)adaptor.nil();


            string_literal22=(Token)match(input,57,FOLLOW_57_in_ctltodot325); 
            string_literal22_tree = 
            (Object)adaptor.create(string_literal22)
            ;
            adaptor.addChild(root_0, string_literal22_tree);


            pushFollow(FOLLOW_formule_in_ctltodot329);
            p1=formule();

            state._fsp--;

            adaptor.addChild(root_0, p1.getTree());

            pushFollow(FOLLOW_file_dot_in_ctltodot333);
            p2=file_dot();

            state._fsp--;

            adaptor.addChild(root_0, p2.getTree());

             onCtlToDot(formule((p1!=null?((Object)p1.tree):null)), (p2!=null?input.toString(p2.start,p2.stop):null)); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ctltodot"


    public static class justifie_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "justifie"
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:169:1: justifie : 'Justifie' p1= formule p2= etat ;
    public final CommandLineParser.justifie_return justifie() throws RecognitionException {
        CommandLineParser.justifie_return retval = new CommandLineParser.justifie_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal23=null;
        CommandLineParser.formule_return p1 =null;

        CommandLineParser.etat_return p2 =null;


        Object string_literal23_tree=null;

        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:170:2: ( 'Justifie' p1= formule p2= etat )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:170:4: 'Justifie' p1= formule p2= etat
            {
            root_0 = (Object)adaptor.nil();


            string_literal23=(Token)match(input,52,FOLLOW_52_in_justifie347); 
            string_literal23_tree = 
            (Object)adaptor.create(string_literal23)
            ;
            adaptor.addChild(root_0, string_literal23_tree);


            pushFollow(FOLLOW_formule_in_justifie351);
            p1=formule();

            state._fsp--;

            adaptor.addChild(root_0, p1.getTree());

            pushFollow(FOLLOW_etat_in_justifie355);
            p2=etat();

            state._fsp--;

            adaptor.addChild(root_0, p2.getTree());

             onJustifie(formule((p1!=null?((Object)p1.tree):null)), etat((p2!=null?input.toString(p2.start,p2.stop):null))); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "justifie"


    public static class justifietodot_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "justifietodot"
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:173:1: justifietodot : 'Justifietodot' p1= formule p2= etat p3= file_dot ;
    public final CommandLineParser.justifietodot_return justifietodot() throws RecognitionException {
        CommandLineParser.justifietodot_return retval = new CommandLineParser.justifietodot_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal24=null;
        CommandLineParser.formule_return p1 =null;

        CommandLineParser.etat_return p2 =null;

        CommandLineParser.file_dot_return p3 =null;


        Object string_literal24_tree=null;

        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:174:2: ( 'Justifietodot' p1= formule p2= etat p3= file_dot )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:174:4: 'Justifietodot' p1= formule p2= etat p3= file_dot
            {
            root_0 = (Object)adaptor.nil();


            string_literal24=(Token)match(input,53,FOLLOW_53_in_justifietodot369); 
            string_literal24_tree = 
            (Object)adaptor.create(string_literal24)
            ;
            adaptor.addChild(root_0, string_literal24_tree);


            pushFollow(FOLLOW_formule_in_justifietodot373);
            p1=formule();

            state._fsp--;

            adaptor.addChild(root_0, p1.getTree());

            pushFollow(FOLLOW_etat_in_justifietodot377);
            p2=etat();

            state._fsp--;

            adaptor.addChild(root_0, p2.getTree());

            pushFollow(FOLLOW_file_dot_in_justifietodot381);
            p3=file_dot();

            state._fsp--;

            adaptor.addChild(root_0, p3.getTree());

             onJustifieToDot(formule((p1!=null?((Object)p1.tree):null)), etat((p2!=null?input.toString(p2.start,p2.stop):null)), (p3!=null?input.toString(p3.start,p3.stop):null)); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "justifietodot"


    public static class stop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stop"
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:177:1: stop : 'stop' ;
    public final CommandLineParser.stop_return stop() throws RecognitionException {
        CommandLineParser.stop_return retval = new CommandLineParser.stop_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal25=null;

        Object string_literal25_tree=null;

        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:178:2: ( 'stop' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:178:4: 'stop'
            {
            root_0 = (Object)adaptor.nil();


            string_literal25=(Token)match(input,68,FOLLOW_68_in_stop395); 
            string_literal25_tree = 
            (Object)adaptor.create(string_literal25)
            ;
            adaptor.addChild(root_0, string_literal25_tree);


             onStop(); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stop"


    public static class file_net_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "file_net"
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:181:1: file_net : (p= STRING_FILE_NET | filename 'net' );
    public final CommandLineParser.file_net_return file_net() throws RecognitionException {
        CommandLineParser.file_net_return retval = new CommandLineParser.file_net_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token p=null;
        Token string_literal27=null;
        CommandLineParser.filename_return filename26 =null;


        Object p_tree=null;
        Object string_literal27_tree=null;

        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:182:2: (p= STRING_FILE_NET | filename 'net' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==STRING_FILE_NET) ) {
                alt4=1;
            }
            else if ( (LA4_0==LETTER||LA4_0==38||(LA4_0 >= 40 && LA4_0 <= 41)||LA4_0==55) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:182:4: p= STRING_FILE_NET
                    {
                    root_0 = (Object)adaptor.nil();


                    p=(Token)match(input,STRING_FILE_NET,FOLLOW_STRING_FILE_NET_in_file_net411); 
                    p_tree = 
                    (Object)adaptor.create(p)
                    ;
                    adaptor.addChild(root_0, p_tree);


                     p.setText((p!=null?p.getText():null).substring(1, (p!=null?p.getText():null).length() - 1)); 

                    }
                    break;
                case 2 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:183:4: filename 'net'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_filename_in_file_net418);
                    filename26=filename();

                    state._fsp--;

                    adaptor.addChild(root_0, filename26.getTree());

                    string_literal27=(Token)match(input,66,FOLLOW_66_in_file_net420); 
                    string_literal27_tree = 
                    (Object)adaptor.create(string_literal27)
                    ;
                    adaptor.addChild(root_0, string_literal27_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "file_net"


    public static class file_dot_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "file_dot"
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:186:1: file_dot : (p= STRING_FILE_DOT | filename 'dot' );
    public final CommandLineParser.file_dot_return file_dot() throws RecognitionException {
        CommandLineParser.file_dot_return retval = new CommandLineParser.file_dot_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token p=null;
        Token string_literal29=null;
        CommandLineParser.filename_return filename28 =null;


        Object p_tree=null;
        Object string_literal29_tree=null;

        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:187:2: (p= STRING_FILE_DOT | filename 'dot' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==STRING_FILE_DOT) ) {
                alt5=1;
            }
            else if ( (LA5_0==LETTER||LA5_0==38||(LA5_0 >= 40 && LA5_0 <= 41)||LA5_0==55) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:187:4: p= STRING_FILE_DOT
                    {
                    root_0 = (Object)adaptor.nil();


                    p=(Token)match(input,STRING_FILE_DOT,FOLLOW_STRING_FILE_DOT_in_file_dot434); 
                    p_tree = 
                    (Object)adaptor.create(p)
                    ;
                    adaptor.addChild(root_0, p_tree);


                     p.setText( (p!=null?p.getText():null).substring(1, (p!=null?p.getText():null).length() - 1)); 

                    }
                    break;
                case 2 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:188:4: filename 'dot'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_filename_in_file_dot441);
                    filename28=filename();

                    state._fsp--;

                    adaptor.addChild(root_0, filename28.getTree());

                    string_literal29=(Token)match(input,59,FOLLOW_59_in_file_dot443); 
                    string_literal29_tree = 
                    (Object)adaptor.create(string_literal29)
                    ;
                    adaptor.addChild(root_0, string_literal29_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "file_dot"


    public static class filename_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "filename"
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:191:1: filename : ( path_modifier )? ( LETTER | '_' | '-' )+ ( '.' | '/' filename ) ;
    public final CommandLineParser.filename_return filename() throws RecognitionException {
        CommandLineParser.filename_return retval = new CommandLineParser.filename_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set31=null;
        Token char_literal32=null;
        Token char_literal33=null;
        CommandLineParser.path_modifier_return path_modifier30 =null;

        CommandLineParser.filename_return filename34 =null;


        Object set31_tree=null;
        Object char_literal32_tree=null;
        Object char_literal33_tree=null;

        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:192:2: ( ( path_modifier )? ( LETTER | '_' | '-' )+ ( '.' | '/' filename ) )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:192:4: ( path_modifier )? ( LETTER | '_' | '-' )+ ( '.' | '/' filename )
            {
            root_0 = (Object)adaptor.nil();


            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:192:4: ( path_modifier )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0 >= 40 && LA6_0 <= 41)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:192:4: path_modifier
                    {
                    pushFollow(FOLLOW_path_modifier_in_filename456);
                    path_modifier30=path_modifier();

                    state._fsp--;

                    adaptor.addChild(root_0, path_modifier30.getTree());

                    }
                    break;

            }


            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:192:19: ( LETTER | '_' | '-' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==LETTER||LA7_0==38||LA7_0==55) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:
            	    {
            	    set31=(Token)input.LT(1);

            	    if ( input.LA(1)==LETTER||input.LA(1)==38||input.LA(1)==55 ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set31)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
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


            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:192:41: ( '.' | '/' filename )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==39) ) {
                alt8=1;
            }
            else if ( (LA8_0==42) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:193:3: '.'
                    {
                    char_literal32=(Token)match(input,39,FOLLOW_39_in_filename476); 
                    char_literal32_tree = 
                    (Object)adaptor.create(char_literal32)
                    ;
                    adaptor.addChild(root_0, char_literal32_tree);


                    }
                    break;
                case 2 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:194:5: '/' filename
                    {
                    char_literal33=(Token)match(input,42,FOLLOW_42_in_filename482); 
                    char_literal33_tree = 
                    (Object)adaptor.create(char_literal33)
                    ;
                    adaptor.addChild(root_0, char_literal33_tree);


                    pushFollow(FOLLOW_filename_in_filename484);
                    filename34=filename();

                    state._fsp--;

                    adaptor.addChild(root_0, filename34.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "filename"


    public static class path_modifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "path_modifier"
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:198:1: path_modifier : ( './' | '../' );
    public final CommandLineParser.path_modifier_return path_modifier() throws RecognitionException {
        CommandLineParser.path_modifier_return retval = new CommandLineParser.path_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set35=null;

        Object set35_tree=null;

        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:199:2: ( './' | '../' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:
            {
            root_0 = (Object)adaptor.nil();


            set35=(Token)input.LT(1);

            if ( (input.LA(1) >= 40 && input.LA(1) <= 41) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set35)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "path_modifier"


    public static class formule_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "formule"
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:204:1: formule : term3 ( OR ^ term3 )* ;
    public final CommandLineParser.formule_return formule() throws RecognitionException {
        CommandLineParser.formule_return retval = new CommandLineParser.formule_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token OR37=null;
        CommandLineParser.term3_return term336 =null;

        CommandLineParser.term3_return term338 =null;


        Object OR37_tree=null;

        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:205:2: ( term3 ( OR ^ term3 )* )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:205:4: term3 ( OR ^ term3 )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_term3_in_formule517);
            term336=term3();

            state._fsp--;

            adaptor.addChild(root_0, term336.getTree());

            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:205:10: ( OR ^ term3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==OR) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:205:11: OR ^ term3
            	    {
            	    OR37=(Token)match(input,OR,FOLLOW_OR_in_formule520); 
            	    OR37_tree = 
            	    (Object)adaptor.create(OR37)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(OR37_tree, root_0);


            	    pushFollow(FOLLOW_term3_in_formule523);
            	    term338=term3();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term338.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "formule"


    public static class term3_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term3"
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:208:1: term3 : term2 ( EQUIV ^ term2 )* ;
    public final CommandLineParser.term3_return term3() throws RecognitionException {
        CommandLineParser.term3_return retval = new CommandLineParser.term3_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EQUIV40=null;
        CommandLineParser.term2_return term239 =null;

        CommandLineParser.term2_return term241 =null;


        Object EQUIV40_tree=null;

        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:209:2: ( term2 ( EQUIV ^ term2 )* )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:209:4: term2 ( EQUIV ^ term2 )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_term2_in_term3536);
            term239=term2();

            state._fsp--;

            adaptor.addChild(root_0, term239.getTree());

            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:209:10: ( EQUIV ^ term2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==EQUIV) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:209:11: EQUIV ^ term2
            	    {
            	    EQUIV40=(Token)match(input,EQUIV,FOLLOW_EQUIV_in_term3539); 
            	    EQUIV40_tree = 
            	    (Object)adaptor.create(EQUIV40)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(EQUIV40_tree, root_0);


            	    pushFollow(FOLLOW_term2_in_term3542);
            	    term241=term2();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term241.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term3"


    public static class term2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term2"
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:212:1: term2 : term1 ( IMPLY ^ term1 )? ;
    public final CommandLineParser.term2_return term2() throws RecognitionException {
        CommandLineParser.term2_return retval = new CommandLineParser.term2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IMPLY43=null;
        CommandLineParser.term1_return term142 =null;

        CommandLineParser.term1_return term144 =null;


        Object IMPLY43_tree=null;

        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:213:2: ( term1 ( IMPLY ^ term1 )? )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:213:4: term1 ( IMPLY ^ term1 )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_term1_in_term2555);
            term142=term1();

            state._fsp--;

            adaptor.addChild(root_0, term142.getTree());

            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:213:10: ( IMPLY ^ term1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==IMPLY) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:213:11: IMPLY ^ term1
                    {
                    IMPLY43=(Token)match(input,IMPLY,FOLLOW_IMPLY_in_term2558); 
                    IMPLY43_tree = 
                    (Object)adaptor.create(IMPLY43)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(IMPLY43_tree, root_0);


                    pushFollow(FOLLOW_term1_in_term2561);
                    term144=term1();

                    state._fsp--;

                    adaptor.addChild(root_0, term144.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term2"


    public static class term1_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term1"
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:216:1: term1 : term0 ( AND ^ term0 )* ;
    public final CommandLineParser.term1_return term1() throws RecognitionException {
        CommandLineParser.term1_return retval = new CommandLineParser.term1_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AND46=null;
        CommandLineParser.term0_return term045 =null;

        CommandLineParser.term0_return term047 =null;


        Object AND46_tree=null;

        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:217:2: ( term0 ( AND ^ term0 )* )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:217:4: term0 ( AND ^ term0 )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_term0_in_term1575);
            term045=term0();

            state._fsp--;

            adaptor.addChild(root_0, term045.getTree());

            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:217:10: ( AND ^ term0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==AND) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:217:11: AND ^ term0
            	    {
            	    AND46=(Token)match(input,AND,FOLLOW_AND_in_term1578); 
            	    AND46_tree = 
            	    (Object)adaptor.create(AND46)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(AND46_tree, root_0);


            	    pushFollow(FOLLOW_term0_in_term1581);
            	    term047=term0();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term047.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term1"


    public static class term0_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term0"
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:220:1: term0 : ( atom | term01 | term02 );
    public final CommandLineParser.term0_return term0() throws RecognitionException {
        CommandLineParser.term0_return retval = new CommandLineParser.term0_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        CommandLineParser.atom_return atom48 =null;

        CommandLineParser.term01_return term0149 =null;

        CommandLineParser.term02_return term0250 =null;



        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:221:2: ( atom | term01 | term02 )
            int alt13=3;
            switch ( input.LA(1) ) {
            case ATOM:
            case 36:
            case 58:
            case 60:
            case 61:
            case 63:
            case 71:
                {
                alt13=1;
                }
                break;
            case 35:
                {
                alt13=2;
                }
                break;
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:221:4: atom
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_atom_in_term0596);
                    atom48=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom48.getTree());

                    }
                    break;
                case 2 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:222:4: term01
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_term01_in_term0601);
                    term0149=term01();

                    state._fsp--;

                    adaptor.addChild(root_0, term0149.getTree());

                    }
                    break;
                case 3 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:223:4: term02
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_term02_in_term0606);
                    term0250=term02();

                    state._fsp--;

                    adaptor.addChild(root_0, term0250.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term0"


    public static class term01_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term01"
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:226:1: term01 : ( '!' ( atom -> ^( NEG atom ) | term02 -> ^( NEG term02 ) ) | '!' term01 -> ^( NEG term01 ) );
    public final CommandLineParser.term01_return term01() throws RecognitionException {
        CommandLineParser.term01_return retval = new CommandLineParser.term01_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal51=null;
        Token char_literal54=null;
        CommandLineParser.atom_return atom52 =null;

        CommandLineParser.term02_return term0253 =null;

        CommandLineParser.term01_return term0155 =null;


        Object char_literal51_tree=null;
        Object char_literal54_tree=null;
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleSubtreeStream stream_term01=new RewriteRuleSubtreeStream(adaptor,"rule term01");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        RewriteRuleSubtreeStream stream_term02=new RewriteRuleSubtreeStream(adaptor,"rule term02");
        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:227:2: ( '!' ( atom -> ^( NEG atom ) | term02 -> ^( NEG term02 ) ) | '!' term01 -> ^( NEG term01 ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==ATOM||LA15_1==36||(LA15_1 >= 44 && LA15_1 <= 51)||LA15_1==58||(LA15_1 >= 60 && LA15_1 <= 61)||LA15_1==63||LA15_1==71) ) {
                    alt15=1;
                }
                else if ( (LA15_1==35) ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:227:4: '!' ( atom -> ^( NEG atom ) | term02 -> ^( NEG term02 ) )
                    {
                    char_literal51=(Token)match(input,35,FOLLOW_35_in_term01618);  
                    stream_35.add(char_literal51);


                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:227:8: ( atom -> ^( NEG atom ) | term02 -> ^( NEG term02 ) )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==ATOM||LA14_0==36||LA14_0==58||(LA14_0 >= 60 && LA14_0 <= 61)||LA14_0==63||LA14_0==71) ) {
                        alt14=1;
                    }
                    else if ( ((LA14_0 >= 44 && LA14_0 <= 51)) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;

                    }
                    switch (alt14) {
                        case 1 :
                            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:228:3: atom
                            {
                            pushFollow(FOLLOW_atom_in_term01624);
                            atom52=atom();

                            state._fsp--;

                            stream_atom.add(atom52.getTree());

                            // AST REWRITE
                            // elements: atom
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 228:8: -> ^( NEG atom )
                            {
                                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:228:11: ^( NEG atom )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot(
                                (Object)adaptor.create(NEG, "NEG")
                                , root_1);

                                adaptor.addChild(root_1, stream_atom.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;

                            }
                            break;
                        case 2 :
                            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:229:5: term02
                            {
                            pushFollow(FOLLOW_term02_in_term01638);
                            term0253=term02();

                            state._fsp--;

                            stream_term02.add(term0253.getTree());

                            // AST REWRITE
                            // elements: term02
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 229:12: -> ^( NEG term02 )
                            {
                                // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:229:15: ^( NEG term02 )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot(
                                (Object)adaptor.create(NEG, "NEG")
                                , root_1);

                                adaptor.addChild(root_1, stream_term02.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:231:4: '!' term01
                    {
                    char_literal54=(Token)match(input,35,FOLLOW_35_in_term01654);  
                    stream_35.add(char_literal54);


                    pushFollow(FOLLOW_term01_in_term01656);
                    term0155=term01();

                    state._fsp--;

                    stream_term01.add(term0155.getTree());

                    // AST REWRITE
                    // elements: term01
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 231:15: -> ^( NEG term01 )
                    {
                        // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:231:18: ^( NEG term01 )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NEG, "NEG")
                        , root_1);

                        adaptor.addChild(root_1, stream_term01.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term01"


    public static class term02_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term02"
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:234:1: term02 : ( 'EF' atom -> ^( EF atom ) | 'EG' atom -> ^( EG atom ) | 'EX' atom -> ^( EX atom ) | 'AF' atom -> ^( AF atom ) | 'AG' atom -> ^( AG atom ) | 'AX' atom -> ^( AX atom ) | 'E' '(' formule 'U' formule ')' -> ^( EU formule formule ) | 'A' '(' formule 'U' formule ')' -> ^( AU formule formule ) );
    public final CommandLineParser.term02_return term02() throws RecognitionException {
        CommandLineParser.term02_return retval = new CommandLineParser.term02_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal56=null;
        Token string_literal58=null;
        Token string_literal60=null;
        Token string_literal62=null;
        Token string_literal64=null;
        Token string_literal66=null;
        Token char_literal68=null;
        Token char_literal69=null;
        Token char_literal71=null;
        Token char_literal73=null;
        Token char_literal74=null;
        Token char_literal75=null;
        Token char_literal77=null;
        Token char_literal79=null;
        CommandLineParser.atom_return atom57 =null;

        CommandLineParser.atom_return atom59 =null;

        CommandLineParser.atom_return atom61 =null;

        CommandLineParser.atom_return atom63 =null;

        CommandLineParser.atom_return atom65 =null;

        CommandLineParser.atom_return atom67 =null;

        CommandLineParser.formule_return formule70 =null;

        CommandLineParser.formule_return formule72 =null;

        CommandLineParser.formule_return formule76 =null;

        CommandLineParser.formule_return formule78 =null;


        Object string_literal56_tree=null;
        Object string_literal58_tree=null;
        Object string_literal60_tree=null;
        Object string_literal62_tree=null;
        Object string_literal64_tree=null;
        Object string_literal66_tree=null;
        Object char_literal68_tree=null;
        Object char_literal69_tree=null;
        Object char_literal71_tree=null;
        Object char_literal73_tree=null;
        Object char_literal74_tree=null;
        Object char_literal75_tree=null;
        Object char_literal77_tree=null;
        Object char_literal79_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        RewriteRuleSubtreeStream stream_formule=new RewriteRuleSubtreeStream(adaptor,"rule formule");
        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:235:2: ( 'EF' atom -> ^( EF atom ) | 'EG' atom -> ^( EG atom ) | 'EX' atom -> ^( EX atom ) | 'AF' atom -> ^( AF atom ) | 'AG' atom -> ^( AG atom ) | 'AX' atom -> ^( AX atom ) | 'E' '(' formule 'U' formule ')' -> ^( EU formule formule ) | 'A' '(' formule 'U' formule ')' -> ^( AU formule formule ) )
            int alt16=8;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt16=1;
                }
                break;
            case 50:
                {
                alt16=2;
                }
                break;
            case 51:
                {
                alt16=3;
                }
                break;
            case 45:
                {
                alt16=4;
                }
                break;
            case 46:
                {
                alt16=5;
                }
                break;
            case 47:
                {
                alt16=6;
                }
                break;
            case 48:
                {
                alt16=7;
                }
                break;
            case 44:
                {
                alt16=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:235:4: 'EF' atom
                    {
                    string_literal56=(Token)match(input,49,FOLLOW_49_in_term02676);  
                    stream_49.add(string_literal56);


                    pushFollow(FOLLOW_atom_in_term02678);
                    atom57=atom();

                    state._fsp--;

                    stream_atom.add(atom57.getTree());

                    // AST REWRITE
                    // elements: atom
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 235:14: -> ^( EF atom )
                    {
                        // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:235:17: ^( EF atom )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(EF, "EF")
                        , root_1);

                        adaptor.addChild(root_1, stream_atom.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:236:4: 'EG' atom
                    {
                    string_literal58=(Token)match(input,50,FOLLOW_50_in_term02691);  
                    stream_50.add(string_literal58);


                    pushFollow(FOLLOW_atom_in_term02693);
                    atom59=atom();

                    state._fsp--;

                    stream_atom.add(atom59.getTree());

                    // AST REWRITE
                    // elements: atom
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 236:14: -> ^( EG atom )
                    {
                        // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:236:17: ^( EG atom )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(EG, "EG")
                        , root_1);

                        adaptor.addChild(root_1, stream_atom.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:237:4: 'EX' atom
                    {
                    string_literal60=(Token)match(input,51,FOLLOW_51_in_term02706);  
                    stream_51.add(string_literal60);


                    pushFollow(FOLLOW_atom_in_term02708);
                    atom61=atom();

                    state._fsp--;

                    stream_atom.add(atom61.getTree());

                    // AST REWRITE
                    // elements: atom
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 237:14: -> ^( EX atom )
                    {
                        // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:237:17: ^( EX atom )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(EX, "EX")
                        , root_1);

                        adaptor.addChild(root_1, stream_atom.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:238:4: 'AF' atom
                    {
                    string_literal62=(Token)match(input,45,FOLLOW_45_in_term02721);  
                    stream_45.add(string_literal62);


                    pushFollow(FOLLOW_atom_in_term02723);
                    atom63=atom();

                    state._fsp--;

                    stream_atom.add(atom63.getTree());

                    // AST REWRITE
                    // elements: atom
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 238:14: -> ^( AF atom )
                    {
                        // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:238:17: ^( AF atom )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(AF, "AF")
                        , root_1);

                        adaptor.addChild(root_1, stream_atom.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:239:4: 'AG' atom
                    {
                    string_literal64=(Token)match(input,46,FOLLOW_46_in_term02736);  
                    stream_46.add(string_literal64);


                    pushFollow(FOLLOW_atom_in_term02738);
                    atom65=atom();

                    state._fsp--;

                    stream_atom.add(atom65.getTree());

                    // AST REWRITE
                    // elements: atom
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 239:14: -> ^( AG atom )
                    {
                        // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:239:17: ^( AG atom )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(AG, "AG")
                        , root_1);

                        adaptor.addChild(root_1, stream_atom.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:240:4: 'AX' atom
                    {
                    string_literal66=(Token)match(input,47,FOLLOW_47_in_term02751);  
                    stream_47.add(string_literal66);


                    pushFollow(FOLLOW_atom_in_term02753);
                    atom67=atom();

                    state._fsp--;

                    stream_atom.add(atom67.getTree());

                    // AST REWRITE
                    // elements: atom
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 240:14: -> ^( AX atom )
                    {
                        // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:240:17: ^( AX atom )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(AX, "AX")
                        , root_1);

                        adaptor.addChild(root_1, stream_atom.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 7 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:241:4: 'E' '(' formule 'U' formule ')'
                    {
                    char_literal68=(Token)match(input,48,FOLLOW_48_in_term02766);  
                    stream_48.add(char_literal68);


                    char_literal69=(Token)match(input,36,FOLLOW_36_in_term02768);  
                    stream_36.add(char_literal69);


                    pushFollow(FOLLOW_formule_in_term02770);
                    formule70=formule();

                    state._fsp--;

                    stream_formule.add(formule70.getTree());

                    char_literal71=(Token)match(input,54,FOLLOW_54_in_term02772);  
                    stream_54.add(char_literal71);


                    pushFollow(FOLLOW_formule_in_term02774);
                    formule72=formule();

                    state._fsp--;

                    stream_formule.add(formule72.getTree());

                    char_literal73=(Token)match(input,37,FOLLOW_37_in_term02776);  
                    stream_37.add(char_literal73);


                    // AST REWRITE
                    // elements: formule, formule
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 241:36: -> ^( EU formule formule )
                    {
                        // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:241:39: ^( EU formule formule )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(EU, "EU")
                        , root_1);

                        adaptor.addChild(root_1, stream_formule.nextTree());

                        adaptor.addChild(root_1, stream_formule.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 8 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:242:4: 'A' '(' formule 'U' formule ')'
                    {
                    char_literal74=(Token)match(input,44,FOLLOW_44_in_term02791);  
                    stream_44.add(char_literal74);


                    char_literal75=(Token)match(input,36,FOLLOW_36_in_term02793);  
                    stream_36.add(char_literal75);


                    pushFollow(FOLLOW_formule_in_term02795);
                    formule76=formule();

                    state._fsp--;

                    stream_formule.add(formule76.getTree());

                    char_literal77=(Token)match(input,54,FOLLOW_54_in_term02797);  
                    stream_54.add(char_literal77);


                    pushFollow(FOLLOW_formule_in_term02799);
                    formule78=formule();

                    state._fsp--;

                    stream_formule.add(formule78.getTree());

                    char_literal79=(Token)match(input,37,FOLLOW_37_in_term02801);  
                    stream_37.add(char_literal79);


                    // AST REWRITE
                    // elements: formule, formule
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 242:36: -> ^( AU formule formule )
                    {
                        // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:242:39: ^( AU formule formule )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(AU, "AU")
                        , root_1);

                        adaptor.addChild(root_1, stream_formule.nextTree());

                        adaptor.addChild(root_1, stream_formule.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term02"


    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:245:1: atom : (p= ATOM | 'dead' -> DEAD | 'initial' -> INITIAL | 'enable' '(' ATOM ')' -> ^( ENABLE ATOM ) | 'true' -> TRUE | 'false' -> FALSE | '(' ! formule ')' !);
    public final CommandLineParser.atom_return atom() throws RecognitionException {
        CommandLineParser.atom_return retval = new CommandLineParser.atom_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token p=null;
        Token string_literal80=null;
        Token string_literal81=null;
        Token string_literal82=null;
        Token char_literal83=null;
        Token ATOM84=null;
        Token char_literal85=null;
        Token string_literal86=null;
        Token string_literal87=null;
        Token char_literal88=null;
        Token char_literal90=null;
        CommandLineParser.formule_return formule89 =null;


        Object p_tree=null;
        Object string_literal80_tree=null;
        Object string_literal81_tree=null;
        Object string_literal82_tree=null;
        Object char_literal83_tree=null;
        Object ATOM84_tree=null;
        Object char_literal85_tree=null;
        Object string_literal86_tree=null;
        Object string_literal87_tree=null;
        Object char_literal88_tree=null;
        Object char_literal90_tree=null;
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_ATOM=new RewriteRuleTokenStream(adaptor,"token ATOM");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");

        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:246:2: (p= ATOM | 'dead' -> DEAD | 'initial' -> INITIAL | 'enable' '(' ATOM ')' -> ^( ENABLE ATOM ) | 'true' -> TRUE | 'false' -> FALSE | '(' ! formule ')' !)
            int alt17=7;
            switch ( input.LA(1) ) {
            case ATOM:
                {
                alt17=1;
                }
                break;
            case 58:
                {
                alt17=2;
                }
                break;
            case 63:
                {
                alt17=3;
                }
                break;
            case 60:
                {
                alt17=4;
                }
                break;
            case 71:
                {
                alt17=5;
                }
                break;
            case 61:
                {
                alt17=6;
                }
                break;
            case 36:
                {
                alt17=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }

            switch (alt17) {
                case 1 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:246:4: p= ATOM
                    {
                    root_0 = (Object)adaptor.nil();


                    p=(Token)match(input,ATOM,FOLLOW_ATOM_in_atom825); 
                    p_tree = 
                    (Object)adaptor.create(p)
                    ;
                    adaptor.addChild(root_0, p_tree);


                     p.setText((p!=null?p.getText():null).substring(1)); 

                    }
                    break;
                case 2 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:247:4: 'dead'
                    {
                    string_literal80=(Token)match(input,58,FOLLOW_58_in_atom832);  
                    stream_58.add(string_literal80);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 247:11: -> DEAD
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(DEAD, "DEAD")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:248:4: 'initial'
                    {
                    string_literal81=(Token)match(input,63,FOLLOW_63_in_atom841);  
                    stream_63.add(string_literal81);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 248:14: -> INITIAL
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(INITIAL, "INITIAL")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:249:4: 'enable' '(' ATOM ')'
                    {
                    string_literal82=(Token)match(input,60,FOLLOW_60_in_atom850);  
                    stream_60.add(string_literal82);


                    char_literal83=(Token)match(input,36,FOLLOW_36_in_atom852);  
                    stream_36.add(char_literal83);


                    ATOM84=(Token)match(input,ATOM,FOLLOW_ATOM_in_atom854);  
                    stream_ATOM.add(ATOM84);


                    char_literal85=(Token)match(input,37,FOLLOW_37_in_atom856);  
                    stream_37.add(char_literal85);


                    // AST REWRITE
                    // elements: ATOM
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 249:26: -> ^( ENABLE ATOM )
                    {
                        // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:249:29: ^( ENABLE ATOM )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ENABLE, "ENABLE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ATOM.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:250:4: 'true'
                    {
                    string_literal86=(Token)match(input,71,FOLLOW_71_in_atom869);  
                    stream_71.add(string_literal86);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 250:11: -> TRUE
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(TRUE, "TRUE")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:251:4: 'false'
                    {
                    string_literal87=(Token)match(input,61,FOLLOW_61_in_atom878);  
                    stream_61.add(string_literal87);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 251:12: -> FALSE
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(FALSE, "FALSE")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 7 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:252:4: '(' ! formule ')' !
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal88=(Token)match(input,36,FOLLOW_36_in_atom887); 

                    pushFollow(FOLLOW_formule_in_atom890);
                    formule89=formule();

                    state._fsp--;

                    adaptor.addChild(root_0, formule89.getTree());

                    char_literal90=(Token)match(input,37,FOLLOW_37_in_atom892); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"


    public static class etat_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "etat"
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:256:1: etat : ( NUMBER )+ ;
    public final CommandLineParser.etat_return etat() throws RecognitionException {
        CommandLineParser.etat_return retval = new CommandLineParser.etat_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NUMBER91=null;

        Object NUMBER91_tree=null;

        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:257:2: ( ( NUMBER )+ )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:257:4: ( NUMBER )+
            {
            root_0 = (Object)adaptor.nil();


            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:257:4: ( NUMBER )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==NUMBER) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:257:4: NUMBER
            	    {
            	    NUMBER91=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_etat907); 
            	    NUMBER91_tree = 
            	    (Object)adaptor.create(NUMBER91)
            	    ;
            	    adaptor.addChild(root_0, NUMBER91_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "etat"

    // Delegated rules


 

    public static final BitSet FOLLOW_instruction_in_start111 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_start114 = new BitSet(new long[]{0x4330000000000000L,0x000000000000007BL});
    public static final BitSet FOLLOW_instruction_in_start116 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_shell_in_instruction129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_load_in_instruction134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphe_in_instruction139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_look_in_instruction144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_succ_in_instruction149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_todot_in_instruction154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_in_instruction159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctltodot_in_instruction164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_justifie_in_instruction169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_justifietodot_in_instruction174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stop_in_instruction179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_shell191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_load204 = new BitSet(new long[]{0x0080034081000000L});
    public static final BitSet FOLLOW_file_net_in_load208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_graphe222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_look236 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_etat_in_look240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_succ254 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_etat_in_succ258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_todot272 = new BitSet(new long[]{0x0080034041000000L});
    public static final BitSet FOLLOW_file_dot_in_todot276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ctl290 = new BitSet(new long[]{0xB40FF01800000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_formule_in_ctl294 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_etat_in_ctl302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ctltodot325 = new BitSet(new long[]{0xB40FF01800000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_formule_in_ctltodot329 = new BitSet(new long[]{0x0080034041000000L});
    public static final BitSet FOLLOW_file_dot_in_ctltodot333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_justifie347 = new BitSet(new long[]{0xB40FF01800000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_formule_in_justifie351 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_etat_in_justifie355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_justifietodot369 = new BitSet(new long[]{0xB40FF01800000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_formule_in_justifietodot373 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_etat_in_justifietodot377 = new BitSet(new long[]{0x0080034041000000L});
    public static final BitSet FOLLOW_file_dot_in_justifietodot381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_stop395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_FILE_NET_in_file_net411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_filename_in_file_net418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_file_net420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_FILE_DOT_in_file_dot434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_filename_in_file_dot441 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_file_dot443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_path_modifier_in_filename456 = new BitSet(new long[]{0x0080004001000000L});
    public static final BitSet FOLLOW_39_in_filename476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_filename482 = new BitSet(new long[]{0x0080034001000000L});
    public static final BitSet FOLLOW_filename_in_filename484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term3_in_formule517 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_OR_in_formule520 = new BitSet(new long[]{0xB40FF01800000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_term3_in_formule523 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_term2_in_term3536 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_EQUIV_in_term3539 = new BitSet(new long[]{0xB40FF01800000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_term2_in_term3542 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_term1_in_term2555 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_IMPLY_in_term2558 = new BitSet(new long[]{0xB40FF01800000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_term1_in_term2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term0_in_term1575 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AND_in_term1578 = new BitSet(new long[]{0xB40FF01800000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_term0_in_term1581 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_atom_in_term0596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term01_in_term0601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term02_in_term0606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_term01618 = new BitSet(new long[]{0xB40FF01000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_atom_in_term01624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term02_in_term01638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_term01654 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_term01_in_term01656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_term02676 = new BitSet(new long[]{0xB400001000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_atom_in_term02678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_term02691 = new BitSet(new long[]{0xB400001000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_atom_in_term02693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_term02706 = new BitSet(new long[]{0xB400001000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_atom_in_term02708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_term02721 = new BitSet(new long[]{0xB400001000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_atom_in_term02723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_term02736 = new BitSet(new long[]{0xB400001000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_atom_in_term02738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_term02751 = new BitSet(new long[]{0xB400001000000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_atom_in_term02753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_term02766 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_term02768 = new BitSet(new long[]{0xB40FF01800000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_formule_in_term02770 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_term02772 = new BitSet(new long[]{0xB40FF01800000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_formule_in_term02774 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_term02776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_term02791 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_term02793 = new BitSet(new long[]{0xB40FF01800000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_formule_in_term02795 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_term02797 = new BitSet(new long[]{0xB40FF01800000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_formule_in_term02799 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_term02801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATOM_in_atom825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_atom832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_atom841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_atom850 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_atom852 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ATOM_in_atom854 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_atom856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_atom869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_atom878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_atom887 = new BitSet(new long[]{0xB40FF01800000080L,0x0000000000000080L});
    public static final BitSet FOLLOW_formule_in_atom890 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_atom892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_etat907 = new BitSet(new long[]{0x0000000004000002L});

}