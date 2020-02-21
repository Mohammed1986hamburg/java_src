package kapitel3;

import java.util.Arrays;

public class Varargs {

	public static void main(String...args) {
//		int [] arr = {9,8,7};
//		System.out.println(arr);
//		varargs(arr);
		
//		int [] arr2 = {9,8,7};
//		System.out.println(arr2);
//		varargs(arr2);
		
//		varargs(new int[]{4,5,6});
//		
//		varargs(15,2,38);
//		
//		nonValidVarargsParameter(1, 2,3,4);
		
//		validVarargsParameter(1, 2,3,4,55,42,97,106);
//		twoVarargsNotValid("01", "23",55,33);
		    Integer [] a ;
		    int [][] b = new int[5][];
		    int [][][] c = new int[5][][];
		    System.out.println(a);
		

	}
	
	public static void varargs(int... zahlen) {				// Varargs alleine -- Check
////		System.out.println(Arrays.toString(zahlen));
//	    System.out.println(zahlen);
//		Arrays.sort(zahlen);
//		System.out.println(Arrays.binarySearch(zahlen,7));
//		System.out.println(Arrays.toString(zahlen));
	   
	    
	    
	}
	
//	public static void  nonValidVarargsParameter(int ... werte, int zahl ) {}	// DOES NOT COMPILE
																				// Varargs an erster Stelle steht
	
//	public static void validVarargsParameter(int zahl, int zahl2,int...werte) {} // Mehrere Parameter erlaubt wenn 
																				 // Varargs an LETZTER Stelle steht
	
//	public static void twoVarargsNotValid(String...strings , int...is ) {}		// 2 Varargs Parameter NICHT erlaubt - DOES NOT COMPILE

}
