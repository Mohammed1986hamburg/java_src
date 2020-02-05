package kapitel_2.aufgaben;

public class OPAufgaben {
	// Lasst euch die Ergebnisse von a, b und c in der Konsole anzeigen
	
	int getResult(int a ) {
		return a++ * 2;
	}

	public static void main(String[] args) {
		int a =0, b =0, c;
		

		c = a++ + (15 % 2) -a;
		
		a = b = 2;
		c = new OPAufgaben().getResult(a) + 10 * OPAufgaben.add(a, b);
		
		a = 10 ; b = 5;
	
		c = ++b * 2 / 4 - b++ + b;
	
		a = 25 ; b = 6;
		c = OPAufgaben.mod(a, b) - new OPAufgaben().getResult(a);
		
		c = (a = OPAufgaben.add(3, 5)) + 10 - (b = OPAufgaben.mod(9, 4)) * ++b / a++;
	}
	
	static int  add(int a , int b) {
		return a + b;
	}
   static int mod (int a, int b) {
	   return a % ++b;
	   }
}
