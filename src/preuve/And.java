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
		tousFalseSauf(etat);
		IPreuve left = getPreuves().get(0);
		IPreuve right = getPreuves().get(1);
		left.couperRacine(ctl, pred, etat);
		right.couperRacine(ctl, pred, etat);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void couper(CTL ctl, int[][] pred, boolean[] parents) {
		tousFalseSauf(pred, parents);
		IPreuve left = getPreuves().get(0);
		IPreuve right = getPreuves().get(1);
		boolean[] m = getMarquage();
		boolean[] m1 = left.getMarquage();
		boolean[] m2 = right.getMarquage();
		for (int i = 0; i < m.length; ++i) {
			if (!m[i]) {
				m1[i] = false;
				m2[i] = false;
			}
		}
		left.setMarquage(m1);
		right.setMarquage(m2);
		left.couper(ctl, pred, parents);
		right.couper(ctl, pred, parents);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void toDot(Map<Integer, Set<Integer>> fleches,
			Set<String> justifications, IPreuve parent, int etatParent,
			Coloration couleurs) {
		StringBuffer sb = new StringBuffer();
		IPreuve left = getPreuves().get(0);
		IPreuve right = getPreuves().get(1);
		boolean[] marquage = getMarquage();
		for (int i = 0; i < marquage.length; ++i) {
			if (marquage[i]) {
				left.toDot(fleches, justifications, this, etatParent, couleurs);
				right.toDot(fleches, justifications, this, etatParent, couleurs);
			}
		}
		justifications.add(sb.toString());
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
