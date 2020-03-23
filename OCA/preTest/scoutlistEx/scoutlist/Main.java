
package scoutlist;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    
    static ArrayList<Scout> scouts = new ArrayList<>();

    public static void main(String[] args) {
        
        
        
        System.out.println(Float.compare(5.4F,1.5F));
        
        Scout s1 = new Scout("Hans", 'm', 150);
        Scout s2 = new Scout("Tina", 'w', 65.5F);
        Scout s3 = new Scout("Bernd", 'm', 105.7F);
        
        Tool t1 = new Tool("Hammer", 2);
        Tool t2 = new Tool("Bogen", 5.5F);
        Tool t3 = new Tool("Zwille", 2.1F);
        
        s1.addTool(t1);
        s1.addTool(t2);
        
        s2.addTool(t3);
        
        s3.addTool(t1);
        s3.addTool(t2);
        s3.addTool(t3);
        
        scouts.add(s1);
        scouts.add(s2);
        scouts.add(s3);
        
        System.out.println(scouts);
        Collections.sort(scouts, (a,b) -> {
            return Float.compare(a.calcToolWeight(), b.calcToolWeight());
        });             // 10        -       7  // 3
                
        System.out.println(scouts);
    }
    
}
