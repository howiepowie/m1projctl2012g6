package principal;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.antlr.runtime.tree.Tree;

import CTL.CTL;
import CTL.Preuve;

import rdp.RdP;
import systeme.AlgoGrapheRdP;
import systeme.GrapheRdP;

public class Main implements ICallback {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	/**
	 * Condition pour arrêter le terminal.
	 */
	private boolean stop;

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
		stop = false;
		boolean first = true;
		Scanner sc = new Scanner(System.in);
		CommandLineParser parser = new CommandLineParser(this);
		while (!stop) {
			if (first) {
				first = false;
			} else {
				System.out.print("\n\n");
			}
			System.out.print("> ");
			String input = sc.nextLine();
			try {
				parser.process(input);
			} catch (Exception e) {

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
	public void load(String filename) {
		try {
			RdP rdp = new RdP(filename);
			this.rdp = rdp;
			System.out.print("Charge: " + rdp.place.length + " place(s) et "
					+ rdp.transition.length + " transition(s).");
		} catch (Exception e) {
			System.out.print("Erreur de lecture du graphe.");
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void graphe() {
		if (rdp == null) {
			System.out.print("Aucun reseau de petri charge.");
		} else {
			try {
				grapheRdP = new AlgoGrapheRdP(rdp).grapherdp();
				System.out.print(grapheRdP.nbEtat + " etat(s) et "
						+ grapheRdP.nbTransition + " transition(s).");
			} catch (Exception e) {
				System.out.print(e.getMessage());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void look(int etat) {
		if (grapheRdP == null) {
			System.out.print("Aucun graphe d'etat charge.");
		} else if (etat >= grapheRdP.nbEtat) {
			System.out.print("Etat inexistant.");
		} else {
			boolean[] m = grapheRdP.etat.get(etat);
			System.out.print(Arrays.toString(m));
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void succ(int etat) {
		if (grapheRdP == null) {
			System.out.print("Aucun graphe d'etat charge.");
		} else if (etat >= grapheRdP.nbEtat) {
			System.out.print("Etat inexistant.");
		} else {
			ArrayList<Integer> succ = grapheRdP.succ.get(etat);
			System.out.print(Arrays.toString(succ.toArray()));
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void toDot(String filename) {
		if (rdp == null) {
			System.out.print("Aucun graphe d'etat charge.");
		} else {
			try {
				File f = new File(filename);
				BufferedOutputStream bos = new BufferedOutputStream(
						new FileOutputStream(f));
				bos.write(grapheRdP.toDot().getBytes());
				bos.close();
			} catch (Exception e) {
				System.out.print("Erreur d'ecriture.");
			}
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void ctl(Tree formule) {
		if (grapheRdP == null) {
			System.out.print("Aucun graphe d'etat charge.");
		} else {
			boolean[] res = evaluer(formule);
			int nbEtat = 0;
			for (boolean b : res) {
				if (b) {
					++nbEtat;
				}
			}
			System.out.print(nbEtat + " etat(s).");
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void ctl(Tree formule, int etat) {
		// TODO Auto-generated method stub
		System.out.println("ctl " + formule.toStringTree() + " " + etat);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void ctlToDot(Tree formule, String filename) {
		if (grapheRdP == null) {
			System.out.print("Aucun graphe d'etat charge.");
		} else {
			try {
				boolean[] res = evaluer(formule);
				File f = new File(filename);
				BufferedOutputStream bos = new BufferedOutputStream(
						new FileOutputStream(f));
				bos.write(grapheRdP.ctlToDot(res).getBytes());
				bos.close();
			} catch (Exception e) {
				System.out.print("Erreur d'ecriture.");
			}
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void justifie(Tree formule, int etat) {
		if (grapheRdP == null) {
			System.out.print("Aucun graphe d'etat charge.");
		} else {
			Preuve p = justifier(formule, etat);
			System.out.println(p.toTree());
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void justifieToDot(Tree formule, int etat, String filename) {
		if (grapheRdP == null) {
			System.out.print("Aucun graphe d'etat charge.");
		} else {
			try {
				Preuve p = justifier(formule, etat);
				File f = new File(filename);
				BufferedOutputStream bos = new BufferedOutputStream(
						new FileOutputStream(f));
				bos.write(grapheRdP.justifieToDot(p, etat).getBytes());
				bos.close();
			} catch (Exception e) {
				System.out.print("Erreur d'ecriture.");
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
	public Preuve justifier(Tree formule, int etat) {
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
		Preuve p = new Preuve(formule);
		ctl.justifie(rdp, formule, p);
		p.preuves.get(0).couperRacine(pred, etat);
		return p.preuves.get(0);
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
