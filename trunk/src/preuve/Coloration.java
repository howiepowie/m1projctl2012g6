package preuve;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

import org.antlr.runtime.tree.Tree;

public class Coloration {

	/**
	 * Dernière valeur hue.
	 */
	private float hue = 0;

	/**
	 * Liste de couleurs distinctes.
	 */
	private List<Couleur> COULEURS;

	private Map<Tree, String> couleursFormules;

	private Map<Tree, String> labelsFormules;

	private int lastId;

	public Coloration() {
		couleursFormules = new TreeMap<Tree, String>(new FormuleComparator());
		labelsFormules = new TreeMap<Tree, String>(new FormuleComparator());
		COULEURS = new ArrayList<Couleur>();
		for (hue = 0; hue <= 1; hue += 0.17) {
			Couleur c = new Couleur();
			c.valeur = hue + " 1 0.5";
			COULEURS.add(c);
		}
		lastId = 0;
	}

	public String getCouleur(Tree formule) {
		return couleursFormules.get(formule);
	}

	public String getLabel(Tree formule) {
		return labelsFormules.get(formule);
	}

	public void ajouter(Tree formule, String couleur, String label) {
		couleursFormules.put(formule, couleur);
		labelsFormules.put(formule, "<FONT COLOR=\"" + couleur + "\">" + label
				+ "</FONT>");
	}

	public FakeTree ajouter(String label) {
		FakeTree t = new FakeTree(lastId);
		++lastId;
		ajouter(t, genererCouleur(), label);
		return t;
	}

	public String genererCouleur() {
		if (COULEURS.size() > 0) {
			return COULEURS.remove(0).valeur;
		} else {
			String valeur = hue + " 1 0.75";
			hue += 0.17;
			if (hue > 1)
				hue -= 1;
			return valeur;
		}
	}

	public void afficher() {
		for (Entry<Tree, String> e : labelsFormules.entrySet()) {
			System.out.println(e.getKey().toStringTree() + ": " + e.getValue());
		}
	}

	private static class FormuleComparator implements Comparator<Tree> {

		@Override
		public int compare(Tree t1, Tree t2) {
			if (t1 == t2)
				return 0;
			if (t1 instanceof FakeTree) {
				if (t2 instanceof FakeTree) {
					return ((FakeTree) t1).id - ((FakeTree) t2).id;
				} else {
					return 1;
				}
			} else if (t2 instanceof FakeTree) {
				return -1;
			}
			// Comparaison des types.
			int i = t1.getType() - t2.getType();
			if (i != 0)
				return i;
			// Du contenu.
			i = t1.toStringTree().compareTo(t2.toStringTree());
			if (i != 0)
				return i;
			// De la position dans le texte.
			i = t1.getCharPositionInLine() - t2.getCharPositionInLine();
			return i;
		}

	}

	private static class FakeTree implements Tree {

		int id;

		public FakeTree(int id) {
			this.id = id;
		}

		@Override
		public void addChild(Tree arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public Object deleteChild(int arg0) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Tree dupNode() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void freshenParentAndChildIndexes() {
			// TODO Auto-generated method stub

		}

		@Override
		public Tree getAncestor(int arg0) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List getAncestors() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int getCharPositionInLine() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public Tree getChild(int arg0) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int getChildCount() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getChildIndex() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getLine() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public Tree getParent() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getText() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int getTokenStartIndex() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getTokenStopIndex() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getType() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public boolean hasAncestor(int arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isNil() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void replaceChildren(int arg0, int arg1, Object arg2) {
			// TODO Auto-generated method stub

		}

		@Override
		public void setChild(int arg0, Tree arg1) {
			// TODO Auto-generated method stub

		}

		@Override
		public void setChildIndex(int arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void setParent(Tree arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void setTokenStartIndex(int arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void setTokenStopIndex(int arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public String toStringTree() {
			// TODO Auto-generated method stub
			return null;
		}

	}

}
