package systeme;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import preuve.IPreuve;
import rdp.RdP;

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

	public String justifieToDot(IPreuve preuve, int depart) {
		Map<Integer, Set<Integer>> fleches = new HashMap<Integer, Set<Integer>>();
		for (int i = 0; i < nbEtat; ++i) {
			fleches.put(i, new HashSet<Integer>());
		}
		Set<String> justifications = new HashSet<String>();
		preuve.toDotRacine(fleches, justifications, null, depart);
		StringBuffer res = new StringBuffer();
		res.append("digraph system {\n");

		res.append("N" + 0 + " [label=<" + rdp.toStringMarquage(etat.get(0)));
		if (depart == 0) {
			res.append("<BR/>");
			res.append(preuve.toDotLabel());
		} else {
			res.append(rdp.toStringMarquage(etat.get(0)));
		}
		res.append(">,shape=octagon]\n");

		for (int e = 1; e < etat.size(); e++) {
			res.append("N" + e + " [label=<"
					+ rdp.toStringMarquage(etat.get(e)));
			if (depart == e) {
				res.append("<BR/>");
				res.append(preuve.toDotLabel());
			}
			res.append(">]\n");
		}

		for (int e = 0; e < etat.size(); e++) {
			for (int t = 0; t < succ.get(e).size(); t++) {
				int f = succ.get(e).get(t);
				if (!fleches.get(e).contains(f)) {
					res.append("N" + e + " -> N" + f + "\n");
				}
			}
		}
		for (String s : justifications) {
			res.append(s);
		}

		res.append("}\n");
		return res.toString();
	}
}
