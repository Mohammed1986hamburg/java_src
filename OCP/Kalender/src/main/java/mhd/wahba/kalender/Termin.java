
package mhd.wahba.kalender;

import java.time.LocalTime;
import java.util.Objects;

/**
 *
 * @author mohammed
 */
public class Termin {
    LocalTime time ;
    String titel;
    String beschreibungText;

    public Termin(int hour, int minutes, String titel, String beschreibungText) {
        time = LocalTime.of(hour, minutes);
        this.titel = titel;
        this.beschreibungText = beschreibungText;
    }

    @Override
    public String toString() {
        return "Termin{" + "time=" + time + ", titel=" + titel + '}';
    }

    
    
    
    
}
