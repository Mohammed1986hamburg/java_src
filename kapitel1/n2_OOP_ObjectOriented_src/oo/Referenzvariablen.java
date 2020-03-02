package oca.basis;

public class Referenzvariablen {

	public static void main(String[] args) {
	
		
	// Klassen == TYP bezeichner Zuweisung(=) new Konstruktor(Parameterwert)
			Schaf 		herde1 			= 	  new 		Schaf(35000)	;
			Schaf 		herde2 			=  	  new 		Schaf(5000)		;
			Schaf 		herde3;		//	= 	  null						;	// ReferenzVariable mit null initialisieren
			
			System.out.println("-------- Adressen ---------");
			System.out.println(" Herde 1 " + herde1);
			System.out.println(" Herde 2 " + herde2);
			System.out.println(" Herde 3 " + herde3);
			System.out.println("---------------------------");
			//System.out.println("herde3 " + herde3.name);
//			System.out.println("herde3 " + herde3.anzahl);		// DOES COMPILE -- ABER wirft NullPointerException

			herde3 = herde1 ;
			System.out.println("Herde 1 " + herde1.anzahl);
			herde3.anzahl = 30000;
			System.out.println("Herde 1 " + herde1.anzahl);
			System.out.println("Herde 3 " + herde3.anzahl);
			herde1 = null;
			herde2 = herde3;
			System.out.println("-------- Adressen neu ---------");
			System.out.println(" Herde 1 " + herde1);
			System.out.println(" Herde 2 " + herde2);
			System.out.println(" Herde 3 " + herde3);
			System.out.println("---------------------------");
	}

}

class Schaf {
	static String name = "Schafe";
	int anzahl ;
	Schaf(int anzahl){
		this.anzahl = anzahl;
	}
}