package oca.api.string;

public class MethodenSB {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Ich brauch Feierabend");//20 Zeichen
		//-- ----------------------------------------
		//-- Bekannte Methoden aus der String Klasse
		//-- ----------------------------------------
		
		// charAt()
		System.out.println(sb.charAt(15));
		
		// indexOf()
		System.out.println(sb.indexOf("r"));
		System.out.println(sb.lastIndexOf("r"));
		System.out.println(sb.indexOf("e",4));
		System.out.println(sb.lastIndexOf("e",4));
		
		// length()
		
		
		// substring()
	}

}
