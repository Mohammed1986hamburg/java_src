import org.graalvm.compiler.nodes.NodeView.Default;

public class Test extends C implements InterfcaeB   {	
	
		 



public static void main(String[] args) throws Exception{
   int i = 1, j = 10;
   do {
      if (i++ > --j) continue;
   } while (i < 5);
   System.out.println("i=" + i + " j=" + j);

//		C face = new Test();
//		
//		((Test)face).callme();
//		System.out.println(((Test)face).numTest);
//		
//		Test h = (Test)face;
//		
//		 
//		
//			
//		}
//	
//	
//	public void callme() {
//		System.out.println("I am from sub");
	}
//	
}


interface InterfcaeB {
	int num1 = 5;
	public default void callme() {
		System.out.println("I am from Interface");
	};
}

class C {
	static int num2 = 5;
	
	public void callme() {
		System.out.println("I am from super");
	}
}

abstract class Abs {
	static int num3 = 5;
}
