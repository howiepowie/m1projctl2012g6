// $ANTLR 3.4 /Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g 2012-12-04 15:25:26

package principal;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;

@SuppressWarnings({ "all", "warnings", "unchecked" })
public class CommandLineParser extends Parser {
	public static final String[] tokenNames = new String[] { "<invalid>",
			"<EOR>", "<DOWN>", "<UP>", "CHAR", "CTL", "CTLTODOT", "ESC_SEQ",
			"EXPONENT", "EXT_DOT", "EXT_NET", "FILENAME", "GRAPHE",
			"HEX_DIGIT", "JUSTIFIE", "JUSTIFIETODOT", "LETTER", "LOAD", "LOOK",
			"NEWLINE", "OCTAL_ESC", "STRING", "STRING_FILE_DOT",
			"STRING_FILE_NET", "SUCC", "TODOT", "UNICODE_ESC", "WS", "'.'",
			"'../'", "'./'", "'/'", "'='" };

	public static final int EOF = -1;
	public static final int T__28 = 28;
	public static final int T__29 = 29;
	public static final int T__30 = 30;
	public static final int T__31 = 31;
	public static final int T__32 = 32;
	public static final int CHAR = 4;
	public static final int CTL = 5;
	public static final int CTLTODOT = 6;
	public static final int ESC_SEQ = 7;
	public static final int EXPONENT = 8;
	public static final int EXT_DOT = 9;
	public static final int EXT_NET = 10;
	public static final int FILENAME = 11;
	public static final int GRAPHE = 12;
	public static final int HEX_DIGIT = 13;
	public static final int JUSTIFIE = 14;
	public static final int JUSTIFIETODOT = 15;
	public static final int LETTER = 16;
	public static final int LOAD = 17;
	public static final int LOOK = 18;
	public static final int NEWLINE = 19;
	public static final int OCTAL_ESC = 20;
	public static final int STRING = 21;
	public static final int STRING_FILE_DOT = 22;
	public static final int STRING_FILE_NET = 23;
	public static final int SUCC = 24;
	public static final int TODOT = 25;
	public static final int UNICODE_ESC = 26;
	public static final int WS = 27;

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

	public String[] getTokenNames() {
		return CommandLineParser.tokenNames;
	}

	public String getGrammarFileName() {
		return "/Users/jeremymorosi/Documents/Programmation/Modelisation et verif/modelproj/src/principal/CommandLine.g";
	}

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

	private void onLook(final Object etat) {
		callback.look(etat);
	}

	private void onSucc(final Object etat) {
		callback.succ(etat);
	}

	private void onToDot(final String filename) {
		callback.toDot(filename);
	}

	private void onCtl(final Object formule) {
		callback.ctl(formule);
	}

	private void onCtl(final Object formule, final Object etat) {
		callback.ctl(formule, etat);
	}

	private void onCtlToDot(final Object formule, final String filename) {
		callback.ctlToDot(formule, filename);
	}

	private void onJustifie(final Object formule, final Object etat) {
		callback.justifie(formule, etat);
	}

	private void onJustifieToDot(final Object formule, final Object etat,
			final String filename) {
		callback.justifieToDot(formule, etat, filename);
	}

	public void process(String source) throws Exception {
		ANTLRStringStream in = new ANTLRStringStream(source);
		CommandLineLexer lexer = new CommandLineLexer(in);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		super.setTokenStream(tokens);
		this.start();
	}

	private Object formule(final Object f) {
		return null;
	}

	private Object etat(final Object e) {
		return null;
	}

	public static class start_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "start"
	// /Users/jeremymorosi/Documents/Programmation/Modelisation et
	// verif/modelproj/src/principal/CommandLine.g:85:1: start : instruction ;
	public final CommandLineParser.start_return start()
			throws RecognitionException {
		CommandLineParser.start_return retval = new CommandLineParser.start_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		CommandLineParser.instruction_return instruction1 = null;

		try {
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:86:2: ( instruction )
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:86:4: instruction
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_instruction_in_start50);
				instruction1 = instruction();

				state._fsp--;

				adaptor.addChild(root_0, instruction1.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "start"

	public static class instruction_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "instruction"
	// /Users/jeremymorosi/Documents/Programmation/Modelisation et
	// verif/modelproj/src/principal/CommandLine.g:89:1: instruction : ( load |
	// graphe | look | succ | todot | ctl | ctltodot | justifie | justifietodot
	// );
	public final CommandLineParser.instruction_return instruction()
			throws RecognitionException {
		CommandLineParser.instruction_return retval = new CommandLineParser.instruction_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		CommandLineParser.load_return load2 = null;

		CommandLineParser.graphe_return graphe3 = null;

		CommandLineParser.look_return look4 = null;

		CommandLineParser.succ_return succ5 = null;

		CommandLineParser.todot_return todot6 = null;

		CommandLineParser.ctl_return ctl7 = null;

		CommandLineParser.ctltodot_return ctltodot8 = null;

		CommandLineParser.justifie_return justifie9 = null;

		CommandLineParser.justifietodot_return justifietodot10 = null;

		try {
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:90:2: ( load | graphe
			// | look | succ | todot | ctl | ctltodot | justifie | justifietodot
			// )
			int alt1 = 9;
			switch (input.LA(1)) {
			case LOAD: {
				alt1 = 1;
			}
				break;
			case GRAPHE: {
				alt1 = 2;
			}
				break;
			case LOOK: {
				alt1 = 3;
			}
				break;
			case SUCC: {
				alt1 = 4;
			}
				break;
			case TODOT: {
				alt1 = 5;
			}
				break;
			case CTL: {
				alt1 = 6;
			}
				break;
			case CTLTODOT: {
				alt1 = 7;
			}
				break;
			case JUSTIFIE: {
				alt1 = 8;
			}
				break;
			case JUSTIFIETODOT: {
				alt1 = 9;
			}
				break;
			default:
				NoViableAltException nvae = new NoViableAltException("", 1, 0,
						input);

				throw nvae;

			}

			switch (alt1) {
			case 1:
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:90:4: load
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_load_in_instruction61);
				load2 = load();

				state._fsp--;

				adaptor.addChild(root_0, load2.getTree());

			}
				break;
			case 2:
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:91:4: graphe
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_graphe_in_instruction66);
				graphe3 = graphe();

				state._fsp--;

				adaptor.addChild(root_0, graphe3.getTree());

			}
				break;
			case 3:
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:92:4: look
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_look_in_instruction71);
				look4 = look();

				state._fsp--;

				adaptor.addChild(root_0, look4.getTree());

			}
				break;
			case 4:
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:93:4: succ
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_succ_in_instruction76);
				succ5 = succ();

				state._fsp--;

				adaptor.addChild(root_0, succ5.getTree());

			}
				break;
			case 5:
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:94:4: todot
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_todot_in_instruction81);
				todot6 = todot();

				state._fsp--;

				adaptor.addChild(root_0, todot6.getTree());

			}
				break;
			case 6:
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:95:4: ctl
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_ctl_in_instruction86);
				ctl7 = ctl();

				state._fsp--;

				adaptor.addChild(root_0, ctl7.getTree());

			}
				break;
			case 7:
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:96:4: ctltodot
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_ctltodot_in_instruction91);
				ctltodot8 = ctltodot();

				state._fsp--;

				adaptor.addChild(root_0, ctltodot8.getTree());

			}
				break;
			case 8:
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:97:4: justifie
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_justifie_in_instruction96);
				justifie9 = justifie();

				state._fsp--;

				adaptor.addChild(root_0, justifie9.getTree());

			}
				break;
			case 9:
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:98:4: justifietodot
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_justifietodot_in_instruction101);
				justifietodot10 = justifietodot();

				state._fsp--;

				adaptor.addChild(root_0, justifietodot10.getTree());

			}
				break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "instruction"

	public static class load_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "load"
	// /Users/jeremymorosi/Documents/Programmation/Modelisation et
	// verif/modelproj/src/principal/CommandLine.g:101:1: load : LOAD p1=
	// file_net ;
	public final CommandLineParser.load_return load()
			throws RecognitionException {
		CommandLineParser.load_return retval = new CommandLineParser.load_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LOAD11 = null;
		CommandLineParser.file_net_return p1 = null;

		Object LOAD11_tree = null;

		try {
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:102:2: ( LOAD p1=
			// file_net )
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:102:4: LOAD p1=
			// file_net
			{
				root_0 = (Object) adaptor.nil();

				LOAD11 = (Token) match(input, LOAD, FOLLOW_LOAD_in_load112);
				LOAD11_tree = (Object) adaptor.create(LOAD11);
				adaptor.addChild(root_0, LOAD11_tree);

				pushFollow(FOLLOW_file_net_in_load116);
				p1 = file_net();

				state._fsp--;

				adaptor.addChild(root_0, p1.getTree());

				onLoad((p1 != null ? input.toString(p1.start, p1.stop) : null));

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "load"

	public static class graphe_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "graphe"
	// /Users/jeremymorosi/Documents/Programmation/Modelisation et
	// verif/modelproj/src/principal/CommandLine.g:105:1: graphe : GRAPHE ;
	public final CommandLineParser.graphe_return graphe()
			throws RecognitionException {
		CommandLineParser.graphe_return retval = new CommandLineParser.graphe_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token GRAPHE12 = null;

		Object GRAPHE12_tree = null;

		try {
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:106:2: ( GRAPHE )
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:106:4: GRAPHE
			{
				root_0 = (Object) adaptor.nil();

				GRAPHE12 = (Token) match(input, GRAPHE,
						FOLLOW_GRAPHE_in_graphe130);
				GRAPHE12_tree = (Object) adaptor.create(GRAPHE12);
				adaptor.addChild(root_0, GRAPHE12_tree);

				onGraphe();

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "graphe"

	public static class look_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "look"
	// /Users/jeremymorosi/Documents/Programmation/Modelisation et
	// verif/modelproj/src/principal/CommandLine.g:109:1: look : LOOK p1= etat ;
	public final CommandLineParser.look_return look()
			throws RecognitionException {
		CommandLineParser.look_return retval = new CommandLineParser.look_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LOOK13 = null;
		CommandLineParser.etat_return p1 = null;

		Object LOOK13_tree = null;

		try {
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:110:2: ( LOOK p1=
			// etat )
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:110:4: LOOK p1= etat
			{
				root_0 = (Object) adaptor.nil();

				LOOK13 = (Token) match(input, LOOK, FOLLOW_LOOK_in_look144);
				LOOK13_tree = (Object) adaptor.create(LOOK13);
				adaptor.addChild(root_0, LOOK13_tree);

				pushFollow(FOLLOW_etat_in_look148);
				p1 = etat();

				state._fsp--;

				adaptor.addChild(root_0, p1.getTree());

				onLook(etat((p1 != null ? ((Object) p1.tree) : null)));

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "look"

	public static class succ_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "succ"
	// /Users/jeremymorosi/Documents/Programmation/Modelisation et
	// verif/modelproj/src/principal/CommandLine.g:113:1: succ : SUCC p1= etat ;
	public final CommandLineParser.succ_return succ()
			throws RecognitionException {
		CommandLineParser.succ_return retval = new CommandLineParser.succ_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SUCC14 = null;
		CommandLineParser.etat_return p1 = null;

		Object SUCC14_tree = null;

		try {
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:114:2: ( SUCC p1=
			// etat )
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:114:4: SUCC p1= etat
			{
				root_0 = (Object) adaptor.nil();

				SUCC14 = (Token) match(input, SUCC, FOLLOW_SUCC_in_succ162);
				SUCC14_tree = (Object) adaptor.create(SUCC14);
				adaptor.addChild(root_0, SUCC14_tree);

				pushFollow(FOLLOW_etat_in_succ166);
				p1 = etat();

				state._fsp--;

				adaptor.addChild(root_0, p1.getTree());

				onSucc(etat((p1 != null ? ((Object) p1.tree) : null)));

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "succ"

	public static class todot_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "todot"
	// /Users/jeremymorosi/Documents/Programmation/Modelisation et
	// verif/modelproj/src/principal/CommandLine.g:117:1: todot : TODOT p1=
	// file_dot ;
	public final CommandLineParser.todot_return todot()
			throws RecognitionException {
		CommandLineParser.todot_return retval = new CommandLineParser.todot_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TODOT15 = null;
		CommandLineParser.file_dot_return p1 = null;

		Object TODOT15_tree = null;

		try {
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:118:2: ( TODOT p1=
			// file_dot )
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:118:4: TODOT p1=
			// file_dot
			{
				root_0 = (Object) adaptor.nil();

				TODOT15 = (Token) match(input, TODOT, FOLLOW_TODOT_in_todot180);
				TODOT15_tree = (Object) adaptor.create(TODOT15);
				adaptor.addChild(root_0, TODOT15_tree);

				pushFollow(FOLLOW_file_dot_in_todot184);
				p1 = file_dot();

				state._fsp--;

				adaptor.addChild(root_0, p1.getTree());

				onToDot((p1 != null ? input.toString(p1.start, p1.stop) : null));

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "todot"

	public static class ctl_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "ctl"
	// /Users/jeremymorosi/Documents/Programmation/Modelisation et
	// verif/modelproj/src/principal/CommandLine.g:121:1: ctl : CTL p1= formule
	// p2= etat ;
	public final CommandLineParser.ctl_return ctl() throws RecognitionException {
		CommandLineParser.ctl_return retval = new CommandLineParser.ctl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CTL16 = null;
		CommandLineParser.formule_return p1 = null;

		CommandLineParser.etat_return p2 = null;

		Object CTL16_tree = null;

		try {
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:122:2: ( CTL p1=
			// formule p2= etat )
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:122:4: CTL p1=
			// formule p2= etat
			{
				root_0 = (Object) adaptor.nil();

				CTL16 = (Token) match(input, CTL, FOLLOW_CTL_in_ctl198);
				CTL16_tree = (Object) adaptor.create(CTL16);
				adaptor.addChild(root_0, CTL16_tree);

				pushFollow(FOLLOW_formule_in_ctl202);
				p1 = formule();

				state._fsp--;

				adaptor.addChild(root_0, p1.getTree());

				pushFollow(FOLLOW_etat_in_ctl206);
				p2 = etat();

				state._fsp--;

				adaptor.addChild(root_0, p2.getTree());

				onCtl(formule((p1 != null ? ((Object) p1.tree) : null)),
						etat((p2 != null ? ((Object) p2.tree) : null)));

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "ctl"

	public static class ctltodot_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "ctltodot"
	// /Users/jeremymorosi/Documents/Programmation/Modelisation et
	// verif/modelproj/src/principal/CommandLine.g:125:1: ctltodot : CTLTODOT
	// p1= formule p2= file_dot ;
	public final CommandLineParser.ctltodot_return ctltodot()
			throws RecognitionException {
		CommandLineParser.ctltodot_return retval = new CommandLineParser.ctltodot_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CTLTODOT17 = null;
		CommandLineParser.formule_return p1 = null;

		CommandLineParser.file_dot_return p2 = null;

		Object CTLTODOT17_tree = null;

		try {
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:126:2: ( CTLTODOT p1=
			// formule p2= file_dot )
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:126:4: CTLTODOT p1=
			// formule p2= file_dot
			{
				root_0 = (Object) adaptor.nil();

				CTLTODOT17 = (Token) match(input, CTLTODOT,
						FOLLOW_CTLTODOT_in_ctltodot220);
				CTLTODOT17_tree = (Object) adaptor.create(CTLTODOT17);
				adaptor.addChild(root_0, CTLTODOT17_tree);

				pushFollow(FOLLOW_formule_in_ctltodot224);
				p1 = formule();

				state._fsp--;

				adaptor.addChild(root_0, p1.getTree());

				pushFollow(FOLLOW_file_dot_in_ctltodot228);
				p2 = file_dot();

				state._fsp--;

				adaptor.addChild(root_0, p2.getTree());

				onCtlToDot(formule((p1 != null ? ((Object) p1.tree) : null)),
						(p2 != null ? input.toString(p2.start, p2.stop) : null));

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "ctltodot"

	public static class justifie_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "justifie"
	// /Users/jeremymorosi/Documents/Programmation/Modelisation et
	// verif/modelproj/src/principal/CommandLine.g:129:1: justifie : JUSTIFIE
	// p1= formule p2= etat ;
	public final CommandLineParser.justifie_return justifie()
			throws RecognitionException {
		CommandLineParser.justifie_return retval = new CommandLineParser.justifie_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token JUSTIFIE18 = null;
		CommandLineParser.formule_return p1 = null;

		CommandLineParser.etat_return p2 = null;

		Object JUSTIFIE18_tree = null;

		try {
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:130:2: ( JUSTIFIE p1=
			// formule p2= etat )
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:130:4: JUSTIFIE p1=
			// formule p2= etat
			{
				root_0 = (Object) adaptor.nil();

				JUSTIFIE18 = (Token) match(input, JUSTIFIE,
						FOLLOW_JUSTIFIE_in_justifie242);
				JUSTIFIE18_tree = (Object) adaptor.create(JUSTIFIE18);
				adaptor.addChild(root_0, JUSTIFIE18_tree);

				pushFollow(FOLLOW_formule_in_justifie246);
				p1 = formule();

				state._fsp--;

				adaptor.addChild(root_0, p1.getTree());

				pushFollow(FOLLOW_etat_in_justifie250);
				p2 = etat();

				state._fsp--;

				adaptor.addChild(root_0, p2.getTree());

				onJustifie(formule((p1 != null ? ((Object) p1.tree) : null)),
						etat((p2 != null ? ((Object) p2.tree) : null)));

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "justifie"

	public static class justifietodot_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "justifietodot"
	// /Users/jeremymorosi/Documents/Programmation/Modelisation et
	// verif/modelproj/src/principal/CommandLine.g:133:1: justifietodot :
	// JUSTIFIETODOT p1= formule p2= etat p3= file_dot ;
	public final CommandLineParser.justifietodot_return justifietodot()
			throws RecognitionException {
		CommandLineParser.justifietodot_return retval = new CommandLineParser.justifietodot_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token JUSTIFIETODOT19 = null;
		CommandLineParser.formule_return p1 = null;

		CommandLineParser.etat_return p2 = null;

		CommandLineParser.file_dot_return p3 = null;

		Object JUSTIFIETODOT19_tree = null;

		try {
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:134:2: (
			// JUSTIFIETODOT p1= formule p2= etat p3= file_dot )
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:134:4: JUSTIFIETODOT
			// p1= formule p2= etat p3= file_dot
			{
				root_0 = (Object) adaptor.nil();

				JUSTIFIETODOT19 = (Token) match(input, JUSTIFIETODOT,
						FOLLOW_JUSTIFIETODOT_in_justifietodot264);
				JUSTIFIETODOT19_tree = (Object) adaptor.create(JUSTIFIETODOT19);
				adaptor.addChild(root_0, JUSTIFIETODOT19_tree);

				pushFollow(FOLLOW_formule_in_justifietodot268);
				p1 = formule();

				state._fsp--;

				adaptor.addChild(root_0, p1.getTree());

				pushFollow(FOLLOW_etat_in_justifietodot272);
				p2 = etat();

				state._fsp--;

				adaptor.addChild(root_0, p2.getTree());

				pushFollow(FOLLOW_file_dot_in_justifietodot276);
				p3 = file_dot();

				state._fsp--;

				adaptor.addChild(root_0, p3.getTree());

				onJustifieToDot(
						formule((p1 != null ? ((Object) p1.tree) : null)),
						etat((p2 != null ? ((Object) p2.tree) : null)),
						(p3 != null ? input.toString(p3.start, p3.stop) : null));

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "justifietodot"

	public static class file_net_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "file_net"
	// /Users/jeremymorosi/Documents/Programmation/Modelisation et
	// verif/modelproj/src/principal/CommandLine.g:137:1: file_net : (p=
	// STRING_FILE_NET | filename EXT_NET );
	public final CommandLineParser.file_net_return file_net()
			throws RecognitionException {
		CommandLineParser.file_net_return retval = new CommandLineParser.file_net_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token p = null;
		Token EXT_NET21 = null;
		CommandLineParser.filename_return filename20 = null;

		Object p_tree = null;
		Object EXT_NET21_tree = null;

		try {
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:138:2: (p=
			// STRING_FILE_NET | filename EXT_NET )
			int alt2 = 2;
			int LA2_0 = input.LA(1);

			if ((LA2_0 == STRING_FILE_NET)) {
				alt2 = 1;
			} else if ((LA2_0 == FILENAME || (LA2_0 >= 29 && LA2_0 <= 30))) {
				alt2 = 2;
			} else {
				NoViableAltException nvae = new NoViableAltException("", 2, 0,
						input);

				throw nvae;

			}
			switch (alt2) {
			case 1:
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:138:4: p=
			// STRING_FILE_NET
			{
				root_0 = (Object) adaptor.nil();

				p = (Token) match(input, STRING_FILE_NET,
						FOLLOW_STRING_FILE_NET_in_file_net292);
				p_tree = (Object) adaptor.create(p);
				adaptor.addChild(root_0, p_tree);

				p.setText((p != null ? p.getText() : null).substring(1,
						(p != null ? p.getText() : null).length() - 1));

			}
				break;
			case 2:
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:139:4: filename
			// EXT_NET
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_filename_in_file_net299);
				filename20 = filename();

				state._fsp--;

				adaptor.addChild(root_0, filename20.getTree());

				EXT_NET21 = (Token) match(input, EXT_NET,
						FOLLOW_EXT_NET_in_file_net301);
				EXT_NET21_tree = (Object) adaptor.create(EXT_NET21);
				adaptor.addChild(root_0, EXT_NET21_tree);

			}
				break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "file_net"

	public static class file_dot_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "file_dot"
	// /Users/jeremymorosi/Documents/Programmation/Modelisation et
	// verif/modelproj/src/principal/CommandLine.g:142:1: file_dot : (p=
	// STRING_FILE_DOT | filename EXT_DOT );
	public final CommandLineParser.file_dot_return file_dot()
			throws RecognitionException {
		CommandLineParser.file_dot_return retval = new CommandLineParser.file_dot_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token p = null;
		Token EXT_DOT23 = null;
		CommandLineParser.filename_return filename22 = null;

		Object p_tree = null;
		Object EXT_DOT23_tree = null;

		try {
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:143:2: (p=
			// STRING_FILE_DOT | filename EXT_DOT )
			int alt3 = 2;
			int LA3_0 = input.LA(1);

			if ((LA3_0 == STRING_FILE_DOT)) {
				alt3 = 1;
			} else if ((LA3_0 == FILENAME || (LA3_0 >= 29 && LA3_0 <= 30))) {
				alt3 = 2;
			} else {
				NoViableAltException nvae = new NoViableAltException("", 3, 0,
						input);

				throw nvae;

			}
			switch (alt3) {
			case 1:
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:143:4: p=
			// STRING_FILE_DOT
			{
				root_0 = (Object) adaptor.nil();

				p = (Token) match(input, STRING_FILE_DOT,
						FOLLOW_STRING_FILE_DOT_in_file_dot315);
				p_tree = (Object) adaptor.create(p);
				adaptor.addChild(root_0, p_tree);

				p.setText((p != null ? p.getText() : null).substring(1,
						(p != null ? p.getText() : null).length() - 1));

			}
				break;
			case 2:
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:144:4: filename
			// EXT_DOT
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_filename_in_file_dot322);
				filename22 = filename();

				state._fsp--;

				adaptor.addChild(root_0, filename22.getTree());

				EXT_DOT23 = (Token) match(input, EXT_DOT,
						FOLLOW_EXT_DOT_in_file_dot324);
				EXT_DOT23_tree = (Object) adaptor.create(EXT_DOT23);
				adaptor.addChild(root_0, EXT_DOT23_tree);

			}
				break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "file_dot"

	public static class filename_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "filename"
	// /Users/jeremymorosi/Documents/Programmation/Modelisation et
	// verif/modelproj/src/principal/CommandLine.g:147:1: filename : (
	// path_modifier )? FILENAME ( '.' | '/' filename ) ;
	public final CommandLineParser.filename_return filename()
			throws RecognitionException {
		CommandLineParser.filename_return retval = new CommandLineParser.filename_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token FILENAME25 = null;
		Token char_literal26 = null;
		Token char_literal27 = null;
		CommandLineParser.path_modifier_return path_modifier24 = null;

		CommandLineParser.filename_return filename28 = null;

		Object FILENAME25_tree = null;
		Object char_literal26_tree = null;
		Object char_literal27_tree = null;

		try {
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:148:2: ( (
			// path_modifier )? FILENAME ( '.' | '/' filename ) )
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:148:4: (
			// path_modifier )? FILENAME ( '.' | '/' filename )
			{
				root_0 = (Object) adaptor.nil();

				// /Users/jeremymorosi/Documents/Programmation/Modelisation et
				// verif/modelproj/src/principal/CommandLine.g:148:4: (
				// path_modifier )?
				int alt4 = 2;
				int LA4_0 = input.LA(1);

				if (((LA4_0 >= 29 && LA4_0 <= 30))) {
					alt4 = 1;
				}
				switch (alt4) {
				case 1:
				// /Users/jeremymorosi/Documents/Programmation/Modelisation et
				// verif/modelproj/src/principal/CommandLine.g:148:4:
				// path_modifier
				{
					pushFollow(FOLLOW_path_modifier_in_filename337);
					path_modifier24 = path_modifier();

					state._fsp--;

					adaptor.addChild(root_0, path_modifier24.getTree());

				}
					break;

				}

				FILENAME25 = (Token) match(input, FILENAME,
						FOLLOW_FILENAME_in_filename339);
				FILENAME25_tree = (Object) adaptor.create(FILENAME25);
				adaptor.addChild(root_0, FILENAME25_tree);

				// /Users/jeremymorosi/Documents/Programmation/Modelisation et
				// verif/modelproj/src/principal/CommandLine.g:148:27: ( '.' |
				// '/' filename )
				int alt5 = 2;
				int LA5_0 = input.LA(1);

				if ((LA5_0 == 28)) {
					alt5 = 1;
				} else if ((LA5_0 == 31)) {
					alt5 = 2;
				} else {
					NoViableAltException nvae = new NoViableAltException("", 5,
							0, input);

					throw nvae;

				}
				switch (alt5) {
				case 1:
				// /Users/jeremymorosi/Documents/Programmation/Modelisation et
				// verif/modelproj/src/principal/CommandLine.g:149:3: '.'
				{
					char_literal26 = (Token) match(input, 28,
							FOLLOW_28_in_filename345);
					char_literal26_tree = (Object) adaptor
							.create(char_literal26);
					adaptor.addChild(root_0, char_literal26_tree);

				}
					break;
				case 2:
				// /Users/jeremymorosi/Documents/Programmation/Modelisation et
				// verif/modelproj/src/principal/CommandLine.g:150:5: '/'
				// filename
				{
					char_literal27 = (Token) match(input, 31,
							FOLLOW_31_in_filename351);
					char_literal27_tree = (Object) adaptor
							.create(char_literal27);
					adaptor.addChild(root_0, char_literal27_tree);

					pushFollow(FOLLOW_filename_in_filename353);
					filename28 = filename();

					state._fsp--;

					adaptor.addChild(root_0, filename28.getTree());

				}
					break;

				}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "filename"

	public static class path_modifier_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "path_modifier"
	// /Users/jeremymorosi/Documents/Programmation/Modelisation et
	// verif/modelproj/src/principal/CommandLine.g:154:1: path_modifier : ( './'
	// | '../' );
	public final CommandLineParser.path_modifier_return path_modifier()
			throws RecognitionException {
		CommandLineParser.path_modifier_return retval = new CommandLineParser.path_modifier_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set29 = null;

		Object set29_tree = null;

		try {
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:155:2: ( './' | '../'
			// )
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:
			{
				root_0 = (Object) adaptor.nil();

				set29 = (Token) input.LT(1);

				if ((input.LA(1) >= 29 && input.LA(1) <= 30)) {
					input.consume();
					adaptor.addChild(root_0, (Object) adaptor.create(set29));
					state.errorRecovery = false;
				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					throw mse;
				}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "path_modifier"

	public static class formule_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "formule"
	// /Users/jeremymorosi/Documents/Programmation/Modelisation et
	// verif/modelproj/src/principal/CommandLine.g:159:1: formule : '=' ;
	public final CommandLineParser.formule_return formule()
			throws RecognitionException {
		CommandLineParser.formule_return retval = new CommandLineParser.formule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal30 = null;

		Object char_literal30_tree = null;

		try {
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:160:2: ( '=' )
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:160:4: '='
			{
				root_0 = (Object) adaptor.nil();

				char_literal30 = (Token) match(input, 32,
						FOLLOW_32_in_formule385);
				char_literal30_tree = (Object) adaptor.create(char_literal30);
				adaptor.addChild(root_0, char_literal30_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "formule"

	public static class etat_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "etat"
	// /Users/jeremymorosi/Documents/Programmation/Modelisation et
	// verif/modelproj/src/principal/CommandLine.g:163:1: etat : '=' ;
	public final CommandLineParser.etat_return etat()
			throws RecognitionException {
		CommandLineParser.etat_return retval = new CommandLineParser.etat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal31 = null;

		Object char_literal31_tree = null;

		try {
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:164:2: ( '=' )
			// /Users/jeremymorosi/Documents/Programmation/Modelisation et
			// verif/modelproj/src/principal/CommandLine.g:164:4: '='
			{
				root_0 = (Object) adaptor.nil();

				char_literal31 = (Token) match(input, 32, FOLLOW_32_in_etat397);
				char_literal31_tree = (Object) adaptor.create(char_literal31);
				adaptor.addChild(root_0, char_literal31_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object) adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start,
					input.LT(-1), re);

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}

	// $ANTLR end "etat"

	// Delegated rules

	public static final BitSet FOLLOW_instruction_in_start50 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_load_in_instruction61 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_graphe_in_instruction66 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_look_in_instruction71 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_succ_in_instruction76 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_todot_in_instruction81 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ctl_in_instruction86 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ctltodot_in_instruction91 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_justifie_in_instruction96 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_justifietodot_in_instruction101 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_LOAD_in_load112 = new BitSet(
			new long[] { 0x0000000060800800L });
	public static final BitSet FOLLOW_file_net_in_load116 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_GRAPHE_in_graphe130 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_LOOK_in_look144 = new BitSet(
			new long[] { 0x0000000100000000L });
	public static final BitSet FOLLOW_etat_in_look148 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_SUCC_in_succ162 = new BitSet(
			new long[] { 0x0000000100000000L });
	public static final BitSet FOLLOW_etat_in_succ166 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_TODOT_in_todot180 = new BitSet(
			new long[] { 0x0000000060400800L });
	public static final BitSet FOLLOW_file_dot_in_todot184 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CTL_in_ctl198 = new BitSet(
			new long[] { 0x0000000100000000L });
	public static final BitSet FOLLOW_formule_in_ctl202 = new BitSet(
			new long[] { 0x0000000100000000L });
	public static final BitSet FOLLOW_etat_in_ctl206 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CTLTODOT_in_ctltodot220 = new BitSet(
			new long[] { 0x0000000100000000L });
	public static final BitSet FOLLOW_formule_in_ctltodot224 = new BitSet(
			new long[] { 0x0000000060400800L });
	public static final BitSet FOLLOW_file_dot_in_ctltodot228 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_JUSTIFIE_in_justifie242 = new BitSet(
			new long[] { 0x0000000100000000L });
	public static final BitSet FOLLOW_formule_in_justifie246 = new BitSet(
			new long[] { 0x0000000100000000L });
	public static final BitSet FOLLOW_etat_in_justifie250 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_JUSTIFIETODOT_in_justifietodot264 = new BitSet(
			new long[] { 0x0000000100000000L });
	public static final BitSet FOLLOW_formule_in_justifietodot268 = new BitSet(
			new long[] { 0x0000000100000000L });
	public static final BitSet FOLLOW_etat_in_justifietodot272 = new BitSet(
			new long[] { 0x0000000060400800L });
	public static final BitSet FOLLOW_file_dot_in_justifietodot276 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_STRING_FILE_NET_in_file_net292 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_filename_in_file_net299 = new BitSet(
			new long[] { 0x0000000000000400L });
	public static final BitSet FOLLOW_EXT_NET_in_file_net301 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_STRING_FILE_DOT_in_file_dot315 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_filename_in_file_dot322 = new BitSet(
			new long[] { 0x0000000000000200L });
	public static final BitSet FOLLOW_EXT_DOT_in_file_dot324 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_path_modifier_in_filename337 = new BitSet(
			new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_FILENAME_in_filename339 = new BitSet(
			new long[] { 0x0000000090000000L });
	public static final BitSet FOLLOW_28_in_filename345 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_31_in_filename351 = new BitSet(
			new long[] { 0x0000000060000800L });
	public static final BitSet FOLLOW_filename_in_filename353 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_32_in_formule385 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_32_in_etat397 = new BitSet(
			new long[] { 0x0000000000000002L });

}