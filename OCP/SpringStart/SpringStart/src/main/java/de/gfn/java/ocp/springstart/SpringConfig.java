
package de.gfn.java.ocp.springstart;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author mohammed
 */

@Configuration
//@ComponentScan(basePackages = "de.gfn.java.ocp.springstart")
public class SpringConfig {
    
    @Bean
    public  ThingService thingService(){
        return new ThingServiceImpl();
    }
    
}
