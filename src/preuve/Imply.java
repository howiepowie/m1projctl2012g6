package preuve;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.runtime.tree.Tree;

import CTL.CTL;

public class Imply extends Preuve {

	public Imply(Tree formule) {
		super(formule, null);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void couperRacine(CTL ctl, int[][] pred, int etat) {
		try {
			tousFalseSauf(etat);
			List<IPreuve> preuves = getPreuves();
			IPreuve left = preuves.get(0);
			IPreuve right = preuves.get(1);
			left.couperRacine(ctl, pred, etat);
			right.couperRacine(ctl, pred, etat);
			boolean[] faux = ctl.faux();
			if (Arrays.equals(left.getMarquage(), faux)) {
				// La condition de gauche est fausse.
				Tree neg = Preuve.negTree(left.getFormule());
				left = ctl.justifie(neg, null);
				left.couperRacine(ctl, pred, etat);
				preuves.set(0, left);
				if (Arrays.equals(right.getMarquage(), faux)) {
					// La condition de droite est fausse.
					neg = Preuve.negTree(right.getFormule());
					right = ctl.justifie(neg, null);
					right.couperRacine(ctl, pred, etat);
					preuves.set(1, right);
				}
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void couper(CTL ctl, int[][] pred, boolean[] parents) {
		try {
			tousFalseSauf(pred, parents);
			List<IPreuve> preuves = getPreuves();
			IPreuve left = preuves.get(0);
			IPreuve right = preuves.get(1);
			boolean[] m = getMarquage();
			boolean[] m1 = left.getMarquage();
			boolean[] m2 = right.getMarquage();
			for (int i = 0; i < m.length; ++i) {
				if (!m[i]) {
					m1[i] = false;
					m2[i] = false;
				}
			}
			left.setMarquage(m1);
			right.setMarquage(m2);
			boolean[] faux = ctl.faux();
			if (Arrays.equals(left.getMarquage(), faux)) {
				// La condition de gauche est fausse.
				Tree neg = Preuve.negTree(left.getFormule());
				left = ctl.justifie(neg, null);
				m1 = left.getMarquage();
				for (int i = 0; i < m.length; ++i) {
					if (!m[i]) {
						m1[i] = false;
					}
				}
				left.setMarquage(m1);
				preuves.set(0, left);
				if (Arrays.equals(right.getMarquage(), faux)) {
					// La condition de droite est fausse.
					neg = Preuve.negTree(right.getFormule());
					right = ctl.justifie(neg, null);
					m2 = left.getMarquage();
					for (int i = 0; i < m.length; ++i) {
						if (!m[i]) {
							m2[i] = false;
						}
					}
					right.setMarquage(m2);
					preuves.set(1, right);
				}
			}
			left.couper(ctl, pred, parents);
			right.couper(ctl, pred, parents);
		} catch (Exception e) {
			throw new RuntimeException(e);
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
		IPreuve left = getPreuves().get(0);
		IPreuve right = getPreuves().get(1);
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
				left.toDot(fleches, justifications, this, i, couleurs);
				right.toDot(fleches, justifications, this, i, couleurs);
			}
		}
		justifications.add(sb.toString());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IPreuve clone() {
		Imply res = new Imply(getFormule());
		res.setMarquage(getMarquageCopie());
		for (IPreuve p : getPreuves()) {
			res.getPreuves().add(p.clone());
		}
		return res;
	}
}
