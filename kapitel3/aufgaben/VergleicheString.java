package kapitel3.aufgaben;

public class VergleicheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Java training";
		String s2 = "Java";
		String s3 = s1 + "training";
		String s4 = new String(s2);
		String s5 = " Java training".trim();
		String s6 = s1;
		String s7 = "Java";
		s1 = "null";
		s2 = null;
		s3 = null;
		
		System.out.println(s1 == s2);    // s1 ist literal in string pool. s2 ist null object
		
		System.out.println(s1 == s3);
		
		System.out.println(s1 == s5);
		
		

	}

}
