package CTL;

import java.util.Arrays;

import org.antlr.runtime.tree.Tree;

import principal.CommandLineParser;
import rdp.RdP;
import preuve.*;

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
			return neg(EU(vrai(), neg(left)));
		case CommandLineParser.EG:
			left = valeur(rdp, t.getChild(0));
			return neg(AU(vrai(), neg(left)));
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

	public IPreuve justifie(RdP rdp, Tree t, IPreuve parent) {
		IPreuve p = new Preuve(t);
		switch (t.getType()) {
		case CommandLineParser.ATOM:
			int etat = rdp.tablePlace.get(t.getText());
			boolean[] b = prop(etat);
			p = new Atom(t, Arrays.copyOf(b, b.length));
			break;
		case CommandLineParser.TRUE:
			p = new True(t, vrai());
			break;
		case CommandLineParser.FALSE:
			p = new False(t, faux());
			break;
		case CommandLineParser.DEAD:
			p = new Dead(t, dead());
			break;
		case CommandLineParser.INITIAL:
			p = new Initial(t, initial());
			break;
		case CommandLineParser.NEG:
			p = new Neg(t);
			IPreuve left = justifie(rdp, t.getChild(0), p);
			p.setMarquage(neg(left.getMarquage()));
			break;
		case CommandLineParser.AU:
			left = justifie(rdp, t.getChild(0), null);
			IPreuve right = justifie(rdp, t.getChild(1), null);
			p = justifieAU(left, right, t);
			break;
		case CommandLineParser.EU:
			left = justifie(rdp, t.getChild(0), null);
			right = justifie(rdp, t.getChild(1), null);
			p = justifieEU(left, right, t);
			break;
		case CommandLineParser.AX:
			p = new AX(t);
			left = justifie(rdp, t.getChild(0), p);
			p.setMarquage(AX(left.getMarquage()));
			break;
		case CommandLineParser.EX:
			p = new EX(t);
			left = justifie(rdp, t.getChild(0), p);
			p.setMarquage(EX(left.getMarquage()));
			break;
		case CommandLineParser.AF:
			left = new True(null, vrai());
			left.genererCouleur();
			right = justifie(rdp, t.getChild(0), null);
			IPreuve p2 = justifieAU(left, right, t);
			p = new AF(t, p2);
			break;
		case CommandLineParser.EF:
			left = new True(null, vrai());
			left.genererCouleur();
			right = justifie(rdp, t.getChild(0), null);
			p2 = justifieEU(left, right, t);
			p = new EF(t, p2);
			break;
		case CommandLineParser.AG:
			// Il faut créer un faux chemin validant tout le temps la formule.
			left = justifie(rdp, t.getChild(0), p);
			IPreuve debut = left.clone();
			IPreuve fin = left.clone();
			fin.setMarquage(and(dead(), fin.getMarquage()));
			boolean[] marquage = neg(EU(vrai(), neg(left.getMarquage())));
			p = new AG(t, marquage, debut, fin);
			break;
		case CommandLineParser.EG:
			// Il faut créer un faux chemin validant tout le temps la formule.
			left = justifie(rdp, t.getChild(0), null);
			debut = left.clone();
			fin = left.clone();
			fin.setMarquage(and(dead(), fin.getMarquage()));
			marquage = neg(AU(vrai(), neg(left.getMarquage())));
			System.out.println(Preuve.affiche(marquage));
			p = new EG(t, marquage, debut, fin);
			break;
		case CommandLineParser.OR:
			p = new Or(t);
			left = justifie(rdp, t.getChild(0), p);
			right = justifie(rdp, t.getChild(1), p);
			p.setMarquage(or(left.getMarquage(), right.getMarquage()));
			break;
		case CommandLineParser.AND:
			p = new And(t);
			left = justifie(rdp, t.getChild(0), p);
			right = justifie(rdp, t.getChild(1), p);
			p.setMarquage(and(left.getMarquage(), right.getMarquage()));
			break;
		case CommandLineParser.IMPLY:
			left = justifie(rdp, t.getChild(0), p);
			right = justifie(rdp, t.getChild(1), p);
			p.setMarquage(or(neg(left.getMarquage()), right.getMarquage()));
			break;
		case CommandLineParser.EQUIV:
			left = justifie(rdp, t.getChild(0), p);
			right = justifie(rdp, t.getChild(1), p);
			p.setMarquage(and(or(neg(left.getMarquage()), right.getMarquage()),
					or(neg(right.getMarquage()), left.getMarquage())));
			break;
		default:
		}
		if (parent != null) {
			parent.getPreuves().add(p);
		}
		p.genererCouleur();
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

	public IPreuve justifieEU(IPreuve debut, IPreuve fin, Tree t) {
		boolean[] res = faux();
		boolean[] avant;
		boolean[] a = debut.getMarquage();
		boolean[] b = fin.getMarquage();
		do {
			avant = res;
			res = or(b, and(a, EX(res)));
		} while (!Arrays.equals(avant, res));
		IPreuve p = new EU(t, res, debut, fin);
		return p;
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

	public IPreuve justifieAU(IPreuve debut, IPreuve fin, Tree t) {
		boolean[] res = faux();
		boolean[] avant;
		boolean[] a = debut.getMarquage();
		boolean[] b = fin.getMarquage();
		do {
			avant = res;
			res = or(b, and(a, AX(res)));
		} while (!Arrays.equals(avant, res));
		IPreuve p = new AU(t, res, debut, fin);
		return p;
	}

}