package oca.api.string;

public class Concatenation {

	private static String fuenf = "";		// Mit einem Leerstring initialisiert
	private static String sechs;			// mit null initialisiert --> ACHTUNG null bleibt drin stehen !!
	
	public static void main(String...strings ) {
		String _null = null;				// selbe wie variable sechs
		String eins ="1"; 					// direkte Wertzuweisung
		
		String zwei = zwei();
		
		_null.concat(zwei());				// DOES COMPILE but throws NullPointerException -->
											// kann keine Methode auf ein nicht vorhandenes Objekt anwenden
		
		System.out.println(fuenf);			// Ausgabe :     (Leer)
		System.out.println(sechs);			// Ausgabe : null 
	
		_null = sechs + "5";				// Ausgabe : null5
		
		System.out.println(_null);
		System.out.println(fuenf);			// Ausgabe :    (Leer)
		sechs = "abc";						// Ausgabe : abc   Zeichenkette null wird ersetzt duch abc
		System.out.println(sechs);
		
		
		
		
		zwei = eins.concat("4");			// eins wird NICHT verändert sondern nur genutzt
		
		System.out.println(zwei);			// 14
		
		System.out.println(eins + zwei + 3);	// 1143
	
		System.out.println(eins);			// Solange es KEINE Zuweisung gibt wird die 
											// Zeichenkette NICHT verändert
		
		eins = fuenf + zwei  ;				//  eins = eins + fuenf + zwei
											//       =  "1"   + ""  + "14"
											//       =       "1"    + "14"
		System.out.println(eins);			//       =          "114"
		
		
		
		
	}
	
	public static String zwei() {
		return "2";
	}
}
