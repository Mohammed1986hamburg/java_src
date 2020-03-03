package oca.uebungInterface;

import java.time.LocalDate;

public interface Schreiben {
	
	String wasWirdGeschrieben(Schreiben text);
	
	LocalDate datum(Schreiben text );
	
	default void beenden() {
		System.out.println("Text ist beendet");
	}

}
