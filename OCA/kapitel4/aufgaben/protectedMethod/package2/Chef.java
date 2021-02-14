package kapitel4.aufgaben.protectedMethod.package2;

import kapitel4.aufgaben.protectedMethod.package1.Mensch;

public class Chef extends Mensch {

	public static void main(String[] args) {
		Chef ceo = new Chef();
		ceo.setName("harald");
	
		System.out.println(ceo.arbriten(ceo));
		
		Mensch human = new Mensch();
		
		human.setName("Otto");
		
		// darf nicht
//		human.arbeiten(human);

	}

}
