package rdp;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

import CTL.CTLLexer;
import CTL.CTLParser;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

public class RdP {
	final public String[] place;
	final public boolean[] marquage;
	final public String[] transition;
	final public int[][] pre;
	final public int[][] post;
	final public HashMap<String, Integer> tablePlace;
	final public HashMap<String, Integer> tableTransition;

	private static int[] toIntArray(ArrayList<Integer> a) {
		int[] res = new int[a.size()];
		for (int i = 0; i < a.size(); i++)
			res[i] = a.get(i);
		return res;
	}

	private static boolean[] toBoolArray(ArrayList<Integer> a) {
		boolean[] res = new boolean[a.size()];
		for (int i = 0; i < a.size(); i++)
			res[i] = a.get(i).equals(new Integer(1));
		return res;
	}

	public RdP(String fichier) throws Exception {
		CharStream input = new ANTLRFileStream(fichier);
		RdPLexer lexer = new RdPLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		RdPParser parser = new RdPParser(tokens);
		parser.start();

		if (!parser.ok) {
			throw new Exception();
		}

		place = parser.place.toArray(new String[0]);
		marquage = toBoolArray(parser.marquage);
		transition = parser.transition.toArray(new String[0]);
		
		pre = new int[transition.length][];
		for (int i = 0; i < transition.length; i++) {
			pre[i] = toIntArray(parser.pre.get(i));
			Arrays.sort(pre[i]);
		}

		post = new int[transition.length][];
		for (int i = 0; i < transition.length; i++) {
			post[i] = toIntArray(parser.post.get(i));
			Arrays.sort(post[i]);
		}
		tablePlace = parser.tablePlace;
		tableTransition = parser.tableTransition;

	}

	public String ctl(String s) throws Exception {
		CharStream input = new ANTLRStringStream(s);
		CTLLexer lexer = new CTLLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		CTLParser parser = new CTLParser(tokens, this);
		parser.start();

		if (parser.ok)
			return parser.res;
		else
			return null;
	}

	public String toStringMarquage(boolean[] m) {
		StringBuffer res = new StringBuffer();
		for (int i = 0; i < m.length; i++) {
			if (m[i]) {
				if (res.length() != 0)
					res.append("+");
				res.append(place[i]);
			}
		}

		if (res.length() == 0)
			res.append("0");
		return res.toString();
	}

	public String toString() {
		StringBuilder res = new StringBuilder();

		for (int p = 0; p < place.length; p++) {
			res.append("#place " + place[p]);
			if (marquage[p])
				res.append(" mk(<..>)");
			res.append("\n");
		}

		res.append("\n");

		for (int t = 0; t < transition.length; t++) {
			res.append("#trans " + transition[t] + "\n");
			res.append("in {");
			for (int i = 0; i < pre[t].length; i++)
				res.append(place[pre[t][i]] + ":<..>;");
			res.append("}\n");

			res.append("out {");
			for (int i = 0; i < post[t].length; i++)
				res.append(place[post[t][i]] + ":<..>;");
			res.append("}\n");

			res.append("#endtr\n\n");
		}
		return res.toString();
	}
}
