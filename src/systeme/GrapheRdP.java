package systeme;

import java.util.ArrayList;

import rdp.RdP;

public class GrapheRdP {
	public RdP rdp;
	public int nbEtat;
	public int nbTransition;
	public ArrayList<boolean[]> etat = new ArrayList<boolean[]>(); 
	public ArrayList<ArrayList<Integer>> succ = new ArrayList<ArrayList<Integer>>();
	
	
	public String toDot() {
		StringBuffer res = new StringBuffer();
		res.append("digraph system {\n");
		
		res.append("N" + 0 + " [label=\""+rdp.toStringMarquage(etat.get(0)) + "\",shape=octagon]\n");
				
		for (int e=1; e<etat.size(); e++) {
			res.append("N" + e + " [label=\""+rdp.toStringMarquage(etat.get(e)) + "\"]\n");
		}
		
		for (int e=0;e<etat.size(); e++)
			for (int t=0; t<succ.get(e).size(); t++)
			    res.append("N" + e + " -> N" + succ.get(e).get(t) + "\n"); 
		
		res.append("}\n");
		return res.toString();
	}
}
