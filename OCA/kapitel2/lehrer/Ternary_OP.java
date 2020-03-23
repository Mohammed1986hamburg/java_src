package oca.controlflow;

public class Ternary_OP {

	public static void main(String[] args) {
		String info;
		int zahl = 6 ;
		double wert = 2.5;
		
		System.out.println( zahl >= 6 ? "Grösser" : 7) ; // Ausgabe KANN verschiedene Typen als ergebnis für
														 // wahr und fals haben
		
		// DOES NOT COMPILE
//		zahl =  zahl >= 6 ? "Grösser" : 7;				// Bei zuweisen des Ergebnis an eine Variable
														// MÜSSEN die Ergebnisse dem Datentyp der Variable
														// entsprechen --> hier int kann KEIN String
		
//		info =  zahl >= 6 ? "Grösser" : 7;				// String kann KEIN int
		
	// Schachtelung im if Zweig
		zahl = zahl++ +10 > 15 ? 10 : zahl == 20  ? 5: 0 ;
		
		if (zahl++ +10 > 15) {
			zahl = 10;
		}
		else 
			if (zahl == 20) zahl = 5 ;
			else zahl = 0;
		
	// Schachtelung im else Zweig	
		zahl = zahl++ +10 > 15 ?  zahl == 20  ? 10: 5: 0 ;
		
		if (zahl++ +10 > 15) {
			if (zahl == 20) zahl = 10;
			else zahl = 5;
		}
		else 
			 zahl = 0 ;
			
	}

}
