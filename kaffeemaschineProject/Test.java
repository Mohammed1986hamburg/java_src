package kaffeemaschineProject;

import java.util.Arrays;

public class Test {
	
	public int a ;
	static public int c;
	public void setA(int a) {
		this.a = a;
	}
	
	public static void setC(int c) {
		Test.c = c;
	}
	
	

	
	 Test() {
		System.out.println(this.a);
	}
	
	public String toString() {
		
		return "ok "+ a;
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		Test[] arr = new Test[] {new Test(),new Test()};
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		
	    
	    
	    
		

	}

}
