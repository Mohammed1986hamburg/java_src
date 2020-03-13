package oca.exceptions;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Dateischreiben {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		
		try {
			FileWriter datei = new FileWriter("C://Users//Nutzer//Documents//testdatei.txt");
				
			try {
			
					String text = "Das ist ein Beispieltext";
					datei.write(text);
					datei.flush();
			}
			catch(FileNotFoundException file) {
				System.out.println("Datei nicht gefunden");
			}
			finally {
				datei.close();			// Hier funktioniert es, weil im äusseren try Block deklariert
			}
		}
		catch(IOException file) {
				System.out.println("Keine datei");
		}
		
		finally {
//			datei.close();				// DOES NOT COMPILE, weil erst im try Block deklariert
		}
	

	}
}
