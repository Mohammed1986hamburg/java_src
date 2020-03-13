package oca.exceptions;

import java.io.IOException;
import java.util.Scanner;

public class Handle {
	int zahl;
	static Handle h;
	
/**
 * 	Konstruktor der Klasse 
 * <br><hr>
 * <br> es darf keine 0 uebergeben werden
 * @param zahl
 * @throws IllegalArgumentException
 */
	Handle(int zahl) throws IllegalArgumentException, IOException{
		
		if(zahl == 0) 
			throw new IllegalArgumentException("Zahl darf nicht 0 sein");
		
		else 
			this.zahl = zahl;
	}
	static {
		 h = null;
	}

	public static void main(String[] args) throws IOException, Exception{
			Scanner sc = new Scanner(System.in);	
		try {
			int zahl = sc.nextInt();
			Handle h = new Handle(zahl);
//			System.out.println(Handle.h.equals(h));
		}
//		catch(Exception hund) { }				// darf nicht vor den untergeordneten Subklassen stehen
		
		catch(NullPointerException np) {		// von der Rangfolge gleichwertige Exceptions
			System.out.println(np.getMessage());
		}
		catch(IOException ioex) {}				// Oder Exceptions von einem anderen TYP ausserhalb der Reihenfolge
		catch(IllegalArgumentException poops) {	// dürfen in beliebiger Reihenfolge in den catch Blöcken stehen
			System.out.println(poops.getMessage());	
		}
	    catch (RuntimeException rex) {			// Übergeordnete Superklassen MÜSSEN unterhalb ihrer Subklassen
	        System.out.println("Konnte nicht gewandelt werden");// in den catch Blöcken definiert werden
	    }
		catch(Exception hund) {
			System.out.println(hund.getMessage());
			
		}
		finally {
			System.out.println("Finally");
			sc.close();
		}
		System.out.println("Ausserhalb Exception Handling");
		String text = sc.nextLine();
		System.out.println(text);

	}

}

