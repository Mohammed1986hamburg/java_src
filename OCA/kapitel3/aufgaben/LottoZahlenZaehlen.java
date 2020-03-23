package kapitel3.aufgaben;

import java.util.Arrays;

public class LottoZahlenZaehlen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] feld = new int[20];
		int [] anzahl = new int[21];
		
		for (int i=0; i <feld.length ; i++) {
			double randomDouble = Math.random();
			randomDouble = randomDouble * 20 + 1;
			int randomInt = (int) randomDouble;
			
			feld[i]=randomInt;
			
		}
		
		System.out.println(Arrays.toString(feld));
		
		for (int number : feld) {
				anzahl[number]++;		
		}
		
		System.out.println(Arrays.toString(anzahl));

	}

}
