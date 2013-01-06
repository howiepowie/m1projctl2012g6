package preuve;

import org.antlr.runtime.tree.Tree;

public class True extends Preuve {

	public True(Tree formule, boolean[] marquage) {
		super(formule, marquage);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String formuleToString() {
		return "true";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IPreuve clone() {
		True res = new True(getFormule(), getMarquageCopie());
		return res;
	}

}
