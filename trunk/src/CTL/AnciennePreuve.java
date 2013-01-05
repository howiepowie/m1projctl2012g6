package CTL;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.tree.Tree;

import principal.CommandLineParser;

public class AnciennePreuve {

	private Tree formule;

	private boolean operateur;

	public boolean[] marquage;

	public List<AnciennePreuve> preuves;

	public AnciennePreuve(Tree formule) {
		this(formule, null);
	}

	public AnciennePreuve(Tree formule, boolean[] marquage) {
		super();
		this.formule = formule;
		this.marquage = marquage;
		preuves = new ArrayList<AnciennePreuve>();
		switch (formule.getType()) {
		case CommandLineParser.AND:
		case CommandLineParser.OR:
		case CommandLineParser.IMPLY:
		case CommandLineParser.EQUIV:
		case CommandLineParser.NEG:
			operateur = true;
			break;
		default:
			operateur = false;
		}
	}

	/**
	 * Le marquage de cette preuve contient tous les états validant la formule à
	 * ce stade. Couper la racine signifie ne garder que l'état donné en
	 * paramètre à vrai et mettre tous les autres à faux. A partir de là on peut
	 * couper les sous-preuves.
	 * 
	 * Les formules du genre &&, ||... sont des cas particuliers car il faut
	 * appeler couperRacine sur les sous-preuves de la formule au lieu de
	 * l'appliquer ici, puis il ne faut garder que les états parmis ceux des
	 * sous-preuves.
	 * 
	 * @param pred
	 * @param etat
	 */
	public void couperRacine(CTL ctl, int[][] pred, int etat) {
		if (operateur) {
			for (AnciennePreuve c : preuves) {
				c.couperRacine(ctl, pred, etat);
			}
			switch (formule.getType()) {
			case CommandLineParser.AND:
				marquage = ctl.and(preuves.get(0).marquage,
						preuves.get(1).marquage);
				break;
			case CommandLineParser.OR:
				marquage = ctl.or(preuves.get(0).marquage,
						preuves.get(1).marquage);
				break;
			case CommandLineParser.IMPLY:
			case CommandLineParser.EQUIV:
				break;
			}
		} else {
			for (int i = 0; i < marquage.length; ++i) {
				if (marquage[i] && i != etat) {
					marquage[i] = false;
				}
			}
			for (AnciennePreuve c : preuves) {
				c.couper(ctl, pred, marquage);
			}
		}
	}

	/**
	 * Le marquage de cette preuve contient tous les états validant la formule à
	 * ce stade. Couper la preuve signifie ne garder à vrai que les états pour
	 * lesquels au moins un prédécesseur est à vrai dans le marquage de la
	 * preuve parent.
	 * 
	 * Sachant que la racine de la preuve a été coupée pour ne garder que l'état
	 * souhaité à vrai, les sous-preuves ne garderont que les états ayant cet
	 * état comme prédécesseur et ainsi de suite pour les sous-preuves des
	 * sous-preuves.
	 * 
	 * Les formules du genre &&, ||... sont des cas particuliers car il faut
	 * appeler couper sur les sous-preuves de la formule au lieu de l'appliquer
	 * ici, puis il ne faut garder que les états parmis ceux des sous-preuves.
	 * 
	 * @param pred
	 * @param parents
	 */
	public void couper(CTL ctl, int[][] pred, boolean[] parents) {
		if (operateur) {
			for (AnciennePreuve c : preuves) {
				c.couper(ctl, pred, parents);
			}
			switch (formule.getType()) {
			case CommandLineParser.AND:
				marquage = ctl.and(preuves.get(0).marquage,
						preuves.get(1).marquage);
				break;
			case CommandLineParser.OR:
				marquage = ctl.or(preuves.get(0).marquage,
						preuves.get(1).marquage);
				break;
			case CommandLineParser.IMPLY:
			case CommandLineParser.EQUIV:
				break;
			}
		} else {
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
			for (AnciennePreuve c : preuves) {
				c.couper(ctl, pred, marquage);
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
		for (AnciennePreuve c : preuves) {
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
		for (AnciennePreuve c : preuves) {
			c.toDot(map);
		}
	}

}
