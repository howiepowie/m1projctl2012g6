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

	public IPreuve justifie(RdP rdp, Tree t, IPreuve parent, Coloration couleurs) {
		String couleur = couleurs.genererCouleur();
		IPreuve p = new Preuve(t);
		switch (t.getType()) {
		case CommandLineParser.ATOM:
			int etat = rdp.tablePlace.get(t.getText());
			boolean[] b = prop(etat);
			p = new Atom(t, Arrays.copyOf(b, b.length));
			couleurs.ajouter(t, couleur, "$" + t.getText());
			break;
		case CommandLineParser.TRUE:
			p = new True(t, vrai());
			couleurs.ajouter(t, couleur, "true");
			break;
		case CommandLineParser.FALSE:
			p = new False(t, faux());
			couleurs.ajouter(t, couleur, "false");
			break;
		case CommandLineParser.DEAD:
			p = new Dead(t, dead());
			couleurs.ajouter(t, couleur, "dead");
			break;
		case CommandLineParser.INITIAL:
			p = new Initial(t, initial());
			couleurs.ajouter(t, couleur, "initial");
			break;
		case CommandLineParser.NEG:
			p = new Neg(t);
			IPreuve left = justifie(rdp, t.getChild(0), p, couleurs);
			p.setMarquage(neg(left.getMarquage()));
			couleurs.ajouter(t, couleur,
					"!" + couleurs.getLabel(left.getFormule()));
			break;
		case CommandLineParser.AU:
			left = justifie(rdp, t.getChild(0), null, couleurs);
			IPreuve right = justifie(rdp, t.getChild(1), null, couleurs);
			p = justifieAU(left, right, t);
			couleurs.ajouter(t, couleur,
					"A(" + couleurs.getLabel(left.getFormule()) + " U "
							+ couleurs.getLabel(right.getFormule()) + ")");
			break;
		case CommandLineParser.EU:
			left = justifie(rdp, t.getChild(0), null, couleurs);
			right = justifie(rdp, t.getChild(1), null, couleurs);
			p = justifieEU(left, right, t);
			couleurs.ajouter(t, couleur,
					"E(" + couleurs.getLabel(left.getFormule()) + " U "
							+ couleurs.getLabel(right.getFormule()) + ")");
			break;
		case CommandLineParser.AX:
			p = new AX(t);
			left = justifie(rdp, t.getChild(0), p, couleurs);
			p.setMarquage(AX(left.getMarquage()));
			couleurs.ajouter(t, couleur,
					"AX(" + couleurs.getLabel(left.getFormule()) + ")");
			break;
		case CommandLineParser.EX:
			p = new EX(t);
			left = justifie(rdp, t.getChild(0), p, couleurs);
			p.setMarquage(EX(left.getMarquage()));
			couleurs.ajouter(t, couleur,
					"EX(" + couleurs.getLabel(left.getFormule()) + ")");
			break;
		case CommandLineParser.AF:
			left = new True(couleurs.ajouter("true"), vrai());
			right = justifie(rdp, t.getChild(0), null, couleurs);
			boolean[] marquage = AU(vrai(), right.getMarquage());
			p = new AF(t, marquage, left, right);
			couleurs.ajouter(t, couleur,
					"AF(" + couleurs.getLabel(right.getFormule()) + ")");
			break;
		case CommandLineParser.EF:
			left = new True(couleurs.ajouter("true"), vrai());
			right = justifie(rdp, t.getChild(0), null, couleurs);
			marquage = EU(vrai(), right.getMarquage());
			p = new EF(t, marquage, left, right);
			couleurs.ajouter(t, couleur,
					"EF(" + couleurs.getLabel(right.getFormule()) + ")");
			break;
		case CommandLineParser.AG:
			// Il faut créer un faux chemin validant tout le temps la formule.
			left = justifie(rdp, t.getChild(0), p, couleurs);
			IPreuve debut = left.clone();
			IPreuve fin = left.clone();
			fin.setMarquage(and(dead(), fin.getMarquage()));
			marquage = neg(EU(vrai(), neg(left.getMarquage())));
			p = new AG(t, marquage, debut, fin);
			couleurs.ajouter(t, couleur,
					"AG(" + couleurs.getLabel(left.getFormule()) + ")");
			break;
		case CommandLineParser.EG:
			// Il faut créer un faux chemin validant tout le temps la formule.
			left = justifie(rdp, t.getChild(0), null, couleurs);
			debut = left.clone();
			fin = left.clone();
			marquage = neg(AU(vrai(), neg(left.getMarquage())));
			p = new EG(t, marquage, debut, fin);
			couleurs.ajouter(t, couleur,
					"EG(" + couleurs.getLabel(left.getFormule()) + ")");
			break;
		case CommandLineParser.OR:
			p = new Or(t);
			left = justifie(rdp, t.getChild(0), p, couleurs);
			right = justifie(rdp, t.getChild(1), p, couleurs);
			p.setMarquage(or(left.getMarquage(), right.getMarquage()));
			couleurs.ajouter(t, couleur,
					"(" + couleurs.getLabel(left.getFormule()) + " || "
							+ couleurs.getLabel(right.getFormule()) + ")");
			break;
		case CommandLineParser.AND:
			p = new And(t);
			left = justifie(rdp, t.getChild(0), p, couleurs);
			right = justifie(rdp, t.getChild(1), p, couleurs);
			p.setMarquage(and(left.getMarquage(), right.getMarquage()));
			couleurs.ajouter(t, couleur,
					"(" + couleurs.getLabel(left.getFormule()) + " &amp;&amp; "
							+ couleurs.getLabel(right.getFormule()) + ")");
			break;
		case CommandLineParser.IMPLY:
			left = justifie(rdp, t.getChild(0), p, couleurs);
			right = justifie(rdp, t.getChild(1), p, couleurs);
			p.setMarquage(or(neg(left.getMarquage()), right.getMarquage()));
			couleurs.ajouter(t, couleur,
					"(" + couleurs.getLabel(left.getFormule()) + " -> "
							+ couleurs.getLabel(right.getFormule()) + ")");
			break;
		case CommandLineParser.EQUIV:
			left = justifie(rdp, t.getChild(0), p, couleurs);
			right = justifie(rdp, t.getChild(1), p, couleurs);
			p.setMarquage(and(or(neg(left.getMarquage()), right.getMarquage()),
					or(neg(right.getMarquage()), left.getMarquage())));
			couleurs.ajouter(t, couleur,
					"(" + couleurs.getLabel(left.getFormule()) + " <-> "
							+ couleurs.getLabel(right.getFormule()) + ")");
			break;
		default:
		}
		if (parent != null) {
			parent.getPreuves().add(p);
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