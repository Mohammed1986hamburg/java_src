

import java.util.ArrayList;

public class Class9D  {
	
	public static void main (String[] args) {
		
		A a = null;				// reine Referenzvariable verweist auf kein Objekt
		
		A aa = new A();			// Referenzvariable die auf ein Objekt verweist
		
		aa.nichtStatisch();
		aa.statisch();
		
		a.statisch();

	
			
			
			
			
	
	}

}

class A {
	public static void statisch() {
		System.out.println("bla");
	}
	public void nichtStatisch() {
		System.out.println("blabla");
	}
}
