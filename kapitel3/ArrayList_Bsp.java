package oca.api.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_Bsp {

	public static void main(String[] args) {
//		createArrayList();
		useArrays();

	}

	public static void useArrays() {
		ArrayList<String> words = new ArrayList();
		
		// -- hinzufügen eines Wertes an das Ende
		words.add("Bla");
		words.add("Schwarz");
		words.add("Bla");
		words.add("Grün");
		words.add("Bla");
		
		// -- ausgabe einer liste
		System.out.println(words);
		
		// -- ausgabe eines Wertes
		System.out.println(words.get(0));
		
		// -- einen Wert suchen
		int index = words.indexOf("Bla");
		System.out.println(index);
		index = words.lastIndexOf("Bla");
		System.out.println(index);
		
		// -- einen Wert hinzufügen an einen Index
		words.add(2, "Blau");
		System.out.println(words);
		words.add("Rot");
		System.out.println(words);
		
		// -- einen Wert an einem index austauschen
		
		words.set(0, "Alaaf");
		
		// -- ArrayList sortieren
		Collections.sort(words);
		System.out.println(words);
		
		// -- Liste löschen
//		words.clear();
//		System.out.println(words);
		
		// -- einzelnen Wert löschen
		words.remove(4);
		System.out.println(words);
		
		words.remove("Bla");
		System.out.println(words);
		
		// -- prüfen ob Liste leer ist
		System.out.println(words.isEmpty());
		
		words.add(null);
		System.out.println(words);
		
		// -- prüfen, ob ein Wert existiert
		System.out.println(words.contains("Grün"));
		System.out.println(words.contains("Bla"));
	}

	public static void createArrayList() {
		// Legale Definition einer ArrayListe
		ArrayList list1 = new ArrayList();		// legt default capacity an
		ArrayList list2 = new ArrayList(100);	// legt eine capacity mit 100 als Startwert an
		ArrayList list3 = new ArrayList(list1); // legt eine "kopie" der list1 an --> Größe und Inhalt wird kopiert 
		
		ArrayList <String> wordList = new ArrayList(); // diamonds <> dürfen auf der rechten Seite fehlen
		ArrayList zahlenListe = new ArrayList<Integer>();// Diamonds und Typ links kann weggelassen werden und nur rechts stehen
		ArrayList zeichenListe = new ArrayList<>();
		ArrayList <Integer> werteListe = new ArrayList<Integer>();
		
		
		// Illegale Definitionen
//		ArrayList <> zeichenList = new ArrayList<Character>();	// Auf der linken Seite DARF ein diamond NUR mit TYP Angabe
//		ArrayList <> kaputteListe = new ArrayList<>();			// stehen
		
		// Nutzen des Interfaces List
		
		List eineListe = new ArrayList();
//		List nochEineKaputteListe = new List();				// DOES NOT COMPILE !! weil List ein Interface ist, und
															// von Interfaces KEINE Objekte erzeugt werden können
		
	}
}
