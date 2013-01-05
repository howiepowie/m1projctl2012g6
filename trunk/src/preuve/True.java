package preuve;

import org.antlr.runtime.tree.Tree;

import CTL.CTL;

public class True extends Preuve {

	public True(Tree formule, boolean[] marquage) {
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
		return "true";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toTree(String indent) {
		return indent + "true\n";
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
		return new True(getFormule(), getMarquageCopie());
	}

}
