package oca.operators;

public class LogicalOP {

	public static void main(String[] args) {
		boolean a = true , b = false; 
		
		//-- -------------------------------------------------
		//-- -Logical Inclusive AND & und short circuit AND &&
		//-- -------------------------------------------------
		System.out.println(a & b); 		// false
		System.out.println(a && b ); 	// false
		
		boolean c =  					// conditional / short circuit operator
				 	!a					// wird der 2te Ausdruck NUR geprüft, wenn
				 		&&
				 			b;			// der erste möglicherweise ein true für den gesamten Ausdruck ergibt
		
		
		c =								// Logical AND werden IMMER beide Seiten geprüft
				!a
					&
						b;
		
		int x;
		System.out.println("SHORT CIRCUIT AND");
		if( (x=1)< 0 && ++x <= 4) {		// In der Expression wird hier nur LINKS geprüft und x NICHT verändert
										// wegen dem && und da der linke Ausdruck NICHT wahr ist
			System.out.println(x);
		}
		System.out.println(x);
		
		System.out.println("LOGICAL  AND");
		if( (x=1)< 0 & ++x <= 4) {		// In der Expression wird hier sowohl der linke als auch der rechte Ausdruck 
										// geprüft wegen dem & 
			System.out.println(x);
		}
		System.out.println(x);
		
		//-- -----------------------------------------------
		//-- -Logical Inclusive OR | und short circuit OR ||
		//-- -----------------------------------------------
		
		System.out.println( a | b ); 	// true
		System.out.println( a || b); 	// true
		System.out.println("SHORT CIRCUIT  OR");
	
		// 1.Ausdruck == true 2.Ausdruck == true
		if( (x=1)> 0 || ++x <= 4) {					// Linker Ausdruck ist wahr --> rechte Seite wird NICHT geprüft
			System.out.println(x);
			}
		System.out.println(x);
		
		// 1.Ausdruck == false 2.Ausdruck == true	// Linker Ausdruck ist fals --> rechte Seit WIRD geprüft
		if( (x=1)< 0 || ++x <= 4) {
			System.out.println(x);
			}
		System.out.println(x);
	
		System.out.println("INCLUSIVE OR");
		// 1.Ausdruck == true 2.Ausdruck == true	// Linker Ausdruck ist wahr TROTZDEM wird auch rechts geprüft
		if( (x=1)> 0 | ++x <= 4) {
			System.out.println(x);
			}
		System.out.println(x);
	
		// 1.Ausdruck == false 2.Ausdruck == false
		if( (x=1)< 0 | ++x >= 4) {					// Linker Ausdruck ist falsch TROTZDEM wird auch rechts geprüft
			System.out.println(x);
			}
		System.out.println(x);
		
		//-- -----------------------------------------------
		//-- -Logical Exclusive OR ^ 
		//-- -----------------------------------------------
		// Exclusive OR DARF NUR EIN Ausdruck insgesamt true ergeben
		System.out.println("EXCLUSIVE OR");
		if( (x=1)< 0 ^ ++x >= 4)System.out.println("Bin drin");
		System.out.println(x);
		
		if( (x=1)> 0 ^ ++x <= 4)System.out.println("Bin drin");
		System.out.println(x);
	
		if( (x=1)> 0 ^ ++x >= 4)System.out.println("Bin drin");
		System.out.println(x);
	}

}
