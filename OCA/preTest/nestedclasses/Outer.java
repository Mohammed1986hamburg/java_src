
package nestedclasses;


public class Outer {
    
    protected int i = 5;
    void tuwas() {
        System.out.println("Outer");
    }
    
    class Inner extends Outer {
        private int i = 10;
        
        void tuwas() {
            System.out.println(super.i);
        }
    }
    
//    static class Inner {
//        int j = 10;
//    }
    
    
}
