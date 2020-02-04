package oca.basis;

public class VariableScope {
	//-- ---------------------------------------------------
	//-- Erreichbarkeit von Variablen
	//-- - statische Variablen und Methoden innerhalb einer Klasse über
	//--   den Namen der variable und / oder methode aus einer STATISCHEN Methode
	//-- - nicht statische Variablen und Methoden innerhalb einer Klasse NIE
	//--   aus statischen Methoden OHNE Objektbezug -- entweder new Konstruktor().variable / methode
	//--   TYP bezeichner = new Konstruktor() ; bezeichner.variable / methode
	//-- - Über Objekte sind statische und nicht statische class member erreichbar
	//-- - Über Klassenname sind NUR statische class member erreichbar
	//-- ---------------------------------------------------
	
	static int var = 5;							// Klassenvariable
	String str = "Wochenende";					// Instanzvariable

	// Klassenmethode --> an die Klasse gebunden
	public static void main(String[] args) {
		Test.test();							// Aufruf einer Klassenmethode -- DOES COMPILE 
//    	instance();								// DOES NOT COMPILE -- weil an das Objekt gebunden
		new VariableScope().instance(); 		// muss über ein Objekt aufgerufen
	}
	
	// InstanzMethode --> an das Objekt gebunden
	public void instance() {		 
		System.out.println(str);				// Ohne objektbezug , da Instanzmethode
	}

}
// zweite Klasse
class Test {

	public static  void  test() {				// Klassengebunden weil statisch Klassenname.methode
		
		System.out.println(VariableScope.var);	// Klassenvariable einer anderen Klasse weil statisch 
												// Klassenname.variablenname
		
		VariableScope obj = new VariableScope();
		obj.str = "Freitag";
		System.out.println(obj.str);
	}
}

// 





