package kapitel5.lehrer;

 public abstract interface    Laufen {
	 
	 int KM = 50;		// public static final steht IMMER bei der interface Variable dran
	 
	 public abstract  void entfernung(Laufen objekt);
}
 interface Liegen{}

 class Haustier{}
 
 class Katze extends Haustier{}
 
 class Hund extends Haustier implements Laufen{

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
 
