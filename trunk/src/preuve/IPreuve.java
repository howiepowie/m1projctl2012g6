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
	 * Retourne une copie du marquage.
	 * 
	 * @return une copie du marquage.
	 */
	public boolean[] getMarquageCopie();

	/**
	 * Modifie la liste des états vérifiant la formule.
	 * 
	 * @param marquage
	 *            la nouvelle liste.
	 */
	public void setMarquage(boolean[] marquage);

	/**
	 * Indique si la preuve est un contre exemple.
	 * 
	 * @return si la preuve est un contre exemple.
	 */
	public boolean isContreExemple();

	/**
	 * Modifie si la preuve est un contre exemple ou non.
	 * 
	 * @param contreExemple
	 *            si la preuve est un contre exemple ou non.
	 */
	public void setContreExemple(boolean contreExemple);

	/**
	 * Retourne la liste des sous-preuves.
	 * 
	 * @return la liste des sous-preuves.
	 */
	public List<IPreuve> getPreuves();

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
			Set<String> justifications, IPreuve parent, int etatParent,
			Coloration couleurs);

	public void toDot(Map<Integer, Set<Integer>> fleches,
			Set<String> justifications, IPreuve parent, int etatParent,
			Coloration couleurs);

	/**
	 * Créer un label complet pour l'état de départ de la formule. Dans le
	 * label, chaque sous-formule est colorée de manière unique.
	 * 
	 * @param couleurs
	 *            TODO
	 * 
	 * @return le label.
	 */
	public String toDotLabel(Coloration couleurs);

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
