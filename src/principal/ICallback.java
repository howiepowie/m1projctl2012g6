package principal;

public interface ICallback {

	public void load(final String filename);

	public void graphe();

	public void look(final Object etat);

	public void succ(final Object etat);

	public void toDot(final String filename);

	public void ctl(final Object formule);

	public void ctl(final Object formule, final Object etat);

	public void ctlToDot(final Object formule, final String filename);

	public void justifie(final Object formule, final Object etat);

	public void justifieToDot(final Object formule, final Object etat,
			final String filename);

	public void stop();
}
