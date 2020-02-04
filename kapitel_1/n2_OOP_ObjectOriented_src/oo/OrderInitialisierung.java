package oca.basis;

public class OrderInitialisierung {

	//
	private String name = show(this) ;
	//............................
	
	
	// Konstruktor
	public OrderInitialisierung() {
		
		System.out.println("2 -"+ name);
	}
	//............................
	
	
	
	// Instance Initialiesr Block
	{ System.out.println("1 -"+ name); }
	//............................
	
	 private String name2 = "Fluffy";
	

	
	//
	public static void main(String[] args) {
		
		OrderInitialisierung object = new OrderInitialisierung();
		
		System.out.println("3 -"+ object.name);
	}
	//............................
	
	
	//
	private String show (OrderInitialisierung obj){
	  System.out.println("4 -"+ obj.name);
	  return "mohammed";
	}
	

}
 