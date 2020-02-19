package oca.api.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import oca.api.Spieler;

public class ArrayListeNutzen {

	public static void main(String[] args) {
		ArrayList objekte = new ArrayList();
		List <String> farben = new ArrayList<String>();
		ArrayList<Spieler> teilnehmer = new ArrayList();
		
		objekte.add(Boolean.TRUE);
		objekte.add("Helga");
		objekte.add('@');
		objekte.add(42);
		objekte.add(2.5F);
		
		farben.add("Rot");
		farben.add("Gelb");
		farben.add("Grün");
		farben.add("Gelb");
		farben.add("Grau");
		farben.add("Weiß");
		farben.add("Blau");
		farben.add("Aquamarin");
		
		teilnehmer.add(new Spieler("Michael",10));
		teilnehmer.add(new Spieler());
		teilnehmer.add(new Spieler("Doris",15));
		
		// -- sortieren und binarysearch
//		Collections.sort(objekte);											// Liste ist nicht typisiert --> ClassCastException
//		System.out.println(Collections.binarySearch(objekte, (Object)("F")));// ClassCastException, weil Liste nicht typisiert
		
		System.out.println(Collections.binarySearch(farben, "Orange"));		// Liste unsortiert --> daher dasselbe ungenaue Ergebnis 
																			// wie bei Arrays
		
		Collections.sort(farben);
		System.out.println(farben);
		System.out.println(Collections.binarySearch(farben, "Orange"));
		Collections.shuffle(farben);										// vermischt die Werte zufällig - NICHT OCA relevant
		System.out.println(farben);
		
		System.out.println(teilnehmer);
		for(int i = 0 ; i < teilnehmer.size();i++) {
			
			if (teilnehmer.get(i).getName().equals("Hugo")) {
			
				System.out.println(" An index : " + i);
				break;
			}
				else System.out.println(false);
						
		}

//		Collections.sort(teilnehmer);							// funktioniert nicht mit ArrayListen welche Objektadressen gespeichert haben		
		int index = -1;
		for(Spieler sp : teilnehmer) {
			if(sp.getName().equals("Diana")) {
				System.out.println(true);
				break;
			}
			else index--;
		}
		System.out.println(index);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		// -- Array asList
		String[] f = {"Rot", "Gelb","Grün"};
		
		farben = Arrays.asList(f);
		System.out.println(farben.size());
		System.out.println(farben.get(1));
//		farben.add("Weiß");
//		farben.clear();
//		farben.remove("Gelb");
		farben.set(0,"Blau");
		System.out.println(farben);
		Collections.sort(farben);
		System.out.println(farben);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		// -- Method chaining
		ArrayList<Integer> zahlen = new ArrayList();
		zahlen.add(0);			zahlen.add(1);		zahlen.add(2);
		zahlen.add(3);			zahlen.add(4);		zahlen.add(5);
		zahlen.add(6);			zahlen.add(7);		zahlen.add(8);
		zahlen.add(9);			zahlen.add(10);		zahlen.add(11);
		zahlen.add(12);			zahlen.add(13);		zahlen.add(14);
		zahlen.add(15);			zahlen.add(16);
		System.out.println(zahlen);
				
		List<Integer> z = zahlen.subList(0, 10);
		System.out.println(z);
		
		System.out.println(zahlen.get(1).compareTo(5));
		System.out.println(zahlen.get(2).equals(z.subList(2,3).get(0)));
		System.out.println(z.subList(2,3).get(0));
		
//		z.remove(5).set(5,99);
	
		z.add(5,Integer.valueOf(99));
		z.add(0,100);
		
		// konstante Liste und konstantes Array
		final ArrayList<Integer>werte = new ArrayList(); // Hier bereits mit einer Referenzadresse initialisiert
														
		werte.addAll(z.subList(0,5));
		werte.add(100);
		System.out.println(werte);
		
		ArrayList<Integer> w = werte;
		
//		werte = w;										// Diese in Zeile 110 zugewiesene Adresse darf nicht überschrieben 
														// werden
		werte.clear();
		
		final int[] arr = {1,2,3};						// arr ist final und darf keine weitere ArrayObjektAdresse
//		arr = new int[4];								// zugewiesen bekommen
		
		System.out.println((arr[0] = 10));
	
	}

}
