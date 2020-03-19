package oca.basis;

public class ObjectInitializer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ClassName().method();       // yes        //-- - statische Variablen und Methoden innerhalb einer Klasse über
	                                            	//--   den Namen der variable und / oder methode aus einer STATISCHEN Methode	
		
		
		//new ClassName().method();    //yes 	//-- - nicht statische Variablen und Methoden innerhalb einer Klasse NIE
											 	//--   aus statischen Methoden OHNE Objektbezug -- entweder new Konstruktor().variable / methode
												//--   TYP bezeichner = new Konstruktor() ; bezeichner.variable / methode 
	
		
		
		//ClassName ojbect;         //yes	   but when you call the this object, you will get this Exception:  The local variable  may not have been initialized."\
											//the solultion with "ReferenzVariable mit null initialisieren"
		
		
		//ClassName ojbect = null ;    // yes,     //ReferenzVariable mit null initialisieren
		
		
	
		
		//new ClassName ojbject;      //no		
		
		

		
		-
	}

}
