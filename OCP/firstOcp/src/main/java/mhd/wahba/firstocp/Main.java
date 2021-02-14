package mhd.wahba.firstocp;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(final String[] args) {
        //..............................  

        System.out.println( maskify("4556364607935616"));
        System.out.println( maskify("64607935616"));
        System.out.println( maskify("Skippy"));
        System.out.println( maskify("Nananananananananananananananana Batman!"));
        

        //...............................    
        System.out.println("done ok");
    }//End main

    // add method here
    // .........................................
  
    public static String maskify(String str) {
        
        // java Format Specifiers
         return str.replaceAll(".(?=.{4})", "#");
    }
    
    //..........................................
}// End class 
