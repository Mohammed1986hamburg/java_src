package kaffeemaschineProject;

import java.util.Scanner;

public class KaffeeMaschine {

	public static void main(String[] args) {
		
		Scanner eingabe = new Scanner(System.in);
		String wert;
		
		do {
			System.out.println("  Kaffee schwarz. 1\n "+" Kaffee Zucker. 2\n "+" Kaffee Milch. 3\n "+" Kaffee Milch und Zucker. 4\n "+" Kakao. 5\n "+" Nichts. 0\n ");
			System.out.print("Ich möchte: ");
			wert = eingabe.next();
			
			switch (wert) {
			case "1":
				
				System.out.println(wert +" Bitte warten");
				break;
			case "2":
				
				System.out.println(wert +" Bitte warten");
				break;
			case "3":
				
				System.out.println(wert +" Bitte warten");
				break;
			case "4":
				
				System.out.println(wert +" Bitte warten");
				break;
			case "5":
				
				System.out.println(wert +" Bitte warten");
				break;
			case "0":
				System.out.println("tschüss");
				break;				

			default:
				System.out.println("Bitte wälen von 0 bis 5");
			}
			
			
			System.out.println(" --------------");
		} while (!wert.equals("0"));
		eingabe.close();
	}

}
