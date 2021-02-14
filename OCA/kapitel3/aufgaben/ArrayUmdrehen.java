package kapitel3.aufgaben;

import java.util.Arrays;

public class ArrayUmdrehen {

	public static void main(String[] args) {
		int [] feld = new int[10];
		
		for (int i=0; i <feld.length ; i++) {
			double randomDouble = Math.random();
			randomDouble = randomDouble * 10 + 1;
			int randomInt = (int) randomDouble;
			
			feld[i]=randomInt;
			
		}
		
		System.out.println(Arrays.toString(feld));
		
		int [] umdrehenFeld = new int [10];
		
		for (int i 	= 0; i < feld.length/2; i++) {
			umdrehenFeld[i]= feld[feld.length-1-i] ;
			umdrehenFeld[feld.length-1-i] = feld[i]; 
		}
		
		System.out.println(Arrays.toString(umdrehenFeld));

	}

}
