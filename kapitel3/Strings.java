package oca.api.string;

public  final class Strings {
	
	

	public static void main(java.lang.String[] args) {
		boolean  check;
		String text = "Java";
		String s1 = "Java";
		
		String text2 = text + " OCA"; 	// Concatenation - 
										// erst wird text.toString() von java.lang.Object verwendet
										// -->   text2 = "Java" + " OCA"
										// verbinden der beiden Zeichenketten 
										// -->   text2 = "Java OCA";
		String s = new String("java");
		
		
		check = text == s;				// Vergleicht die Referenzadressen der Variablen
	
		System.out.println(check);
		System.out.println(s.hashCode());
		System.out.println(text.hashCode());
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		check = text.equals(s);				// Vergleich die Literale auf Gleichheit
		System.out.println(check);
		
		check = text.equalsIgnoreCase(s);	// Vergleicht die Lietrale auf Gleichheit ABER ungeachtet der Schreibweise
		System.out.println(check);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		check = text == s1;
		System.out.println(check);
		System.out.println(s1.hashCode());
		System.out.println(text.hashCode());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		text = text2;						// Beide haben jetzt das Literal "Java OCA"
		
		check = text == text2;
		String a = "text == text --> " + "Java OCA" ;
		
		System.out.println("text == text --> " + text == text2); // Ausgabe : false	a entspricht dem inhalt des linken operanden
		
		System.out.println("text == text --> " + (text == text2));// Ausgabe text == text --> true
		
		text = "Java OCA";
		check = text == text2;
		System.out.println(check);
		check = text.equals(text2);
		System.out.println(check);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(1 + 2 );
		
		
		
		
	}

}
