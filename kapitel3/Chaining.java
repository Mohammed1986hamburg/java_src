package oca.api.string;

public class Chaining {

	public static void main(String[] args) {
		String abc = "";
		
		abc += "Abcdef".concat("ghijk").replace('A', 'a'); 	// Method chaining = Verkettung
															// Abarbeitung von links nach rechts
		
		// abc = "" + "Abcdef".concat("ghijk").replace('A', 'a')
		//		=   "Abcdef"  .concat("ghijk").replace('A', 'a')
		//		=			"Abcdefgihjk"	  .replace('A', 'a')
		//		=						"abcdefghijk"
		// --> abc = "abcdefghijk"
		System.out.println(abc);
		
		// Alternative wäre :
		abc = "";
		
		abc = abc + "Abcdef";
		abc = abc.concat("ghijk");
		abc = abc.replace('A', 'a');
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		abc = abc.replace("ab","  ");
		System.out.println(abc);
		System.out.println();
		abc = abc.trim().substring(0).replace('c',abc.charAt(5));	// Methodenaufruf innerhalb
																	// der Parameterliste werden zuerst aufgerufen
	//  abc = abc.trim().substring(0).replace('c',char c = abc.charAt(5)); // aus dem Ursprungs String
																		   // "__cdefghijk"	
																		   // "012345678910 "
	//		= abc.trim().substring(0).replace('c',        'f' );
		
		System.out.println(abc);
		
		abc = abc.substring(abc.indexOf('f'),abc.lastIndexOf('f'));	// Methodenaufruf innerhalb der Parameterliste
		System.out.println(abc);
		
		abc = "ABCDEFG".concat("hijklmnO".substring(2,6));
		System.out.println(abc);
		
		// Funktioniert nicht
		
		boolean a = abc.substring(7,11).toUpperCase().equals("jklm");	// Zuweisung an eine boolsche Variable , 
																		// String verändert sich NICHT 
		System.out.println(a);
		System.out.println(abc);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
