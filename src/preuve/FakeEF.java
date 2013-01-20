package preuve;

import org.antlr.runtime.tree.Tree;

public class FakeEF extends FakeEU {

	public FakeEF(Tree formule, boolean[] marquage) {
		super(formule, marquage);
	}

	public FakeEF(Tree formule, boolean[] marquage, IPreuve debut, IPreuve fin) {
		super(formule, marquage, debut, fin);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IPreuve clone() {
		FakeEF res = new FakeEF(getFormule(), getMarquageCopie(), getDebut()
				.clone(), getFin().clone());
		for (IPreuve p : getPreuves()) {
			res.getPreuves().add(p.clone());
		}
		return res;
	}

}
