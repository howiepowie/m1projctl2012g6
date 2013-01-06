package preuve;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.runtime.tree.Tree;

import CTL.CTL;

public class EG extends Preuve {

	private IChemin chemin;

	public EG(Tree formule, boolean[] marquage, IPreuve debut, IPreuve fin) {
		super(formule, null);
		chemin = new EU(formule, marquage, debut, fin);
		System.out.println(affiche(marquage));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void couperRacine(CTL ctl, int[][] pred, int etat) {
		chemin.couperRacine(ctl, pred, etat);
	}

	/**
	 * On appelle couper sur le début du chemin.
	 */
	@Override
	public void couper(CTL ctl, int[][] pred, boolean[] parents) {
		chemin.couper(ctl, pred, parents);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toTree(String indent) {
		List<IPreuve> preuves = chemin.getPreuves().get(0).getPreuves();
		StringBuffer sb = new StringBuffer();
		sb.append(indent);
		sb.append(formuleToString());
		sb.append(" = ");
		sb.append(affiche(chemin.getMarquage()));
		sb.append(" {\n");
		for (IPreuve c : preuves) {
			if (c != null) {
				sb.append(c.toTree(indent + "  "));
			}
		}
		sb.append(indent);
		sb.append("}\n");
		return sb.toString();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void toDotRacine(Map<Integer, Set<Integer>> fleches,
			Set<String> justifications, IPreuve parent, int etat) {
		chemin.toDotRacine(fleches, justifications, parent, etat);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void toDot(Map<Integer, Set<Integer>> fleches,
			Set<String> justifications, IPreuve parent, int etatParent) {
		chemin.toDot(fleches, justifications, parent, etatParent);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toDotLabel() {
		List<IPreuve> preuves = chemin.getPreuves().get(0).getPreuves();
		int size = preuves.size() - 1;
		if (size == 0) {
			return "<FONT COLOR=\"" + getCouleur() + "\">EG("
					+ preuves.get(0).toDotLabel() + ")</FONT>";
		} else {
			return "<FONT COLOR=\"" + getCouleur() + "\">EG("
					+ preuves.get(size).toDotLabel() + ")</FONT>";
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IPreuve clone() {
		EG res = new EG(getFormule(), chemin.getMarquage().clone(), chemin
				.getDebut().clone(), chemin.getFin().clone());
		for (IPreuve p : getPreuves()) {
			res.getPreuves().add(p.clone());
		}
		res.setCouleur(getCouleur());
		return res;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void genererCouleur() {
		super.genererCouleur();
		chemin.setCouleur(getCouleur());
	}

}
