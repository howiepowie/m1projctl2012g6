package preuve;

import java.util.Map;
import java.util.Set;

import org.antlr.runtime.tree.Tree;

import CTL.CTL;

public class And extends Preuve {

	public And(Tree formule) {
		super(formule, null);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void couperRacine(CTL ctl, int[][] pred, int etat) {
		IPreuve left = getPreuves().get(0);
		IPreuve right = getPreuves().get(1);
		left.couperRacine(ctl, pred, etat);
		right.couperRacine(ctl, pred, etat);
		setMarquage(ctl.and(left.getMarquage(), right.getMarquage()));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void couper(CTL ctl, int[][] pred, boolean[] parents) {
		IPreuve left = getPreuves().get(0);
		IPreuve right = getPreuves().get(1);
		left.couper(ctl, pred, parents);
		right.couper(ctl, pred, parents);
		setMarquage(ctl.and(left.getMarquage(), right.getMarquage()));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void toDot(Map<Integer, Set<Integer>> fleches,
			Set<String> justifications, IPreuve parent, int etatParent,
			Coloration couleurs) {
		IPreuve left = getPreuves().get(0);
		IPreuve right = getPreuves().get(1);
		boolean[] marquage = getMarquage();
		for (int i = 0; i < marquage.length; ++i) {
			if (marquage[i]) {
				left.toDot(fleches, justifications, parent, etatParent,
						couleurs);
				right.toDot(fleches, justifications, parent, etatParent,
						couleurs);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IPreuve clone() {
		And res = new And(getFormule());
		res.setMarquage(getMarquageCopie());
		for (IPreuve p : getPreuves()) {
			res.getPreuves().add(p.clone());
		}
		return res;
	}
}
