package preuve;

import java.util.Map;
import java.util.Set;

import org.antlr.runtime.tree.Tree;

import CTL.CTL;

public class False extends Preuve {

	public False(Tree formule, boolean[] marquage) {
		super(formule, marquage);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void couperRacine(CTL ctl, int[][] pred, int etat) {
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void couper(CTL ctl, int[][] pred, boolean[] parents) {
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void toDot(Map<Integer, Set<Integer>> fleches,
			Set<String> justifications, IPreuve parent, int etat) {
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toDotLabel() {
		return "<FONT COLOR=\"" + getCouleur() + "\">false</FONT>";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IPreuve clone() {
		False res = new False(getFormule(), getMarquageCopie());
		res.setCouleur(getCouleur());
		return res;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String formuleToString() {
		return "false";
	}

}
