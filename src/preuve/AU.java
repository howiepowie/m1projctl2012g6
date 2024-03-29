package preuve;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.runtime.tree.Tree;

import CTL.CTL;

public class AU extends CheminBase {

	public AU(Tree formule, boolean[] marquage) {
		super(formule, marquage);
	}

	public AU(Tree formule, boolean[] marquage, IPreuve debut, IPreuve fin) {
		super(formule, marquage, debut, fin);
	}

	/**
	 * Le marquage contient tous les états ayant un chemin validant la formule
	 * de départ jusqu'à ce que la formule de fin soit validée. Avec AU, il faut
	 * prouver que pour chacun de ces états, tous les chemins valident la
	 * formule.
	 */
	@Override
	public void couperRacine(CTL ctl, int[][] pred, int etat) {
		tousFalseSauf(etat);
		genererSousPreuves(ctl, pred);
	}

	/**
	 * On appelle couper sur le début du chemin.
	 */
	@Override
	public void couper(CTL ctl, int[][] pred, boolean[] parents) {
		tousFalseSauf(pred, parents);
		genererSousPreuves(ctl, pred);
	}

	/**
	 * Génère une copie de cette preuve pour chaque état du marquage afin de
	 * prouver qu'ils ont tous tous les chemins valides.
	 */
	private void genererSousPreuves(CTL ctl, int[][] pred) {
		List<IPreuve> preuves = getPreuves();
		preuves.clear();
		boolean[] m = getMarquage();
		// Pour chaque état du marquage.
		for (int i = 0; i < m.length; ++i) {
			if (m[i]) {
				// On crée la sous-preuve avec l'état i à true uniquement.
				boolean[] pM = new boolean[m.length];
				pM[i] = true;
				IPreuve p = genererSousPreuve();
				p.setMarquage(pM);
				// On appelle couper.
				p.couper(ctl, pred, pM);
				// On l'ajoute.
				preuves.add(p);
			}
		}
	}

	protected IChemin genererSousPreuve() {
		return new FakeAU(getFormule(), getEtats().clone(), getDebut().clone(),
				getFin().clone());
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
		AU res = new AU(getFormule(), getMarquageCopie(), getDebut().clone(),
				getFin().clone());
		for (IPreuve p : getPreuves()) {
			res.getPreuves().add(p.clone());
		}
		return res;
	}

}
