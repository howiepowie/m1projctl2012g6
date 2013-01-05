package preuve;

import org.antlr.runtime.tree.Tree;

import CTL.CTL;

public class False extends Preuve {

	public False(Tree formule, boolean[] marquage) {
		super(formule, marquage);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void couperRacine(CTL ctl, int[][] pred, int etat) {
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void couper(CTL ctl, int[][] pred, boolean[] parents) {
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return "false";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toTree(String indent) {
		return indent + "false\n";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toDot(int etat) {
		return "";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IPreuve clone() {
		return new False(getFormule(), getMarquageCopie());
	}

}
