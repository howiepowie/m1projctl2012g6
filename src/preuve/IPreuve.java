package preuve;

import java.util.List;

import org.antlr.runtime.tree.Tree;

import CTL.CTL;

public interface IPreuve {

	public Tree getFormule();

	public boolean[] getMarquage();

	public void setMarquage(boolean[] marquage);

	public List<IPreuve> getPreuves();

	public void couperRacine(CTL ctl, int[][] pred, int etat);

	public void couper(CTL ctl, int[][] pred, boolean[] parents);

	public String toTree();

	public String toTree(String indent);

	public String toDot(int parent);

	public IPreuve clone();

}
