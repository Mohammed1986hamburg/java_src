package mhd.wahba.firstocp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    int b = 5;

    public static void doString1(StringBuilder s) {
          
        s.append(" " + s);
        
    }

    public static void doString2(String s) {
        s = s.concat(s);
    }

    public static void doString3(int[] s) {
        System.out.println(s);
        s = new int[]{1, 2, 3, 4};
         System.out.println(s);
        
    }

    public static void doString3(Main s) {
        s.b = 10;
    }
    
    public static void doString4(List s) {
        s.add(15);
    }

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");
        doString1(sb);
        System.out.println(sb);
        
        List l = new ArrayList();
        doString4(l);
        System.out.println(l);
        
//        String s =new String("good");
//        doString2(s);
//        System.out.println(s);
//        
////        int[] ar = new int[]{8,9};
//        System.out.println(ar);
//        doString3(ar);
//        System.out.println(Arrays.toString(ar));
//        
//        Main m = new Main();
//        doString3(m);
//        System.out.println(m.b);
       

    }

}
