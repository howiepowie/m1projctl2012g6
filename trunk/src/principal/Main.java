package principal;

import java.util.Scanner;

import org.antlr.runtime.tree.Tree;

import rdp.RdP;

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
			System.out.print("Chargé: " + rdp.place.length + " places et "
					+ rdp.transition.length + " transitions.");
		} catch (Exception e) {
			System.out.print("Erreur de lecture du graphe.");
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void graphe() {
		// TODO Auto-generated method stub
		System.out.println("graphe");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void look(int etat) {
		// TODO Auto-generated method stub
		System.out.println("look " + etat);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void succ(int etat) {
		// TODO Auto-generated method stub
		System.out.println("succ " + etat);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void toDot(String filename) {
		// TODO Auto-generated method stub
		System.out.println("toDot " + filename);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void ctl(Tree formule) {
		// TODO Auto-generated method stub
		System.out.println("ctl " + formule.toStringTree());
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
		// TODO Auto-generated method stub
		System.out.println("ctlToDot " + formule.toStringTree() + " "
				+ filename);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void justifie(Tree formule, int etat) {
		// TODO Auto-generated method stub
		System.out.println("justifie " + formule.toStringTree() + " " + etat);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void justifieToDot(Tree formule, int etat, String filename) {
		// TODO Auto-generated method stub
		System.out.println("justifieToDot " + formule.toStringTree() + " "
				+ etat + " " + filename);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void stop() {
		this.stop = true;
	}

	public static void afficher(Tree t) {
		afficher(t, "-");
	}

	/**
	 * Comment se servir de la classe Tree pour parcourir la formule CTL.
	 */
	public static void afficher(Tree t, String indent) {
		System.out.print(indent + " ");
		switch (t.getType()) {
		case CommandLineParser.EF:
			System.out.println("EF");
			break;
		case CommandLineParser.AF:
			System.out.println("AF");
			break;
		default:
			System.out.println(t.getText());
		}
		int max = t.getChildCount();
		for (int i = 0; i < max; ++i) {
			afficher(t.getChild(i), indent + "-");
		}
	}
}
