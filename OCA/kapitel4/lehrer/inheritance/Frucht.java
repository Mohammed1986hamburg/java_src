package kapitel4.lehrer.inheritance;

public  abstract class Frucht {

	static String gattung = "Frucht";
	
	private String obstname = "Fr�chte";

	// constructor
	public Frucht( ){
		
		
	}
	
	// getters
	public static 	String getGattung() 	{ return gattung;}
	public 			String getObstname(){ return obstname;}

	// setters
	
	public 			void 	setObstname(String obstname){this.obstname = obstname;}
	
	
	public  void essen() {
		System.out.println("Ich esse " + obstname );
	}
	public static void kaufen() {
		System.out.println("Fr�chte kaufen");
	}
}














