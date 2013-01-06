package principal;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.antlr.runtime.tree.Tree;

import preuve.Coloration;
import preuve.IPreuve;
import preuve.Preuve;
import rdp.RdP;
import systeme.AlgoGrapheRdP;
import systeme.GrapheRdP;
import CTL.CTL;

public class Main implements ICallback {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	/**
	 * Si on est en mode shell.
	 */
	private boolean shell;

	/**
	 * Condition pour arrêter le terminal.
	 */
	private boolean stop;

	/**
	 * Dernière commande.
	 */
	private String commande;

	/**
	 * Le dernier réseau de pétri chargé.
	 */
	private RdP rdp;

	/**
	 * Le graphe des états accessibles.
	 */
	private GrapheRdP grapheRdP;

	/**
	 * Lance le terminal.
	 */
	private void run() {
		shell = false;
		stop = false;
		Scanner sc = new Scanner(System.in);
		CommandLineParser parser = new CommandLineParser(this);
		while (!stop) {
			System.out.print("> ");
			commande = sc.nextLine();
			if (shell) {
				System.out.println(commande.trim());
			}
			try {
				parser.process(commande);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		sc.close();
	}

	/**
	 * Retourne le dernier réseau de pétri chargé.
	 */
	public RdP getRdP() {
		return rdp;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void shell() {
		if (!shell) {
			System.out.println(commande.trim());
		}
		shell = true;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void load(String filename) {
		try {
			RdP rdp = new RdP(filename);
			this.rdp = rdp;
			System.out.println("Charge: " + rdp.place.length + " place(s) et "
					+ rdp.transition.length + " transition(s).");
		} catch (Exception e) {
			System.out.println("Erreur de lecture du graphe.");
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void graphe() {
		if (rdp == null) {
			System.out.println("Aucun reseau de petri charge.");
		} else {
			try {
				grapheRdP = new AlgoGrapheRdP(rdp).grapherdp();
				System.out.println(grapheRdP.nbEtat + " etat(s) et "
						+ grapheRdP.nbTransition + " transition(s).");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void look(int etat) {
		if (grapheRdP == null) {
			System.out.println("Aucun graphe d'etat charge.");
		} else if (etat >= grapheRdP.nbEtat) {
			System.out.println("Etat inexistant.");
		} else {
			boolean[] m = grapheRdP.etat.get(etat);
			System.out.println(Arrays.toString(m));
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void succ(int etat) {
		if (grapheRdP == null) {
			System.out.println("Aucun graphe d'etat charge.");
		} else if (etat >= grapheRdP.nbEtat) {
			System.out.println("Etat inexistant.");
		} else {
			ArrayList<Integer> succ = grapheRdP.succ.get(etat);
			System.out.println(Arrays.toString(succ.toArray()));
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void toDot(String filename) {
		if (rdp == null) {
			System.out.println("Aucun graphe d'etat charge.");
		} else {
			try {
				File f = new File(filename);
				BufferedOutputStream bos = new BufferedOutputStream(
						new FileOutputStream(f));
				bos.write(grapheRdP.toDot().getBytes());
				bos.close();
			} catch (Exception e) {
				System.out.println("Erreur d'ecriture.");
			}
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void ctl(Tree formule) {
		if (grapheRdP == null) {
			System.out.println("Aucun graphe d'etat charge.");
		} else {
			boolean[] res = evaluer(formule);
			int nbEtat = 0;
			for (boolean b : res) {
				if (b) {
					++nbEtat;
				}
			}
			System.out.println(nbEtat + " etat(s).");
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void ctl(Tree formule, int etat) {
		if (grapheRdP == null) {
			System.out.println("Aucun graphe d'etat charge.");
		} else {
			boolean[] res = evaluer(formule);
			if (res[etat]) {
				System.out.println("vrai");
			} else {
				System.out.println("faux");
			}
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void ctlToDot(Tree formule, String filename) {
		if (grapheRdP == null) {
			System.out.println("Aucun graphe d'etat charge.");
		} else {
			try {
				boolean[] res = evaluer(formule);
				File f = new File(filename);
				BufferedOutputStream bos = new BufferedOutputStream(
						new FileOutputStream(f));
				bos.write(grapheRdP.ctlToDot(res).getBytes());
				bos.close();
			} catch (Exception e) {
				System.out.println("Erreur d'ecriture.");
			}
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void justifie(Tree formule, int etat) {
		if (grapheRdP == null) {
			System.out.println("Aucun graphe d'etat charge.");
		} else {
			Coloration couleurs = new Coloration();
			IPreuve p = justifier(formule, etat, couleurs);
			System.out.println(p.toTree());
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void justifieToDot(Tree formule, int etat, String filename) {
		if (grapheRdP == null) {
			System.out.println("Aucun graphe d'etat charge.");
		} else {
			try {
				Coloration couleurs = new Coloration();
				IPreuve p = justifier(formule, etat, couleurs);
				File f = new File(filename);
				BufferedOutputStream bos = new BufferedOutputStream(
						new FileOutputStream(f));
				bos.write(grapheRdP.justifieToDot(p, etat, couleurs).getBytes());
				bos.close();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Erreur d'ecriture.");
			}
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void stop() {
		this.stop = true;
	}

	/**
	 * Evalue la formule.
	 * 
	 * @param formule
	 *            la formule.
	 * @return les états validant la formule.
	 */
	public boolean[] evaluer(Tree formule) {
		int[][] succ = listToInt(grapheRdP.succ);
		/*
		 * AP: en y les places, en x les états pour lesquels la place est à
		 * true.
		 */
		boolean[][] AP = new boolean[rdp.tablePlace.size()][grapheRdP.nbEtat];
		for (int j = 0; j < AP.length; ++j) {
			boolean[] b = AP[j];
			for (int i = 0; i < b.length; ++i) {
				b[i] = grapheRdP.etat.get(i)[j];
			}
		}
		CTL ctl = new CTL(succ, AP);
		return ctl.valeur(rdp, formule);
	}

	/**
	 * Justifie la formule.
	 * 
	 * @param formule
	 *            la formule.
	 * @param etat
	 *            l'état de départ.
	 * @return la justification.
	 */
	public IPreuve justifier(Tree formule, int etat, Coloration couleurs) {
		int[][] succ = listToInt(grapheRdP.succ);
		int[][] pred = listToInt(grapheRdP.pred);
		boolean[][] AP = new boolean[rdp.tablePlace.size()][grapheRdP.nbEtat];
		for (int j = 0; j < AP.length; ++j) {
			boolean[] b = AP[j];
			for (int i = 0; i < b.length; ++i) {
				b[i] = grapheRdP.etat.get(i)[j];
			}
		}
		CTL ctl = new CTL(succ, AP);
		IPreuve p = new Preuve(formule);
		ctl.justifie(rdp, formule, p, couleurs);
		p.getPreuves().get(0).couperRacine(ctl, pred, etat);
		return p.getPreuves().get(0);
	}

	/**
	 * Pour convertir la liste de listes d'entiers en tableau.
	 * 
	 * @param list
	 *            la liste.
	 * @return le tableau.
	 */
	public static int[][] listToInt(ArrayList<ArrayList<Integer>> list) {
		int[][] res = new int[list.size()][];
		for (int j = 0; j < res.length; ++j) {
			List<Integer> l = list.get(j);
			int[] s = new int[l.size()];
			for (int i = 0; i < s.length; ++i) {
				s[i] = l.get(i);
			}
			res[j] = s;
		}
		return res;
	}
}
