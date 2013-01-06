package preuve;

import java.util.Map;
import java.util.Set;

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
	public String toTree(String indent) {
		StringBuffer sb = new StringBuffer();
		sb.append(indent);
		sb.append(formuleToString());
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
	public void toDotRacine(Map<Integer, Set<Integer>> fleches,
			Set<String> justifications, IPreuve parent, int etat,
			Coloration couleurs) {
		for (IPreuve p : getPreuves()) {
			p.toDot(fleches, justifications, this, etat, couleurs);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void toDot(Map<Integer, Set<Integer>> fleches,
			Set<String> justifications, IPreuve parent, int etatParent,
			Coloration couleurs) {
		StringBuffer sb = new StringBuffer();
		boolean[] marquage = getMarquage();
		for (int etat = 0; etat < marquage.length; ++etat) {
			if (marquage[etat]) {
				sb.append('N');
				sb.append(etatParent);
				sb.append(" -> ");
				sb.append('N');
				sb.append(etat);
				sb.append(" [color=\"");
				sb.append(couleurs.getCouleur(parent.getFormule()));
				sb.append("\",label=<");
				sb.append(toDotLabel(couleurs));
				sb.append(">]\n");
				fleches.get(etatParent).add(etat);
				for (IPreuve p : getPreuves()) {
					p.toDot(fleches, justifications, this, etat, couleurs);
				}
				justifications.add(sb.toString());
				return;
			}
		}
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
