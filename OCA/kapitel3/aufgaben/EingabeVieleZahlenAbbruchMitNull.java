package kapitel3.aufgaben;


import java.util.*;

public class EingabeVieleZahlenAbbruchMitNull {

	public static void main(String[] args) {
		
		Scanner eingabe = new Scanner(System.in);
		int [] arr = new int[100];
		

		String wert;
		int counter = 0;
		int counter2 = 1;
		System.out.println("start");
		do {
			System.out.print("number."+ counter2++ + "  "  );
			wert = eingabe.nextLine();
			arr[counter++]= Integer.parseInt(wert);
		} while (!wert.equals("0"));	
		


		
		System.out.println("done");
		System.out.println(Arrays.toString(arr));
		eingabe.close();

	}

}
