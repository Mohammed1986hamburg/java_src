package kapitel4.lehrer;

import java.util.Arrays;

public class Methoden {

	private int [] zahlen = {4,5,6};
	
	public int[] getZahlen() {
		int[] werte = new int [zahlen.length];
		werte = Arrays.copyOfRange(zahlen, 0, zahlen.length);
		return werte ;
	}
	
	public void ausgabemitParameter(String text) {
		System.out.println(text);
		return;
	}
	
	public String wechselZeichenkette(String bla) {
		
		return bla += " bla";
	}

	int zahlInkrement (int zahl) {
		
		return zahl + 5 ;
	}
	
	int [] changeArr (int [] arr) {
		arr[0] = 100;
		return arr;
	}
	
	void ausgabeZahlen() {
		System.out.println(Arrays.toString(zahlen));
	}

	 public int addition(int wert, double wert2) {
		
		return (int)(wert + wert2) ;
	}
}
