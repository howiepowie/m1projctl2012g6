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
		case CommandLineParser.DEAD:
			return dead();
		case CommandLineParser.INITIAL:
			return initial();
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
			return AX(left);
		case CommandLineParser.EX:
			left = valeur(rdp, t.getChild(0));
			return EX(left);
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

	public Preuve justifie(RdP rdp, Tree t, Preuve parent) {
		Preuve p = new Preuve(t);
		switch (t.getType()) {
		case CommandLineParser.ATOM:
			int etat = rdp.tablePlace.get(t.getText());
			p.marquage = prop(etat);
			break;
		case CommandLineParser.TRUE:
			p.marquage = vrai();
			break;
		case CommandLineParser.FALSE:
			p.marquage = faux();
			break;
		case CommandLineParser.DEAD:
			p.marquage = dead();
			break;
		case CommandLineParser.INITIAL:
			p.marquage = initial();
			break;
		case CommandLineParser.NEG:
			Preuve left = justifie(rdp, t.getChild(0), p);
			p.marquage = neg(left.marquage);
			break;
		case CommandLineParser.AU:
			left = justifie(rdp, t.getChild(0), p);
			Preuve right = justifie(rdp, t.getChild(1), p);
			p.marquage = AU(left.marquage, right.marquage);
			break;
		case CommandLineParser.EU:
			left = justifie(rdp, t.getChild(0), p);
			right = justifie(rdp, t.getChild(1), p);
			p = justifieEU(left.marquage, right.marquage, t, p);
			break;
		case CommandLineParser.AX:
			left = justifie(rdp, t.getChild(0), p);
			p.marquage = AX(left.marquage);
			break;
		case CommandLineParser.EX:
			left = justifie(rdp, t.getChild(0), p);
			p.marquage = EX(left.marquage);
			break;
		case CommandLineParser.AF:
			left = justifie(rdp, t.getChild(0), p);
			p.marquage = AU(vrai(), left.marquage);
			break;
		case CommandLineParser.EF:
			left = justifie(rdp, t.getChild(0), p);

			p.marquage = EU(vrai(), left.marquage);
			break;
		case CommandLineParser.AG:
			left = justifie(rdp, t.getChild(0), p);
			p.marquage = neg(AU(vrai(), neg(left.marquage)));
			break;
		case CommandLineParser.EG:
			left = justifie(rdp, t.getChild(0), p);
			p.marquage = neg(EU(vrai(), neg(left.marquage)));
			break;
		case CommandLineParser.OR:
			left = justifie(rdp, t.getChild(0), p);
			right = justifie(rdp, t.getChild(1), p);
			p.marquage = or(left.marquage, right.marquage);
			break;
		case CommandLineParser.AND:
			left = justifie(rdp, t.getChild(0), p);
			right = justifie(rdp, t.getChild(1), p);
			p.marquage = and(left.marquage, right.marquage);
			break;
		case CommandLineParser.IMPLY:
			left = justifie(rdp, t.getChild(0), p);
			right = justifie(rdp, t.getChild(1), p);
			p.marquage = or(neg(left.marquage), right.marquage);
			break;
		case CommandLineParser.EQUIV:
			left = justifie(rdp, t.getChild(0), p);
			right = justifie(rdp, t.getChild(1), p);
			p.marquage = and(or(neg(left.marquage), right.marquage),
					or(neg(right.marquage), left.marquage));
			break;
		default:
		}
		if (parent != null) {
			parent.preuves.add(p);
		}
		return p;
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

	public boolean[] dead() {
		boolean[] res = new boolean[systeme.length];
		for (int i = 0; i < systeme.length; ++i) {
			res[i] = systeme[i].length == 0;
		}
		return res;
	}

	public boolean[] initial() {
		boolean[] res = new boolean[systeme.length];
		Arrays.fill(res, false);
		res[0] = true;
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

	public Preuve justifieEU(boolean[] a, boolean[] b, Tree t, Preuve parent) {
		boolean[] res = faux();
		boolean[] avant;
		int count = 0;
		do {
			avant = res;
			res = or(b, and(a, EX(res)));
			++count;
		} while (!Arrays.equals(avant, res));
		for (; count > 1; --count) {
			parent.marquage = new boolean[res.length];
			System.arraycopy(res, 0, parent.marquage, 0, res.length);
			Preuve p = new Preuve(t);
			p.preuves.add(parent);
			parent = p;
		}
		parent.marquage = new boolean[res.length];
		System.arraycopy(res, 0, parent.marquage, 0, res.length);
		return parent;
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