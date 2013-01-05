// $ANTLR 3.4 /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g 2013-01-04 21:48:10

	package principal;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class CommandLineParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AF", "AG", "AND", "ATOM", "AU", "AX", "CHAR", "DEAD", "EF", "EG", "ENABLE", "EQUIV", "ESC_SEQ", "EU", "EX", "EXPONENT", "FALSE", "HEX_DIGIT", "IMPLY", "INITIAL", "LETTER", "NEG", "NUMBER", "OCTAL_ESC", "OR", "STRING", "STRING_FILE_DOT", "STRING_FILE_NET", "TRUE", "UNICODE_ESC", "WS", "'!'", "'('", "')'", "'-'", "'.'", "'../'", "'./'", "'/'", "';'", "'A'", "'AF'", "'AG'", "'AX'", "'E'", "'EF'", "'EG'", "'EX'", "'Justifie'", "'Justifietodot'", "'U'", "'_'", "'ctl'", "'ctltodot'", "'dead'", "'dot'", "'enable'", "'false'", "'graphe'", "'initial'", "'load'", "'look'", "'net'", "'succ'", "'todot'", "'true'"
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
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:108:1: start : instruction ( ';' instruction )* ;
    public final CommandLineParser.start_return start() throws RecognitionException {
        CommandLineParser.start_return retval = new CommandLineParser.start_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal2=null;
        CommandLineParser.instruction_return instruction1 =null;

        CommandLineParser.instruction_return instruction3 =null;


        Object char_literal2_tree=null;

        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:109:2: ( instruction ( ';' instruction )* )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:109:4: instruction ( ';' instruction )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_instruction_in_start111);
            instruction1=instruction();

            state._fsp--;

            adaptor.addChild(root_0, instruction1.getTree());

            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:109:16: ( ';' instruction )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==43) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:109:17: ';' instruction
            	    {
            	    char_literal2=(Token)match(input,43,FOLLOW_43_in_start114); 
            	    char_literal2_tree = 
            	    (Object)adaptor.create(char_literal2)
            	    ;
            	    adaptor.addChild(root_0, char_literal2_tree);


            	     System.out.println("\n"); 

            	    pushFollow(FOLLOW_instruction_in_start118);
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
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:112:1: instruction : ( load | graphe | look | succ | todot | ctl | ctltodot | justifie | justifietodot );
    public final CommandLineParser.instruction_return instruction() throws RecognitionException {
        CommandLineParser.instruction_return retval = new CommandLineParser.instruction_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        CommandLineParser.load_return load4 =null;

        CommandLineParser.graphe_return graphe5 =null;

        CommandLineParser.look_return look6 =null;

        CommandLineParser.succ_return succ7 =null;

        CommandLineParser.todot_return todot8 =null;

        CommandLineParser.ctl_return ctl9 =null;

        CommandLineParser.ctltodot_return ctltodot10 =null;

        CommandLineParser.justifie_return justifie11 =null;

        CommandLineParser.justifietodot_return justifietodot12 =null;



        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:113:2: ( load | graphe | look | succ | todot | ctl | ctltodot | justifie | justifietodot )
            int alt2=9;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt2=1;
                }
                break;
            case 62:
                {
                alt2=2;
                }
                break;
            case 65:
                {
                alt2=3;
                }
                break;
            case 67:
                {
                alt2=4;
                }
                break;
            case 68:
                {
                alt2=5;
                }
                break;
            case 56:
                {
                alt2=6;
                }
                break;
            case 57:
                {
                alt2=7;
                }
                break;
            case 52:
                {
                alt2=8;
                }
                break;
            case 53:
                {
                alt2=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:113:4: load
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_load_in_instruction131);
                    load4=load();

                    state._fsp--;

                    adaptor.addChild(root_0, load4.getTree());

                    }
                    break;
                case 2 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:114:4: graphe
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_graphe_in_instruction136);
                    graphe5=graphe();

                    state._fsp--;

                    adaptor.addChild(root_0, graphe5.getTree());

                    }
                    break;
                case 3 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:115:4: look
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_look_in_instruction141);
                    look6=look();

                    state._fsp--;

                    adaptor.addChild(root_0, look6.getTree());

                    }
                    break;
                case 4 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:116:4: succ
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_succ_in_instruction146);
                    succ7=succ();

                    state._fsp--;

                    adaptor.addChild(root_0, succ7.getTree());

                    }
                    break;
                case 5 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:117:4: todot
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_todot_in_instruction151);
                    todot8=todot();

                    state._fsp--;

                    adaptor.addChild(root_0, todot8.getTree());

                    }
                    break;
                case 6 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:118:4: ctl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ctl_in_instruction156);
                    ctl9=ctl();

                    state._fsp--;

                    adaptor.addChild(root_0, ctl9.getTree());

                    }
                    break;
                case 7 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:119:4: ctltodot
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ctltodot_in_instruction161);
                    ctltodot10=ctltodot();

                    state._fsp--;

                    adaptor.addChild(root_0, ctltodot10.getTree());

                    }
                    break;
                case 8 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:120:4: justifie
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_justifie_in_instruction166);
                    justifie11=justifie();

                    state._fsp--;

                    adaptor.addChild(root_0, justifie11.getTree());

                    }
                    break;
                case 9 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:121:4: justifietodot
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_justifietodot_in_instruction171);
                    justifietodot12=justifietodot();

                    state._fsp--;

                    adaptor.addChild(root_0, justifietodot12.getTree());

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


    public static class load_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "load"
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:124:1: load : 'load' p1= file_net ;
    public final CommandLineParser.load_return load() throws RecognitionException {
        CommandLineParser.load_return retval = new CommandLineParser.load_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal13=null;
        CommandLineParser.file_net_return p1 =null;


        Object string_literal13_tree=null;

        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:125:2: ( 'load' p1= file_net )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:125:4: 'load' p1= file_net
            {
            root_0 = (Object)adaptor.nil();


            string_literal13=(Token)match(input,64,FOLLOW_64_in_load182); 
            string_literal13_tree = 
            (Object)adaptor.create(string_literal13)
            ;
            adaptor.addChild(root_0, string_literal13_tree);


            pushFollow(FOLLOW_file_net_in_load186);
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
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:128:1: graphe : 'graphe' ;
    public final CommandLineParser.graphe_return graphe() throws RecognitionException {
        CommandLineParser.graphe_return retval = new CommandLineParser.graphe_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal14=null;

        Object string_literal14_tree=null;

        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:129:2: ( 'graphe' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:129:4: 'graphe'
            {
            root_0 = (Object)adaptor.nil();


            string_literal14=(Token)match(input,62,FOLLOW_62_in_graphe200); 
            string_literal14_tree = 
            (Object)adaptor.create(string_literal14)
            ;
            adaptor.addChild(root_0, string_literal14_tree);


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
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:132:1: look : 'look' p1= etat ;
    public final CommandLineParser.look_return look() throws RecognitionException {
        CommandLineParser.look_return retval = new CommandLineParser.look_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal15=null;
        CommandLineParser.etat_return p1 =null;


        Object string_literal15_tree=null;

        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:133:2: ( 'look' p1= etat )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:133:4: 'look' p1= etat
            {
            root_0 = (Object)adaptor.nil();


            string_literal15=(Token)match(input,65,FOLLOW_65_in_look214); 
            string_literal15_tree = 
            (Object)adaptor.create(string_literal15)
            ;
            adaptor.addChild(root_0, string_literal15_tree);


            pushFollow(FOLLOW_etat_in_look218);
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
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:136:1: succ : 'succ' p1= etat ;
    public final CommandLineParser.succ_return succ() throws RecognitionException {
        CommandLineParser.succ_return retval = new CommandLineParser.succ_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal16=null;
        CommandLineParser.etat_return p1 =null;


        Object string_literal16_tree=null;

        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:137:2: ( 'succ' p1= etat )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:137:4: 'succ' p1= etat
            {
            root_0 = (Object)adaptor.nil();


            string_literal16=(Token)match(input,67,FOLLOW_67_in_succ232); 
            string_literal16_tree = 
            (Object)adaptor.create(string_literal16)
            ;
            adaptor.addChild(root_0, string_literal16_tree);


            pushFollow(FOLLOW_etat_in_succ236);
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
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:140:1: todot : 'todot' p1= file_dot ;
    public final CommandLineParser.todot_return todot() throws RecognitionException {
        CommandLineParser.todot_return retval = new CommandLineParser.todot_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal17=null;
        CommandLineParser.file_dot_return p1 =null;


        Object string_literal17_tree=null;

        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:141:2: ( 'todot' p1= file_dot )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:141:4: 'todot' p1= file_dot
            {
            root_0 = (Object)adaptor.nil();


            string_literal17=(Token)match(input,68,FOLLOW_68_in_todot250); 
            string_literal17_tree = 
            (Object)adaptor.create(string_literal17)
            ;
            adaptor.addChild(root_0, string_literal17_tree);


            pushFollow(FOLLOW_file_dot_in_todot254);
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
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:144:1: ctl : 'ctl' p1= formule (p2= etat |) ;
    public final CommandLineParser.ctl_return ctl() throws RecognitionException {
        CommandLineParser.ctl_return retval = new CommandLineParser.ctl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal18=null;
        CommandLineParser.formule_return p1 =null;

        CommandLineParser.etat_return p2 =null;


        Object string_literal18_tree=null;

        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:145:2: ( 'ctl' p1= formule (p2= etat |) )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:145:4: 'ctl' p1= formule (p2= etat |)
            {
            root_0 = (Object)adaptor.nil();


            string_literal18=(Token)match(input,56,FOLLOW_56_in_ctl268); 
            string_literal18_tree = 
            (Object)adaptor.create(string_literal18)
            ;
            adaptor.addChild(root_0, string_literal18_tree);


            pushFollow(FOLLOW_formule_in_ctl272);
            p1=formule();

            state._fsp--;

            adaptor.addChild(root_0, p1.getTree());

            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:145:21: (p2= etat |)
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
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:146:3: p2= etat
                    {
                    pushFollow(FOLLOW_etat_in_ctl280);
                    p2=etat();

                    state._fsp--;

                    adaptor.addChild(root_0, p2.getTree());

                     onCtl(formule((p1!=null?((Object)p1.tree):null)), etat((p2!=null?input.toString(p2.start,p2.stop):null))); 

                    }
                    break;
                case 2 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:147:5: 
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
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:151:1: ctltodot : 'ctltodot' p1= formule p2= file_dot ;
    public final CommandLineParser.ctltodot_return ctltodot() throws RecognitionException {
        CommandLineParser.ctltodot_return retval = new CommandLineParser.ctltodot_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal19=null;
        CommandLineParser.formule_return p1 =null;

        CommandLineParser.file_dot_return p2 =null;


        Object string_literal19_tree=null;

        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:152:2: ( 'ctltodot' p1= formule p2= file_dot )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:152:4: 'ctltodot' p1= formule p2= file_dot
            {
            root_0 = (Object)adaptor.nil();


            string_literal19=(Token)match(input,57,FOLLOW_57_in_ctltodot303); 
            string_literal19_tree = 
            (Object)adaptor.create(string_literal19)
            ;
            adaptor.addChild(root_0, string_literal19_tree);


            pushFollow(FOLLOW_formule_in_ctltodot307);
            p1=formule();

            state._fsp--;

            adaptor.addChild(root_0, p1.getTree());

            pushFollow(FOLLOW_file_dot_in_ctltodot311);
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
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:155:1: justifie : 'Justifie' p1= formule p2= etat ;
    public final CommandLineParser.justifie_return justifie() throws RecognitionException {
        CommandLineParser.justifie_return retval = new CommandLineParser.justifie_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal20=null;
        CommandLineParser.formule_return p1 =null;

        CommandLineParser.etat_return p2 =null;


        Object string_literal20_tree=null;

        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:156:2: ( 'Justifie' p1= formule p2= etat )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:156:4: 'Justifie' p1= formule p2= etat
            {
            root_0 = (Object)adaptor.nil();


            string_literal20=(Token)match(input,52,FOLLOW_52_in_justifie325); 
            string_literal20_tree = 
            (Object)adaptor.create(string_literal20)
            ;
            adaptor.addChild(root_0, string_literal20_tree);


            pushFollow(FOLLOW_formule_in_justifie329);
            p1=formule();

            state._fsp--;

            adaptor.addChild(root_0, p1.getTree());

            pushFollow(FOLLOW_etat_in_justifie333);
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
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:159:1: justifietodot : 'Justifietodot' p1= formule p2= etat p3= file_dot ;
    public final CommandLineParser.justifietodot_return justifietodot() throws RecognitionException {
        CommandLineParser.justifietodot_return retval = new CommandLineParser.justifietodot_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal21=null;
        CommandLineParser.formule_return p1 =null;

        CommandLineParser.etat_return p2 =null;

        CommandLineParser.file_dot_return p3 =null;


        Object string_literal21_tree=null;

        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:160:2: ( 'Justifietodot' p1= formule p2= etat p3= file_dot )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:160:4: 'Justifietodot' p1= formule p2= etat p3= file_dot
            {
            root_0 = (Object)adaptor.nil();


            string_literal21=(Token)match(input,53,FOLLOW_53_in_justifietodot347); 
            string_literal21_tree = 
            (Object)adaptor.create(string_literal21)
            ;
            adaptor.addChild(root_0, string_literal21_tree);


            pushFollow(FOLLOW_formule_in_justifietodot351);
            p1=formule();

            state._fsp--;

            adaptor.addChild(root_0, p1.getTree());

            pushFollow(FOLLOW_etat_in_justifietodot355);
            p2=etat();

            state._fsp--;

            adaptor.addChild(root_0, p2.getTree());

            pushFollow(FOLLOW_file_dot_in_justifietodot359);
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


    public static class file_net_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "file_net"
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:163:1: file_net : (p= STRING_FILE_NET | filename 'net' );
    public final CommandLineParser.file_net_return file_net() throws RecognitionException {
        CommandLineParser.file_net_return retval = new CommandLineParser.file_net_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token p=null;
        Token string_literal23=null;
        CommandLineParser.filename_return filename22 =null;


        Object p_tree=null;
        Object string_literal23_tree=null;

        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:164:2: (p= STRING_FILE_NET | filename 'net' )
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
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:164:4: p= STRING_FILE_NET
                    {
                    root_0 = (Object)adaptor.nil();


                    p=(Token)match(input,STRING_FILE_NET,FOLLOW_STRING_FILE_NET_in_file_net375); 
                    p_tree = 
                    (Object)adaptor.create(p)
                    ;
                    adaptor.addChild(root_0, p_tree);


                     p.setText((p!=null?p.getText():null).substring(1, (p!=null?p.getText():null).length() - 1)); 

                    }
                    break;
                case 2 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:165:4: filename 'net'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_filename_in_file_net382);
                    filename22=filename();

                    state._fsp--;

                    adaptor.addChild(root_0, filename22.getTree());

                    string_literal23=(Token)match(input,66,FOLLOW_66_in_file_net384); 
                    string_literal23_tree = 
                    (Object)adaptor.create(string_literal23)
                    ;
                    adaptor.addChild(root_0, string_literal23_tree);


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
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:168:1: file_dot : (p= STRING_FILE_DOT | filename 'dot' );
    public final CommandLineParser.file_dot_return file_dot() throws RecognitionException {
        CommandLineParser.file_dot_return retval = new CommandLineParser.file_dot_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token p=null;
        Token string_literal25=null;
        CommandLineParser.filename_return filename24 =null;


        Object p_tree=null;
        Object string_literal25_tree=null;

        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:169:2: (p= STRING_FILE_DOT | filename 'dot' )
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
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:169:4: p= STRING_FILE_DOT
                    {
                    root_0 = (Object)adaptor.nil();


                    p=(Token)match(input,STRING_FILE_DOT,FOLLOW_STRING_FILE_DOT_in_file_dot398); 
                    p_tree = 
                    (Object)adaptor.create(p)
                    ;
                    adaptor.addChild(root_0, p_tree);


                     p.setText( (p!=null?p.getText():null).substring(1, (p!=null?p.getText():null).length() - 1)); 

                    }
                    break;
                case 2 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:170:4: filename 'dot'
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_filename_in_file_dot405);
                    filename24=filename();

                    state._fsp--;

                    adaptor.addChild(root_0, filename24.getTree());

                    string_literal25=(Token)match(input,59,FOLLOW_59_in_file_dot407); 
                    string_literal25_tree = 
                    (Object)adaptor.create(string_literal25)
                    ;
                    adaptor.addChild(root_0, string_literal25_tree);


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
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:173:1: filename : ( path_modifier )? ( LETTER | '_' | '-' )+ ( '.' | '/' filename ) ;
    public final CommandLineParser.filename_return filename() throws RecognitionException {
        CommandLineParser.filename_return retval = new CommandLineParser.filename_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set27=null;
        Token char_literal28=null;
        Token char_literal29=null;
        CommandLineParser.path_modifier_return path_modifier26 =null;

        CommandLineParser.filename_return filename30 =null;


        Object set27_tree=null;
        Object char_literal28_tree=null;
        Object char_literal29_tree=null;

        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:174:2: ( ( path_modifier )? ( LETTER | '_' | '-' )+ ( '.' | '/' filename ) )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:174:4: ( path_modifier )? ( LETTER | '_' | '-' )+ ( '.' | '/' filename )
            {
            root_0 = (Object)adaptor.nil();


            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:174:4: ( path_modifier )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0 >= 40 && LA6_0 <= 41)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:174:4: path_modifier
                    {
                    pushFollow(FOLLOW_path_modifier_in_filename420);
                    path_modifier26=path_modifier();

                    state._fsp--;

                    adaptor.addChild(root_0, path_modifier26.getTree());

                    }
                    break;

            }


            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:174:19: ( LETTER | '_' | '-' )+
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
            	    set27=(Token)input.LT(1);

            	    if ( input.LA(1)==LETTER||input.LA(1)==38||input.LA(1)==55 ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set27)
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


            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:174:41: ( '.' | '/' filename )
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
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:175:3: '.'
                    {
                    char_literal28=(Token)match(input,39,FOLLOW_39_in_filename440); 
                    char_literal28_tree = 
                    (Object)adaptor.create(char_literal28)
                    ;
                    adaptor.addChild(root_0, char_literal28_tree);


                    }
                    break;
                case 2 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:176:5: '/' filename
                    {
                    char_literal29=(Token)match(input,42,FOLLOW_42_in_filename446); 
                    char_literal29_tree = 
                    (Object)adaptor.create(char_literal29)
                    ;
                    adaptor.addChild(root_0, char_literal29_tree);


                    pushFollow(FOLLOW_filename_in_filename448);
                    filename30=filename();

                    state._fsp--;

                    adaptor.addChild(root_0, filename30.getTree());

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
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:180:1: path_modifier : ( './' | '../' );
    public final CommandLineParser.path_modifier_return path_modifier() throws RecognitionException {
        CommandLineParser.path_modifier_return retval = new CommandLineParser.path_modifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set31=null;

        Object set31_tree=null;

        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:181:2: ( './' | '../' )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:
            {
            root_0 = (Object)adaptor.nil();


            set31=(Token)input.LT(1);

            if ( (input.LA(1) >= 40 && input.LA(1) <= 41) ) {
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
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:186:1: formule : term3 ( OR ^ term3 )* ;
    public final CommandLineParser.formule_return formule() throws RecognitionException {
        CommandLineParser.formule_return retval = new CommandLineParser.formule_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token OR33=null;
        CommandLineParser.term3_return term332 =null;

        CommandLineParser.term3_return term334 =null;


        Object OR33_tree=null;

        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:187:2: ( term3 ( OR ^ term3 )* )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:187:4: term3 ( OR ^ term3 )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_term3_in_formule481);
            term332=term3();

            state._fsp--;

            adaptor.addChild(root_0, term332.getTree());

            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:187:10: ( OR ^ term3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==OR) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:187:11: OR ^ term3
            	    {
            	    OR33=(Token)match(input,OR,FOLLOW_OR_in_formule484); 
            	    OR33_tree = 
            	    (Object)adaptor.create(OR33)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(OR33_tree, root_0);


            	    pushFollow(FOLLOW_term3_in_formule487);
            	    term334=term3();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term334.getTree());

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
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:190:1: term3 : term2 ( EQUIV ^ term2 )* ;
    public final CommandLineParser.term3_return term3() throws RecognitionException {
        CommandLineParser.term3_return retval = new CommandLineParser.term3_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EQUIV36=null;
        CommandLineParser.term2_return term235 =null;

        CommandLineParser.term2_return term237 =null;


        Object EQUIV36_tree=null;

        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:191:2: ( term2 ( EQUIV ^ term2 )* )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:191:4: term2 ( EQUIV ^ term2 )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_term2_in_term3500);
            term235=term2();

            state._fsp--;

            adaptor.addChild(root_0, term235.getTree());

            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:191:10: ( EQUIV ^ term2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==EQUIV) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:191:11: EQUIV ^ term2
            	    {
            	    EQUIV36=(Token)match(input,EQUIV,FOLLOW_EQUIV_in_term3503); 
            	    EQUIV36_tree = 
            	    (Object)adaptor.create(EQUIV36)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(EQUIV36_tree, root_0);


            	    pushFollow(FOLLOW_term2_in_term3506);
            	    term237=term2();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term237.getTree());

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
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:194:1: term2 : term1 ( IMPLY ^ term1 )? ;
    public final CommandLineParser.term2_return term2() throws RecognitionException {
        CommandLineParser.term2_return retval = new CommandLineParser.term2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IMPLY39=null;
        CommandLineParser.term1_return term138 =null;

        CommandLineParser.term1_return term140 =null;


        Object IMPLY39_tree=null;

        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:195:2: ( term1 ( IMPLY ^ term1 )? )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:195:4: term1 ( IMPLY ^ term1 )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_term1_in_term2519);
            term138=term1();

            state._fsp--;

            adaptor.addChild(root_0, term138.getTree());

            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:195:10: ( IMPLY ^ term1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==IMPLY) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:195:11: IMPLY ^ term1
                    {
                    IMPLY39=(Token)match(input,IMPLY,FOLLOW_IMPLY_in_term2522); 
                    IMPLY39_tree = 
                    (Object)adaptor.create(IMPLY39)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(IMPLY39_tree, root_0);


                    pushFollow(FOLLOW_term1_in_term2525);
                    term140=term1();

                    state._fsp--;

                    adaptor.addChild(root_0, term140.getTree());

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
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:198:1: term1 : term0 ( AND ^ term0 )* ;
    public final CommandLineParser.term1_return term1() throws RecognitionException {
        CommandLineParser.term1_return retval = new CommandLineParser.term1_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AND42=null;
        CommandLineParser.term0_return term041 =null;

        CommandLineParser.term0_return term043 =null;


        Object AND42_tree=null;

        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:199:2: ( term0 ( AND ^ term0 )* )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:199:4: term0 ( AND ^ term0 )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_term0_in_term1539);
            term041=term0();

            state._fsp--;

            adaptor.addChild(root_0, term041.getTree());

            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:199:10: ( AND ^ term0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==AND) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:199:11: AND ^ term0
            	    {
            	    AND42=(Token)match(input,AND,FOLLOW_AND_in_term1542); 
            	    AND42_tree = 
            	    (Object)adaptor.create(AND42)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(AND42_tree, root_0);


            	    pushFollow(FOLLOW_term0_in_term1545);
            	    term043=term0();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term043.getTree());

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
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:202:1: term0 : ( atom | '!' atom -> ^( NEG atom ) | 'EF' atom -> ^( EF atom ) | 'EG' atom -> ^( EG atom ) | 'EX' atom -> ^( EX atom ) | 'AF' atom -> ^( AF atom ) | 'AG' atom -> ^( AG atom ) | 'AX' atom -> ^( AX atom ) | 'E' '(' formule 'U' formule ')' -> ^( EU formule formule ) | 'A' '(' formule 'U' formule ')' -> ^( AU formule formule ) );
    public final CommandLineParser.term0_return term0() throws RecognitionException {
        CommandLineParser.term0_return retval = new CommandLineParser.term0_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal45=null;
        Token string_literal47=null;
        Token string_literal49=null;
        Token string_literal51=null;
        Token string_literal53=null;
        Token string_literal55=null;
        Token string_literal57=null;
        Token char_literal59=null;
        Token char_literal60=null;
        Token char_literal62=null;
        Token char_literal64=null;
        Token char_literal65=null;
        Token char_literal66=null;
        Token char_literal68=null;
        Token char_literal70=null;
        CommandLineParser.atom_return atom44 =null;

        CommandLineParser.atom_return atom46 =null;

        CommandLineParser.atom_return atom48 =null;

        CommandLineParser.atom_return atom50 =null;

        CommandLineParser.atom_return atom52 =null;

        CommandLineParser.atom_return atom54 =null;

        CommandLineParser.atom_return atom56 =null;

        CommandLineParser.atom_return atom58 =null;

        CommandLineParser.formule_return formule61 =null;

        CommandLineParser.formule_return formule63 =null;

        CommandLineParser.formule_return formule67 =null;

        CommandLineParser.formule_return formule69 =null;


        Object char_literal45_tree=null;
        Object string_literal47_tree=null;
        Object string_literal49_tree=null;
        Object string_literal51_tree=null;
        Object string_literal53_tree=null;
        Object string_literal55_tree=null;
        Object string_literal57_tree=null;
        Object char_literal59_tree=null;
        Object char_literal60_tree=null;
        Object char_literal62_tree=null;
        Object char_literal64_tree=null;
        Object char_literal65_tree=null;
        Object char_literal66_tree=null;
        Object char_literal68_tree=null;
        Object char_literal70_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        RewriteRuleSubtreeStream stream_formule=new RewriteRuleSubtreeStream(adaptor,"rule formule");
        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:203:2: ( atom | '!' atom -> ^( NEG atom ) | 'EF' atom -> ^( EF atom ) | 'EG' atom -> ^( EG atom ) | 'EX' atom -> ^( EX atom ) | 'AF' atom -> ^( AF atom ) | 'AG' atom -> ^( AG atom ) | 'AX' atom -> ^( AX atom ) | 'E' '(' formule 'U' formule ')' -> ^( EU formule formule ) | 'A' '(' formule 'U' formule ')' -> ^( AU formule formule ) )
            int alt13=10;
            switch ( input.LA(1) ) {
            case ATOM:
            case 36:
            case 58:
            case 60:
            case 61:
            case 63:
            case 69:
                {
                alt13=1;
                }
                break;
            case 35:
                {
                alt13=2;
                }
                break;
            case 49:
                {
                alt13=3;
                }
                break;
            case 50:
                {
                alt13=4;
                }
                break;
            case 51:
                {
                alt13=5;
                }
                break;
            case 45:
                {
                alt13=6;
                }
                break;
            case 46:
                {
                alt13=7;
                }
                break;
            case 47:
                {
                alt13=8;
                }
                break;
            case 48:
                {
                alt13=9;
                }
                break;
            case 44:
                {
                alt13=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:203:4: atom
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_atom_in_term0560);
                    atom44=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom44.getTree());

                    }
                    break;
                case 2 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:204:4: '!' atom
                    {
                    char_literal45=(Token)match(input,35,FOLLOW_35_in_term0565);  
                    stream_35.add(char_literal45);


                    pushFollow(FOLLOW_atom_in_term0567);
                    atom46=atom();

                    state._fsp--;

                    stream_atom.add(atom46.getTree());

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
                    // 204:13: -> ^( NEG atom )
                    {
                        // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:204:16: ^( NEG atom )
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
                case 3 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:205:4: 'EF' atom
                    {
                    string_literal47=(Token)match(input,49,FOLLOW_49_in_term0580);  
                    stream_49.add(string_literal47);


                    pushFollow(FOLLOW_atom_in_term0582);
                    atom48=atom();

                    state._fsp--;

                    stream_atom.add(atom48.getTree());

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
                    // 205:14: -> ^( EF atom )
                    {
                        // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:205:17: ^( EF atom )
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
                case 4 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:206:4: 'EG' atom
                    {
                    string_literal49=(Token)match(input,50,FOLLOW_50_in_term0595);  
                    stream_50.add(string_literal49);


                    pushFollow(FOLLOW_atom_in_term0597);
                    atom50=atom();

                    state._fsp--;

                    stream_atom.add(atom50.getTree());

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
                    // 206:14: -> ^( EG atom )
                    {
                        // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:206:17: ^( EG atom )
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
                case 5 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:207:4: 'EX' atom
                    {
                    string_literal51=(Token)match(input,51,FOLLOW_51_in_term0610);  
                    stream_51.add(string_literal51);


                    pushFollow(FOLLOW_atom_in_term0612);
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
                    // 207:14: -> ^( EX atom )
                    {
                        // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:207:17: ^( EX atom )
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
                case 6 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:208:4: 'AF' atom
                    {
                    string_literal53=(Token)match(input,45,FOLLOW_45_in_term0625);  
                    stream_45.add(string_literal53);


                    pushFollow(FOLLOW_atom_in_term0627);
                    atom54=atom();

                    state._fsp--;

                    stream_atom.add(atom54.getTree());

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
                    // 208:14: -> ^( AF atom )
                    {
                        // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:208:17: ^( AF atom )
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
                case 7 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:209:4: 'AG' atom
                    {
                    string_literal55=(Token)match(input,46,FOLLOW_46_in_term0640);  
                    stream_46.add(string_literal55);


                    pushFollow(FOLLOW_atom_in_term0642);
                    atom56=atom();

                    state._fsp--;

                    stream_atom.add(atom56.getTree());

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
                    // 209:14: -> ^( AG atom )
                    {
                        // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:209:17: ^( AG atom )
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
                case 8 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:210:4: 'AX' atom
                    {
                    string_literal57=(Token)match(input,47,FOLLOW_47_in_term0655);  
                    stream_47.add(string_literal57);


                    pushFollow(FOLLOW_atom_in_term0657);
                    atom58=atom();

                    state._fsp--;

                    stream_atom.add(atom58.getTree());

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
                    // 210:14: -> ^( AX atom )
                    {
                        // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:210:17: ^( AX atom )
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
                case 9 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:211:4: 'E' '(' formule 'U' formule ')'
                    {
                    char_literal59=(Token)match(input,48,FOLLOW_48_in_term0670);  
                    stream_48.add(char_literal59);


                    char_literal60=(Token)match(input,36,FOLLOW_36_in_term0672);  
                    stream_36.add(char_literal60);


                    pushFollow(FOLLOW_formule_in_term0674);
                    formule61=formule();

                    state._fsp--;

                    stream_formule.add(formule61.getTree());

                    char_literal62=(Token)match(input,54,FOLLOW_54_in_term0676);  
                    stream_54.add(char_literal62);


                    pushFollow(FOLLOW_formule_in_term0678);
                    formule63=formule();

                    state._fsp--;

                    stream_formule.add(formule63.getTree());

                    char_literal64=(Token)match(input,37,FOLLOW_37_in_term0680);  
                    stream_37.add(char_literal64);


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
                    // 211:36: -> ^( EU formule formule )
                    {
                        // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:211:39: ^( EU formule formule )
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
                case 10 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:212:4: 'A' '(' formule 'U' formule ')'
                    {
                    char_literal65=(Token)match(input,44,FOLLOW_44_in_term0695);  
                    stream_44.add(char_literal65);


                    char_literal66=(Token)match(input,36,FOLLOW_36_in_term0697);  
                    stream_36.add(char_literal66);


                    pushFollow(FOLLOW_formule_in_term0699);
                    formule67=formule();

                    state._fsp--;

                    stream_formule.add(formule67.getTree());

                    char_literal68=(Token)match(input,54,FOLLOW_54_in_term0701);  
                    stream_54.add(char_literal68);


                    pushFollow(FOLLOW_formule_in_term0703);
                    formule69=formule();

                    state._fsp--;

                    stream_formule.add(formule69.getTree());

                    char_literal70=(Token)match(input,37,FOLLOW_37_in_term0705);  
                    stream_37.add(char_literal70);


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
                    // 212:36: -> ^( AU formule formule )
                    {
                        // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:212:39: ^( AU formule formule )
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
    // $ANTLR end "term0"


    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:215:1: atom : (p= ATOM | 'dead' -> DEAD | 'initial' -> INITIAL | 'enable' '(' ATOM ')' -> ^( ENABLE ATOM ) | 'true' -> TRUE | 'false' -> FALSE | '(' ! formule ')' !);
    public final CommandLineParser.atom_return atom() throws RecognitionException {
        CommandLineParser.atom_return retval = new CommandLineParser.atom_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token p=null;
        Token string_literal71=null;
        Token string_literal72=null;
        Token string_literal73=null;
        Token char_literal74=null;
        Token ATOM75=null;
        Token char_literal76=null;
        Token string_literal77=null;
        Token string_literal78=null;
        Token char_literal79=null;
        Token char_literal81=null;
        CommandLineParser.formule_return formule80 =null;


        Object p_tree=null;
        Object string_literal71_tree=null;
        Object string_literal72_tree=null;
        Object string_literal73_tree=null;
        Object char_literal74_tree=null;
        Object ATOM75_tree=null;
        Object char_literal76_tree=null;
        Object string_literal77_tree=null;
        Object string_literal78_tree=null;
        Object char_literal79_tree=null;
        Object char_literal81_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_ATOM=new RewriteRuleTokenStream(adaptor,"token ATOM");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");

        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:216:2: (p= ATOM | 'dead' -> DEAD | 'initial' -> INITIAL | 'enable' '(' ATOM ')' -> ^( ENABLE ATOM ) | 'true' -> TRUE | 'false' -> FALSE | '(' ! formule ')' !)
            int alt14=7;
            switch ( input.LA(1) ) {
            case ATOM:
                {
                alt14=1;
                }
                break;
            case 58:
                {
                alt14=2;
                }
                break;
            case 63:
                {
                alt14=3;
                }
                break;
            case 60:
                {
                alt14=4;
                }
                break;
            case 69:
                {
                alt14=5;
                }
                break;
            case 61:
                {
                alt14=6;
                }
                break;
            case 36:
                {
                alt14=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:216:4: p= ATOM
                    {
                    root_0 = (Object)adaptor.nil();


                    p=(Token)match(input,ATOM,FOLLOW_ATOM_in_atom729); 
                    p_tree = 
                    (Object)adaptor.create(p)
                    ;
                    adaptor.addChild(root_0, p_tree);


                     p.setText((p!=null?p.getText():null).substring(1)); 

                    }
                    break;
                case 2 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:217:4: 'dead'
                    {
                    string_literal71=(Token)match(input,58,FOLLOW_58_in_atom736);  
                    stream_58.add(string_literal71);


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
                    // 217:11: -> DEAD
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(DEAD, "DEAD")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:218:4: 'initial'
                    {
                    string_literal72=(Token)match(input,63,FOLLOW_63_in_atom745);  
                    stream_63.add(string_literal72);


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
                    // 218:14: -> INITIAL
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(INITIAL, "INITIAL")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:219:4: 'enable' '(' ATOM ')'
                    {
                    string_literal73=(Token)match(input,60,FOLLOW_60_in_atom754);  
                    stream_60.add(string_literal73);


                    char_literal74=(Token)match(input,36,FOLLOW_36_in_atom756);  
                    stream_36.add(char_literal74);


                    ATOM75=(Token)match(input,ATOM,FOLLOW_ATOM_in_atom758);  
                    stream_ATOM.add(ATOM75);


                    char_literal76=(Token)match(input,37,FOLLOW_37_in_atom760);  
                    stream_37.add(char_literal76);


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
                    // 219:26: -> ^( ENABLE ATOM )
                    {
                        // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:219:29: ^( ENABLE ATOM )
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
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:220:4: 'true'
                    {
                    string_literal77=(Token)match(input,69,FOLLOW_69_in_atom773);  
                    stream_69.add(string_literal77);


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
                    // 220:11: -> TRUE
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(TRUE, "TRUE")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:221:4: 'false'
                    {
                    string_literal78=(Token)match(input,61,FOLLOW_61_in_atom782);  
                    stream_61.add(string_literal78);


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
                    // 221:12: -> FALSE
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(FALSE, "FALSE")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 7 :
                    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:222:4: '(' ! formule ')' !
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal79=(Token)match(input,36,FOLLOW_36_in_atom791); 

                    pushFollow(FOLLOW_formule_in_atom794);
                    formule80=formule();

                    state._fsp--;

                    adaptor.addChild(root_0, formule80.getTree());

                    char_literal81=(Token)match(input,37,FOLLOW_37_in_atom796); 

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
    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:226:1: etat : ( NUMBER )+ ;
    public final CommandLineParser.etat_return etat() throws RecognitionException {
        CommandLineParser.etat_return retval = new CommandLineParser.etat_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NUMBER82=null;

        Object NUMBER82_tree=null;

        try {
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:227:2: ( ( NUMBER )+ )
            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:227:4: ( NUMBER )+
            {
            root_0 = (Object)adaptor.nil();


            // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:227:4: ( NUMBER )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==NUMBER) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g:227:4: NUMBER
            	    {
            	    NUMBER82=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_etat811); 
            	    NUMBER82_tree = 
            	    (Object)adaptor.create(NUMBER82)
            	    ;
            	    adaptor.addChild(root_0, NUMBER82_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
    public static final BitSet FOLLOW_43_in_start114 = new BitSet(new long[]{0x4330000000000000L,0x000000000000001BL});
    public static final BitSet FOLLOW_instruction_in_start118 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_load_in_instruction131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphe_in_instruction136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_look_in_instruction141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_succ_in_instruction146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_todot_in_instruction151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctl_in_instruction156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctltodot_in_instruction161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_justifie_in_instruction166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_justifietodot_in_instruction171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_load182 = new BitSet(new long[]{0x0080034081000000L});
    public static final BitSet FOLLOW_file_net_in_load186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_graphe200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_look214 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_etat_in_look218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_succ232 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_etat_in_succ236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_todot250 = new BitSet(new long[]{0x0080034041000000L});
    public static final BitSet FOLLOW_file_dot_in_todot254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ctl268 = new BitSet(new long[]{0xB40FF01800000080L,0x0000000000000020L});
    public static final BitSet FOLLOW_formule_in_ctl272 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_etat_in_ctl280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ctltodot303 = new BitSet(new long[]{0xB40FF01800000080L,0x0000000000000020L});
    public static final BitSet FOLLOW_formule_in_ctltodot307 = new BitSet(new long[]{0x0080034041000000L});
    public static final BitSet FOLLOW_file_dot_in_ctltodot311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_justifie325 = new BitSet(new long[]{0xB40FF01800000080L,0x0000000000000020L});
    public static final BitSet FOLLOW_formule_in_justifie329 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_etat_in_justifie333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_justifietodot347 = new BitSet(new long[]{0xB40FF01800000080L,0x0000000000000020L});
    public static final BitSet FOLLOW_formule_in_justifietodot351 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_etat_in_justifietodot355 = new BitSet(new long[]{0x0080034041000000L});
    public static final BitSet FOLLOW_file_dot_in_justifietodot359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_FILE_NET_in_file_net375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_filename_in_file_net382 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_file_net384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_FILE_DOT_in_file_dot398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_filename_in_file_dot405 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_file_dot407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_path_modifier_in_filename420 = new BitSet(new long[]{0x0080004001000000L});
    public static final BitSet FOLLOW_39_in_filename440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_filename446 = new BitSet(new long[]{0x0080034001000000L});
    public static final BitSet FOLLOW_filename_in_filename448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term3_in_formule481 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_OR_in_formule484 = new BitSet(new long[]{0xB40FF01800000080L,0x0000000000000020L});
    public static final BitSet FOLLOW_term3_in_formule487 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_term2_in_term3500 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_EQUIV_in_term3503 = new BitSet(new long[]{0xB40FF01800000080L,0x0000000000000020L});
    public static final BitSet FOLLOW_term2_in_term3506 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_term1_in_term2519 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_IMPLY_in_term2522 = new BitSet(new long[]{0xB40FF01800000080L,0x0000000000000020L});
    public static final BitSet FOLLOW_term1_in_term2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term0_in_term1539 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AND_in_term1542 = new BitSet(new long[]{0xB40FF01800000080L,0x0000000000000020L});
    public static final BitSet FOLLOW_term0_in_term1545 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_atom_in_term0560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_term0565 = new BitSet(new long[]{0xB400001000000080L,0x0000000000000020L});
    public static final BitSet FOLLOW_atom_in_term0567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_term0580 = new BitSet(new long[]{0xB400001000000080L,0x0000000000000020L});
    public static final BitSet FOLLOW_atom_in_term0582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_term0595 = new BitSet(new long[]{0xB400001000000080L,0x0000000000000020L});
    public static final BitSet FOLLOW_atom_in_term0597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_term0610 = new BitSet(new long[]{0xB400001000000080L,0x0000000000000020L});
    public static final BitSet FOLLOW_atom_in_term0612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_term0625 = new BitSet(new long[]{0xB400001000000080L,0x0000000000000020L});
    public static final BitSet FOLLOW_atom_in_term0627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_term0640 = new BitSet(new long[]{0xB400001000000080L,0x0000000000000020L});
    public static final BitSet FOLLOW_atom_in_term0642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_term0655 = new BitSet(new long[]{0xB400001000000080L,0x0000000000000020L});
    public static final BitSet FOLLOW_atom_in_term0657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_term0670 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_term0672 = new BitSet(new long[]{0xB40FF01800000080L,0x0000000000000020L});
    public static final BitSet FOLLOW_formule_in_term0674 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_term0676 = new BitSet(new long[]{0xB40FF01800000080L,0x0000000000000020L});
    public static final BitSet FOLLOW_formule_in_term0678 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_term0680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_term0695 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_term0697 = new BitSet(new long[]{0xB40FF01800000080L,0x0000000000000020L});
    public static final BitSet FOLLOW_formule_in_term0699 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_term0701 = new BitSet(new long[]{0xB40FF01800000080L,0x0000000000000020L});
    public static final BitSet FOLLOW_formule_in_term0703 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_term0705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATOM_in_atom729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_atom736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_atom745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_atom754 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_atom756 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ATOM_in_atom758 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_atom760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_atom773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_atom782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_atom791 = new BitSet(new long[]{0xB40FF01800000080L,0x0000000000000020L});
    public static final BitSet FOLLOW_formule_in_atom794 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_atom796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_etat811 = new BitSet(new long[]{0x0000000004000002L});

}