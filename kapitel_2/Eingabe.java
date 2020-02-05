import java.util.Scanner;



public class Eingabe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String eingabe;
		
		System.out.println("Gib einen text ein");
		eingabe = sc.nextLine();				// wartet auf eingabe und liest eine ZEICHENKETTE
		//int var =  sc.nextInt();
		//double var = sc.nextDouble();
	
		
		System.out.println(eingabe);
		int zahl = Integer.parseInt(eingabe);		// wandelt in ganze Zahl um
		double z = Double.parseDouble(eingabe);		// wandelt in Kommazahl um
	
		sc.close();
		
	}

}
