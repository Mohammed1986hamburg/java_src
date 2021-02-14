package oca.lottoProject;

public class Spieler {
	
	private String name;				// Instanzvariable -- wird mit null defaultwert initialisiert
										// werden bei JEDEM Objekt das erzeugt wird initialisiert
										// Jedes Objekt hält eine Kopie dieser Variable
	
	public static  int spielerID ;		// Klassenvariable -- wird mit 0 defaultwert initialisiert
										// static wird NUR ein EINZIGES Mal beim Klassenaufruf ausgeführt
										// Es exisitiert diese Klassenvariable NUR EIN EINZIGES MAL 
										// Ihr Wert ist für ALLE gültig, für die Klasse selber UND für alle Objekte der Klasse
	
	public static final int ID = getID();// wird durch Methodenaufruf und dessen returnwert initialisiert
										 // static wird NUR ein EINZIGES Mal beim Klassenaufruf ausgeführt
	
	public Spieler() {					// Konstruktor -- wird zum einen als letztes aufgerufen bei der Objekterzeugung und wird JEDESMAL 
										// aufgerufen
		System.out.println("constructor");
	}

	static {							// Static Initializer Block
		System.out.println(spielerID);	// static wird NUR ein EINZIGES Mal beim Klassenaufruf ausgeführt
		spielerID = 1;
		System.out.println(ID);
	}
	
	{ System.out.println(name);			// Instanz Initializer Block -- werden bei JEDEM Objekt das erzeugt wird ausgeführt !!
		name = "Spieler";
	}
	public static void main(String[] args) {
		Spieler sp = new Spieler();
		Spieler hubert = new Spieler();
		
	}
	//int anzahlReihen = getID();		// Instanzvariablen können durch aufruf von statischen und nicht statischen Methoden
	int anzahlReihen = getReihen();		// initialisiert werden
	

	static int getID() {				// Kann zur Initialisierung von Variablen bereits genutzt werden
		return 15;
	}
	
	int getReihen() {
		return 1;
	}
	static {System.out.println(spielerID);}	// Static Initializer Block
											// static wird NUR ein EINZIGES Mal beim Klassenaufruf ausgeführt
	
	{System.out.println(name);}			// Instanz Initializer Block
}
