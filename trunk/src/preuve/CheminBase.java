package preuve;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.tree.Tree;

import CTL.CTL;

public abstract class CheminBase extends Preuve implements IChemin {

	/**
	 * La preuve du début du chemin.
	 */
	private IPreuve debut;

	/**
	 * Les états par lesquels passe les chemins.
	 */
	private List<boolean[]> chemins;

	/**
	 * Les etats vérifiant le début du chemin.
	 */
	private boolean[] etats;

	/**
	 * La preuve de la fin du chemin.
	 */
	private IPreuve fin;

	/**
	 * Constructeur d'initialisation.
	 * 
	 * @param formule
	 *            la formule.
	 * @param marquage
	 *            le marquage.
	 */
	public CheminBase(Tree formule, boolean[] marquage) {
		this(formule, marquage, null, null);
	}

	/**
	 * Constructeur d'initialisation.
	 * 
	 * @param formule
	 *            la formule.
	 * @param marquage
	 *            le marquage.
	 * @param debut
	 *            la preuve du début du chemin.
	 * @param fin
	 *            la preuve de la fin du chemin.
	 */
	public CheminBase(Tree formule, boolean[] marquage, IPreuve debut,
			IPreuve fin) {
		super(formule, marquage);
		setDebut(debut);
		chemins = new ArrayList<boolean[]>();
		etats = debut.getMarquage();
		setFin(fin);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean[] getMarquage() {
		return debut.getMarquage();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IPreuve getDebut() {
		return debut;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setDebut(IPreuve preuve) {
		this.debut = preuve;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<boolean[]> getChemins() {
		return chemins;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean[] getEtats() {
		return etats;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IPreuve getFin() {
		return fin;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setFin(IPreuve preuve) {
		this.fin = preuve;
	}

	/**
	 * On appelle couperRacine sur le début du chemin.
	 */
	@Override
	public void couperRacine(CTL ctl, int[][] pred, int etat) {
		debut.couperRacine(ctl, pred, etat);
		recreerChemins(ctl);
	}

	/**
	 * On appelle couper sur le début du chemin.
	 */
	@Override
	public void couper(CTL ctl, int[][] pred, boolean[] parents) {
		debut.couper(ctl, pred, parents);
		recreerChemins(ctl);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toTree(String indent) {
		// Etats vérifiants le chemin.
		StringBuffer sb = new StringBuffer();
		sb.append(indent);
		sb.append(toString());
		sb.append(" = ");
		sb.append(affiche(getMarquage()));
		sb.append('\n');
		// Etats vérifiants le début.
		indent = indent + "  ";
		sb.append(getDebut().toTree(indent));
		// Etats vérifiants la fin.
		sb.append(getFin().toTree(indent));
		return sb.toString();
	}

}
