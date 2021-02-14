package kapitel4.lehrer;

import java.util.Arrays;

public class AufrufPackage {

	public static void main(String[] args) {
		Methoden obj = new Methoden();
		
		obj.ausgabemitParameter("Sein oder nicht Sein");
		
		System.out.println(obj.wechselZeichenkette("bla"));
		
		String neuerText = obj.wechselZeichenkette("..");
		
		System.out.println(neuerText);
		
		int x = 6 ;
		int y = obj.zahlInkrement(x);
		
		System.out.println(x + " " + y);
		
		int [] werte = {1,2,3};
		
		werte = obj.changeArr(werte);
		
		System.out.println(Arrays.toString(werte));
		
		werte = obj.getZahlen();
		werte[0] = 444;
		obj.ausgabeZahlen();
		System.out.println(Arrays.toString(werte));
		
		System.out.println(x = obj.addition(4, 5.0));
		
		

	}

}
