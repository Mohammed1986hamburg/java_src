package kapitel3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String a ="mhd";
//		
//		System.out.println(a);
//		
//		 a.concat("44"); // no change  ????
//		
//		System.out.println(a);
//		
//		
//		
//		a=a.concat("33"); //  changed  ????
//		
//		System.out.println(a);
//		
//		
//		
//		a += "33";  // but changed 
//		
//		System.out.println(a);
		
		//....................................................
		
		String [] myArray = new String [10];
		System.out.println(myArray.length);       // no()
		System.out.println(myArray.length);
		
		myArray[0] = "mhd";
		System.out.println(myArray[0].length());    // with()
		
		//...............................................
		
		
		String [] a;					
//		System.out.println("String [] a: " + a);					
		
		String [] b = {"s","f"};					//String  anonymous Array 
		System.out.println("String []b = {\"s\",\"f\"}: " + b);
		
		
		int [] c;					
//		System.out.println("int [] c: " + c);
		
		int [] d = {1,2};					// int anonymous Array 
		System.out.println("int [] d = {1,2}: " + d);

	}

}
