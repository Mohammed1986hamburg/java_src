package oca.inheritance;

public class Kernobst extends Frucht {
	static String gattung = "Kernobst";
	String obstname = "Kernobst";
	
	public Kernobst( ) {
		
		
	}
	public void essen() {
		System.out.println(" Ich esse  " + obstname);
	}

	public void essen(Frucht f) {
		System.out.println(" Ich esse " + f );
	}
	
	public static void kaufen() {
		System.out.println(" kaufe :" + gattung);
	}
}
