package oca.controlflow;

public class Entscheidung {

	static final boolean ok;							// defaultwert false
	static { ok = true;}								// erstmalige Initialisierung in einem static
														// initiallizer Block
	public static void main(String[] args) {
		
		int x = 5 ;
		final boolean ok;
		
		// Unreachable Code
		if (true) {System.out.println("If-zweig");}		// gültige Anweisung
		else {System.out.println("Else-zweig");}		// Unreachable Code -- DOES COMPILE/ NO EXCEPTION
		
		// Initialisieren 
		if ((x = 4) > x);								// Zuweisung innerhalb der () erlaubt wenn geklammert bei 
														// allen Datentypen ausser boolean
		
		if (ok = 4 > x);								// Zuweisung des Ergebnis von dem Vergleich geht nur bei 
														// einer boolschen Variablen - Erst wird 4 > x ausgewertet 
														// und dann ok zugewiesen
		
	//	if (ok = !ok);									// ok ist eine lokale Konstante die in Zeile 20 
														// initialisiert wurde --> DOES NOT COMPILE
		
		// Wertveränderung der Variable innerhalb der Expression
		x = 5;
		if (++x > 5 )			
			x = 0 ;
		else
			x--;
		System.out.println(x);
		
		if (x++ > 5) 
			x = 0;
		
		System.out.println(x);
		
		if (x < 10) x = 5;
			else if (!ok) x = 10;
		else ;x = 50;
		
//		else System.out.println("Fehler");				// else ohne if Anweisung --> DOES NOT COMPILE
	}

}
