package preuve;

import org.antlr.runtime.tree.Tree;

public class FakeAX extends AX {

	public FakeAX(Tree formule) {
		super(formule);
	}

	public FakeAX(Tree formule, boolean[] marquage) {
		super(formule, marquage);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return "AX(" + getPreuves().get(0).toString() + ")";
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
		FakeAX res = new FakeAX(getFormule());
		res.setMarquage(getMarquageCopie());
		for (IPreuve p : getPreuves()) {
			res.getPreuves().add(p.clone());
		}
		return res;
	}

}
