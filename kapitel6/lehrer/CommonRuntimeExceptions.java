package oca.exceptions;

import java.util.ArrayList;
import java.util.Scanner;

public class CommonRuntimeExceptions {
	static Test object;
	CommonRuntimeExceptions o;
	
/**	// static Initializer Block 		// ExceptionInInitializerError wird hier ausgelöst, wenn
	static {							// Exceptions im Initializer Block auftauchen
		object = null;
		System.out.println(7/0);
	}
*/

	CommonRuntimeExceptions(){
		o = new CommonRuntimeExceptions();
	}
	public static void main(String[] args) {
//		illegalStateException();
//		arrayIndexOutOfBoundsException(new int[5]);
//		classCastException();
//		nullPointerException();
//		numberFormatException();
//		illegalArgumentException(3);
//		stackOverflowError(3);
		outOfMemoryError();
	}


	public static void illegalStateException() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Text");
		String text = sc.nextLine();
		sc.close();
		
		text = sc.nextLine();
		
	}
	// deklaration mit throws in der Signatur ist eine unchecked Exception
	// Diese muss NICHT in der aufrufenden (caller) Methode deklariert oder behandelt werden

	public static void arrayIndexOutOfBoundsException(int... array) throws IndexOutOfBoundsException, RuntimeException{ 
		
		System.out.println(array[9]);
	}
	
	public static void classCastException() {
		Test test = new Testfrage();
		System.out.println(test.toString());
//		Testfrage frage = (Testfrage)new Test();	// Throws Exception aber DOES Compile
													// Objekt der Superklasse kann nicht vom Typ der subklasse
													// referenziert werden
//		System.out.println(frage.toString());
		Object objekt = test;						
		String fragentext = (String)objekt;			// Throws Exception aber DOES compile
													// compiler sieht nur den Typ Object und nicht
													// das refenzierte Objekt
		
	}
	
	
	
	public static void nullPointerException() {
		Testfrage frage = null;
//		System.out.println(frage.toString());
		Integer i = null ;
		System.out.println(i.valueOf(i));
		Object o = null;
		System.out.println(o.toString());
	}
	
	public static void numberFormatException() {
		String zeichen = "a1c";
		int i = Integer.parseInt(zeichen);
		
//		Scanner sc = new Scanner(System.in);
//		int eingabe = sc.nextInt();			// throws InputMismatchException keine NumberFormatException
	}
	
	public static void illegalArgumentException(int wert) throws IllegalArgumentException {
		
		if (wert <0) throw new IllegalArgumentException("Kein negativer Wert");
		else if (wert>5 ) throw new IllegalArgumentException("Wert darf nur zwischen 0 und 5 sein");
		else System.out.println(wert);
	}
	

	public static void stackOverflowError(int wert) {
//		CommonRuntimeExceptions test = new CommonRuntimeExceptions();
		 
//		if(wert > 0)										// Abbruchbedingung für einen rekursiven Aufruf
		stackOverflowError(--wert);							// ohne diese führt der rekursive Aufruf zu einer 
															// StackOverflowError
//		else System.out.println("rekursiver Aufruf beendet");
	}
	
	public static void outOfMemoryError() {
	
		StringBuilder sb = new StringBuilder("ein Text");
		
		for (int i = 0 ; i< Integer.MAX_VALUE ; i++)
			sb.append("weiterer Text");
	}
}


class Test{}
class Testfrage extends Test{}

 
