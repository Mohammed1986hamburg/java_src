package oca.methods.b;

import oca.methods.Mensch;
import oca.methods.a.Mitarbeiter;

public class Chef extends Mensch {
	
	public static void main(String[] args) {
		
		Chef ceo = new Chef();
		ceo.setName("harald");
	
		System.out.println(ceo.arbeiten(ceo));
		
		Mensch human = new Mensch();
		
		human.setName("Otto");
		
		human.arbeiten(human);
		
		
	}
		
	
	
	public void entlassen(Mitarbeiter name) {}

}
