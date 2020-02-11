package kapitel3.aufgaben;

import java.util.Scanner;

public class Passwort {
	
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
	
	public static void main(String[] args) {
		
		Scanner eingabe = new Scanner(System.in); 
		boolean correct = false;
		test:
			while (!correct) {
				System.out.print("Enter your password please:  "); 
				String password = eingabe.next();
				if (passwordLength(password)) {
					continue test;
				}else if (doppeltGross(password)) {
					continue test;
				}else if (doppeltklein(password)) {
					continue test;
				}else {
					correct = !correct;
				}
				System.out.println("Done, Saved.");
			}
		eingabe.close();
	}

}
