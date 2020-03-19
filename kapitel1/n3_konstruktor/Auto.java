package oo;

public class Auto {
	
	private String marke = "Fiat";
	private int km = 150;
	
	// public Auto(){}						// Wenn kein Konstructor selbst geschrieben wurde, 
											// fügt der Compiler genau diesen automatisch ein
											// das ist dann der default constructor
	
	public Auto(){							// No Argument Constructor
	
	}
	
	public Auto (String marke , int km){	// compiler sieht nur Auto(String,int)
		this.marke = marke;
		this.km = km;
	
	}
	
	public Auto (String marke){				// compiler sieht nur Auto(String)
		this.marke = marke;
	}			
	
	public Auto (int km){					// compiler sieht nur Auto(int)
		this.km = km;
	}					

	
	public static void main(String [] args){
		Auto vati 		= new Auto("Ferrari", 0);
		Auto mutti		= new Auto (2000);
		Auto junior 	= new Auto("BMW");
		Auto tochter 	= new Auto();
		
		System.out.println(vati.marke + " " + vati.km + "\t vati");
		System.out.println(mutti.marke + " " + mutti.km + "\t mutti");
		System.out.println(junior.marke + " " + junior.km + "\t junior");
		System.out.println(tochter.marke + " " + tochter.km + "\t tochter");
	
	}



}