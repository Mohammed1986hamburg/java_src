package uebungen;

public class Auto {
	
	public String marke = "keine Marke noch";
	public String farbe = "keine Frabe noch";
	public static int km = 0;
	
	public Auto() {
		this.marke = "Fiat";
		this.farbe = "rote";
		this.km = 3000;
	}
	
	
	public static void main(String [] args){
		// Auto car1 = new Auto("BMW","Gold",2000);
		Auto car1 = new Auto();
		Auto car2 = new Auto();
		car1.km = 1000;
		car2.km = 2000;
		
		System.out.println("car1 info... "+"die Marke: "+ car1.marke	+" ,"+"die Frabe:"+ car1.farbe +" ,"+"Das Auto wurde gefahren:"+ car1.km);
		System.out.println("car1 info... "+"die Marke: "+ car2.marke	+" ,"+"die Frabe:"+ car2.farbe +" ,"+"Das Auto wurde gefahren:"+ car2.km);
		
	}
}