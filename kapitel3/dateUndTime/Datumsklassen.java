package oca.api.datum;

import java.time.*;
import java.time.format.*;

public class Datumsklassen {

	public static void main(String[] args) {
		LocalDateTime datumKomplett = LocalDateTime.now();
		LocalDate datum = LocalDate.from(datumKomplett);
		LocalTime zeit = LocalTime.from(datumKomplett);
		
		datum = datum.plusWeeks(2);
		
		// Anlegen von Formatierungsvorgaben für Date
		DateTimeFormatter formatDateFull = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter formatDateLong = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter formatDateMedium = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter formatDateShort = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

		// Anlegen von Formatierungsvorgaben für Time
		DateTimeFormatter formatTimeFull = DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL);// DateTimeException wegen fehlender Informationen in LocalTimeObjekten
		DateTimeFormatter formatTimeLong = DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG);// DateTimeException wegen fehlender Informationen in LocalTimeObjekten
		DateTimeFormatter formatTimeMedium = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
		DateTimeFormatter formatTimeShort = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		
		// Anlegen von Formatierungsvorgaben für DateTime
		DateTimeFormatter formatDateTimeFull = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);// DateTimeException wegen fehlender Informationen in LocalTimeObjekten
		DateTimeFormatter formatDateTimeLong = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);// DateTimeException wegen fehlender Informationen in LocalTimeObjekten
		DateTimeFormatter formatDateTimeMedium = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		DateTimeFormatter formatDateTimeShort = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		// Ausgabe
		System.out.println("----------------------------------------------------------------------");
		System.out.println("---------    Formatierte Ausgabe Date mit Formatstyle       ----------");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Datum Full   --> " + datum.format(formatDateFull));
		System.out.println("Datum Long   --> " + datum.format(formatDateLong));
		System.out.println("Datum Medium --> " + datum.format(formatDateMedium));
		System.out.println("Datum Short  --> " + datum.format(formatDateShort));
		System.out.println("----------------------------------------------------------------------");
		System.out.println("---------    Formatierte Ausgabe Zeit mit Formatstyle       ----------");
		System.out.println("----------------------------------------------------------------------");
//		System.out.println("Time Full   --> " + zeit.format(formatTimeFull));
//		System.out.println("Time Long   --> " + zeit.format(formatTimeLong));
		System.out.println("Time Medium --> " + zeit.format(formatTimeMedium));
		System.out.println("Time Short  --> " + zeit.format(formatTimeShort));
		System.out.println("----------------------------------------------------------------------");
		System.out.println("---------    Formatierte Ausgabe DateTime mit Formatstyle       ------");
		System.out.println("----------------------------------------------------------------------");
//		System.out.println("DateTime Full   --> " + datumKomplett.format(formatDateTimeFull));
//		System.out.println("DateTime Long   --> " + datumKomplett.format(formatDateTimeLong));
		System.out.println("DateTime Medium --> " + datumKomplett.format(formatDateTimeMedium));
		System.out.println("DateTime Short  --> " + datumKomplett.format(formatDateTimeShort));
		
		
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("---------          Arbeiten mit Period Objekten           ------------");
		System.out.println("----------------------------------------------------------------------");
		
		LocalDate beispiel = LocalDate.of(2010,10,15);
		
		beispiel = beispiel.plusDays(30);
		System.out.println(beispiel);
		
		Period period = Period.ZERO.ofDays(10); 	// Method Chaining
		System.out.println(period);
		
		period = period.withMonths(2);				// with()
		System.out.println(period);
		
		Period negativerZeitraum ;
		negativerZeitraum = Period.of(1,5,10).negated();	// negiert
		System.out.println(negativerZeitraum);
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("---------          Beispiele mit DateTimeFormatter        ------------");
		System.out.println("----------------------------------------------------------------------");
		DateTimeFormatter format = DateTimeFormatter.ofPattern("d  MMM  yyyy");
		System.out.println(beispiel.format(format));
		
		DateTimeFormatter format1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT,FormatStyle.MEDIUM);
		LocalDateTime beispiel1 = beispiel.atTime(LocalTime.now());
		
		System.out.println(beispiel1.format(format1));
	}

}
