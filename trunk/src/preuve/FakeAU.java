package preuve;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.runtime.tree.Tree;

import CTL.CTL;

public class FakeAU extends CheminBase {

	/**
	 * Si cet état est la fin d'un chemin.
	 */
	private boolean estFin;

	public FakeAU(Tree formule, boolean[] marquage) {
		super(formule, marquage);
	}

	public FakeAU(Tree formule, boolean[] marquage, IPreuve debut, IPreuve fin) {
		super(formule, marquage, debut, fin);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void couper(CTL ctl, int[][] pred, boolean[] parents) {
		recreerChemins(ctl, pred);
	}

	/**
	 * Génère les chemins entre l'état de départ et les états d'arrivées. Pour
	 * ce faire, on génère des preuves AU pour chaque voisin de l'état de départ
	 * sauf si le voisin est un état prouvant la fin auquel cas on génère un EU.
	 */
	public void recreerChemins(CTL ctl, int[][] pred) {
		estFin = true;
		List<IPreuve> preuves = getPreuves();
		preuves.clear();
		boolean[] avant = getMarquage();
		boolean[] etats = getEtats();
		boolean[] fin = getFin().getMarquage();
		// L'état qui est valide.
		int etat = 0;
		for (int i = 0; i < avant.length; ++i) {
			if (avant[i]) {
				etat = i;
				i = avant.length;
			}
		}
		// Si l'état de départ est la fin du chemin.
		if (fin[etat]) {
			// On doit uniquement prouver la fin.
			IPreuve p = getFin().clone();
			p.couperRacine(ctl, pred, etat);
			preuves.add(p);
			return;
		} else {
			// Sinon, on doit prouver le départ et les chemins.
			estFin = false;
			IPreuve p = getDebut().clone();
			p.couperRacine(ctl, pred, etat);
			preuves.add(p);
		}
		// On cherche les voisins de l'état de départ.
		for (int i = 0; i < avant.length; ++i) {
			if (avant[i]) {
				for (int j = 0; j < etats.length; ++j) {
					if (etats[j]) {
						for (int k = 0; k < pred[j].length; ++k) {
							// J est un voisin de I.
							if (pred[j][k] == i) {
								boolean[] m = new boolean[avant.length];
								m[j] = true;
								IPreuve p;
								// Si J est un état final.
								if (fin[j]) {
									// On doit prouver la formule de fin pour J.
									p = getFin().clone();
									preuves.add(1, p);
								} else {
									// On doit prouver AU pour J.
									p = genererAU();
									p.setCouleur(getCouleur());
									preuves.add(p);
								}
								p.setMarquage(m);
								p.couperRacine(ctl, pred, j);
							}
						}
					}
				}
				return;
			}
		}
	}

	protected IChemin genererAU() {
		return new AU(getFormule(), getEtats().clone(), getDebut().clone(),
				getFin().clone());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toTree(String indent) {
		// Etats vérifiants le chemin.
		StringBuffer sb = new StringBuffer();
		sb.append(indent);
		sb.append(formuleToString());
		sb.append(" = ");
		sb.append(affiche(getMarquage()));
		sb.append(" {\n");
		for (IPreuve p : getPreuves()) {
			sb.append(p.toTree(indent + "  "));
		}
		sb.append(indent);
		sb.append("}\n");
		return sb.toString();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void toDotRacine(Map<Integer, Set<Integer>> fleches,
			Set<String> justifications, IPreuve parent, int etat) {
		cheminsToDot(fleches, justifications, etat);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void toDot(Map<Integer, Set<Integer>> fleches,
			Set<String> justifications, IPreuve parent, int etatParent) {
		StringBuffer sb = new StringBuffer();
		boolean[] marquage = getMarquage();
		for (int etat = 0; etat < marquage.length; ++etat) {
			if (marquage[etat]) {
				sb.append('N');
				sb.append(etatParent);
				sb.append(" -> ");
				sb.append('N');
				sb.append(etat);
				sb.append(" [color=\"");
				sb.append(parent.getCouleur());
				sb.append("\",label=<");
				sb.append(toDotLabel());
				sb.append(">]\n");
				fleches.get(etatParent).add(etat);
				cheminsToDot(fleches, justifications, etat);
				justifications.add(sb.toString());
				return;
			}
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toDotLabel() {
		return "<FONT COLOR=\"" + getCouleur() + "\">A("
				+ conditionToDotLabel() + ")</FONT>";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String conditionToDotLabel() {
		List<IPreuve> preuves = getPreuves();
		if (estFin) {
			return getDebut().toDotLabel() + " U "
					+ preuves.get(0).toDotLabel();
		} else {
			return preuves.get(0).toDotLabel() + " U "
					+ preuves.get(1).toDotLabel();
		}
	}

	/**
	 * Trace les chemins.
	 * 
	 * @param fleches
	 * @param justifications
	 * @param depart
	 */
	private void cheminsToDot(Map<Integer, Set<Integer>> fleches,
			Set<String> justifications, int depart) {
		// Pour chaque sous-chemin.
		for (IPreuve p : getPreuves()) {
			p.toDot(fleches, justifications, this, depart);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void genererCouleur() {
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IPreuve clone() {
		FakeAU res = new FakeAU(getFormule(), getMarquageCopie(), getDebut()
				.clone(), getFin().clone());
		for (IPreuve p : getPreuves()) {
			res.getPreuves().add(p.clone());
		}
		res.setCouleur(getCouleur());
		return res;
	}

}
