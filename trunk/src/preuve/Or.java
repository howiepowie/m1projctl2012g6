package preuve;

import java.util.Map;
import java.util.Set;

import org.antlr.runtime.tree.Tree;

import CTL.CTL;

public class Or extends Preuve {

	public Or(Tree formule) {
		super(formule, null);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void couperRacine(CTL ctl, int[][] pred, int etat) {
		IPreuve left = getPreuves().get(0);
		IPreuve right = getPreuves().get(1);
		left.couperRacine(ctl, pred, etat);
		right.couperRacine(ctl, pred, etat);
		setMarquage(ctl.or(left.getMarquage(), right.getMarquage()));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void couper(CTL ctl, int[][] pred, boolean[] parents) {
		IPreuve left = getPreuves().get(0);
		IPreuve right = getPreuves().get(1);
		left.couper(ctl, pred, parents);
		right.couper(ctl, pred, parents);
		setMarquage(ctl.or(left.getMarquage(), right.getMarquage()));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toTree(String indent) {
		StringBuffer sb = new StringBuffer();
		sb.append(indent);
		sb.append(formuleToString());
		sb.append(" = ");
		sb.append(affiche(getMarquage()));
		sb.append('\n');
		IPreuve p = getPreuves().get(0);
		boolean[] m = p.getMarquage();
		for (int i = 0; i < m.length; ++i) {
			if (m[i]) {
				sb.append(p.toTree(indent + "  "));
				return sb.toString();
			}
		}
		sb.append(getPreuves().get(1).toTree(indent + "  "));
		return sb.toString();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void toDot(Map<Integer, Set<Integer>> fleches,
			Set<String> justifications, IPreuve parent, int etatParent) {
		IPreuve left = getPreuves().get(0);
		IPreuve right = getPreuves().get(1);
		boolean[] leftM = left.getMarquage();
		boolean[] rightM = right.getMarquage();
		boolean[] marquage = getMarquage();
		for (int i = 0; i < marquage.length; ++i) {
			if (marquage[i]) {
				if (leftM[i]) {
					left.toDot(fleches, justifications, parent, etatParent);
				} else if (rightM[i]) {
					right.toDot(fleches, justifications, parent, etatParent);
				}
			}
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toDotLabel() {
		return "<FONT COLOR=\"" + getCouleur() + "\">("
				+ getPreuves().get(0).toDotLabel() + " || "
				+ getPreuves().get(1).toDotLabel() + ")</FONT>";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void genererCouleur() {
		Couleur c = getCouleur();
		if (c == null) {
			c = new Couleur();
		}
		c.valeur = "black";
		setCouleur(c);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IPreuve clone() {
		Or res = new Or(getFormule());
		res.setMarquage(getMarquageCopie());
		for (IPreuve p : getPreuves()) {
			res.getPreuves().add(p.clone());
		}
		res.setCouleur(getCouleur());
		return res;
	}
}
