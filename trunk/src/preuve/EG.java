package preuve;

import org.antlr.runtime.tree.Tree;

public class EG extends EU {

	public EG(Tree formule, boolean[] marquage, IPreuve debut, IPreuve fin) {
		super(formule, marquage, debut, fin);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected IChemin genererSousPreuve() {
		return new FakeEG(getFormule(), getEtats().clone(), getDebut().clone(),
				getFin().clone());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IPreuve clone() {
		EG res = new EG(getFormule(), getMarquageCopie(), getDebut().clone(),
				getFin().clone());
		for (IPreuve p : getPreuves()) {
			res.getPreuves().add(p.clone());
		}
		return res;
	}

}
