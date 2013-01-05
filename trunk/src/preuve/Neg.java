package preuve;

import org.antlr.runtime.tree.Tree;

import CTL.CTL;

public class Neg extends Preuve {

	public Neg(Tree formule) {
		super(formule, null);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void couperRacine(CTL ctl, int[][] pred, int etat) {
		tousFalseSauf(etat);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void couper(CTL ctl, int[][] pred, boolean[] parents) {
		tousFalseSauf(pred, parents);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return "!" + getPreuves().get(0).toString();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toDot(int parent) {
		StringBuffer sb = new StringBuffer();
		boolean[] marquage = getMarquage();
		for (int i = 0; i < marquage.length; ++i) {
			if (marquage[i]) {
				sb.append('N');
				sb.append(parent);
				sb.append(" -> N");
				sb.append(i);
				sb.append(" [label=\"");
				sb.append(toString());
				sb.append("\"]");
				sb.append('\n');
			}
		}
		return sb.toString();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IPreuve clone() {
		Neg res = new Neg(getFormule());
		res.setMarquage(getMarquageCopie());
		for (IPreuve p : getPreuves()) {
			res.getPreuves().add(p.clone());
		}
		return res;
	}
}
