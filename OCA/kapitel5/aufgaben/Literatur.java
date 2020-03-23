package kapitel5.aufgaben;

public abstract class Literatur implements Lesen, Schreiben {
	public String art;
	public String titel;
	public int seite;

	@Override
	public void schreiben(Schreiben text) {
		// TODO Auto-generated method stub

	}

	@Override
	public void lesen() {
		// TODO Auto-generated method stub

	}
	
	public abstract void kaufen();

}
