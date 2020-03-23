package kapitel3.aufgaben;

import java.util.Arrays;

public class ArrayKopieren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = new int[] {1,2,3,4,5,6};
		int[] arr2 = new int[6];
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr1[arr1.length-1-i];
		}
		
		System.out.println(arr1);
		System.out.println(Arrays.toString(arr1));
		System.out.println(arr2);
		System.out.println(Arrays.toString(arr2));
		
		arr2[arr2.length] = 1;
		
		

	}

}
