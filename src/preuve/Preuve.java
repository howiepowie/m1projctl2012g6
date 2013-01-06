package preuve;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.runtime.tree.Tree;

import principal.CommandLineParser;

import CTL.CTL;

public class Preuve implements IPreuve {

	/**
	 * Dernière valeur hue.
	 */
	private static float hue = 0;

	/**
	 * Liste de couleurs distinctes.
	 */
	private static List<Couleur> COULEURS;

	static {
		COULEURS = new ArrayList<Couleur>();
		for (hue = 0; hue <= 1; hue += 0.17) {
			Couleur c = new Couleur();
			c.valeur = hue + " 1 0.5";
			COULEURS.add(c);
		}
	}

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
	 * Couleur associée à la preuve.
	 */
	private Couleur couleur;

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
	public List<IPreuve> getPreuves() {
		return preuves;
	}

	@Override
	public Couleur getCouleur() {
		return couleur;
	}

	@Override
	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
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
			Set<String> justifications, IPreuve parent, int etat) {
		for (IPreuve p : preuves) {
			p.toDot(fleches, justifications, this, etat);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void toDot(Map<Integer, Set<Integer>> fleches,
			Set<String> justifications, IPreuve parent, int etatParent) {
		StringBuffer sb = new StringBuffer();
		boolean[] marquage = getMarquage();
		for (int i = 0; i < marquage.length; ++i) {
			if (marquage[i]) {
				sb.append('N');
				sb.append(etatParent);
				sb.append(" -> N");
				sb.append(i);
				sb.append(" [color=\"");
				sb.append(parent.getCouleur());
				sb.append("\",label=\"");
				sb.append(toString());
				sb.append("\"]");
				sb.append('\n');
			}
		}
		justifications.add(sb.toString());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toDotLabel() {
		return "";
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
	public void genererCouleur() {
		if (couleur == null)
			couleur = new Couleur();
		if (COULEURS.size() > 0) {
			couleur.valeur = COULEURS.remove(0).valeur;
		} else {
			String valeur = hue + " 1 0.75";
			couleur.valeur = valeur;
			hue += 0.17;
			if (hue > 1)
				hue -= 1;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String formuleToString() {
		return formuleToString(formule);
	}

	private String formuleToString(Tree t) {
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
			return "EX(" + formuleToString(t.getChild(0)) + ")";
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

}
