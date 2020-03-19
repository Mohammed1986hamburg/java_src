


public class Shop {

	public static void main(String[] args) {
		Kunde k = new Kunde();

		Kunde k1 = new Kunde();
		Shop huddel = new Shop();
		
		k.setName("Heidi");
		k.setAlter(25);
		
		k1.setName("Lorchen");
		k1.setAlter(15);
		
		huddel.vollJaehrig(k);
		
		
	}

	public boolean vollJaehrig(Kunde kunde) {
		return kunde.getAlter()>= 18;
	}
}
