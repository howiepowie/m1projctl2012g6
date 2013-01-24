package preuve;

import org.antlr.runtime.tree.Tree;

public class FakeEG extends FakeEU {

	public FakeEG(Tree formule, boolean[] marquage) {
		super(formule, marquage);
	}

	public FakeEG(Tree formule, boolean[] marquage, IPreuve debut, IPreuve fin) {
		super(formule, marquage, debut, fin);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IPreuve clone() {
		FakeEG res = new FakeEG(getFormule(), getMarquageCopie(), getDebut()
				.clone(), getFin().clone());
		for (IPreuve p : getPreuves()) {
			res.getPreuves().add(p.clone());
		}
		return res;
	}

}
