package preuve;

import java.util.Map;
import java.util.Set;

import org.antlr.runtime.tree.Tree;

import CTL.CTL;

public class Dead extends Preuve {

	public Dead(Tree formule, boolean[] marquage) {
		super(formule, marquage);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void couperRacine(CTL ctl, int[][] pred, int etat) {
		tousFalseSauf(etat);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void couper(CTL ctl, int[][] pred, boolean[] parents) {
		tousFalseSauf(pred, parents);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return "dead";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void toDot(Map<Integer, Set<Integer>> fleches,
			Set<String> justifications, IPreuve parent, int etatParent) {
		StringBuffer sb = new StringBuffer();
		boolean[] marquage = getMarquage();
		for (int i = 0; i < marquage.length; ++i) {
			if (marquage[i]) {
				sb.append('N');
				sb.append(etatParent);
				sb.append(" -> N");
				sb.append(i);
				sb.append(" [color=\"");
				sb.append(parent.getCouleur());
				sb.append("\",label=<");
				sb.append(toDotLabel());
				sb.append(">]\n");
				fleches.get(etatParent).add(i);
			}
		}
		justifications.add(sb.toString());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toDotLabel() {
		return "<FONT COLOR=\"" + getCouleur() + "\">dead</FONT>";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IPreuve clone() {
		Dead res = new Dead(getFormule(), getMarquageCopie());
		res.setCouleur(getCouleur());
		return res;
	}
}
