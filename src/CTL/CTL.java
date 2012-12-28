package CTL;

import java.util.Arrays;

import org.antlr.runtime.tree.Tree;

import principal.CommandLineParser;
import rdp.RdP;

public class CTL {

	int[][] systeme; // liste des succeseur de chaque état
	boolean[][] AP; //

	public CTL(int[][] systeme, boolean[][] AP) {
		this.systeme = systeme;
		this.AP = AP;
	}

	public boolean[] valeur(RdP rdp, Tree t) {
		switch (t.getType()) {
		case CommandLineParser.ATOM:
			return prop(rdp.tablePlace.get(t.getText()));
		case CommandLineParser.TRUE:
			return vrai();
		case CommandLineParser.FALSE:
			return faux();
		case CommandLineParser.NEG:
			boolean[] left = valeur(rdp, t.getChild(0));
			return neg(left);
		case CommandLineParser.AU:
			left = valeur(rdp, t.getChild(0));
			boolean[] right = valeur(rdp, t.getChild(1));
			return AU(left, right);
		case CommandLineParser.EU:
			left = valeur(rdp, t.getChild(0));
			right = valeur(rdp, t.getChild(1));
			return EU(left, right);
		case CommandLineParser.AX:
			left = valeur(rdp, t.getChild(0));
			return EX(left);
		case CommandLineParser.EX:
			left = valeur(rdp, t.getChild(0));
			return AX(left);
		case CommandLineParser.AF:
			left = valeur(rdp, t.getChild(0));
			return AU(vrai(), left);
		case CommandLineParser.EF:
			left = valeur(rdp, t.getChild(0));
			return EU(vrai(), left);
		case CommandLineParser.AG:
			left = valeur(rdp, t.getChild(0));
			return neg(AU(vrai(), neg(left)));
		case CommandLineParser.EG:
			left = valeur(rdp, t.getChild(0));
			return neg(EU(vrai(), neg(left)));
		case CommandLineParser.OR:
			left = valeur(rdp, t.getChild(0));
			right = valeur(rdp, t.getChild(1));
			return or(left, right);
		case CommandLineParser.AND:
			left = valeur(rdp, t.getChild(0));
			right = valeur(rdp, t.getChild(1));
			return and(left, right);
		case CommandLineParser.IMPLY:
			left = valeur(rdp, t.getChild(0));
			right = valeur(rdp, t.getChild(1));
			return or(neg(left), right);
		case CommandLineParser.EQUIV:
			left = valeur(rdp, t.getChild(0));
			right = valeur(rdp, t.getChild(1));
			return and(or(neg(left), right), or(neg(right), left));
		default:
			return null;
		}
	}

	public boolean[] prop(int i) {
		return AP[i];
	}

	public boolean[] faux() {
		boolean[] res = new boolean[systeme.length];
		Arrays.fill(res, false);
		return res;
	}

	public boolean[] vrai() {
		boolean[] res = new boolean[systeme.length];
		Arrays.fill(res, true);
		return res;
	}

	public boolean[] neg(boolean[] a) {
		boolean[] res = new boolean[systeme.length];
		for (int i = 0; i < systeme.length; i++)
			res[i] = !a[i];
		return res;
	}

	public boolean[] or(boolean[] a, boolean[] b) {
		boolean[] res = new boolean[systeme.length];
		for (int i = 0; i < systeme.length; i++)
			res[i] = a[i] || b[i];
		return res;
	}

	public boolean[] and(boolean[] a, boolean[] b) {
		boolean[] res = new boolean[systeme.length];
		for (int i = 0; i < systeme.length; i++)
			res[i] = a[i] && b[i];
		return res;
	}

	public boolean[] EX(boolean[] a) {
		boolean[] res = new boolean[systeme.length];
		for (int i = 0; i < systeme.length; i++) {
			res[i] = false;
			for (int j = 0; !res[i] && j < systeme[i].length; j++)
				res[i] = a[systeme[i][j]];
		}
		return res;
	}

	public boolean[] AX(boolean[] a) {
		return neg(EX(neg(a)));
	}

	public boolean[] EU(boolean[] a, boolean[] b) {
		boolean[] res = faux();
		boolean[] avant;
		do {
			avant = res;
			res = or(b, and(a, EX(res)));
		} while (!Arrays.equals(avant, res));
		return res;
	}

	public boolean[] AU(boolean[] a, boolean[] b) {
		boolean[] res = faux();
		boolean[] avant;
		do {
			avant = res;
			res = or(b, and(a, AX(res)));
		} while (!Arrays.equals(avant, res));
		return res;
	}
}