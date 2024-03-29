package preuve;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.runtime.tree.Tree;

import CTL.CTL;

public class EX extends Preuve {

	public EX(Tree formule) {
		super(formule);
	}

	public EX(Tree formule, boolean[] marquage) {
		super(formule, marquage);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void couperRacine(CTL ctl, int[][] pred, int etat) {
		tousFalseSauf(etat);
		genererSousPreuves(ctl, pred);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void couper(CTL ctl, int[][] pred, boolean[] parents) {
		tousFalseSauf(pred, parents);
		genererSousPreuves(ctl, pred);
	}

	/**
	 * Le marquage de cette preuve correspond aux états qui ont au moins un
	 * voisin validant une certaine sous-formule. Le but est de prouver que pour
	 * chaque état ce voisin existe. On va donc, pour chaque état du marquage,
	 * recopier la sous-preuve qui, elle, contient tous les états vérifiant la
	 * sous-formule et on va s'en servir pour prouver l'état.
	 */
	private void genererSousPreuves(CTL ctl, int[][] pred) {
		// On récupère la sous-preuve et on vide la liste.
		List<IPreuve> preuves = getPreuves();
		IPreuve p = preuves.get(0);
		preuves.clear();
		// Pour chaque état validant la formule.
		boolean[] marquage = getMarquage();
		for (int etat = 0; etat < marquage.length; ++etat) {
			if (marquage[etat]) {
				// On clone la preuve de départ.
				IPreuve p2 = p.clone();
				boolean[] p2m = p2.getMarquage();
				// On l'attache à un EX ne contenant que l'état actuel.
				boolean[] p3m = new boolean[marquage.length];
				p3m[etat] = true;
				IPreuve p3 = new FakeEX(getFormule(), p3m);
				p3.getPreuves().add(p2);
				// On ne garde qu'un seul état pour la sous-preuve car EX.
				boolean b = false;
				for (int i = 0; !b && i < p2m.length; ++i) {
					if (p2m[i]) {
						for (int j = 0; !b && j < pred[i].length; ++j) {
							if (pred[i][j] == etat) {
								p2.couperRacine(ctl, pred, i);
								b = true;
							}
						}
					}
				}
				// On l'ajoute à la liste.
				preuves.add(p3);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toTree(String indent) {
		List<IPreuve> preuves = getPreuves();
		if (preuves.size() > 1) {
			StringBuffer sb = new StringBuffer();
			sb.append(indent);
			sb.append(formuleToString());
			sb.append(" = ");
			sb.append(affiche(getMarquage()));
			sb.append(" {\n");
			for (IPreuve c : preuves) {
				if (c != null) {
					sb.append(c.toTree(indent + "  "));
				}
			}
			sb.append(indent);
			sb.append("}\n");
			return sb.toString();
		} else {
			return preuves.get(0).toTree(indent);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void toDotRacine(Map<Integer, Set<Integer>> fleches,
			Set<String> justifications, IPreuve parent, int etat,
			Coloration couleurs) {
		for (IPreuve p : getPreuves()) {
			p.toDotRacine(fleches, justifications, null, etat, couleurs);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void toDot(Map<Integer, Set<Integer>> fleches,
			Set<String> justifications, IPreuve parent, int etatParent,
			Coloration couleurs) {
		for (IPreuve p : getPreuves()) {
			p.toDot(fleches, justifications, parent, etatParent, couleurs);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IPreuve clone() {
		EX res = new EX(getFormule());
		res.setMarquage(getMarquageCopie());
		for (IPreuve p : getPreuves()) {
			res.getPreuves().add(p.clone());
		}
		return res;
	}

}
