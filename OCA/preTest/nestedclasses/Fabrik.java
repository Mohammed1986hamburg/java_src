
package nestedclasses;

// Outerclass
public class Fabrik {
    
    String werk;
    int anzahl;
    
    
    Fabrik(String werk) {
        this.werk = werk;
    }
    
    Auto produziereAuto(String model, String farbe, int ps) {
        Auto a = new Auto(model, farbe, ps);
        anzahl++;
        return a;
    }
    
    void tuwas(Auto a) {
        System.out.println(a.farbe);
    }
    
    
    // Innerclass (non-static)
    // Innere Klassen können auf alle Attribute und Methoden der äußeren Klasse zugreifen, auch wenn sie private sind.
    // Innere Klassen können static bzw. non-static.
    // Zum Instanziieren einer non-static inner class benötigt man eine Instanz der äußeren Klasse.
    class Auto {
        static final int j = 5;
        String fahrgestellnummer;
        String model;
        String farbe;
        int ps;
        
        // Durch inner classes können wir eine erweiterte Kapselung implementieren
        // Auto lässt sich jetzt nicht mehr von außen instanziieren.
        private Auto(String model, String farbe, int ps) {
            this.fahrgestellnummer = werk+this.hashCode();
            this.model = model;
            this.farbe = farbe;
            this.ps = ps;
        }

        @Override
        public String toString() {
            return "Auto{" + "fahrgestellnummer=" + fahrgestellnummer + ", model=" + model + ", farbe=" + farbe + ", ps=" + ps + '}';
        }
    }
}
