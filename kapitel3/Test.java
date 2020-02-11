package kapitel3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a ="mhd";
		
		System.out.println(a);
		
		 a.concat("44"); // no change  ????
		
		System.out.println(a);
		
		
		
		a=a.concat("33"); //  changed  ????
		
		System.out.println(a);
		
		
		
		a += "33";  // but changed 
		
		System.out.println(a);

	}

}
