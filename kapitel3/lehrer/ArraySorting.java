package kapitel3;

import  java.util.Arrays;
import static java.util.Arrays.*;

public class ArraySorting {

	public static void main(String[] args) {
		String [] words = {"Bobo","Alfred","Aal","Bibi","Biene","Al"};
		String [] ziffern = {"110","1","1000","01","0"};
		int[] werte = {1,55,10,100};
		
		System.out.println(Arrays.toString(words));				// Ausgabe des unsortierten Arrays
		System.out.println(Arrays.binarySearch(words,"Al"));	// Anwenden der binären Suchmethode
																// Ergebnis ist NICHT aussagekräftig (unpredictable)!!
		
		sort(words);											// sortieren des Arrays
		System.out.println(Arrays.toString(words));				// Ausgabe des sortierten Arrays
		System.out.println(Arrays.binarySearch(words,"Al"));	// Anwenden der binär Suche auf das sortierte Array
																// Aussagekräftig !!
		
		System.out.println(Arrays.toString(ziffern));
		System.out.println(Arrays.binarySearch(ziffern, "01"));	//-1 
		Arrays.sort(ziffern);
		System.out.println(Arrays.toString(ziffern));
		System.out.println(Arrays.binarySearch(ziffern, "01"));	// 1
		
		System.out.println(Arrays.toString(werte));
		System.out.println(Arrays.binarySearch(werte, 10));		// -2	bedeutet -1 wird immer dann ausgegeben, wenn der Wert NICHT an dem 
																// erwarteten Index existiert und dann die erwartete index zahl von -1 abziehe
																// -1 Nicht vorhanden -1 erwarteter index(1) --> -2 
																// Diese Ausgaben sind NICHT aussagekräftig !!!
		Arrays.sort(werte);
		System.out.println(Arrays.toString(werte));
		System.out.println(Arrays.binarySearch(werte, 10));		// 1
		
		System.out.println(Arrays.binarySearch(werte, 2));		// -2 ist Aussagekräftig , da Array sortiert ist, und der erwartete 
																// index für die Zahl 2 index 1 wäre. 2 existiert nicht, daher -1 für nicht 
																// vorhanden und -1 für den index 1 an dem sie stehen müsste
		System.out.println(Arrays.binarySearch(ziffern, "001"));// -2
		
		
		int[] ar = {1,55,10,100,6, 0};
		System.out.println(Arrays.toString(ar));
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		// [0, 1, 6, 10, 55, 100]
		System.out.println(Arrays.binarySearch(ar, 55));
		System.out.println(Arrays.binarySearch(ar, 6));
		System.out.println(Arrays.binarySearch(ar, 8));
		System.out.println(Arrays.binarySearch(ar, 60));
		
		int[] ar2 =     {3,2,1};
		System.out.println(Arrays.binarySearch(ar2, 3));
		System.out.println(Arrays.binarySearch(ar2, 2));
		System.out.println(Arrays.binarySearch(ar2, 1));

	}

}
