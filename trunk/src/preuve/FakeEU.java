package preuve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.runtime.tree.Tree;

import CTL.CTL;

public class FakeEU extends CheminBase {

	public FakeEU(Tree formule, boolean[] marquage) {
		super(formule, marquage);
	}

	public FakeEU(Tree formule, boolean[] marquage, IPreuve debut, IPreuve fin) {
		super(formule, marquage, debut, fin);
	}

	/**
	 * On appelle couper sur le début du chemin.
	 */
	@Override
	public void couper(CTL ctl, int[][] pred, boolean[] parents) {
		recreerChemins(pred);
		Iterator<IPreuve> it = getPreuves().iterator();
		IPreuve p = it.next();
		boolean[] m = p.getMarquage();
		for (int i = 0; i < m.length; ++i) {
			if (m[i]) {
				p.couperRacine(ctl, pred, i);
				i = m.length;
			}
		}
		while (it.hasNext()) {
			parents = p.getMarquage();
			p = it.next();
			p.couper(ctl, pred, parents);
		}
	}

	/**
	 * Génère le chemin entre l'état de départ et l'arrivée.
	 */
	public void recreerChemins(int[][] pred) {
		List<IPreuve> preuves = getPreuves();
		preuves.clear();
		boolean[] avant = getMarquage();
		boolean[] etats = getEtats();
		boolean[] fin = getFin().getMarquage();
		// Si le départ est déjà l'arrivée.
		for (int i = 0; i < avant.length; ++i) {
			if (avant[i] && fin[i]) {
				// On prouve directement la fin.
				IPreuve p = getFin().clone();
				boolean[] pM = p.getMarquage();
				Arrays.fill(pM, false);
				pM[i] = true;
				p.setMarquage(pM);
				preuves.add(p);
				return;
			}
		}
		// On parcoure le chemin pour trouver les états intermédiaires.
		List<boolean[]> list = new ArrayList<boolean[]>();
		list.add(avant);
		int etatFinal = -1;
		while (etatFinal == -1) {
			boolean[] etape = Arrays.copyOf(etats, etats.length);
			// On enlève les états qui n'ont pas de prédécesseur dans avant.
			for (int i = 0; i < etape.length; ++i) {
				if (etape[i]) {
					etape[i] = false;
					for (int j = 0; !etape[i] && j < pred[i].length; ++j) {
						if (avant[pred[i][j]]) {
							etape[i] = true;
							// Si l'état est dans l'arrivée.
							if (fin[i] && etatFinal == -1) {
								etatFinal = i;
							}
						}
					}
				}
			}
			list.add(etape);
			avant = etape;
		}
		boolean[][] etapes = new boolean[list.size()][];
		list.toArray(etapes);
		int size = etapes.length - 1;
		// Pour la fin du chemin on ne laisse que etatFinal à true.
		IPreuve p = getFin();
		boolean[] pM = p.getMarquage();
		Arrays.fill(pM, false);
		pM[etatFinal] = true;
		p.setMarquage(pM);
		preuves.add(p);
		// On crée les étapes intermédiaires.
		for (int j = size - 1; j >= 0; --j) {
			for (int i = 0; i < etapes[0].length; ++i) {
				if (etapes[j][i]) {
					for (int k = 0; k < pred[etatFinal].length; ++k) {
						if (pred[etatFinal][k] == i) {
							k = pred[etatFinal].length;
							etatFinal = i;
							i = etapes[0].length;
							p = getDebut().clone();
							pM = p.getMarquage();
							Arrays.fill(pM, false);
							pM[etatFinal] = true;
							p.setMarquage(pM);
							preuves.add(0, p);
						}
					}
				}
			}
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toTree(String indent) {
		// Etats vérifiants le chemin.
		StringBuffer sb = new StringBuffer();
		sb.append(indent);
		sb.append(formuleToString());
		sb.append(" = ");
		sb.append(affiche(getMarquage()));
		sb.append(" {\n");
		for (IPreuve p : getPreuves()) {
			sb.append(p.toTree(indent + "  "));
		}
		sb.append(indent);
		sb.append("}\n");
		return sb.toString();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void toDotRacine(Map<Integer, Set<Integer>> fleches,
			Set<String> justifications, IPreuve parent, int etat,
			Coloration couleurs) {
		cheminsToDot(fleches, justifications, etat, couleurs);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void toDot(Map<Integer, Set<Integer>> fleches,
			Set<String> justifications, IPreuve parent, int etatParent,
			Coloration couleurs) {
		StringBuffer sb = new StringBuffer();
		boolean[] marquage = getMarquage();
		for (int etat = 0; etat < marquage.length; ++etat) {
			if (marquage[etat]) {
				sb.append('N');
				sb.append(etatParent);
				sb.append(" -> ");
				sb.append('N');
				sb.append(etat);
				sb.append(" [color=\"");
				sb.append(couleurs.getCouleur(parent.getFormule()));
				sb.append("\",label=<");
				sb.append(toDotLabel(couleurs));
				sb.append(">]\n");
				fleches.get(etatParent).add(etat);
				cheminsToDot(fleches, justifications, etat, couleurs);
				justifications.add(sb.toString());
				return;
			}
		}
	}

	/**
	 * Trace le chemin.
	 * 
	 * @param fleches
	 * @param justifications
	 * @param depart
	 */
	private void cheminsToDot(Map<Integer, Set<Integer>> fleches,
			Set<String> justifications, int depart, Coloration couleurs) {
		int cheminEtat = depart;
		Iterator<IPreuve> it = getPreuves().iterator();
		while (it.hasNext()) {
			IPreuve p = it.next();
			p.toDot(fleches, justifications, this, cheminEtat, couleurs);
			boolean[] m = p.getMarquage();
			for (int i = 0; i < m.length; ++i) {
				if (m[i]) {
					cheminEtat = i;
					i = m.length;
				}
			}
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IPreuve clone() {
		FakeEU res = new FakeEU(getFormule(), getMarquageCopie(), getDebut()
				.clone(), getFin().clone());
		for (IPreuve p : getPreuves()) {
			res.getPreuves().add(p.clone());
		}
		return res;
	}

}
