package oca.uebungInterface;

public abstract class Literatur implements Lesen,Schreiben {
	private String kategorie;
	private String titel;
	private double preis;
	
	// constructor
	
	public Literatur (String kategorie, String titel, double preis) {
		this.kategorie = kategorie;
		this.titel = titel;
		this.preis = preis;
	}
	
	// getter
	public String getKategorie() { 	return kategorie;}
	public String getTitel() 	 { 	return titel;	}
	public double getPreis() 	 {	return preis;	}
	
	// setter
	public void setPreis(double preis) { this.preis = preis;}
	
	public abstract void kaufen();
	
	@Override										// Erste Klasse welche die 
	public void beenden() {							// identischen default Methoden der Interfaces überschreibt
	
		System.out.println("Literatur ist gelesen "); 	
	}
	

}
