package oca.interfaces;

// -- 						Interface 
// --------------------------------------------------------------------------------
// -- > Interfaces D�rfen NUR public oder package-private sein
// -- > Nie final, protected oder private !!!
// -- > Interfaces D�RFEN NUR andere Interfaces erweitern (extend) NICHT implementieren (implements)
// -- > Interfaces SIND IMMER abstract - keywords: public und abstract sind optional 
// -- > Mehrere Interfaces in einer Datei --> ist IMMER das Interface public, welches den 
// --   gleichen Namen wie die Datei hat.
// -- > Ein Interface, darf mehr wie ein interface spezialisieren (extends) --> ANDERS ALS BEI KLASSEN
// -- > D�rfen nicht instanziiert werden

interface Bewegung {}

interface Checks extends Bewegung{}

interface Kaufen extends Reparatur, Checks { public abstract String auswahlFarbe();}

interface Reparatur  {}

// Klassen
abstract class Auto  implements Bewegung{		 	// NUR KLASSEN implementieren (implements) ein / mehrere Intefaces
	abstract String auswahlFarbe();
}

class PKW extends Auto implements Checks, Kaufen{ 	// Bei Klassen darf jede Klasse nur EINE spezialisieren (extends)
	public String auswahlFarbe() { return "Weiss";}	// aber mehrere Interfaces implementieren (implements)

}

	


