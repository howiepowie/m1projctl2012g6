package preuve;

import org.antlr.runtime.tree.Tree;

public class FakeEX extends Preuve {

	public FakeEX(Tree formule) {
		super(formule);
	}

	public FakeEX(Tree formule, boolean[] marquage) {
		super(formule, marquage);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return "EX(" + getPreuves().get(0).toString() + ")";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toTree(String indent) {
		StringBuffer sb = new StringBuffer();
		sb.append(indent);
		sb.append(toString());
		sb.append(" = ");
		sb.append(affiche(getMarquage()));
		sb.append('\n');
		for (IPreuve c : getPreuves()) {
			if (c != null) {
				sb.append(c.toTree(indent + "  "));
			}
		}
		return sb.toString();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IPreuve clone() {
		FakeEX res = new FakeEX(getFormule());
		res.setMarquage(getMarquageCopie());
		for (IPreuve p : getPreuves()) {
			res.getPreuves().add(p.clone());
		}
		return res;
	}

}
