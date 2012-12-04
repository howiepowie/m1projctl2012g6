package principal;

import org.antlr.runtime.tree.Tree;

import rdp.RdP;

public interface ICallback {

	public RdP getRdP();

	public void load(String filename);

	public void graphe();

	public void look(int etat);

	public void succ(int etat);

	public void toDot(String filename);

	public void ctl(Tree formule);

	public void ctl(Tree formule, int etat);

	public void ctlToDot(Tree formule, String filename);

	public void justifie(Tree formule, int etat);

	public void justifieToDot(Tree formule, int etat, String filename);

	public void stop();
}
