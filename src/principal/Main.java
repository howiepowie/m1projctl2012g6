package principal;

import java.util.Scanner;

public class Main implements ICallback {

	public static void main(String[] args) throws Exception {
		Main main = new Main();
		main.run();
	}

	private boolean stop;

	private Main() {
	}

	private void run() throws Exception {
		stop = false;
		boolean first = true;
		Scanner sc = new Scanner(System.in);
		CommandLineParser parser = new CommandLineParser(this);
		while (!stop) {
			if (first) {
				first = false;
			} else {
				System.out.println();
			}
			System.out.print("> ");
			String input = sc.nextLine();
			parser.process(input);
		}
		sc.close();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void load(String filename) {
		// TODO Auto-generated method stub
		System.out.println("load " + filename);
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
	public void look(Object etat) {
		// TODO Auto-generated method stub
		System.out.println("look " + etat);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void succ(Object etat) {
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
	public void ctl(Object formule) {
		// TODO Auto-generated method stub
		System.out.println("ctl " + formule);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void ctl(Object formule, Object etat) {
		// TODO Auto-generated method stub
		System.out.println("ctl " + formule + " " + etat);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void ctlToDot(Object formule, String filename) {
		// TODO Auto-generated method stub
		System.out.println("ctlToDot " + formule + " " + filename);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void justifie(Object formule, Object etat) {
		// TODO Auto-generated method stub
		System.out.println("justifie " + formule + " " + etat);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void justifieToDot(Object formule, Object etat, String filename) {
		// TODO Auto-generated method stub
		System.out.println("justifieToDot " + formule + " " + etat + " "
				+ filename);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void stop() {
		this.stop = true;
	}

}
