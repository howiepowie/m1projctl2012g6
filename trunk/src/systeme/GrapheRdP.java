package systeme;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import rdp.RdP;
import CTL.Preuve;

public class GrapheRdP {
	public RdP rdp;
	public int nbEtat;
	public int nbTransition;
	public ArrayList<boolean[]> etat = new ArrayList<boolean[]>();
	public ArrayList<ArrayList<Integer>> succ = new ArrayList<ArrayList<Integer>>();
	public ArrayList<ArrayList<Integer>> pred = new ArrayList<ArrayList<Integer>>();

	public String toDot() {
		StringBuffer res = new StringBuffer();
		res.append("digraph system {\n");

		res.append("N" + 0 + " [label=\"" + rdp.toStringMarquage(etat.get(0))
				+ "\",shape=octagon]\n");

		for (int e = 1; e < etat.size(); e++) {
			res.append("N" + e + " [label=\""
					+ rdp.toStringMarquage(etat.get(e)) + "\"]\n");
		}

		for (int e = 0; e < etat.size(); e++)
			for (int t = 0; t < succ.get(e).size(); t++)
				res.append("N" + e + " -> N" + succ.get(e).get(t) + "\n");

		res.append("}\n");
		return res.toString();
	}

	public String ctlToDot(boolean[] etats) {
		StringBuffer res = new StringBuffer();
		res.append("digraph system {\n");

		res.append("N" + 0 + " [label=\"" + rdp.toStringMarquage(etat.get(0))
				+ "\",shape=octagon");
		if (etats[0]) {
			res.append(",color=blue");
		}
		res.append("]\n");

		for (int e = 1; e < etat.size(); e++) {
			res.append("N" + e + " [label=\""
					+ rdp.toStringMarquage(etat.get(e)) + "\"");
			if (etats[e]) {
				res.append(",color=blue");
			}
			res.append("]\n");
		}

		for (int e = 0; e < etat.size(); e++)
			for (int t = 0; t < succ.get(e).size(); t++)
				res.append("N" + e + " -> N" + succ.get(e).get(t) + "\n");

		res.append("}\n");
		return res.toString();
	}

	public String justifieToDot(Preuve preuve, int depart) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		preuve.toDot(map);
		StringBuffer res = new StringBuffer();
		res.append("digraph system {\n");

		res.append("N" + 0 + " [label=\"" + rdp.toStringMarquage(etat.get(0)));
		String formule;
		if ((formule = map.get(0)) != null) {
			res.append("\\n" + formule);
		}
		res.append("\",shape=octagon]\n");

		for (int e = 1; e < etat.size(); e++) {
			res.append("N" + e + " [label=\""
					+ rdp.toStringMarquage(etat.get(e)));
			if ((formule = map.get(e)) != null) {
				res.append("\\n" + formule);
			}
			res.append("\"]\n");
		}

		for (int e = 0; e < etat.size(); e++)
			for (int t = 0; t < succ.get(e).size(); t++)
				res.append("N" + e + " -> N" + succ.get(e).get(t) + "\n");

		res.append("}\n");
		return res.toString();
	}
}
