package oca.interfaces;

 public abstract interface    Laufen {
	 
	 int KM = 50;		// public static final steht IMMER bei der interface Variable dran
	 
	 public abstract  void entfernung(Laufen objekt);
	 default void zeitAusgabe() { System.out.println("Du bist 10 min gelaufen");};
}
 interface Leistung{
	 default void zeitAusgabe() { System.out.println("Du konntest deine Zeit verbessern");}
 }

abstract  class Haustier implements Laufen,Leistung{
	public void zeitAusgabe() {System.out.println("Meine Tiere brauchen Ruhe");}
	public String zeitAusgabe(int zeit) {return "Pause";}
}
 
 class Katze extends Haustier{

	@Override
	public void entfernung(Laufen objekt) {
		System.out.println("Die Katze schleicht");
		
	}}
 
 class Hund extends Haustier {

	@Override
	public void entfernung(Laufen objekt) {
		System.out.println("Der Hund lauft");		
	}
	
	public void bellen(Laufen objekt) {
		System.out.println("Hund bellt");
	}
	 
 }
 
 class Mensch implements Laufen{

	@Override
	public void entfernung(Laufen objekt) {
		System.out.println("Der Mensch kann auch laufen..");
		
	}
	 
 }
 
