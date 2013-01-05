package CTL;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.tree.Tree;

import principal.CommandLineParser;

public class Preuve {

	public Tree formule;

	public boolean[] marquage;

	public List<Preuve> preuves;

	public Preuve(Tree formule) {
		this(formule, null);
	}

	public Preuve(Tree formule, boolean[] marquage) {
		super();
		this.formule = formule;
		this.marquage = marquage;
		preuves = new ArrayList<Preuve>();
	}

	public void couperRacine(int[][] pred, int etat) {
		for (int i = 0; i < marquage.length; ++i) {
			if (marquage[i] && i != etat) {
				marquage[i] = false;
			}
		}
		for (Preuve c : preuves) {
			c.couper(pred, marquage);
		}
	}

	public void couper(int[][] pred, boolean[] parents) {
		for (int i = 0; i < marquage.length; ++i) {
			if (marquage[i]) {
				marquage[i] = false;
				for (int j = 0; !marquage[i] && j < pred[i].length; ++j) {
					if (parents[pred[i][j]]) {
						marquage[i] = true;
					}
				}
			}
		}
		switch (formule.getType()) {
		case CommandLineParser.AND:
		case CommandLineParser.OR:
		case CommandLineParser.IMPLY:
		case CommandLineParser.EQUIV:
			for (Preuve c : preuves) {
				c.couper(pred, parents);
			}
			break;
		default:
			for (Preuve c : preuves) {
				c.couper(pred, marquage);
			}
		}
	}

	public String toString() {
		switch (formule.getType()) {
		case CommandLineParser.ATOM:
			return '$' + formule.getText();
		case CommandLineParser.TRUE:
			return "true";
		case CommandLineParser.FALSE:
			return "false";
		case CommandLineParser.DEAD:
			return "dead";
		case CommandLineParser.INITIAL:
			return "initial";
		case CommandLineParser.NEG:
			return '!' + preuves.get(0).toString();
		case CommandLineParser.AU:
			return "AU(" + preuves.get(0).toString() + ','
					+ preuves.get(1).toString() + ')';
		case CommandLineParser.EU:
			if (preuves.size() == 1) {
				return preuves.get(0).toString();
			} else {
				return "E((" + preuves.get(0).toString() + ") U ("
						+ preuves.get(1).toString() + "))";
			}
		case CommandLineParser.AX:
			return "AX(" + preuves.get(0).toString() + ')';
		case CommandLineParser.EX:
			return "EX(" + preuves.get(0).toString() + ')';
		case CommandLineParser.AF:
			return "AF(" + preuves.get(0).toString() + ')';
		case CommandLineParser.EF:
			return "EF(" + preuves.get(0).toString() + ')';
		case CommandLineParser.AG:
			return "AG(" + preuves.get(0).toString() + ')';
		case CommandLineParser.EG:
			return "EG(" + preuves.get(0).toString() + ')';
		case CommandLineParser.OR:
			return '(' + preuves.get(0).toString() + ") || ("
					+ preuves.get(1).toString() + ')';
		case CommandLineParser.AND:
			return '(' + preuves.get(0).toString() + ") && ("
					+ preuves.get(1).toString() + ')';
		case CommandLineParser.IMPLY:
			return '(' + preuves.get(0).toString() + ") -> ("
					+ preuves.get(1).toString() + ')';
		case CommandLineParser.EQUIV:
			return '(' + preuves.get(0).toString() + ") <-> ("
					+ preuves.get(1).toString() + ')';
		default:
			return null;
		}
	}

	public String toTree() {
		return toTree("");
	}

	public String toTree(String indent) {
		StringBuffer sb = new StringBuffer();
		sb.append(indent);
		sb.append(toString());
		sb.append(" = ");
		sb.append(affiche(marquage));
		sb.append('\n');
		for (Preuve c : preuves) {
			if (c != null) {
				sb.append(c.toTree(indent + "  "));
			}
		}
		return sb.toString();
	}

	private static String affiche(boolean[] b) {
		StringBuffer res = new StringBuffer();
		res.append("{ ");
		for (int i = 0; i < b.length; i++) {
			if (b[i])
				res.append(i + " ");
		}
		res.append("}");
		return res.toString();
	}

	public void toDot(Map<Integer, String> map) {
		String s = toString();
		for (int i = 0; i < marquage.length; ++i) {
			if (marquage[i]) {
				String s2 = map.get(i);
				if (s2 == null) {
					map.put(i, s);
				} else {
					map.put(i, s2 + ", " + s);
				}
			}
		}
		for (Preuve c : preuves) {
			c.toDot(map);
		}
	}

}
