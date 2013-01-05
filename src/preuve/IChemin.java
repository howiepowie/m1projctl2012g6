package preuve;

import java.util.List;

import CTL.CTL;

public interface IChemin extends IPreuve {

	/**
	 * Retourne la preuve pour le début du chemin.
	 * 
	 * @return la preuve pour le début du chemin.
	 */
	IPreuve getDebut();

	/**
	 * Modifie la preuve pour le début du chemin.
	 * 
	 * @param preuve
	 *            la nouvelle preuve.
	 */
	void setDebut(IPreuve preuve);

	/**
	 * Retourne les états par lesquels passent les chemins.
	 * 
	 * @return les états par lesquels passent les chemins.
	 */
	List<boolean[]> getChemins();

	/**
	 * Retourne les etats vérifiant le début du chemin.
	 * 
	 * @return les etats vérifiant le début du chemin.
	 */
	boolean[] getEtats();

	/**
	 * Retourne la preuve pour la fin du chemin.
	 * 
	 * @return la preuve pour la fin du chemin.
	 */
	IPreuve getFin();

	/**
	 * Modifie la preuve pour le fin du chemin.
	 * 
	 * @param preuve
	 *            la nouvelle preuve.
	 */
	void setFin(IPreuve preuve);

	/**
	 * Permet de recreer les chemins à la suite d'une coupure.
	 * 
	 * @param ctl
	 */
	void recreerChemins(CTL ctl);

}
