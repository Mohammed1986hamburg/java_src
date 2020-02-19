package kapitel3.aufgaben;


import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAnWelcherStelleKommtZahlVor {

	public static void main(String[] args) {
		
		
		int suche=23, anzahl=0;
		int[] arr = {10,25,30,50,23,23,7,89,22,100,23};
		System.out.println(Arrays.toString(arr));
		
		ArrayList<Integer> result =  kommtZahlVor(arr, suche);
		System.out.println(result);
		System.out.println(anzahl= result.size());	

	}
	
	public static ArrayList<Integer> sucheArr = new ArrayList<Integer>();    

	
	public static ArrayList<Integer> kommtZahlVor(int[] arr , int sucheNum) {
		
		int index = 0;
		for (int i : arr) {
			if (i==sucheNum)sucheArr.add(index + 1);
			index++;
		}
		return sucheArr;		
		
	}

}
