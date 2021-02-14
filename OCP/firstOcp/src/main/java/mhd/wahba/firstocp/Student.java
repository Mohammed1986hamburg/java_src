package mhd.wahba.firstocp;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author tlubowiecki
 */
public class Student implements Observer {
    
    // Klassen-Konstante
    static final String sConst;
    
    static {
        sConst = "Test1";
    }

    @Override
    public String toString() {
        return "Student{" + "iConst=" + iConst + ", name=" + name + '}';
    }
    
    
    // Instanz-Konstante
    final String iConst;
    
    private String name;
    private String matrikelnr;

    public Student(String name, String matrikelnr) {
        this.name = name;
        this.matrikelnr = matrikelnr;
        
        iConst = "Test2";
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMatrikelnr() {
        return matrikelnr;
    }

    public void setMatrikelnr(String matrikelnr) {
        this.matrikelnr = matrikelnr;
    }

    @Override
    public void update(Observable o, Object arg) {
        
        // Runtime-Konstante
        final String X = arg.toString();
        
        // Compile-Time-Konstante
        final String Y = "B";
        
        switch(arg.toString()) {
            
            case "A":
                System.out.println(name + ": Super. Ich bin dabei.");
                break;
            
            case Y:
                System.out.println(name + ": Grrr. Das ist ja doof!");
                o.deleteObserver(this);
                break;
                
            default:
                System.out.println(name + ": Ok. Ist mir egal!");
            
        }
    }
}
