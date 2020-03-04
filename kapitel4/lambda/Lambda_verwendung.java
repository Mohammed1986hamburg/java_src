package oca.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;		// Klasse die für Lambda in OCA8 wichtig ist

public class Lambda_verwendung {

	public static void main(String[] args) {
	withoutLambda();
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Mit Lambda ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println();
	withLambda();
	

	}
	
	// Abfrage von Werten aus einer Liste wie bisher
	public static void withoutLambda() {
		ArrayList <Dog> dogs = new ArrayList();
		dogs.add(new Dog("bboy",		30,	6));
		dogs.add(new Dog("Flo",			5,	12));
		dogs.add(new Dog("Luna",		6,	16));
		dogs.add(new Dog("Tashi",		45,	2));
		dogs.add(new Dog("Charlotte",	8,	12));
		dogs.add(new Dog("Luke",		55,	3));
		dogs.add(new Dog("Oscar",		40,	1));
		dogs.add(new Dog("Esther",		2,	4));
		dogs.add(new Dog("Rudi",		10,	5));
		dogs.add(new Dog("Teddy",		7,	10));
		dogs.add(new Dog("Chiwa",		18,	9));
		dogs.add(new Dog("Lady",		21,	11));
		dogs.add(new Dog("Bonny",		30,	6));
		dogs.add(new Dog("Herkules",	4,	5));
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~  Ausgabe nur mit sysout  Klassisch   ~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
		System.out.println();
		// alle Hunde
		System.out.println("Alle Hunde : \t\t" + dogs);
		System.out.println();
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~  Ausgabe über Methode minAge Klassisch ~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
		System.out.println();
		// alle im Alter von 6
		System.out.println("Alle im Alter von 6: \t" + minAge(dogs,6));		//  Aufruf einer Methode die eine Liste zurückgibt mit den Junden in diesem Alter
		System.out.println();
		System.out.println();

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~  Ausgabe über Methode maxWeight Klassisch ~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
		// alle Hunde mit einem Gewicht von mehr als 15 Kilo
		System.out.println("Alle über 15 Kilo: \t" + maxWeight(dogs, 15));	// Aufruf einer Methode die eine Liste zurückgibt mit dem Gewicht
		System.out.println();
	
	}
	

	// Methode zur Generierung einer Liste mit Hunden in einem bestimmten Alter	
	static ArrayList<Dog> minAge(ArrayList<Dog> dog, int alter){
			ArrayList<Dog> age = new ArrayList();
			for (Dog d : dog)
				if(d.getAge() == alter)
					age.add(d);
			return age;
		}
	
	// Methode zur Generierung einer Liste mit Hunden von einem bestimmten Gewicht	
	static ArrayList<Dog> maxWeight (ArrayList<Dog> dog, int gewicht){
			ArrayList<Dog> weight = new ArrayList();
			for (Dog d : dog)
				if(d.getWeight() >= gewicht)
					weight.add(d);
			return weight;
		}
	

	// Hier wird derselbe sourcecode wie in der Methode withoutLambda()
	// Zur Verwendung von OCA8 Anspruch in Lambda wird nur die KLasse Predicate gebraucht aus
	// java.util.function
	public static void withLambda() {
		ArrayList <Dog> dogs = new ArrayList();
		dogs.add(new Dog("bboy",		30,	6));
		dogs.add(new Dog("Flo",			5,	12));
		dogs.add(new Dog("Luna",		6,	16));
		dogs.add(new Dog("Tashi",		45,	2));
		dogs.add(new Dog("Charlotte",	8,	12));
		dogs.add(new Dog("Luke",		55,	3));
		dogs.add(new Dog("Oscar",		40,	1));
		dogs.add(new Dog("Esther",		2,	4));
		dogs.add(new Dog("Rudi",		10,	5));
		dogs.add(new Dog("Teddy",		7,	10));
		dogs.add(new Dog("Chiwa",		18,	9));
		dogs.add(new Dog("Lady",		21,	11));
		dogs.add(new Dog("Bonny",		30,	6));
		dogs.add(new Dog("Herkules",	4,	5));
	
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~  Ausgabe nur mit sysout  Klassisch   ~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
		// alle Hunde
		System.out.println("Alle Hunde : \t\t" + dogs);
		System.out.println();
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~       Ausgabe mit Lambda Aufruf      ~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
		// alle im Alter von 6
		System.out.println("Alle Hunde im Alter von 6: \t" +
				
				//						   {				Expression					  	}
				//	method			Liste  { Parameter		Arrow-Token				Body 	}
					auswahlLambda(	dogs,		 d				->			d.getAge() == 6));	
	
		System.out.println();
		System.out.println();
		// alle Hunde mit einem Gewicht von mehr als 15 Kilo
		System.out.println("Alle über 15 Kilo: \t" +
		
					//							{				Expression					  	}
					//	method			Liste  { Parameter		Arrow-Token			Body 		}
					auswahlLambda(		dogs, 		d				->		 d.getWeight() > 15));
	
		
		System.out.println();
		System.out.println();
	}

	// methode die Lambda Ausdruck übergeben bekommt und ihn im if() verwendet
	// die Predicate Methode test() liefert einen boolean Wert zurück, weshalb Sie verwendet werden kann
	static ArrayList<Dog> auswahlLambda(ArrayList<Dog> dog,		Predicate<Dog> expr){
		ArrayList<Dog> auswahl = new ArrayList();
	
		for (Dog t : dog)		// Wie bisher bekannt eine for each Schleife, die durch ein iterierbares Objekt durchläuft
			
			if(expr.test(t))	// expr enthält die Lambda syntax welche in der methode withLambda in 
								// der AusgabeAnweisung übergeben wird in der Parameterliste als Object der Klasse Predicate vom Typ Dog
								// Methode test(argument) prüft jetzt die übergebene Lambda Anweisung ob sie war oder falsch ist.
								// d.getAge() liefert einen int Wert zurück der mit dem Wert 6 verglichen wird, für jedes Objekt der Liste dog
								// d.getWeight() liefert einen int Wert zurück der mit dem Wert 6 verglichen wird, für jedes Objekt der Liste dog
				
				auswahl.add(t);	// Wenn wahr, dann wird dieses Objekt in die lokale Liste hinzugefügt
		
		return auswahl;
	}

}

//Class für die Hunde Objekte
class Dog{
	private String name;
	private int weight; 
	private int age;
	
	Dog(String name, int weight, int age){
		this.name = name;
		this.weight = weight;
		this.age = age;
	}
	public String getName() {return name;}
	public int getWeight() {return weight;}
	public int getAge() {return age;}
	
	public String toString() {return name;	}
	
}