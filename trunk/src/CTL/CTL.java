package CTL;

import java.util.Arrays;

import org.antlr.runtime.tree.Tree;

import preuve.AF;
import preuve.AG;
import preuve.AU;
import preuve.AX;
import preuve.And;
import preuve.Atom;
import preuve.Coloration;
import preuve.Dead;
import preuve.EF;
import preuve.EG;
import preuve.EU;
import preuve.EX;
import preuve.Equivalent;
import preuve.False;
import preuve.IPreuve;
import preuve.Imply;
import preuve.Initial;
import preuve.NegAtom;
import preuve.NegComplex;
import preuve.Or;
import preuve.Preuve;
import preuve.True;
import principal.CommandLineParser;
import rdp.RdP;

public class CTL {

	int[][] systeme; // liste des succeseur de chaque état
	boolean[][] AP; //
	RdP rdp;
	Coloration couleurs;

	public CTL(RdP rdp, int[][] systeme, boolean[][] AP, Coloration couleurs) {
		this.systeme = systeme;
		this.AP = AP;
		this.rdp = rdp;
		this.couleurs = couleurs;
	}

	public RdP getRdP() {
		return rdp;
	}

	public Coloration getCouleurs() {
		return couleurs;
	}

	public boolean[] valeur(Tree t) {
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
			boolean[] left = valeur(t.getChild(0));
			return neg(left);
		case CommandLineParser.AU:
			left = valeur(t.getChild(0));
			boolean[] right = valeur(t.getChild(1));
			return AU(left, right);
		case CommandLineParser.EU:
			left = valeur(t.getChild(0));
			right = valeur(t.getChild(1));
			return EU(left, right);
		case CommandLineParser.AX:
			left = valeur(t.getChild(0));
			return AX(left);
		case CommandLineParser.EX:
			left = valeur(t.getChild(0));
			return EX(left);
		case CommandLineParser.AF:
			left = valeur(t.getChild(0));
			return AU(vrai(), left);
		case CommandLineParser.EF:
			left = valeur(t.getChild(0));
			return EU(vrai(), left);
		case CommandLineParser.AG:
			left = valeur(t.getChild(0));
			return neg(EU(vrai(), neg(left)));
		case CommandLineParser.EG:
			left = valeur(t.getChild(0));
			return neg(AU(vrai(), neg(left)));
		case CommandLineParser.OR:
			left = valeur(t.getChild(0));
			right = valeur(t.getChild(1));
			return or(left, right);
		case CommandLineParser.AND:
			left = valeur(t.getChild(0));
			right = valeur(t.getChild(1));
			return and(left, right);
		case CommandLineParser.IMPLY:
			left = valeur(t.getChild(0));
			right = valeur(t.getChild(1));
			return or(neg(left), right);
		case CommandLineParser.EQUIV:
			left = valeur(t.getChild(0));
			right = valeur(t.getChild(1));
			return and(or(neg(left), right), or(neg(right), left));
		default:
			return null;
		}
	}

	public IPreuve justifie(Tree t, IPreuve parent) {
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
			try {
				if (Preuve.estAtomique(t.getChild(0))) {
					// Si c'est une négation sur un atome.
					p = new NegAtom(t);
					IPreuve left = justifie(t.getChild(0), p);
					p.setMarquage(neg(left.getMarquage()));
					couleurs.ajouter(t, couleur,
							"!" + couleurs.getLabel(left.getFormule()));
				} else {
					// Si c'est une négation sur une formule complexe.
					Tree neg = Preuve.negTree(t.getChild(0));
					IPreuve negP = justifie(neg, null);
					p = new NegComplex(t, negP);
					p.setMarquage(negP.getMarquage());
					couleurs.ajouter(t, couleur, Preuve.formuleToString(t));
				}
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
			break;
		case CommandLineParser.AU:
			IPreuve left = justifie(t.getChild(0), null);
			IPreuve right = justifie(t.getChild(1), null);
			p = justifieAU(left, right, t);
			couleurs.ajouter(t, couleur,
					"A(" + couleurs.getLabel(left.getFormule()) + " U "
							+ couleurs.getLabel(right.getFormule()) + ")");
			break;
		case CommandLineParser.EU:
			left = justifie(t.getChild(0), null);
			right = justifie(t.getChild(1), null);
			p = justifieEU(left, right, t);
			couleurs.ajouter(t, couleur,
					"E(" + couleurs.getLabel(left.getFormule()) + " U "
							+ couleurs.getLabel(right.getFormule()) + ")");
			break;
		case CommandLineParser.AX:
			p = new AX(t);
			left = justifie(t.getChild(0), p);
			p.setMarquage(AX(left.getMarquage()));
			couleurs.ajouter(t, couleur,
					"AX(" + couleurs.getLabel(left.getFormule()) + ")");
			break;
		case CommandLineParser.EX:
			p = new EX(t);
			left = justifie(t.getChild(0), p);
			p.setMarquage(EX(left.getMarquage()));
			couleurs.ajouter(t, couleur,
					"EX(" + couleurs.getLabel(left.getFormule()) + ")");
			break;
		case CommandLineParser.AF:
			left = new True(couleurs.ajouter("true"), vrai());
			right = justifie(t.getChild(0), null);
			boolean[] marquage = AU(vrai(), right.getMarquage());
			p = new AF(t, marquage, left, right);
			couleurs.ajouter(t, couleur,
					"AF(" + couleurs.getLabel(right.getFormule()) + ")");
			break;
		case CommandLineParser.EF:
			left = new True(couleurs.ajouter("true"), vrai());
			right = justifie(t.getChild(0), null);
			marquage = EU(vrai(), right.getMarquage());
			p = new EF(t, marquage, left, right);
			couleurs.ajouter(t, couleur,
					"EF(" + couleurs.getLabel(right.getFormule()) + ")");
			break;
		case CommandLineParser.AG:
			// Il faut créer un faux chemin validant tout le temps la formule.
			left = justifie(t.getChild(0), null);
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
			left = justifie(t.getChild(0), null);
			debut = left.clone();
			fin = left.clone();
			marquage = neg(AU(vrai(), neg(left.getMarquage())));
			p = new EG(t, marquage, debut, fin);
			couleurs.ajouter(t, couleur,
					"EG(" + couleurs.getLabel(left.getFormule()) + ")");
			break;
		case CommandLineParser.OR:
			p = new Or(t);
			left = justifie(t.getChild(0), p);
			right = justifie(t.getChild(1), p);
			p.setMarquage(or(left.getMarquage(), right.getMarquage()));
			couleurs.ajouter(t, couleur,
					"(" + couleurs.getLabel(left.getFormule()) + " || "
							+ couleurs.getLabel(right.getFormule()) + ")");
			break;
		case CommandLineParser.AND:
			p = new And(t);
			left = justifie(t.getChild(0), p);
			right = justifie(t.getChild(1), p);
			p.setMarquage(and(left.getMarquage(), right.getMarquage()));
			couleurs.ajouter(t, couleur,
					"(" + couleurs.getLabel(left.getFormule()) + " &amp;&amp; "
							+ couleurs.getLabel(right.getFormule()) + ")");
			break;
		case CommandLineParser.IMPLY:
			p = new Imply(t);
			left = justifie(t.getChild(0), p);
			right = justifie(t.getChild(1), p);
			p.setMarquage(or(neg(left.getMarquage()), right.getMarquage()));
			couleurs.ajouter(t, couleur,
					"(" + couleurs.getLabel(left.getFormule()) + " -&gt; "
							+ couleurs.getLabel(right.getFormule()) + ")");
			break;
		case CommandLineParser.EQUIV:
			p = new Equivalent(t);
			left = justifie(t.getChild(0), p);
			right = justifie(t.getChild(1), p);
			p.setMarquage(and(or(neg(left.getMarquage()), right.getMarquage()),
					or(neg(right.getMarquage()), left.getMarquage())));
			couleurs.ajouter(t, couleur,
					"(" + couleurs.getLabel(left.getFormule()) + " &lt;-&gt; "
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
		Arrays.fill(res, true);
		for (int i = 0; i < systeme.length; ++i) {
			for (int j = 0; j < systeme[i].length; ++j) {
				res[systeme[i][j]] = false;
			}
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
		for (int i = 0; i < a.length; i++) {
			if (a[i]) {
				for (int j = 0; j < systeme[i].length; ++j) {
					res[systeme[i][j]] = true;
				}
			}
		}
		return res;
	}

	public boolean[] AX(boolean[] a) {
		int[] res = new int[systeme.length];
		for (int i = 0; i < systeme.length; ++i) {
			for (int j = 0; j < systeme[i].length; ++j) {
				res[systeme[i][j]]++;
			}
		}
		for (int i = 0; i < a.length; ++i) {
			if (a[i]) {
				for (int j = 0; j < systeme[i].length; ++j) {
					res[systeme[i][j]]--;
				}
			}
		}
		boolean[] r = new boolean[a.length];
		for (int i = 0; i < res.length; ++i) {
			r[i] = res[i] == 0;
		}
		return r;
	}

	public boolean[] EU(boolean[] a, boolean[] b) {
		boolean[] res = Arrays.copyOf(b, b.length);
		boolean[] todo = Arrays.copyOf(b, b.length);
		boolean continuer = true;
		while (continuer) {
			continuer = false;
			for (int i = 0; !continuer && i < todo.length; ++i) {
				if (todo[i]) {
					continuer = true;
					todo[i] = false;
					for (int j = 0; j < systeme[i].length; ++j) {
						int p = systeme[i][j];
						if (a[p] && !res[p]) {
							todo[p] = true;
							res[p] = true;
						}
					}
				}
			}
		}
		return res;
	}

	public IPreuve justifieEU(IPreuve debut, IPreuve fin, Tree t) {
		boolean[] a = debut.getMarquage();
		boolean[] res = fin.getMarquageCopie();
		boolean[] todo = fin.getMarquageCopie();
		boolean continuer = true;
		while (continuer) {
			continuer = false;
			for (int i = 0; !continuer && i < todo.length; ++i) {
				if (todo[i]) {
					continuer = true;
					todo[i] = false;
					for (int j = 0; j < systeme[i].length; ++j) {
						int p = systeme[i][j];
						if (a[p] && !res[p]) {
							todo[p] = true;
							res[p] = true;
						}
					}
				}
			}
		}
		IPreuve p = new EU(t, res, debut, fin);
		return p;
	}

	public boolean[] AU(boolean[] a, boolean[] b) {
		boolean[] todo = Arrays.copyOf(b, b.length);
		int[] res = new int[systeme.length];
		for (int i = 0; i < systeme.length; ++i) {
			for (int j = 0; j < systeme[i].length; ++j) {
				res[systeme[i][j]]++;
			}
		}
		for (int i = 0; i < b.length; ++i) {
			if (b[i]) {
				res[i] = 0;
			}
		}
		boolean continuer = true;
		while (continuer) {
			continuer = false;
			for (int i = 0; !continuer && i < todo.length; ++i) {
				if (todo[i]) {
					continuer = true;
					todo[i] = false;
					for (int j = 0; j < systeme[i].length; ++j) {
						int p = systeme[i][j];
						if (a[p] && res[p] > 0) {
							res[p]--;
							todo[p] = res[p] == 0;
						}
					}
				}
			}
		}
		boolean[] r = new boolean[res.length];
		for (int i = 0; i < res.length; ++i) {
			if (res[i] == 0) {
				r[i] = true;
			}
		}
		return r;
	}

	public IPreuve justifieAU(IPreuve debut, IPreuve fin, Tree t) {
		boolean[] a = debut.getMarquage();
		boolean[] b = fin.getMarquageCopie();
		boolean[] todo = fin.getMarquageCopie();
		int[] res = new int[systeme.length];
		for (int i = 0; i < systeme.length; ++i) {
			for (int j = 0; j < systeme[i].length; ++j) {
				res[systeme[i][j]]++;
			}
		}
		for (int i = 0; i < b.length; ++i) {
			if (b[i]) {
				res[i] = 0;
			}
		}
		boolean continuer = true;
		while (continuer) {
			continuer = false;
			for (int i = 0; !continuer && i < todo.length; ++i) {
				if (todo[i]) {
					continuer = true;
					todo[i] = false;
					for (int j = 0; j < systeme[i].length; ++j) {
						int p = systeme[i][j];
						if (a[p] && res[p] > 0) {
							res[p]--;
							todo[p] = res[p] == 0;
						}
					}
				}
			}
		}
		boolean[] r = new boolean[res.length];
		for (int i = 0; i < res.length; ++i) {
			if (res[i] == 0) {
				r[i] = true;
			}
		}
		IPreuve p = new AU(t, r, debut, fin);
		return p;
	}

}