package oca.inheritance;


public class Birne extends Kernobst {
	static String gattung = "Birne";
	String obstname = "Birne Helene";
	
	public Birne() {}
		
	public void essen() {
		System.out.println(" Ich esse  " + obstname);
	}

	public void essen(Frucht f) {
		System.out.println(" Ich esse " + f );
	}
	
	 public static  void kaufen() {
		System.out.println(" kaufe :" + gattung);
	}
}
