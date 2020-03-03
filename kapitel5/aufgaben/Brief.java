package oca.uebungInterface;

import java.time.LocalDate;

public class Brief implements Lesen, Schreiben {

	@Override
	public void beenden() {}
	
	@Override
	public String wasWirdGeschrieben(Schreiben text) {
		
		return null;
	}

	@Override
	public LocalDate datum(Schreiben text) {
		
		return null;
	}

	@Override
	public String wasWirdgelesen(Lesen objekt) {
		
		return null;
	}

	@Override
	public int lesedauer(Lesen objekt) {
		
		return 0;
	}

}
