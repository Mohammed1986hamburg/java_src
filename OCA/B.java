
public class B {
	
	static int fB=56;
	
	B() {System.out.println("SuperClass constructor");}
	
	static {System.out.println("SuperClass static");}
	
	       {System.out.println("SuperClass instance");}
	       
//	private void hiCall() {System.out.println("SuperClass hiCall");} // hiden 
	       
	      void hiCall() {System.out.println("SuperClass hiCall");} // overrided in subclass

}
