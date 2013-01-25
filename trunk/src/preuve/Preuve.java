package preuve;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;

import principal.CommandLineLexer;
import principal.CommandLineParser;
import principal.ICallback;
import CTL.CTL;

public class Preuve implements IPreuve {

	/**
	 * Formule associée à la preuve.
	 */
	private Tree formule;

	/**
	 * Etats vérifiants la formule.
	 */
	private boolean[] marquage;

	/**
	 * Liste des sous-preuves.
	 */
	private List<IPreuve> preuves;

	/**
	 * Si la preuve est un contre exemple.
	 */
	private boolean contreExemple;

	public Preuve(Tree formule) {
		this(formule, null);
	}

	public Preuve(Tree formule, boolean[] marquage) {
		this.formule = formule;
		this.marquage = marquage;
		preuves = new ArrayList<IPreuve>();
	}

	@Override
	public Tree getFormule() {
		return formule;
	}

	@Override
	public boolean[] getMarquage() {
		return marquage;
	}

	@Override
	public void setMarquage(boolean[] marquage) {
		this.marquage = marquage;
	}

	@Override
	public boolean isContreExemple() {
		return contreExemple;
	}

	@Override
	public void setContreExemple(boolean contreExemple) {
		this.contreExemple = contreExemple;
	}

	@Override
	public List<IPreuve> getPreuves() {
		return preuves;
	}

	@Override
	public void couperRacine(CTL ctl, int[][] pred, int etat) {
		tousFalseSauf(etat);
		for (IPreuve c : preuves) {
			c.couper(ctl, pred, marquage);
		}
	}

	@Override
	public void couper(CTL ctl, int[][] pred, boolean[] parents) {
		tousFalseSauf(pred, parents);
		for (IPreuve c : preuves) {
			c.couper(ctl, pred, marquage);
		}
	}

	@Override
	public String toTree() {
		return toTree("");
	}

	@Override
	public String toTree(String indent) {
		StringBuffer sb = new StringBuffer();
		sb.append(indent);
		sb.append(formuleToString());
		sb.append(" = ");
		sb.append(affiche(marquage));
		sb.append('\n');
		for (IPreuve c : preuves) {
			if (c != null) {
				sb.append(c.toTree(indent + "  "));
			}
		}
		return sb.toString();
	}

	@Override
	public void toDotRacine(Map<Integer, Set<Integer>> fleches,
			Set<String> justifications, IPreuve parent, int etat,
			Coloration couleurs) {
		for (IPreuve p : preuves) {
			p.toDot(fleches, justifications, this, etat, couleurs);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void toDot(Map<Integer, Set<Integer>> fleches,
			Set<String> justifications, IPreuve parent, int etatParent,
			Coloration couleurs) {
		StringBuffer sb = new StringBuffer();
		boolean[] marquage = getMarquage();
		for (int i = 0; i < marquage.length; ++i) {
			if (marquage[i]) {
				sb.append('N');
				sb.append(etatParent);
				sb.append(" -> N");
				sb.append(i);
				sb.append(" [color=\"");
				sb.append(couleurs.getCouleur(parent.getFormule()));
				sb.append("\",label=<");
				sb.append(toDotLabel(couleurs));
				sb.append(">]");
				sb.append('\n');
				fleches.get(etatParent).add(i);
			}
		}
		justifications.add(sb.toString());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toDotLabel(Coloration couleurs) {
		return couleurs.getLabel(formule);
	}

	public static String affiche(boolean[] b) {
		StringBuffer res = new StringBuffer();
		res.append("{ ");
		for (int i = 0; i < b.length; i++) {
			if (b[i])
				res.append(i + " ");
		}
		res.append("}");
		return res.toString();
	}

	/**
	 * Met tous les états du marquage à false sauf celui donné.
	 * 
	 * @param etat
	 *            l'état à laisser tel quel.
	 */
	protected void tousFalseSauf(int etat) {
		for (int i = 0; i < marquage.length; ++i) {
			if (marquage[i] && i != etat) {
				marquage[i] = false;
			}
		}
	}

	/**
	 * Met tous les états du marquage à false sauf ceux qui ont au moins un
	 * prédécesseur à true dans la liste des parents.
	 * 
	 * @param pred
	 *            liste des prédécesseurs.
	 * @param parents
	 *            liste des parents.
	 */
	protected void tousFalseSauf(int[][] pred, boolean[] parents) {
		for (int i = 0; i < marquage.length; ++i) {
			if (marquage[i]) {
				marquage[i] = false;
				for (int j = 0; !marquage[i] && j < pred[i].length; ++j) {
					if (parents[pred[i][j]]) {
						marquage[i] = true;
					}
				}
			}
		}
	}

	public IPreuve clone() {
		return null;
	}

	public boolean[] getMarquageCopie() {
		boolean[] b = new boolean[marquage.length];
		System.arraycopy(marquage, 0, b, 0, b.length);
		return b;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String formuleToString() {
		return formuleToString(formule);
	}

	public static String formuleToString(Tree t) {
		switch (t.getType()) {
		case CommandLineParser.ATOM:
			return "$" + t.getText();
		case CommandLineParser.TRUE:
			return "true";
		case CommandLineParser.FALSE:
			return "false";
		case CommandLineParser.DEAD:
			return "dead";
		case CommandLineParser.INITIAL:
			return "initial";
		case CommandLineParser.NEG:
			return "!" + formuleToString(t.getChild(0));
		case CommandLineParser.AU:
			return "A(" + formuleToString(t.getChild(0)) + " U "
					+ formuleToString(t.getChild(1)) + ")";
		case CommandLineParser.EU:
			return "E(" + formuleToString(t.getChild(0)) + " U "
					+ formuleToString(t.getChild(1)) + ")";
		case CommandLineParser.AX:
			return "AX(" + formuleToString(t.getChild(0)) + ")";
		case CommandLineParser.EX:
			return "EX(" + formuleToString(t.getChild(0)) + ")";
		case CommandLineParser.AF:
			return "AF(" + formuleToString(t.getChild(0)) + ")";
		case CommandLineParser.EF:
			return "EF(" + formuleToString(t.getChild(0)) + ")";
		case CommandLineParser.AG:
			return "AG(" + formuleToString(t.getChild(0)) + ")";
		case CommandLineParser.EG:
			return "EG(" + formuleToString(t.getChild(0)) + ")";
		case CommandLineParser.OR:
			return "(" + formuleToString(t.getChild(0)) + " || "
					+ formuleToString(t.getChild(1)) + ")";
		case CommandLineParser.AND:
			return "(" + formuleToString(t.getChild(0)) + " && "
					+ formuleToString(t.getChild(1)) + ")";
		case CommandLineParser.IMPLY:
			return "(" + formuleToString(t.getChild(0)) + " -> "
					+ formuleToString(t.getChild(1)) + ")";
		case CommandLineParser.EQUIV:
			return "(" + formuleToString(t.getChild(0)) + " <-> "
					+ formuleToString(t.getChild(1)) + ")";
		default:
			return null;
		}
	}

	public static String neg(Tree t) {
		switch (t.getType()) {
		case CommandLineParser.ATOM:
			return "!$" + t.getText();
		case CommandLineParser.TRUE:
			return "false";
		case CommandLineParser.FALSE:
			return "true";
		case CommandLineParser.DEAD:
			return "!dead";
		case CommandLineParser.INITIAL:
			return "!initial";
		case CommandLineParser.NEG:
			return formuleToString(t.getChild(0));
		case CommandLineParser.AU:
			String u = formuleToString(t.getChild(0));
			String v = formuleToString(t.getChild(1));
			return "(E(!" + v + " U !(" + u + " || " + v + ")) || EG(!" + v
					+ "))";
		case CommandLineParser.EU:
			u = formuleToString(t.getChild(0));
			v = formuleToString(t.getChild(1));
			return "A((" + u + " && !" + v + ") U (!" + u + " && !" + v + "))";
		case CommandLineParser.AX:
			return "EX(!" + formuleToString(t.getChild(0)) + ")";
		case CommandLineParser.EX:
			return "AX(!" + formuleToString(t.getChild(0)) + ")";
		case CommandLineParser.AF:
			return "EG(!" + formuleToString(t.getChild(0)) + ")";
		case CommandLineParser.EF:
			return "AG(!" + formuleToString(t.getChild(0)) + ")";
		case CommandLineParser.AG:
			return "EF(!" + formuleToString(t.getChild(0)) + ")";
		case CommandLineParser.EG:
			return "AF(!" + formuleToString(t.getChild(0)) + ")";
		case CommandLineParser.OR:
			return "(!" + formuleToString(t.getChild(0)) + " && !"
					+ formuleToString(t.getChild(1)) + ")";
		case CommandLineParser.AND:
			return "(!" + formuleToString(t.getChild(0)) + " || !"
					+ formuleToString(t.getChild(1)) + ")";
		case CommandLineParser.IMPLY:
			return "(" + formuleToString(t.getChild(0)) + " && !"
					+ formuleToString(t.getChild(1)) + ")";
		case CommandLineParser.EQUIV:
			u = formuleToString(t.getChild(0));
			v = formuleToString(t.getChild(1));
			return "(!(" + u + " -> " + v + ") || !(" + v + " -> " + u + "))";
		default:
			return null;
		}
	}

	public static Tree negTree(Tree t) throws RecognitionException {
		return negTree(neg(t));
	}

	public static Tree negTree(String s) throws RecognitionException {
		if (s == null) {
			return null;
		} else {
			ANTLRStringStream in = new ANTLRStringStream(s);
			CommandLineLexer lexer = new CommandLineLexer(in);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			CommandLineParser parser = new CommandLineParser((ICallback) null);
			parser.setTokenStream(tokens);
			return (Tree) parser.formule().getTree();
		}
	}

	public static boolean estAtomique(Tree t) {
		switch (t.getType()) {
		case CommandLineParser.ATOM:
		case CommandLineParser.TRUE:
		case CommandLineParser.FALSE:
		case CommandLineParser.DEAD:
		case CommandLineParser.INITIAL:
			return true;
		default:
			return false;
		}
	}

}
