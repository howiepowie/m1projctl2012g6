package preuve;

import org.antlr.runtime.tree.Tree;

public class AF extends AU {

	public AF(Tree formule, boolean[] marquage, IPreuve debut, IPreuve fin) {
		super(formule, marquage, debut, fin);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected IChemin genererSousPreuve() {
		return new FakeAF(getFormule(), getEtats().clone(), getDebut().clone(),
				getFin().clone());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IPreuve clone() {
		AF res = new AF(getFormule(), getMarquageCopie(), getDebut().clone(),
				getFin().clone());
		for (IPreuve p : getPreuves()) {
			res.getPreuves().add(p.clone());
		}
		res.setCouleur(getCouleur());
		return res;
	}

}
