package systeme;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

import principal.CommandLineParser;
import CTL.CTL;

public class AlgoCTL {

	private final GrapheRdP grapheRdp;
	private final CTL ctl;

	public AlgoCTL(GrapheRdP grapheRdp) {
		this.grapheRdp = grapheRdp;
		int[][] systeme = new int[grapheRdp.succ.size()][];
		for (int i = 0; i < systeme.length; ++i) {
			ArrayList<Integer> l = grapheRdp.succ.get(i);
			systeme[i] = new int[l.size()];
			for (int j = 0; j < systeme[i].length; ++j) {
				systeme[i][j] = l.get(j);
			}
		}
		boolean[][] AP = new boolean[grapheRdp.etat.size()][];
		grapheRdp.etat.toArray(AP);
		ctl = new CTL(systeme, AP);
	}

	public boolean[] traiter(Tree t) {
		switch (t.getType()) {
		case CommandLineParser.ATOM:
			return ctl.prop(grapheRdp.rdp.tablePlace.get(t.getText()));
		case CommandLineParser.TRUE:
			return ctl.vrai();
		case CommandLineParser.FALSE:
			return ctl.faux();
		case CommandLineParser.NEG:
			boolean[] left = traiter(t.getChild(0));
			return ctl.neg(left);
		case CommandLineParser.AU:
			left = traiter(t.getChild(0));
			boolean[] right = traiter(t.getChild(1));
			return ctl.AU(left, right);
		case CommandLineParser.EU:
			left = traiter(t.getChild(0));
			right = traiter(t.getChild(1));
			return ctl.EU(left, right);
		case CommandLineParser.AX:
			left = traiter(t.getChild(0));
			return ctl.EX(left);
		case CommandLineParser.EX:
			left = traiter(t.getChild(0));
			return ctl.AX(left);
		case CommandLineParser.AF:
			left = traiter(t.getChild(0));
			return ctl.AU(ctl.vrai(), left);
		case CommandLineParser.EF:
			left = traiter(t.getChild(0));
			return ctl.EU(ctl.vrai(), left);
		case CommandLineParser.AG:
			left = traiter(t.getChild(0));
			return ctl.neg(ctl.AU(ctl.vrai(), ctl.neg(left)));
		case CommandLineParser.EG:
			left = traiter(t.getChild(0));
			return ctl.neg(ctl.EU(ctl.vrai(), ctl.neg(left)));
		case CommandLineParser.OR:
			left = traiter(t.getChild(0));
			right = traiter(t.getChild(1));
			return ctl.or(left, right);
		case CommandLineParser.AND:
			left = traiter(t.getChild(0));
			right = traiter(t.getChild(1));
			return ctl.and(left, right);
		case CommandLineParser.IMPLY:
			left = traiter(t.getChild(0));
			right = traiter(t.getChild(1));
			return ctl.or(ctl.neg(left), right);
		case CommandLineParser.EQUIV:
			left = traiter(t.getChild(0));
			right = traiter(t.getChild(1));
			return ctl.and(ctl.or(ctl.neg(left), right),
					ctl.or(ctl.neg(right), left));
		default:
			return null;
		}
	}

}
