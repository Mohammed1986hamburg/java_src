package kapitel4.aufgaben.varargs;

public class TestVarargs {

	public static void main(String[] args) {
		int [] a = null;
		System.out.println("varargs: " + varargs());  // done
		System.out.println("normalArr: " + normalArr(a)); // done
		
		

	}
	
	public static int varargs(int... arr) {
		
		return arr.length;
		
	}
	public static int normalArr(int[] arr) {
		
		return arr.length;
		
	}

}
