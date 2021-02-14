
package de.gfn.java.ocp.springstart;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author mohammed
 */

@Getter
@Setter
@ToString
public class Thing {
    
    private int id;
    private String name;
    private boolean active;

    public Thing() {
    }
    
    
    
    public void doSomething(){
        
    }
    
}
