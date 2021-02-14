
public class Test extends B  {	
	
	static int fTest=5;
	
	Test(){System.out.println("SubClass constructor");}
	
	static {System.out.println("SubClass static");}
	
	       {System.out.println("SubClass instance");}
	
	void hiCall() {System.out.println("SubClass hiCall");}
	
		 
public static void main(String[] args)  {
	
//	System.out.println("after load class");
//	System.out.println(Test.fB);
	
//	new B();
	
//	new Test();
	
	B obj = new Test();
	obj.hiCall();
	
	
	
	
	

		
}
}

