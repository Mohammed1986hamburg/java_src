package oca.methods;

public class Overloading {

	public static void main(String[] args) {
		int x = 5, y = 3;
		double xd = 2.5 , yd = 1.5;
		Integer xI = Integer.valueOf(25), yI = Integer.valueOf(10); 
		
		Overloading rechner = new Overloading();

		System.out.println(rechner.addieren(x,y));
//		System.out.println(rechner.addieren(x,xd));
//		System.out.println(rechner.addieren(xd,yd));
		System.out.println(rechner.addieren(xI,yI));
	}

	// Überladene Methode addieren
	// Methode hat denselben Bezeichner aber UNTERSCHIEDLICHE PARAMETERLISTE
	// Methode hat denselben Bezeichner und KANN unterschiedliche RETURNTYPs haben
	
//	private int addieren(int wert1 , int wert2) {
//		return wert1 + wert2;
//	}
//	
//	private int addieren (Integer wert1 , Integer wert2) {
//		return wert1 + wert2;
//	}
//	 int addieren (double wert1, double wert2) {
//		return (int)(wert1 + wert2);
//	}
//	
//	protected double addieren (int wert1 , double wert2) {
//		return wert1 + wert2;
//	}
//	public Integer addieren( double wert1 , int wert2) {
//		return (int)(wert1 + wert2);
//	}
//	
	private Double addieren(Double... werte) {
		double sum = 0;
		for(double wert : werte) 
			sum += wert;
		return sum;
	}
	
	private int addieren(Integer... werte) {
		int sum = 0;
		for(int wert : werte)
			sum += wert;
		return sum;
	}
	
}
