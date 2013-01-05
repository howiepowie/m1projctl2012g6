package preuve;

import java.util.Arrays;
import java.util.List;

import org.antlr.runtime.tree.Tree;

import CTL.CTL;

public class EU extends CheminBase {

	public EU(Tree formule, boolean[] marquage) {
		super(formule, marquage);
	}

	public EU(Tree formule, boolean[] marquage, IPreuve debut, IPreuve fin) {
		super(formule, marquage, debut, fin);
	}

	public void recreerChemins(CTL ctl) {
		List<boolean[]> c = getChemins();
		c.clear();
		boolean[] avant = getDebut().getMarquage();
		boolean[] res = getEtats();
		boolean[] faux = ctl.faux();
	}

	public String toString() {
		return "E(" + getDebut().toString() + " U " + getFin().toString() + ")";
	}

}
