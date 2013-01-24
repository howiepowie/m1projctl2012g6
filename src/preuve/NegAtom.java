package preuve;

import java.util.Map;
import java.util.Set;

import org.antlr.runtime.tree.Tree;

import CTL.CTL;

public class NegAtom extends Preuve {

	public NegAtom(Tree formule) {
		super(formule, null);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void couperRacine(CTL ctl, int[][] pred, int etat) {
		tousFalseSauf(etat);
		getPreuves().get(0).couper(ctl, pred, ctl.vrai());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void couper(CTL ctl, int[][] pred, boolean[] parents) {
		tousFalseSauf(pred, parents);
		getPreuves().get(0).couper(ctl, pred, ctl.vrai());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void toDotRacine(Map<Integer, Set<Integer>> fleches,
			Set<String> justifications, IPreuve parent, int etat,
			Coloration couleurs) {
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void toDot(Map<Integer, Set<Integer>> fleches,
			Set<String> justifications, IPreuve parent, int etatParent,
			Coloration couleurs) {
		StringBuffer sb = new StringBuffer();
		boolean[] marquage = getMarquage();
		for (int i = 0; i < marquage.length; ++i) {
			if (marquage[i]) {
				sb.append('N');
				sb.append(etatParent);
				sb.append(" -> N");
				sb.append(i);
				sb.append(" [color=\"");
				sb.append(couleurs.getCouleur(parent.getFormule()));
				sb.append("\",label=<");
				sb.append(toDotLabel(couleurs));
				sb.append(">]\n");
				fleches.get(etatParent).add(i);
			}
		}
		justifications.add(sb.toString());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IPreuve clone() {
		NegAtom res = new NegAtom(getFormule());
		res.setMarquage(getMarquageCopie());
		for (IPreuve p : getPreuves()) {
			res.getPreuves().add(p.clone());
		}
		return res;
	}
}
