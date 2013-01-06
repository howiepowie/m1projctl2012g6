package preuve;

import java.util.Map;
import java.util.Set;

import org.antlr.runtime.tree.Tree;

import CTL.CTL;

public class True extends Preuve {

	public True(Tree formule, boolean[] marquage) {
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
	public String toTree(String indent) {
		return indent + "true\n";
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
		return "<FONT COLOR=\"" + getCouleur() + "\">true</FONT>";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IPreuve clone() {
		True res = new True(getFormule(), getMarquageCopie());
		res.setCouleur(getCouleur());
		return res;
	}

}
