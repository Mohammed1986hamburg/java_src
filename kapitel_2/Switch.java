package oca.controlflow;

public class Switch {

	public static void main(String[] args) {
		int varToTest = 5;
		String ampel = "blau";
		final String farbe = "pink";
		 final String rot = "rot", gelb = "gelb" , gruen = "grün";
		
		switch(varToTest) {

		
		case 1 :
				System.out.println("a");
				break;
				
		default :
			System.out.println("c");
			break;
			
		case 2 :
				System.out.println("b");
//		default :							// NUR EINE default Anweisung im switch --> DOES NOT COMPILE
//			System.out.println("c");		
//			break;	
		}
		
		switch (ampel = "pink") {
		
		case rot : 
					System.out.println(1);	
					//gelb = "lila";		// Konstante gelb kann der Wert NICHT geändert werden
		case gelb:
					System.out.println(2);	
		case "grün":
					System.out.println(3);	
		case farbe : 
				System.out.println(4);
		default    :
					System.out.println("crash");
		}
	}

}
