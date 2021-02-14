/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.java.ocp.springstart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author mohammed
 */
public class ThingTest {

    public static void main(String[] args) {
        // CDI-Container
        
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.register(SpringConfig.class);
//        context.refresh();

        // or
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        

        // xml
       ApplicationContext context = new ClassPathXmlApplicationContext("springXMLConfig.xml");
        
        System.out.println("start");
        // Inject gem. Config
        
//        ThingService ts = context.getBean(ThingService.class);
//        Thing t = ts.create();
//        System.out.println(t);
        
         ThingService ts2 = context.getBean(ThingService.class);
        ts2.setInf("my info");
        System.out.println(ts2.getInfo());
        
         ThingService ts3 = context.getBean(ThingService.class);
        System.out.println(ts3.getInfo());
        
        System.out.println("end");
        
        
        
    }

}
