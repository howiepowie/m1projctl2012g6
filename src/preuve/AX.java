package preuve;

import java.util.List;

import org.antlr.runtime.tree.Tree;

import CTL.CTL;

public class AX extends Preuve {

	public AX(Tree formule) {
		super(formule);
	}

	public AX(Tree formule, boolean[] marquage) {
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
	 * Le marquage de cette preuve correspond aux états pour lesquels tous les
	 * voisins valident une sous-formule. Le but est de prouver que pour chaque
	 * état tous les voisins sont valides. On va donc, pour chaque état du
	 * marquage, recopier la sous-preuve qui, elle, contient tous les états
	 * vérifiant la sous-formule et on va s'en servir pour prouver l'état.
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
				// On l'attache à un AX ne contenant que l'état actuel.
				boolean[] p3m = new boolean[marquage.length];
				p3m[etat] = true;
				IPreuve p3 = new FakeAX(getFormule(), p3m);
				p3.getPreuves().add(p2);
				// On garde tous les états pour la sous-preuve car AX.
				for (int i = 0; i < p2m.length; ++i) {
					if (p2m[i]) {
						p2m[i] = false;
						for (int j = 0; !p2m[i] && j < pred[i].length; ++j) {
							if (pred[i][j] == etat) {
								p2m[i] = true;
							}
						}
					}
				}
				p2.setMarquage(p2m);
				// On appelle couper pour la nouvelle sous-preuve.
				p2.couper(ctl, pred, p3m);
				// On l'ajoute à la liste.
				preuves.add(p3);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return getPreuves().get(0).toString();
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
			sb.append(toString());
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
	public IPreuve clone() {
		AX res = new AX(getFormule());
		res.setMarquage(getMarquageCopie());
		for (IPreuve p : getPreuves()) {
			res.getPreuves().add(p.clone());
		}
		return res;
	}

}
