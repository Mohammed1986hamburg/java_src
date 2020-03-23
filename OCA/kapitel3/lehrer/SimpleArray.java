package oca.api.array;

import java.util.Arrays;

public class SimpleArray {

	// Klassen gebundenes Array
	static String [] arrClass ;			// Array Deklaration --> sieht eigentlich so aus :
										// static String [] arrClass = null;
	
	// Instanzgebundenes Array
	String[] arrInstanz = new String[0];// Array der Größe 0 !! KEIN INDEX
	
	public static void main(String[] args) {
		
//		System.out.println(new SimpleArray().arrInstanz[0]); // Wirft ArrayIndexOutOfBoundsException
		
//		System.out.println(arrClass.toString());			// Wirft NullPointerException
	//-- ----------------------------------------------------------------
	//-- Lokale (innerhalb einer Methode) Deklaration und Initialisierung
	//-- ----------------------------------------------------------------
		
		// bekannteste 
		String [] arrLocal = new String [3]; 		// Array vom Typ String der Größe 3
		
		System.out.println(arrLocal);				// Gibt die Adrese des Array aus
		System.out.println(arrLocal[0]);			// Gibt den Wert an index 0 aus
													// Defaultwerte bei Objekt Typen --> null
		
		int [] arrInt = new int[2];					// Array von einem primitiven Datentyp
		System.out.println(arrInt[0]);				// wird AUCH mit einem defaultwert initialisiert 
													// byte,short,int,long = 0,
													// float,double = 0.0, 
													// char = 'u0000',boolean = false
		
		Integer[] arrInteger = new Integer [2];		// Arrays von Wrapperclass Typen sind ebenfalls
		System.out.println(arrInteger[0]);			// Referenzen auf Objekte und daher mit null
													// initialisiert an den indizes
		
		// alternative
		String arrString [] = new String [] {"a","b"};
		System.out.println(arrString[1]);
		
		// Die [] können links vom = an jeder beliebigen Stelle stehen.
		// Allerdings MUSS der Typ als erstes stehen. Bedeutet die
		// [] müssen NICHT direkt nach dem Typ gesetzt werden.
		int [][] arInt [] = new int [][][] {	{	{1,2},{1}	}	,{	{4,5},{6,7}	}	};
		arInt [0][0] = new int [2];
		arInt [0][1] = new int [1];
		arInt [1][0] = new int [2];
		arInt [1][1] = new int [2];
		
		// ohne new
		byte [] arrByte = {3,6};					// anonymous Array weil keine Größen Zuweisung erfolgt
		
		// multiple Arraydeklaration
		
	//	Typ		eindimensionales		Variable		zweiDimensionales
		short  	arrShort1[] = {1,2}, arrShort2 = 5, arrShort3[][] = new short[1][];
		
		
	//	int []	iArr1[] , iArr2,	[] iArr ;		// DOES NOT COMPILE --> iArr hat die [] vor dem Bezeichner
													// das DARF NICHT sein
		
		// Ausgabe von allen Werten
		
		System.out.println(Arrays.toString(arrString));
		System.out.println(arrString.toString());
		System.out.println(arrString);
		
		
		
		
		
		
		
		

	}

}
