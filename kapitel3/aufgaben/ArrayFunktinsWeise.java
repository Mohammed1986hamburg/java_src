package kapitel3.aufgaben;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayFunktinsWeise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] wurf = new int[6];
		
		wurf[0]= 1;
		wurf[1]= 7;
		wurf[2]= 9;
		wurf[3]= 4;
		wurf[4]= 2;
		wurf[5]= 8;
		
		System.out.println(Arrays.toString(wurf));
		
		int[] wurf2 = {1,8,5,2,5,7,4};
		System.out.println(Arrays.toString(wurf2));
		
		int sum = 0;
		String look ="";
		for (int wert : wurf2) {
			sum += wert;
			
		    look += wert+" + ";      // " + "  ist 3 chars
			
		}
		
		look = look.substring(0, look.length()-3);     //-3
		System.out.println(look + " = " + sum );
		

	}
	
	

}
