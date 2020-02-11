package oo;

import java.lang.*;

public class Person extends java.lang.Object{ 	// extends.. wird automatisch IMMER eingefügt
												// wenn nicht eine andere Klasse spezialisiert wird
	private String name = "Otto";				// Instanzfeld
	private static String nachname = "Schmitz"; // Klassenfeld
	
	public void setAlter(int alter){			// Instanzmethode OHNE Rückgabewert 
		this.alter = alter;
	}	
	
	private int alter = 5;						// Instanzfeld
	
	public static void main(String [] args){	// main Methode
	
		Person person = new Person();			// Objekt erstellt --> Instanziiert
												// Typ(Klasse) Bezeichner  = new Konstruktor();
		System.out.print("Die Person heisst: " + person.name+ "." + person.nachname);
		person.name = "Herbert";				// Ändern des Wertes für Objekt 1
		person.nachname = "Mueller";
		
		Person person2 = new Person();			// 2tes Objekt erzeugt
		System.out.print("\nDie Person 1 heisst: " + person.name + "." + person.nachname);
		System.out.print("\nDie Person 2 heisst: " + person2.name+ "." + person2.nachname);
		
	}
	
	public int getAlter(){						// Instanzmethode MIT Rückgabewert
		return alter;
	}

}

class Mitarbeiter{}