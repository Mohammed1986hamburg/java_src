package kapitel3.dateUndTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalUnit;
/**
 * --------------------  Erstellen und Manipulieren von und mit Datumswerten -----------------				
 * 
 * 					!! In Java 8 wurden die Datumsklassen komplett überarbeitet. !!
 * Es wird nur auf die neue Schreibweise geprüft, die alte ist trotzdem weiterhin nutzbar im Sourcecode
 * 
 * Besonderheit: 	ALLE Objekte egal ob Datum, Zeit , Datum und Zeit oder Perioden sind IMMUTABLE !! (genau wie String Objekte)
 * 					Es werden bei keiner Klasse Konstruktor aufgerufen - NIRGENDS wird das keyword new verwendet !!
 * 					Tatsächlich sind diese Klassen alle sogenannte factory Klassen. Es wird nur eine public static Methode aufgerufen die einen 
 * 					private Konstruktor aufruft und so ein Objekt erstellt.
 * 
 * Wissen:
 * 		> 5 Klassen müssen gewußt werden:
 * 			- java.time.LocalDateTime			<-- wird genutzt um Datums und Zeitobjekte zu erstellen --> Ausgabe : YYYY-MM-DDTHH:MM:SS.NS
 * 			- java.time.LocalDate				<-- wird genutzt um Datums Objekte zu erstellen			--> Ausgabe : YYYY-MM-DD
 * 			- java.time.LocalTime				<-- wird genutzt um Zeit Objekte zu erstellen			--> Ausgabe : HH:MM:SS.NS
 * 			- java.time.format.DateTimeFormatter<-- wird von den oberen Klassen genutzt Zeit und Datumswerte zu formatieren für 
 * 													die Ausgabe und zum umwandeln von Eingaben 
 * 													
 * 			- java.time.Period					<-- Wird benutzt um Objekte zu erstellen, die eine Zeitperiode von days,months
 * 													and years darstellen
 * 			- java.time.temporal.TemporalAmount <-- Interface das von der Period Klasse implementiert wird  
 * 
 * 
 * */
public class DateVerwendung {
	

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();
		Period periodDateAll = Period.of(2, 5, 10);
		
		
//		localDate();				
//		localTime();
//		localDateTime();
		periodTime();
//		periodUsageForDateObjects(periodDateAll, date);
		
//		useDateTimeObjects(date,time,dateTime);
//		DateTimeFormatieren();
	}
	public static void localDate() {
		//---------------------------------------------------------------------------------------
		//------- statische Methode: of(int year, int month, int day)
		//------- statische Methode: of(int year, Month month, int day)
		//---------------------------------------------------------------------------------------
		//----------------------  Methoden sind überladen  --------------------------------------
		//---------------------------------------------------------------------------------------
		LocalDate datum1 = LocalDate.of(2010, 2, 22);				// ruft die static method of (int year, int month, int day) auf 
		
		LocalDate datum2 = LocalDate.of(2010, Month.FEBRUARY, 22);	// ruft die static method of (int year, Month month, int day) auf
																	// Month.Monatsname <-- Enum Typ == Konstante mit . Operator zu verwenden
																	
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");			// Ausgaben sind identisch
		System.out.println("---  Datumswerte ----");
		System.out.println(datum1);									
		System.out.println(datum2);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");

	}
	public static void localTime() {
		//---------------------------------------------------------------------------------------
		//------- statische Methode: of(int hour, int minute)
		//------- statische Methode: of(int hour, int minute, int second)
		//------- statische Methode: of(int hour, int minute, int second, int nanos)
		//---------------------------------------------------------------------------------------
		//----------------------  Methoden sind überladen  --------------------------------------
		//---------------------------------------------------------------------------------------
		
		LocalTime zeit1 = LocalTime.of(10, 30);					//<< ruft statische Methode of(int hour, int minute)auf
		LocalTime zeit2 = LocalTime.of(10, 30, 15);				//<< ruft statische Methode of(int hour, int minute, int second)auf
		LocalTime zeit3 = LocalTime.of(10, 30, 15,999999999);	//<< ruft statische Methode of(int hour, int minute, int second, int nanos)auf
																// Nano Sekunden reichen von 0 bis 999,999,999
		
		System.out.println("---  Zeitwerte ----");
		System.out.println(zeit1);
		System.out.println(zeit2);
		System.out.println(zeit3);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		//System.out.println(zeit1.now());
	
	}
	public static void localDateTime() {
		
		//---------------------------------------------------------------------------------------
		//------- 1.statische Methode: of(int year, int month,int day,int hour, int minute)
		//------- 2.statische Methode: of(int year, int month,int day,int hour, int minute,int second)
		//------- 3.statische Methode: of(int year, int month,int day,int hour, int minute, int second, int nanos)
		//------- 4.statische Methode: of(int year, Month month,int day,int hour, int minute)
		//------- 5.statische Methode: of(int year, Month month,int day,int hour, int minute, int second)
		//------- 6.statische Methode: of(int year, Month month,int day,int hour, int minute, int second, int nanos)
		//------- 7.statische Methode: of(LocalDate date, LocalTime time)
		//---------------------------------------------------------------------------------------
		//----------------------  Methoden sind überladen  --------------------------------------
		//---------------------------------------------------------------------------------------
		LocalDateTime zeitstempel1 = LocalDateTime.of(2011, 3, 30, 12, 0, 55, 1);			// ruft methode 3 auf
		
		LocalDateTime zeitstempel2 = LocalDateTime.of(2011, 3, 30, 12, 0, 55);				// ruft methode 2 auf
		
		LocalDateTime zeitstempel3 = LocalDateTime.of(2011, 3, 30, 12, 0);					// ruft methode 1 auf
		
		LocalDateTime zeitstempel4 = LocalDateTime.of(2011,Month.MARCH, 30, 12, 0);			// ruft methode 4 auf
		
		LocalDateTime zeitstempel5 = LocalDateTime.of(2011, Month.MARCH, 30, 12, 0, 55, 1);	// ruft methode 6 auf
		
		LocalDateTime zeitstempel6 = LocalDateTime.of(2011, Month.MARCH, 30, 12, 0, 55);	// ruft methode 5 auf
		
		LocalDate datum = LocalDate.of(2011, 3, 30);
		LocalTime zeit = LocalTime.of(12,0);
		
		LocalDateTime zeitstempel7 = LocalDateTime.of(datum,zeit);							// ruft methode 7 auf
		
		System.out.println("---  Datum und Zeitwerte ----");
		System.out.println(zeitstempel1);
		System.out.println(zeitstempel2);
		System.out.println(zeitstempel3);
		System.out.println(zeitstempel4);
		System.out.println(zeitstempel5);
		System.out.println(zeitstempel6);
		System.out.println(zeitstempel7);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		
	}
	public static void periodTime() {
		
		//---------------------------------------------------------------------------------------
		//------- statische Methode: of(int years, int months, int days)
		//------- statische Methode: ofDays(int days)
		//------- statische Methode: ofMonts(int months)
		//------- statische Methode: ofWeeks(int weeks)
		//------- statische Methode: ofYears(int days)
		//---------------------------------------------------------------------------------------
		
		
		Period zeitraumGanz   = Period.of(2, 10, 3);
		Period zeitraumTage   = Period.ofDays(16);
		Period zeitraumMonate = Period.ofMonths(6);
		Period zeitraumWochen = Period.ofWeeks(12);
		Period zeitraumJahre  = Period.ofYears(2);
		
		System.out.println("---  Zeiträume ----");
		System.out.println("Zeitraum komplett: " + zeitraumGanz);
		System.out.println("Zeitraum komplett: " + zeitraumGanz.getUnits());									
		System.out.println("Zeitraum Tage:\t " + zeitraumTage);
		System.out.println("Zeitraum Monate: " + zeitraumMonate);
		System.out.println("Zeitraum Wochen: " + zeitraumWochen);
		System.out.println("Zeitraum Tage:\t " + zeitraumJahre);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		zeitraumGanz = Period.ofDays(5).ofDays(15); 		// Chaining von Methoden und es wird nur der Letzte Wert gespeichert 
		System.out.println(zeitraumGanz);
		
		
		LocalDateTime aktuell = LocalDateTime.now();
		
		aktuell = aktuell.plusDays(5).plusYears(3);			// chaining bei Date/ Time ist möglich und wird gespeichert
		
		System.out.println(aktuell);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	public static void periodUsageForDateObjects(Period period, LocalDate date) {
		//-------------------------------------------------------------------------------------------------
		//-------------------------------------------------------------------------------------------------
		// ---- LocalDate Objekte mit Period Objekten nutzen
		// ---- Methoden : getUnits(),plusDays(),addTo(),getYears(),toTotalMonths(),getMonths(),getDays();
		//-------------------------------------------------------------------------------------------------
		//-------------------------------------------------------------------------------------------------
		Period periodDay = Period.ofDays(3);				// Lokales period Objekt
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~ Perioden Objekte ~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
	
		System.out.println("Einheiten gespeichert in period: "	// Ausgabe der Gespeicherten Zeitraum Einheiten
		                    + period.getUnits());
		System.out.println("Zeitraum Original: \t\t " + period);// Ausgabe der Original Werte
		System.out.println();
		System.out.println("Was für Einheiten gibt es?\t " 
						+ periodDay.getUnits());			 	// Holt immer alle möglichen Einheiten für Zeitraum Änderung
		System.out.println("Auch bei einem periodOfDays?\t "
						+ periodDay);							// Ausgabe des neuen periodDay Objektes
		System.out.println();
		
		period = period.plusDays(5);							// Erstellt ein neues Objekt mit der erhöhten Tagesänderung 
		System.out.println("Werte für Tage erhöht:\t\t "
							+ period);
		System.out.println();
		System.out.println("Gespeichertes Datum: \t\t " + date);
		System.out.println();
		System.out.println("Temporär verändertes Datum:\t " // Chaining !! Was passiert ?
							+ period.addTo					// addTo() addiert das Ergebnis der Anweisungen in den ()
															
							  (date.plusYears(				// data.plusYears() erhöht die Jahreszahl um die Anzahl die getYears() zurückgibt
							  
								period.getYears()))); 		// getYears() holt sich die int Werte für Jahr
															// (plusYears(getYears == 2) --> also  (2020 + 2) --> 2022
															// addTo --> (2022 + 2Y - 02 + 5M - 21 + 15D) -->  das Period Object hat noch Tage und Monate ;)
															// Daher : 		 2024	-	08	  -   05
		
		Period periodTotalMonths = 							// neues Lokales Period Objekt 
				Period.ofMonths(							// Zuweisen der Gesamtmenge an Monaten die in einem Period Objekt gespeichert sind
						(int) period.toTotalMonths());		// an ein neues period Objekt, das nur die Monate als Zeitraum hat
		
		System.out.println("Anzahl Zeitraum Monate:\t\t " + periodTotalMonths);				// Ausgabe des neuen Monatszeitraumes
		
		LocalDate zukunft = LocalDate.of(2019, 12, 24);		// Erstellen eines neuen Date Objekt
		
		period = period.between(date, zukunft);				// between(startdatum, enddatum) gibt den differenzZeitraum zwischen den Date Objekten aus
		
		System.out.println();
		System.out.println("Gut zu wissen ....");
		System.out.println(".. Noch " + period.getYears() +	// Ausgabe des Zeitraums gesplittet in getYears(),getMonths(), getDays()
				" Jahre, " + period.getMonths() + 
				" Monate und " + period.getDays()  + 
				" Tage, bis Weihnachten :)" );
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~ Beispiel ~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


		date = LocalDate.now();
		period = period.of(10,12,10);
		period.minusYears(period.getYears() - 5);
		System.out.println(period);
		System.out.println(period.addTo(date));
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

	}
	public static void useDateTimeObjects(LocalDate date, LocalTime time, LocalDateTime dateTime) {
		
		//------------------------------------------------------------------------------------------------------------------------------------
		//---------------------------    Methoden --------------------------------------------------------------------------------------------
		//------- Date Objekte : 	plusYears(), minusYears(), plusMonths(), minusMonth(), plusDays(),minusDays()
		//-------					getDayOfWeek(), getMonth(), getYear(),getDayOfYear(),lengthOfMonth(),lengthOfYear(),MAX
		//------- Time Objekte: 	plusHours(),minusHours(),plusMinutes(),minusMinutes(),plusSeconds(),minusSeconds(),plusNanos(),minusNanos()
		//-------					getHour(),getMinute(), getSecond()
		//------- DateTime Objekte: plusYears(), minusYears(), plusMonths(), minusMonth(), plusDays(),minusDays()
		//-------					plusHours(),minusHours(),plusMinutes(),minusMinutes(),plusSeconds(),minusSeconds(),plusNanos(),minusNanos()
		//------- 					getYear(),withYear(int),
		//-------------------------------------------------------------------------------------------------------------------------------------
		
		//---------------------------------------------------------
		// ---- LocalDate Objekte und Methoden
		//---------------------------------------------------------
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~ Datum Objekte ~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
		System.out.println("-- Datumswerte manipulieren --");
		System.out.println("---  erhöhen / verringern  ---");
		System.out.println("3 Jahre später :" + date.plusYears(3));
		System.out.println("3 Jahre früher :" + date.minusYears(3));
		System.out.println("3 Tage später  :" + date.plusDays(8));
		System.out.println("3 Tage früher  :" + date.minusDays(30));
		System.out.println();
		
		System.out.println("---  	Nix passiert	  ----");
		date.minusYears(5);
		System.out.println();
		System.out.println("warum o_O  :" + date);
		System.out.println();
		System.out.println("---  	 jetzt aber..     ----");
		date = date.minusYears(5);								// Änderungen am Objekt MÜSSEN einer entsprechen Referenzvariable zugewiesen 
		System.out.println("aahhhh :)  :" + date);
		date = date.plusYears(6);
		System.out.println();
//		date = date.now();
		System.out.println("---   wo bin ich im Jahr? ----");
		System.out.println("Tag des Monats :" + date.getDayOfMonth());
		System.out.println("Welcher Monat  :" + date.getMonthValue());
		System.out.println("Tag des Jahres :" + date.getDayOfYear());
		System.out.println();
		System.out.println("---    Was hab ich hier?  ----");
		System.out.println(date);
		System.out.println("Wieviel Tage im Monat? :" + date.lengthOfMonth());
		System.out.println("Wieviel Tage im Jahr?  :" + date.lengthOfYear());
		System.out.println("Bis zu welchem Datum?  :" + date.MAX + " .. das erleb ich nicht ;)");
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		//---------------------------------------------------------
		// ---- LocalTime Objekte und Methoden
		//---------------------------------------------------------
		System.out.println("~~~~~~~ Zeit Objekte ~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("--- Zeitwerte manipulieren ---");
		System.out.println("---  erhöhen / verringern  ---");
		System.out.println("3 Stunden später : " + time.plusHours(3));
		System.out.println("3 Stunden früher : " + time.minusHours(3));
		System.out.println("20 Minuten später: " + time.plusMinutes(20));
		System.out.println("10 Minuten früher: " + time.minusMinutes(10));
		System.out.println("---      Nix passiert     ----");
		time.minusHours(5);
		System.out.println("warum o_O  :" + time);
		System.out.println("---      jetzt aber..     ----");
		time = time.minusHours(5);								// Änderungen am Objekt MÜSSEN einer entsprechen Referenzvariable zugewiesen 
		System.out.println("aahhhh :)  :" + time);
		
		
		System.out.println("--  wo bin ich in der Zeit? --");
		System.out.println("Anzahl Stunden  :" + time.getHour());
		System.out.println("Anzahl Minuten  :" + time.getMinute());
		System.out.println("Anzahl Sekunden :" + time.getSecond());
		
		System.out.println("---   Was hab ich hier?   ----");
		System.out.println("Wieviel Sekunden vom Tag sind vorbei ? :" + time.toSecondOfDay());
		System.out.println("Maximale Angaben  :" + time.MAX + " .. gut zu wissen ;)");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");	
		
		//---------------------------------------------------------
		// ---- LocalDateTime Objekte und Methoden
		//---------------------------------------------------------
		System.out.println("~~~~ Zeitstempel  Objekte ~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
		System.out.println("--- Zeitwerte manipulieren ---");
		System.out.println("---  erhöhen / verringern  ---");
		System.out.println("3 Stunden später : " + dateTime.plusHours(3));
		System.out.println("3 Stunden früher : " + dateTime.minusHours(3));
		System.out.println("20 Minuten später: " + dateTime.plusMinutes(20));
		System.out.println("10 Minuten früher: " + dateTime.minusMinutes(10));
		System.out.println();
	
		System.out.println("---      Nix passiert     ----");
		dateTime.minusHours(5).plusMonths(5);
		System.out.println("warum o_O  :" + dateTime);
		System.out.println();
	
		System.out.println("---      jetzt aber..     ----");
		dateTime = dateTime.minusHours(5).plusMonths(5);	// Änderungen am Objekt MÜSSEN einer entsprechen Referenzvariable zugewiesen 
		System.out.println("aahhhh :)  :" + dateTime);
		System.out.println();
		
			
		System.out.println("-- wie ist mein Zeitstempel? --");
		System.out.println("Aktuell Jahre    :" + dateTime.getYear());
		System.out.println("Aktuell Monate   :" + dateTime.getMonth());
		System.out.println("Aktuell Tag    	 :" + dateTime.getDayOfWeek());
		System.out.println("Anzahl Stunden   :" + dateTime.getDayOfMonth());
		System.out.println("Anzahl Stunden   :" + dateTime.getHour());
		System.out.println("Anzahl Minuten   :" + dateTime.getMinute());
		System.out.println("Anzahl Sekunden  :" + dateTime.getSecond());
		System.out.println();
		
		date = dateTime.toLocalDate();
		System.out.println("Nu ist die Uhrzeit futsch :" + date);
	
		System.out.println();
		System.out.println("---   Was hab ich hier?   ----");
		System.out.println(" Ändern Jahr\t\t  :" + dateTime.withYear(1999));
		System.out.println(" Ändern Monat\t\t  :" + dateTime.withMonth(10));
		System.out.println(" Ändern Tag\t\t  :" + dateTime.withDayOfMonth(3));
		System.out.println(" Ändern Stunde\t\t  :" + dateTime.withHour(0));
		System.out.println(" Ändern Minute\t\t  :" + dateTime.withMinute(0));
		System.out.println();
		
		System.out.println("Minimale Angaben  :" + dateTime.MIN + " .. gut zu wissen ;)");
		System.out.println("Maximale Angaben  :" + dateTime.MAX + " .. gut zu wissen ;)");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");			
	
		
	}
	
	public static void DateTimeFormatieren() {
		
	//------------------------------------------------------------------------------------------
	//---  Datum und Zeit Objekte Formatieren
	//------------------------------------------------------------------------------------------
	
	// ----------  Lokale Datum und Zeit Objekte erstellen
		LocalDateTime 	formatDateTimeLocal = LocalDateTime.now();
		LocalDate 		formatDateLocal 	= LocalDate.now().plusDays(1);
		LocalTime 		formatTimeLocal 	= LocalTime.now().plusHours(2);

	//--------- Formatierungsvorgaben ofPattern(String) 
	DateTimeFormatter format2 = DateTimeFormatter.ofPattern("EEEE :  dd . MMMM , yyyy h:m:s");  // Formatiert : NameTag : Tag . Monatname , Jahr Stunde :  Minute : Sekunde
	DateTimeFormatter format3 = DateTimeFormatter.ofPattern("E MMM dd, yy h:m:s");			  	// Formatiert : TagAbk MonatAbk Tag, Jahr2stellig Stunde : Minute : Sekunde
	DateTimeFormatter format4 = DateTimeFormatter.ofPattern("MMM d, yyyy ");					// Formatiert : MonatAbk Tag Jahr
	DateTimeFormatter format5 = DateTimeFormatter.ofPattern("h:m:s: A a"); 						// Formatiert : 24 Stunden Zeit : minute : sekunden millisekunden bis  AM/PM	
	DateTimeFormatter format6 = DateTimeFormatter.ofPattern("QQQQ  yyyy GG"); 			    	// Formatiert : Zahl.Quartal Jahr	Era (nach Christus)
	
	


	
	// ------ String zur Speicherung der Formatierung
		String formatierteZeit ;										
			
//	DateTimeFormatter format = formatDateTimeLocal.format(format2);  // <-- Doesn't Compile Methode format(DatTimeFormatter) gibt String zurück 
		
		formatierteZeit = formatDateTimeLocal.format(format2);		// DateTime Objekt
		System.out.println(formatierteZeit);
		System.out.println(); 
		formatierteZeit = formatDateTimeLocal.format(format3);		// DateTime Objekt
		System.out.println(formatierteZeit);
		System.out.println();
		formatierteZeit = formatDateLocal.format(format4);			// Date Objekt
		System.out.println(formatierteZeit);
		System.out.println();
		formatierteZeit = formatTimeLocal.format(format5);			// Time Objekt
		System.out.println(formatierteZeit);
		System.out.println();
		formatierteZeit = formatDateLocal.format(format6);			// Date Objekt
		System.out.println(formatierteZeit);
		System.out.println();
		formatDateLocal = formatDateLocal.minusYears(2120);			// Date Objekt
		System.out.println(formatDateLocal.format(format6));
		System.out.println();
		System.out.println(formatDateTimeLocal.format(format5)); 	// DateTime Objekt
		System.out.println();

	
	
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~   Spielerei   ~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	
	// -----------------------------------------------------------------------------------------
	// --------  		Link zu Methoden und Pattern Angaben :
	// --------	https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
	// ------------------------------------------------------------------------------------------
		

		
	//------------------------------------------------------------------------------------------
	//--- Spielerei mit Datums Objekten
	//------------------------------------------------------------------------------------------
		Lifetime.usingFormatter();
		
	}
















}
