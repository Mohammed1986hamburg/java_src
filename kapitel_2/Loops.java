package oca.controlflow;

public class Loops {

	public static void main(String[] args) {
//		forLoop();
//		forEachLoop();
//		nestedLoops();
		labels();
	}

	static void forLoop() {
		// standard for Loop Schreibweise
			for(int i = 0 ; i <5 ; i++) {}
		
//	--  Gültige Schreibweisen   -- //
		
		//1. Endlosschleife
//		for(;;);			// Kürzeste for Schleife --> Endlos und nachstehender SC ist unreachable, dann --> DOES NOT COMPILE
		for(;;) {
			System.out.println("bla"); 
			break;			// Abbruchanweisung welche ausser im switch auch in Schleifen eingesetzt werden kann
		}
		
		//2. Fehlende Bereiche
		// fehlende iteration im Kopf 
		for(int i = 0; i < 5 ; ) {		// iteration kann ÜBERALL vorkommen abhängig vom Vorkommen
										// ändert sich die Anzahl der Schleifendurchläufe
			System.out.println(i);
			i++;					// iteration kann auch andere Werte umfassen z.B i += 2
		}
		
		// fehlende Deklaration im Kopf
		int i;						// Deklaration des Zählers
		
		for (i = 1 ; i++ < 5 ; );	// verändern von i OHNE Code block gültige Schleife
	
		System.out.println(i);		// i ist von aussen erreichbar
		
		// Ohne Initialisierung
		for ( ; ++i > 10 ; );		// i ist in Zeile 33 initialisiert und kann daher genutzt werden
		
		System.out.println(i);
		
		boolean go = true;

		for ( ; go  ;) {
			System.out.println("bin dabei");
			go = !go;
		}
		
	}

	static void forEachLoop() {
		int [] zahlen = {1,2,3,4};
	Sprungpunkt:
		for (int zahl : zahlen) {
			
			if(zahl%2 == 0) {
				System.out.println(zahl);
			}
		}
		
		zahlen = new int []{1,2,1,2,1,2,1,2,1};
		int count = 0;
		
		Label:
			for(int zahl : zahlen) {
				if (zahl == 2)continue Label;
				else count++;
				System.out.println(zahl);
			}
		System.out.println("Anzahl gültig: " + count);
	}

	static void nestedLoops() {
		
		int[] zahlen = new int[] {1,2,3,4,2,3,1,2,3,1};
		int count = 0;
		
		Erste:
		for(int i = 0 ; i < zahlen.length;i++) {
			Zweite:
				for (int j = 0; j < zahlen.length; j++) {
					if(zahlen[j] == 3)
						break Erste;
					System.out.println("Wert :\t" + zahlen[j]);
					
					count++;
					System.out.println("Wert von i: " + i);
				}
		}
		System.out.println("Durchläufe gültig :" + count);
	}

	static void labels() {
		int x = 4;
	
		WhileLoop:
			while (x < 10 ) {
				++x;
				while (x < 8) {
					System.out.println(x++);
				}
				if (x == 8) continue WhileLoop;
				if (x > 5 && x == 9 ) break WhileLoop;
			}
		x = 9;
		
		DoWhileLoop:
			do {
				if(++x != 10) 
					System.out.println(x);
				else 
					continue DoWhileLoop;
				
				System.out.println("Bin noch in der Schleife");
				
				if(x == 18) break;
			}while (x < 20);
	
		
	
	}
}
