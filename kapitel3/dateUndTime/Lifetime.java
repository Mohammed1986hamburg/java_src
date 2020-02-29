package kapitel3.dateUndTime;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;			// Enum Klasse <-- nicht für OCA wichtig
import java.util.Scanner;

public class Lifetime {

	public static void usingFormatter() {
		// Calendar Objects
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy"); // dd muss klein und yyyy auch NUR MM capital
		LocalDate gebDat = null;
		LocalDate xPire = null;
		Period lifeTime = null;
		
		
		Scanner in = new Scanner(System.in);
		
		String inGebDat;
		String day;
		int alter;
		long anzTage;
		long anzWochen;
		
		
		// Versuch Eingabe umzuwandeln
		try {
			System.out.println("geben Sie  das geburtsdatum ein DD.MM.YYYY");
			inGebDat= in.nextLine();
			gebDat = LocalDate.parse(inGebDat, format);
			
		
		}catch (java.time.DateTimeException e) {
			System.out.println("Nicht geklappt");
		    
		}
		lifeTime = lifeTime.between(gebDat, LocalDate.now());
		System.out.println();
		System.out.println("Dein Geburtstag ist also der : " + gebDat.format(format));
		System.out.println();
		
		// Umwandeln der englischen Bezeichnung
		day = gebDat.getDayOfWeek().toString();
		switch(day) {
			case "MONDAY": 		System.out.println("Das war ein : Montag");
								break;
			case "TUESDAY":		System.out.println("Das war ein : Dienstag");
								break;
			case "WEDNESDAY":	System.out.println("Das war ein : Mittwoch");
								break;
			case "THURSDAY":	System.out.println("Das war ein : Donnerstag");
								break;
			case "FRIDAY" :		System.out.println("Das war ein : Freitag");
								break;
			case "SATURDAY":	System.out.println("Das war ein : Samstag");
								break;
			case "SUNDAY":		System.out.println("Das war ein : Sonntag");
			
		}
				
		// Ausgabe Lebenszeit
		System.out.print("Du hast : " + lifeTime.getYears() + " Jahre , ");
		System.out.println(lifeTime.getMonths() 
						+ " Monate und " 
							+ lifeTime.getDays() + " Tage bis jetzt gelebt !");
		System.out.println();
		
		alter = lifeTime.getYears();
		if(alter < 0 || alter > 120) 
			System.out.println("..mmhh das Alter ist irritierend");
		
		//Anzahl Tage von Geburt bis heute
		anzTage = gebDat.until(LocalDate.now(),ChronoUnit.DAYS);
		
		System.out.println("Das sind : " + anzTage + " Tage.");
		System.out.println();
	
		// Anzahl Wochen
		anzWochen = gebDat.until(LocalDate.now(), ChronoUnit.WEEKS);
		System.out.println("..und " + anzWochen + " Wochen ... Wohoo");
		System.out.println();
		
		// wie sieht es in sagen wir .. der Zukunft aus ?
		xPire = gebDat.plusDays(30_000);
		System.out.println("Am "+ xPire.format(format) 
		 					  + " hast du 30.000 Tage gelebt");
		// In Wochen 
		anzWochen = gebDat.until(xPire, ChronoUnit.WEEKS);
		System.out.println("das sind dann ..." + anzWochen + " Wochen !");
		System.out.println();
		
		// Differenz
		anzWochen = (gebDat.until(xPire, ChronoUnit.WEEKS))-(gebDat.until(LocalDate.now(), ChronoUnit.WEEKS));
		anzTage = (gebDat.until(xPire, ChronoUnit.DAYS))-(gebDat.until(LocalDate.now(), ChronoUnit.DAYS));
		System.out.println("Dann hast du noch " + anzWochen + " Wochen übrig :D");
		System.out.println(".. oder " + anzTage  + " Tage .. Mach was draus !");
		System.out.println();
	
		
		// Berechnen zukünftiges Alter
		lifeTime = lifeTime.between(gebDat, xPire);
		System.out.println("Du bist dann "+ lifeTime.getYears() + " Jahre, " 
							+ lifeTime.getMonths() + " Monate und " 
							  + lifeTime.getDays() + " alt - o_O");

	}

}
