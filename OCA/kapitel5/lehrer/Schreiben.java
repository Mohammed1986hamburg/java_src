package oca.interfaces;

// -- 					Besonderheit bei multiple inheritance von methoden und variablen
// -----------------------------------------------------------------------------------------
// -- > Interface Klassen, die weitere Interface Klassen einbinden (extends), und in diesen 
// --   abstrakte oder default Methoden mit identischer Signatur sind müssen in dem Einbindenden
// --   Interface überschrieben werden
// -- > Existieren statische Methoden mit selber Signatur wie eine abstrakte oder default Methode
// --   muss nicht überschrieben werden
// -- > In dem Interface welches die anderen einbindet, kann bei abstract / default Signatur Gleichheit
// --   entweder eine abstrakte oder default methode zum überschreiben genutzt werden.
// -- > Auch bei zwei übereinstimmenden Signaturen von default Methoden reicht eine abstrakte Methode
// --   zum überschreiben in einem Interface aus.
// -- > Interface Klassen mit identischen Variablen Bezeichnern müssen in dem spezialisiertem Interface 
// --   vor den Bezeichner geschrieben werden. Bsp: interfaceName.Bezeichner


interface Schreiben {short minuten = 10; 	 default void ausgabe() {System.out.println("ich lese..");} }

interface Lesen		{int  minuten = 150;  default void ausgabe() {System.out.println("ich lese..");} }

interface Lernen 	{byte minuten = 5;	 static  void ausgabe() {System.out.println("Kann ich ..");}}


interface LesenSchreiben extends  Schreiben, Lernen, Lesen{
	
//	void ausgabe();
	
	default void ausgabe () {
		System.out.println("Ich lese .." + Lesen.minuten + " ich schreibe.." + Schreiben.minuten );
	}
}

interface Malen extends LesenSchreiben{
	// Kein Zwang mehr die Methoden zu überschreiben
	default void aus() {
		System.out.println(Schreiben.minuten + " " + Lesen.minuten + " " + Lernen.minuten);
	}
}

