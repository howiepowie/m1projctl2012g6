package preuve;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.runtime.tree.Tree;

import CTL.CTL;

public class NegComplex extends Preuve {

	/**
	 * La preuve de la négation.
	 */
	private IPreuve negation;

	public NegComplex(Tree formule, IPreuve negation) {
		super(formule, null);
		this.negation = negation;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void couperRacine(CTL ctl, int[][] pred, int etat) {
		tousFalseSauf(etat);
		genererSousPreuves(ctl, pred);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void couper(CTL ctl, int[][] pred, boolean[] parents) {
		tousFalseSauf(pred, parents);
		genererSousPreuves(ctl, pred);
	}

	private void genererSousPreuves(CTL ctl, int[][] pred) {
		List<IPreuve> preuves = getPreuves();
		preuves.clear();
		boolean[] m = getMarquage();
		for (int i = 0; i < m.length; ++i) {
			if (m[i]) {
				IPreuve p = negation.clone();
				p.couperRacine(ctl, pred, i);
				preuves.add(p);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void toDotRacine(Map<Integer, Set<Integer>> fleches,
			Set<String> justifications, IPreuve parent, int etat,
			Coloration couleurs) {
		IPreuve p = getPreuves().get(0);
		boolean[] m = getMarquage();
		for (int i = 0; i < m.length; ++i) {
			p.toDotRacine(fleches, justifications, this, i, couleurs);
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
		IPreuve p = getPreuves().get(0);
		boolean[] marquage = getMarquage();
		for (int i = 0; i < marquage.length; ++i) {
			if (marquage[i]) {
				sb.append('N');
				sb.append(etatParent);
				sb.append(" -> N");
				sb.append(i);
				sb.append(" [color=\"");
				sb.append(couleurs.getCouleur(parent.getFormule()));
				sb.append("\",label=<");
				sb.append(toDotLabel(couleurs));
				sb.append(">]\n");
				fleches.get(etatParent).add(i);
				p.toDot(fleches, justifications, this, i, couleurs);
			}
		}
		justifications.add(sb.toString());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IPreuve clone() {
		NegComplex res = new NegComplex(getFormule(), negation.clone());
		res.setMarquage(getMarquageCopie());
		for (IPreuve p : getPreuves()) {
			res.getPreuves().add(p.clone());
		}
		return res;
	}
}
