package kapitel4.lehrer.inheritance;

public class Apfel extends Kernobst {
	static String gattung = "Apfel";
	String obstname = "Gala Apfel";
	public Apfel() {}
		
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
