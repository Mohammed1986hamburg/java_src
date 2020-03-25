
package mhd.wahba.kalender;

import java.time.LocalDate;

import java.util.*;


/**
 *
 * @author mohammed
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        Map<LocalDate, List<Termin>> cal = new HashMap<>();
        String nochTermin = "ja";
       
        
        while (nochTermin.equals("ja")) {
            String datum;
            String termin;
            String titel;
            String beschreibungstext;
            
            System.out.println("Geben Sie die Datum wie DD.MM.YYYY");
            datum = user.nextLine();
            System.out.println("Geben Sie die Termin wie hh:mm");
            termin = user.nextLine();
            System.out.println("Geben Sie die Titel");
            titel = user.nextLine();
            System.out.println("Geben Sie die Beschreibungstext");
            beschreibungstext = user.nextLine();
            
            
            String[] splitDatum = datum.split("\\.");
            String[] splitTermin = termin.split(":");
            
            if(cal.get(LocalDate.of(Integer.parseInt(splitDatum[2]),Integer.parseInt(splitDatum[1]),Integer.parseInt(splitDatum[0])))==null){
            cal.put(LocalDate.of(Integer.parseInt(splitDatum[2]),Integer.parseInt(splitDatum[1]),Integer.parseInt(splitDatum[0])),new ArrayList<>());
            }
            
            cal.get(LocalDate.of(Integer.parseInt(splitDatum[2]),Integer.parseInt(splitDatum[1]),Integer.parseInt(splitDatum[0]))).add(new Termin(Integer.parseInt(splitTermin[0]), Integer.parseInt(splitTermin[1]), titel, beschreibungstext));
          
            System.out.println("-----------------------------");
            System.out.println(cal);
            
            System.out.println("Noch ein neu Termin :  ja oder nein");
            nochTermin = user.nextLine();
            if (nochTermin.equals("nein")) break;
        }
        
        
        
        System.out.println("-----------------------------");
        System.out.println("eine Ausgabe der Termine für einen bestimmten Tag");
        System.out.println("Geben Sie die Datum wie DD.MM.YYYY");
        String datum2;
        datum2 = user.nextLine();
        String[] splitDatum2 = datum2.split("\\.");
        List<Termin> toShow = cal.get(LocalDate.of(Integer.parseInt(splitDatum2[2]),Integer.parseInt(splitDatum2[1]),Integer.parseInt(splitDatum2[0])));
        
        int counter =1;
        for (Termin termin : toShow) {
            
            System.out.println(termin);
            if(counter == 7) break;
            counter++;
            
            
        }
        
        
        
        
    }
    
    
    
}
