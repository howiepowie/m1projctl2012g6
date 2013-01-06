package preuve;

import org.antlr.runtime.tree.Tree;

public class FakeAG extends FakeAU {

	public FakeAG(Tree formule, boolean[] marquage) {
		super(formule, marquage);
	}

	public FakeAG(Tree formule, boolean[] marquage, IPreuve debut, IPreuve fin) {
		super(formule, marquage, debut, fin);
	}

	protected IChemin genererAU() {
		return new AG(getFormule(), getEtats().clone(), getDebut().clone(),
				getFin().clone());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IPreuve clone() {
		FakeAG res = new FakeAG(getFormule(), getMarquageCopie(), getDebut()
				.clone(), getFin().clone());
		for (IPreuve p : getPreuves()) {
			res.getPreuves().add(p.clone());
		}
		return res;
	}

}
