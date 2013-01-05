package preuve;

import org.antlr.runtime.tree.Tree;

import CTL.CTL;

public class AU extends CheminBase {

	public AU(Tree formule, boolean[] marquage) {
		super(formule, marquage);
	}

	public AU(Tree formule, boolean[] marquage, IPreuve debut, IPreuve fin) {
		super(formule, marquage, debut, fin);
	}
	
	public void recreerChemins() {
		
	}

	public String toString() {
		return "A(" + getDebut().toString() + " U " + getFin().toString() + ")";
	}

	@Override
	public void recreerChemins(CTL ctl) {
		// TODO Auto-generated method stub
		
	}

}
