package preuve;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.runtime.tree.Tree;

import CTL.CTL;

public interface IPreuve {

	/**
	 * Retourne la formule associée à cette preuve.
	 * 
	 * @return la formule associée à cette preuve.
	 */
	public Tree getFormule();

	/**
	 * Retourne le tableau contenant à true les états vérifiant la formule.
	 * 
	 * @return le tableau contenant à true les états vérifiant la formule.
	 */
	public boolean[] getMarquage();

	/**
	 * Modifie la liste des états vérifiant la formule.
	 * 
	 * @param marquage
	 *            la nouvelle liste.
	 */
	public void setMarquage(boolean[] marquage);

	/**
	 * Retourne la liste des sous-preuves.
	 * 
	 * @return la liste des sous-preuves.
	 */
	public List<IPreuve> getPreuves();

	/**
	 * Retourne la couleur associée à cette preuve.
	 * 
	 * @return la couleur associée à cette preuve.
	 */
	public Couleur getCouleur();

	/**
	 * Modifie la couleur associée à cette preuve.
	 * 
	 * @param couleur
	 *            la nouvelle couleur.
	 */
	public void setCouleur(Couleur couleur);

	/**
	 * Met tous les états vérifiant la formule à false sauf celui donné.
	 * 
	 * @param ctl
	 * @param pred
	 * @param etat
	 *            l'état à laisser à true.
	 */
	public void couperRacine(CTL ctl, int[][] pred, int etat);

	/**
	 * Met tous les états vérifiant la formule et n'ayant aucun prédécesseur
	 * dans la liste des parents à false.
	 * 
	 * @param ctl
	 * @param pred
	 * @param parents
	 *            la liste des parents.
	 */
	public void couper(CTL ctl, int[][] pred, boolean[] parents);

	public String toTree();

	public String toTree(String indent);

	public void toDotRacine(Map<Integer, Set<Integer>> fleches,
			Set<String> justifications, IPreuve parent, int etatParent);

	public void toDot(Map<Integer, Set<Integer>> fleches,
			Set<String> justifications, IPreuve parent, int etatParent);

	/**
	 * Créer un label complet pour l'état de départ de la formule. Dans le
	 * label, chaque sous-formule est colorée de manière unique.
	 * 
	 * @return le label.
	 */
	public String toDotLabel();

	/**
	 * Génère une nouvelle couleur pour cette preuve.
	 */
	public void genererCouleur();

	/**
	 * Clone la preuve.
	 * 
	 * @return la copie de la preuve.
	 */
	public IPreuve clone();

	/**
	 * Retourne la formule au format textuel.
	 * 
	 * @return la formule au format textuel
	 */
	public String formuleToString();

}
