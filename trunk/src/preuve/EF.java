package preuve;

import org.antlr.runtime.tree.Tree;

public class EF extends EU {

	public EF(Tree formule, boolean[] marquage, IPreuve debut, IPreuve fin) {
		super(formule, marquage, debut, fin);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected IChemin genererSousPreuve() {
		return new FakeEF(getFormule(), getEtats().clone(), getDebut().clone(),
				getFin().clone());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IPreuve clone() {
		EF res = new EF(getFormule(), getMarquageCopie(), getDebut().clone(),
				getFin().clone());
		for (IPreuve p : getPreuves()) {
			res.getPreuves().add(p.clone());
		}
		return res;
	}

}
