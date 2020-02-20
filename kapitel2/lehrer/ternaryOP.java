package oca.controlflow;
import java.util.*;



public class ternaryOP {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner in = new Scanner(System.in);
		
		String name;
		int iValue = rand.nextInt(50);
		int testWert1 ;
		int wert;
		double dValue = rand.nextDouble()+2;
		double testWert2;
		boolean check;
		
		// Test int
		System.out.print("Geben Sie eine ganze Zahl ein:");
		iValue = in.nextInt();
		in.nextLine();
		System.out.println();
		
		System.out.print("Geben Sie eine weitere ganze Zahl ein:");
		testWert1 = in.nextInt();
		in.nextLine();
		
		if (iValue <= testWert1) System.out.println(1);
		else System.out.println(0);
		//ternäres Konstrukt
		System.out.println( iValue <= testWert1 ? 1 : 0);
		
		
		// Test double
		System.out.print("Geben Sie eine Kommazahl ein:");
		dValue = in.nextDouble();
		in.nextLine();
		System.out.println();
		
		System.out.print("Geben Sie eine weitere Kommazahl ein:");
		testWert2 = in.nextDouble();
		in.nextLine();
		
		if (dValue <= testWert2) System.out.println(1);
		else System.out.println(0);
	
		// Mit ternärem Konstrukt
		System.out.println( dValue <= testWert2 ? 1 : 0);
		
		// Test String
		System.out.print("Geben Sie einen Namen ein:");
		name = in.nextLine();
		if (name.equals("alex"))System.out.println("wahr");
		else System.out.println("falsch");
	
		// Mit ternärem Konstrukt
		System.out.println(name.equalsIgnoreCase("alex")? "wahr" : "falsch");
	
		// Test boolean
		System.out.print("Geben Sie wahr oder falsch ein:");
		name = in.nextLine();
		if (name.equalsIgnoreCase("wahr")) {
			check = true;
			System.out.println(check);
		}
		else if(name.equalsIgnoreCase("falsch")) {
			check = false;
			System.out.println(check);
		}else System.out.println("falsche Eingabe");
		
		// Mit ternärem Konstrukt
		System.out.println(name.equalsIgnoreCase("wahr")? true : name.equalsIgnoreCase("falsch")? false : "falsche Eingabe");
		
		// Zufallswerte
		iValue = rand.nextInt(50);
		wert = (iValue > 0 && iValue <= 24) ? iValue : iValue > 24 && iValue <= 49 ?  iValue: 0;
		System.out.println(wert);
		dValue = rand.nextDouble()+2;
		testWert2 = (dValue > 0.1 && dValue <= 1.0) ? dValue : dValue > 1.0 && dValue <= 2.1 ?  dValue : 0.0;
		System.out.println(testWert2 + " " + dValue);

	}

}
