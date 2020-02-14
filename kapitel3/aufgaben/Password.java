package kapitel3.aufgaben;

import java.util.Scanner;

public class Password {
	
	public static boolean doppeltGross(String pass) {
		
		test :
		for (char uniChar = '\u0041'; uniChar < '\u005B'; uniChar++) {
			int indexChar = pass.indexOf(uniChar);
			if (indexChar != -1) {
				int indexCharDoppelt = pass.indexOf(uniChar, indexChar + 1);
				if (indexCharDoppelt != -1) {
					System.out.println("Doppel of " + uniChar  ); 
					return true;
					
				}
				
			}else {
				continue test;
			}
		}
	return false;
	}

	public static boolean doppeltklein(String pass) {
		
		test :
		for (char uniChar = '\u0061'; uniChar < '\u007B'; uniChar++) {
			int indexChar = pass.indexOf(uniChar);
			if (indexChar != -1) {
				int indexCharDoppelt = pass.indexOf(uniChar, indexChar + 1);
				if (indexCharDoppelt != -1) {
					System.out.println("Doppel of " + uniChar  ); 
					return true;
					
				}
				
			}else {
				continue test;
			}
		}
	return false;
	}
	
	public static boolean passwordLength(String pass) {
		if (pass.length() < 8) {
			System.out.println("renter your password please, it must min 8 chars");
			return true;
		} else {
			return false;

		}
		
	}
	
	public static boolean findChar(String myChar, String pass) {
		if (pass.contains(myChar)) {
			return true;
			
		} else {
			
			return false;
		}
	}
	
	
	public final static void main(String[] args) {
		
		Scanner eingabe = new Scanner(System.in); 
		boolean correct = false;
		test:
			while (!correct) {
				System.out.print("Enter your password please:  "); 
				String password = eingabe.nextLine();
				if (passwordLength(password)) {
					continue test;
				}else if (doppeltGross(password)) {
					continue test;
				}else if (doppeltklein(password)) {
					continue test;
				}else if (!(findChar("!", password)||findChar("$", password)||findChar("&", password)||findChar("*", password)||findChar("(", password)||findChar(")", password))) {
					System.out.println("Please use in your password: ! $ & * ( ) ");
					continue test;
				}else if (!(findChar("0", password)||findChar("1", password)||findChar("2", password)||findChar("3", password)||findChar("4", password)||findChar("5", password)||findChar("6", password)||findChar("7", password)||findChar("8", password)||findChar("9", password))) {
					System.out.println("Please use in your password: 0-9 numbers ");
					continue test;
				}else {
					correct = !correct;
					System.out.println("Done, Saved.");
				}
				
			}
		
		eingabe.close();
	}

}
