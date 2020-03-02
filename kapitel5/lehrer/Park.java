package oca.interfaces;

class Park{
	 public static void main(String[] args) {
//		Typ 	Bezeichner	verweist auf 	Objekt
		Hund	fifi 			= 			new Hund();
		Laufen 	rex 			= 			new Hund();
		
		((Laufen)fifi).entfernung(fifi);
		((Hund)(Laufen)fifi).bellen(fifi);
		
		Laufen mize = new Katze();
		
		rex.entfernung(rex);
		((Hund)rex).bellen(rex);
		
		Laufen paul = new Mensch();
		Laufen hans = new Hund();
		((Mensch)hans).entfernung(hans);
		
		paul.entfernung(paul);
	}
}
