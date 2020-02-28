package oca.inheritance;

public class Person {

	public static void main(String[] args) {
		Person paul = new Person();
		
		Frucht gala = new Apfel();
		
		
//		paul.hatHunger(apfel);
//		paul.einkaufen(gala);
	
		((Apfel)gala).kaufen();
		gala.essen();


	}
	
	public void hatHunger(Frucht frucht) {
		frucht.essen();
		
		}
	
	
	public static void einkaufen(Frucht frucht) {
		frucht.kaufen();
		((Kernobst)frucht).kaufen();
		((Apfel)frucht).kaufen();
	}

	
}
