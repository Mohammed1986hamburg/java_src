package kapitel3.aufgaben;

import java.util.Arrays;

public class ArrayFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		int [] arr = new int[30];
		arr[0]= 0;
		arr[1]= 1;
		
		for (int i = 2; i < arr.length; i++) {
			
			arr[i]=arr[i-1]+arr[i-2];
			
		}

		System.out.println(Arrays.toString(arr));
	}

}
