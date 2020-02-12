package oca.api.string;

import java.util.Arrays;

public class Methoden {

	public static void main(String[] args) {
		String str = "";
		
		// hinzufügen
		str = str.concat("abcdefg");	// 7 Zeichen
		
		//ein Zeichen auslesen
		int laenge = str.length();
		char zeichen = str.charAt(laenge - 1);	// Zeichen an index 7 --> StringIndexOutOfBounds 
												// Besser mit length.()-1
		System.out.println(zeichen);
		
		zeichen = str.charAt(str.length() - 2);// Vorletzte Zeichen
		System.out.println(zeichen);
		
		
		// Index von Zeichen oder Zeichenketten werden IMMER die indize des zuerst zutreffenden Zeichens bzw Zeichenkette 
		// zurückgegeben
		// index eines Zeichen erfahren allgemein bei 0 beginnend
		int index = str.indexOf("e");
		System.out.println(index);
		
		// index eines Zeichens ab einer bestimmten Stelle
		str += str;
		index = str.indexOf("e",5);
		System.out.println(index);
		
		// index einer Zeichenkette ab index 0
		index = str.indexOf("abc");
		System.out.println(index);
	
		// index einer Zeichenkette ab einer bestimmten Stelle
		index = str.indexOf("abc",6);
		System.out.println(index);
		
		// Teilstring
		str += str.substring(5);	// str = str + str.substring(5) Teilstring ab index 5 (inklusive)
									// bis zum Ende wird ausgeschnitten und an den vorherigen angefügt
		System.out.println(str);
		
		String s = str.substring(7,9);	// Begin Index ist IMMER inklusive und der Endindex exklusive hier nur die 
										// indexe 7 und 8
		System.out.println(s);
		
		s = str.substring(8,8);			// NIX
		System.out.println(s);
		
		s = str.substring(8,9);			// Nur das Zeichen an index 8
		System.out.println(s);
		
//		s = str.substring(6, 4);		// Wenn der Endindex VOR dem Beginn Index liegt, gibt es
										// eine StringIndexOutofBoundsException hier -2
//		System.out.println(s);
		
		// Ersetzen eines Zeichens oder einer Zeichenkette
		str = str.replace("abc", "  ");
		System.out.println(str);
		
		//--- -------- Nicht Examensrelevant -----------------------
		// Wörter aus Zeichenkette extrahieren
		str = "Fischers Fritz fischt frische Fische";
		
		String[] st = str.split(" ");
		System.out.println(Arrays.toString(st));
		
	}

}
