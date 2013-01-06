package preuve;

import org.antlr.runtime.tree.Tree;

public class FakeAF extends FakeAU {

	public FakeAF(Tree formule, boolean[] marquage) {
		super(formule, marquage);
	}

	public FakeAF(Tree formule, boolean[] marquage, IPreuve debut, IPreuve fin) {
		super(formule, marquage, debut, fin);
	}

	protected IChemin genererAU() {
		return new AF(getFormule(), getEtats().clone(), getDebut().clone(),
				getFin().clone());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toDotLabel() {
		if (estFin()) {
			return "<FONT COLOR=\"" + getCouleur() + "\">AF("
					+ getPreuves().get(0).toDotLabel() + ")</FONT>";
		} else if (aVoisinFin()) {
			return "<FONT COLOR=\"" + getCouleur() + "\">AF("
					+ getPreuves().get(1).toDotLabel() + ")</FONT>";
		} else {
			return getPreuves().get(getPreuves().size() - 1).toDotLabel();
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String conditionToDotLabel() {
		return "";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IPreuve clone() {
		FakeAF res = new FakeAF(getFormule(), getMarquageCopie(), getDebut()
				.clone(), getFin().clone());
		for (IPreuve p : getPreuves()) {
			res.getPreuves().add(p.clone());
		}
		res.setCouleur(getCouleur());
		return res;
	}

}
