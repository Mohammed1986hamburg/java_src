package oca.api.arraylist;

public class WrapperBsp {

	public static void main(String[] args) {
		comparingCachedValues();
		createObjects();
		wrapperObjectsToPrimitives();
	}

	/**
	 * Werte von Wrapper Objekten können den entsprechenden primitiven Datentypen ebenfalls
	 * zugewiesen werden.
	 * Dazu gibt es zwei Varianten:
	 * 		1. Mit Hilfe der valueOf() Methode der entsprechenden Klassen
	 * 			Genau wie beim zuweisen eines Wertes in ein Wrapper Objekt, kann die
	 * 			valueOf() Methode den Wert eines Wrapper Objektes einem primitiven Datentypen zuweisen
	 * 		--------------------------------------------------------------------------------------------  
	 * 		2. Durch unboxing 
	 * 			unboxing funktioniert genau andersherum wie autoboxing. Es entpackt den Wert eines Wrapperobjektes
	 * 			in den entsprechenden primitiven Datentyp
	 * 		--------------------------------------------------------------------------------------------
	 * Bei beiden Versionen ist natürlich immer zu beachten, das der primitive Datentyp dem ein Wert zugewiesen
	 * werden soll, den Wert des Wrapper Objektes auch darstellen kann.
	 */
	
	private static void wrapperObjectsToPrimitives() {
		//-- --------------------------------------------------------------------------------
		//-- 				Nutzen der valueOf() Methode
		//-- --------------------------------------------------------------------------------
		Byte b1 = 2;			Short s1 = 3;			Integer i1 = 4; 	 Long l1 = 5L;	
		Float f1 = 2.5F;		Double d1 = 3.5;		Boolean bo1 = true;	 Character c1 = '@';
		
		byte b 	= Byte.valueOf(b1);			float f 	= Float.valueOf(f1);
		short s = Short.valueOf(s1);		double d 	= Double.valueOf(d1);
		int i 	= Integer.valueOf(i1);		boolean bo 	= Boolean.valueOf(bo1);
		long l 	= Long.valueOf(l1);			char c 		= Character.valueOf(c1);
		
		//-- --------------------------------------------------------------------------------
		//-- 				Nutzen des unboxing
		//-- --------------------------------------------------------------------------------
		
		byte bb 	= b1;			float ff 	= f1;
		short ss 	= s1;			double dd 	= d1;
		int ii 		= i1;			boolean bbo = bo1;
		long ll 	= l1;			char cc 	= c1;
	}
	/**
	 * Es gibt drei Möglichkeiten ein Wrapper Objekt zu erzeugen:
	 * 		1.  über den Konstruktor der Wrapper Klasse
	 * 			Alle Klassen bis auf Character haben 2 Konstruktoren, die den
	 * 			primitiven Datentyp und String übergeben bekommen können.
	 * 			Character kann nur den primitiven Datentyp übergeben bekommen.
	 * 			Float kann zusätzlich noch einen double übergeben bekommen.
	 * 		-------------------------------------------------------------------------------------
	 * 		2.  die valueOf() Methode
	 * 			Jede Klasse hat zwei statische valueOf() Methoden, welche den eigenen primitiven
	 * 			Datentyp und einen String aufnehmen können.
	 * 			Ausser Character, die Klasse hat nur eine statische Methode valueOf() für den
	 * 			eigenen Typ.
	 * 			Float hat auch nur 2 statische Methoden valueOf() --> anders als im Konstruktor,
	 * 			gibt es keine Methode für die Aufnahme eines double.
	 * 		--------------------------------------------------------------------------------------
	 * 			UNTERSCHIED zwischen Konstruktor und valueOf()
	 * 			Ein Konstruktor erstellt IMMER ein neues Objekt, während die valueOf Methode ein
	 * 			ein gecashtes Objekt zurückgeben kann.
	 *  	-------------------------------------------------------------------------------------- 
	 * 		3.  auto-boxing eines primitiven Elements in die passende Wrapper Klasse	
	 * 			Seit Java 5 ermöglicht Java diese Technik, das in eine Wrapper Variable der entsprechende
	 * 			primitive Datentyp direkt zugewiesen werden kann, ohne das ein Konstruktor oder die 
	 * 			statische Methode valueOf() genutzt werden muss.		
	 * */
	private static void createObjects() {
		//-- --------------------------------------------------------------------------------
		//-- 				Erzeugen mit Konstruktor
		//-- --------------------------------------------------------------------------------
		
		// Byte								/*|*/		 // Short
		byte varByte = 2;					/*|*/		short varShort = 3;
		Byte b1 = new Byte(varByte);		/*|*/		Short s1 = new Short(varShort);
		Byte b2 = new Byte((byte) 2);		/*|*/		Short s2 = new Short((short)3);
		Byte b3 = new Byte("2");			/*|*/		Short s3 = new Short("3");
		
		//Integer							/*|*/		//Long
		int varInt = 4;						/*|*/		long varLong = 5;
		Integer i1 = new Integer(varInt);	/*|*/		Long l1 = new Long(varLong);
		Integer i2 = new Integer(4);		/*|*/		Long l2 = new Long(5L);
		Integer i3 = new Integer("4");		/*|*/		Long l3 = new Long ("5");
		
		// Float							/*|*/		//Double
		Float f1 = new Float(2.5F);			/*|*/		Double d1 = new Double(3.5);
		Float f2 = new Float(2.5);			/*|*/		Double d2 = new Double("3.5");
		Float f3 = new Float("2.5");
	
		//Boolean							/*|*/		// Character
		Boolean bo1 = new Boolean(true);	/*|*/		Character c1 = new Character('@');
		Boolean bo2 = new Boolean("true");	/*|*/		Character c2 = new Character('\u0040');
		Boolean bo3 = new Boolean(Boolean.FALSE);
		
		//-- --------------------------------------------------------------------------------
		//-- 				Erzeugen mit valueOf() Methode
		//-- --------------------------------------------------------------------------------
		
		// Byte 										/*|*/	//Short
		Byte bb1 = Byte.valueOf(varByte);				/*|*/	Short ss1 = Short.valueOf(varShort);
		Byte bb2 = Byte.valueOf((byte)2);				/*|*/	Short ss2 = Short.valueOf((short)2);
		Byte bb3 = Byte.valueOf("2");					/*|*/	Short ss3 = Short.valueOf("3");
		
		//Integer										/*|*/	//Long
		Integer ii1 = Integer.valueOf(varInt);			/*|*/	Long ll1 = Long.valueOf(varLong);
		Integer ii2 = Integer.valueOf(4);				/*|*/	Long ll2 = Long.valueOf(5L);
		Integer ii3 = Integer.valueOf("4");				/*|*/	Long ll3 = Long.valueOf("5");
		
		//Float											/*|*/	//Double
		Float ff1 = Float.valueOf(2.5F);				/*|*/	Double dd1 = Double.valueOf(3.5);
		Float ff2 = Float.valueOf("2.5");				/*|*/	Double dd2 = Double.valueOf("3.5");
		
		//Boolean										/*|*/	//Character
		Boolean bbo1 = Boolean.valueOf(false);			/*|*/	Character cc1 = Character.valueOf('@');
		Boolean bbo2 = Boolean.valueOf(Boolean.TRUE);	/*|*/	Character cc2 = Character.valueOf('\u0040');
	
		//-- --------------------------------------------------------------------------------
		//-- 				Erzeugen mit auto-boxing
		//-- --------------------------------------------------------------------------------
		
		Byte bbb1 = 2;			Short sss1 = 3;			Integer iii1 = 4; 	 Long lll1 = 5L;
		
		Float fff1 = 2.5F;		Double ddd1 = 3.5;		Boolean bbbo1 = true;	Character ccc1 = '@';
		
	}
	/**
	 * Wrapper Klassen sind inkonsistent in Bezug auf welche Werte sie im Speicher (cache) halten. 
	 * Referenzieren zwei Wrapper Objekte auf denselben Wert, können Sie mit == true als Ergebnis 
	 * liefern, oder aber nicht.
	 * Garantiert ist das nur im Wertebereich von Byte (-128 bis 127 ) für alle ganzzahligen Datentypen
	 * von Byte bis Integer. 
	 * Auch die Long Wrapper Klasse kann es trotzdem die JavaDoc Beschreibung etwas anderes  sagt.
	 * Bei Vergleich von Objekten aller Wrapper Klassen mit equals() wird der Wert verglichen, und equals 
	 * ergibt bei identischen Werten immer true!
	 * 
			 * bei nachfolgenden Klassen  im Bereich :
			 * 
			 * 		Boolean
			 * 		Byte 
			 * 		Character von \u0000 bis \u007f (7f ist 127 in dezimal )
			 * 		Short und Integer von -128 - 127 
			 * 	
			 * ergibt == immer true! <-- hier werden die Werte gecached
	 * Werte ausserhalb dieser Bereiche können , müssen aber nicht gecached werden. 
	 * */
	
	public static void comparingCachedValues() {
		//-- --------------------------------------------------------------------------------
		//-- 				gecachte Werte über 127
		//-- --------------------------------------------------------------------------------
		
		Integer iOb1 = 256;
		Integer iOb2 = 256;			// referenziert auf denselben gecashten Wert oder nicht --> inkonsistent wegen 
									// Wertebereich über 127
		System.out.println();
		System.out.println("~~~~~~~ mit auto-boxing ~~~~~~~~~~~");
		System.out.println("Wert an iOb1 : " + iOb1 + "\nWert an iOb2 : " + iOb2 + "\n\t\t== --> " + (iOb1 == iOb1));
		System.out.println("Wert an iOb1 : " + iOb1 + "\nWert an iOb2 : " + iOb2 + "\n\t\tequals() --> " + iOb1.equals(iOb2));
	
	
		Integer x = 256;
		Integer y = 256;			// referenziert auf denselben gecashten Wert oder nicht --> inkonsistent wegen 
									// Wertebereich über 127
		System.out.println();
		System.out.println("~~~~~~~ mit auto-boxing ~~~~~~~~~~~");
		System.out.println("Wert an x : " + x + "\nWert an y : " + y + "\n\t\t== --> " + (x == y));
		System.out.println("Wert an x : " + x + "\nWert an y : " + y + "\n\t\tequals() --> " + x.equals(y));

		Integer i1 = new Integer(1000);
		Integer i2 = new Integer(1000);
		System.out.println();
		System.out.println("~~~~~~~ mit new erzeugt ~~~~~~~~~~~");
		System.out.println("Wert an i1 : " + i1 + "\nWert an i2 : " + i2 + "\n\t\t== --> " + (i1 == i2));
		System.out.println("Wert an i1 : " + i1 + "\nWert an i2 : " + i2 + "\n\t\tequals() --> " + i1.equals(i2));
		//-- --------------------------------------------------------------------------------
		//-- 				gecachte Werte innerhalb des Wertebereiches -128 bis 127
		//-- --------------------------------------------------------------------------------
		Long lOb1 = 127L;
		Long lOb2 = 127L;
		System.out.println();
		System.out.println("~~~~~~~ mit auto-boxing ~~~~~~~~~~~");
		System.out.println("Wert an lOb1 : " + lOb1 + "\nWert an lOb2 : " + lOb2 + "\n\t\t== --> " + (lOb1 == lOb1));
		System.out.println("Wert an lOb1 : " + lOb1 + "\nWert an lOb2 : " + lOb2 + "\n\t\tequals() --> " + lOb1.equals(lOb2));
		
		x = 127;
		y = 127;
		System.out.println();
		System.out.println("~~~~~~~ mit auto-boxing ~~~~~~~~~~~");
		System.out.println("Wert an x : " + x + "\nWert an y : " + y + "\n\t\t== --> " + (x == y));
		System.out.println("Wert an x : " + x + "\nWert an y : " + y + "\n\t\tequals() --> " + x.equals(y));
		
		Integer i3 = new Integer(5);
		Integer i4 = new Integer(5);
		System.out.println();
		System.out.println("~~~~~~~ mit new erzeugt ~~~~~~~~~~~");
		System.out.println("Wert an i3 : " + i3 + "\nWert an i4 : " + i4 + "\n\t\t== --> " + (i3 == i4));
		System.out.println("Wert an i3 : " + i3 + "\nWert an i4 : " + i4 + "\n\t\tequals() --> " + i3.equals(i4));
		
		Character c1 = '\u0040';
		Character c2 = '\u0040';
		System.out.println();
		System.out.println("~~~~~~~ mit auto-boxing ~~~~~~~~~~~");
		System.out.println("Wert an c1 : " + c1 + "\nWert an c2 : " + c2 + "\n\t\t== --> " + (c1 == c2));
		System.out.println("Wert an c1 : " + c1 + "\nWert an c2 : " + c2 + "\n\t\tequals() --> " + c1.equals(c2));
	}

}
