package preuve;

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
	public String toString() {
		return "(" + getPreuves().get(0).toString() + ") && ("
				+ getPreuves().get(1).toString() + ")";
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
		And res = new And(getFormule());
		res.setMarquage(getMarquageCopie());
		for (IPreuve p : getPreuves()) {
			res.getPreuves().add(p.clone());
		}
		return res;
	}
}
