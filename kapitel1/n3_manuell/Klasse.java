class Klasse {      

	// Felder --> halten den Zustand einer Klasse oder eines 
	// 			  Objektes
	// Klassenvariable
	public static String name;		// wird mit defaultwert null initialisiert
	
	// Instanzvariable 
	public int teilnehmerAnzahl;	// wird mit defaultwert 0 initialisiert

	public static void main(String [] args){ 
		int tn = 15;		// Initialisierung
		int anzahlLehrer ;	// Deklaration
		System.out.println(name);
		// System.out.println(teilnehmerAnzahl); // DOES NOT COMPILE
		System.out.println(new Klasse().teilnehmerAnzahl); // DOES NOT COMPILE
	}
}