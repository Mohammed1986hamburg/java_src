
package nestedclasses;


public class NestedClasses {

    
    public static void main(String[] args) {
        
        Fabrik f = new Fabrik("Opel");
        
        Fabrik.Auto a1 = f.produziereAuto("Astra", "Rot", 105);
        
        System.out.println(a1);
        
        f.tuwas(a1);
        
        //Fabrik.Auto a2 = f.new Auto("Insigna", "Blau", 70);
        
        //System.out.println(a2);
        
        
        //Outer o = new Outer();
        //o.tuwas();
        
        //Outer.Inner i = o. new Inner(); instanziierung der non-static inner class;
        //Outer.Inner i = (new Outer()). new Inner();
        //i.tuwas();
        
        
        //Outer.Inner oi = new Outer.Inner(); // instanziierung der static inner class;
        //i.tuwas();
        
        
        
        
    }
    
}
