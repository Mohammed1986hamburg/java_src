package oca.interfaces;

    abstract interface  Check {

	// --                        Variablen
	// --  Statische Variablen die public und final automatisch gesetzt werden , wenn nicht selber geschrieben
	// --  Keine non static Variablen ( Instanzvariablen) --> Klar, da keine Interfaces Instanziiert werden können
	public final static  String    CHECK = "Checking..";  // IMMER public static final --> auch wenn es NICHT da steht !!
	static final 		 int 	   DAUER = 50;
	final 				 boolean   FERTIG = true;
						 long      MILLISEKUNDEN = 1235487L;	// !!! Achtung ausserhalb eines Interfaces wäre das 
																// package Private access einer non static Variablen !!!!!!
	
	// ----   Methoden in Interfaces
	// -- > abstrakte Methoden
	// --  -- > müssen spätestens in der ersten Konkreten Klasse überschrieben werden 
	// --  -- > Signatur darf nicht verändert werden, ausser der access Modifier (z.B. public) ist weniger 
	// --  -- > einschränkend als in der abstrakten Methode
	// --  -- > müssen nicht abstract gekennzeichnet werden, (Achtung !! in einer Abstrakten Klasse MUSS abstract geschrieben werden)
	// -- > statische Methoden
	// --  -- > sind wie bereits bekannt an die Klasse gebunden und können NICHT vererbt werden
	// --  -- > sind ebenfalls public , keyword public ist auch hier optional
	// --  -- > static Keyword muss verwendet
	// -- > default Methoden
	// --  -- > sind neu seit Java 8 ergänzen die bisherigen abstrakten methoden
	// --  -- > müssen nicht überschrieben werden wie abstrakte , da sie einen Body haben
	// --  -- > werden vererbt an die Klasse und somit an die Instanz der Klasse
	// --  -- > Bei zwei Interfaces die von einer Klasse / Interface eingebunden werden MUSS die 
	// --  -- > default Methode mit GLEICHER Signatur überschrieben werden
	// --  -- > MUSS keyword default zu beginn stehen haben
	// --  -- > ist immer public
	// --  -- > NIE static oder abstract
	
	// abstract method -- richtige Schreibweise !!
							void 		check();
	abstract 				String		ergebnisCheck();
	abstract public  		boolean 	checked (Check checkedObjekt) throws Exception;
	public 					int			zaehlen();
/*	
	// falsche Schreibweisen :
	private 			void 	fehlerhaft(String fehler); 	// NICHT private
	protected abstract 	void 	vererbbar(int anzahl);		// Nicht protected
	final abstract 		void 	unveraenderlich();			// Darf nicht final sein
	public final 		int		festerWert();				// Darf nicht final sein
						void 	schmecken(String material) {};// KEINEN methodenkörper
*/
	// default methods 
	
	default 				String  	checkin(Check c) {return "abgegeben";}
	public default     		void 		checkout (Check c) {System.out.println("ausgecheckt");} 
/*
	// falsche Schreibweisen:
							String 	check2() {System.out.println("");}	// Ohne default geht der Compiler von
																		// abstract aus und da darf KEIN 
																		// Methodenkörper existieren
	 default static 		int 	zaehlen(int anzahl) {return anzahl;}// darf nicht static sein
	 private default		void	test() {}							// darf nicht private oder protected sein
	 public final 			void	ausgabe() {}						// darf nicht final sein
	 public					boolean check1(boolean wert) {}				// default muss immer geschrieben werden
*/
	 
	// static methods
	
	static				void 			checkValue(int wert) {System.out.println("Wert " + wert + " ist in Prüfung");}
	public static 		int 			valueToBeChecked(Check c) { return c.DAUER;}
	
	// falsche Schreibweisen :
/*
						void 			testmethode() {}				// static fehlt
	static private 		void			geheim() {}						// darf nicht private oder protected sein
	static public final void			ultrageheim()					// darf nicht final sein
*/
}
   interface bla{
	    int x = 3 ;
   }
   
