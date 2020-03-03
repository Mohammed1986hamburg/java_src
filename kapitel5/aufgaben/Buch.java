package oca.uebungInterface;

import java.time.LocalDate;

public class Buch extends Literatur {

	public Buch(String kategorie, String titel, double preis) {
		super(kategorie, titel, preis);
		
	}

	@Override
	public String wasWirdgelesen(Lesen objekt) {
		
		return null;
	}

	@Override
	public int lesedauer(Lesen objekt) {
		
		return 0;
	}

	@Override
	public String wasWirdGeschrieben(Schreiben text) {
		
		return null;
	}

	@Override
	public LocalDate datum(Schreiben text) {
		
		return null;
	}

	@Override
	public void kaufen() {
		
		
	}

}
