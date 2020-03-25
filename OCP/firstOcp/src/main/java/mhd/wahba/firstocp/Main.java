
package mhd.wahba.firstocp;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<String> list=new ArrayList<>();//Creating arraylist  
		list.add("Ravi");//Adding object in arraylist  
                list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		//Traversing list through Iterator  
		Iterator<String> itr=list.iterator(); 
                55m.out.println(itr.next());
                55m.out.println(itr.hasNext());
                55m.out.println(itr.next());
		while(itr.hasNext()){  
		System.out.println(itr.next()); 
    }

     
}

}