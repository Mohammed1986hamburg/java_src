package kapitel3;

import java.util.Arrays;
import java.util.Scanner;

public class NutzenArray {

	public static void main(String[] args) {
	
		zuweisenVonObjektenInArray();
//		wertTauschen();
//		copyArray();
		
	}
	
	public static void zuweisenVonObjektenInArray() {
		Scanner sc = new Scanner(System.in);
		
		String [] oc = new String[3];
		System.out.println(Arrays.toString(oc));
		
		Teilnehmer [] oca = new Teilnehmer[3]; // Teilnehmer tnJulian = new Teilnehmer(); 
		
		System.out.println(Arrays.toString(oca));
		
		
		for(int i = 0 ; i < oca.length ; i++ ) {
			oca[i] = new Teilnehmer();			// zuweisen eines Teilnehmer Objektes an einen index
		}
		
		System.out.println(Arrays.toString(oca));// Gespeichert werde die Refrenzadressen zu den Instanzen
		
		oca[0].name = "Julian";					// Bezeichner[index].Instanzfeld / Instanzmethode
		oca[0].standort= "Karlsruhe";			// können die Inhalte der Objekte abrufen oder
		oca[1].name = "Annina";					// Verhaltensweisen auslösen
		oca[2].name = "Vasilij";
		oca[1].standort = "Hamburg";
		oca[2].standort = "Darmstadt";
		
		
		
		
//		Abfrage:									// Zuweisen von Werten an ALLE Objekte die noch kein 
//		for(int i = 0 ; i < oca.length ; i++) {		// literal (Wert) haben.
//			if(oca[i].name != null) continue Abfrage;
//			else{
//				System.out.println("Wie heißt du ?");
//				oca[i].name = sc.nextLine();
//				System.out.println("Un wo sitzt du ?");
//				oca[i].standort = sc.nextLine();
//			}
//			
//		}

		for(int i = 0 ; i < oca.length ; i++) {
			System.out.println(oca[i].name +", \t\t" + oca[i].standort);
		}
	}

	public static void wertTauschen() {
		int swap[] = {3,5,4};
//		Arrays.sort(swap); 				// sortiert die Werte des arrays aufsteigend
	
		int index = 0; 
		for(int wert : swap) {
			if(wert > swap[++index]) {
				int temp = wert;
				swap[--index]= swap[++index];
				swap [index ]= wert;
			}
			if (index >= swap.length-1)break;
		}
		
		System.out.println(Arrays.toString(swap));
		
		swap = new int[]{2,6,7,0,8,4,9};		// Neues Array erzeugt und somit ist das Objekt aus Zeile
												// 55 nicht mehr referenziert !!
		for(int i = 0; i < swap.length;i++) {
			for(int j = swap.length-1 ; j >=i ; j--) {
				int temp ;
				if(swap [i] > swap [j]) {
					temp = swap[i];
					swap[i] = swap [j];
					swap [j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(swap));
	}

	public static void copyArray() {
		int arr1[] = {1,2,3};
		int[] arrCopy = arr1;
		
		arrCopy[0] = 9;
		System.out.println(Arrays.toString(arr1));
		
		arrCopy = new int[arr1.length];
		for(int i = 0 ; i < arr1.length;i++)
			arrCopy[i] = arr1[i];
		arrCopy[0] = 8;
		System.out.println(Arrays.toString(arrCopy));
		System.out.println(Arrays.toString(arr1));
		
	}
}
