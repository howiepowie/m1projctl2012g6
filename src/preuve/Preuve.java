package preuve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.tree.Tree;

import principal.CommandLineParser;

import CTL.CTL;

public class Preuve implements IPreuve {
	private Tree formule;

	private boolean[] marquage;

	private List<IPreuve> preuves;

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
	public String toString() {
		switch (formule.getType()) {
		case CommandLineParser.ATOM:
			return '$' + formule.getText();
		case CommandLineParser.TRUE:
			return "true";
		case CommandLineParser.FALSE:
			return "false";
		case CommandLineParser.DEAD:
			return "dead";
		case CommandLineParser.INITIAL:
			return "initial";
		case CommandLineParser.NEG:
			return '!' + preuves.get(0).toString();
		case CommandLineParser.AX:
			return "AX(" + preuves.get(0).toString() + ')';
		case CommandLineParser.EX:
			return "EX(" + preuves.get(0).toString() + ')';
		case CommandLineParser.AF:
			return "AF(" + preuves.get(0).toString() + ')';
		case CommandLineParser.EF:
			return "EF(" + preuves.get(0).toString() + ')';
		case CommandLineParser.AG:
			return "AG(" + preuves.get(0).toString() + ')';
		case CommandLineParser.EG:
			return "EG(" + preuves.get(0).toString() + ')';
		case CommandLineParser.OR:
			return '(' + preuves.get(0).toString() + ") || ("
					+ preuves.get(1).toString() + ')';
		case CommandLineParser.AND:
			return '(' + preuves.get(0).toString() + ") && ("
					+ preuves.get(1).toString() + ')';
		case CommandLineParser.IMPLY:
			return '(' + preuves.get(0).toString() + ") -> ("
					+ preuves.get(1).toString() + ')';
		case CommandLineParser.EQUIV:
			return '(' + preuves.get(0).toString() + ") <-> ("
					+ preuves.get(1).toString() + ')';
		default:
			return null;
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
		sb.append(toString());
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
	public String toDot(int etat) {
		// TODO Auto-generated method stub
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

}
