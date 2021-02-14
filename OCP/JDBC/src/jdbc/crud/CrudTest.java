/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.crud;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author tlubowiecki
 */
public class CrudTest {
    
    public static void main(String[] args) {
        
        CustomerCRUD crud = new CustomerCRUD();
        
        try {
            
            Customer c;
            
            c = crud.find(1);
            crud.delete(c);
            // crud.delete(1);
            
            c = new Customer("Bruce", "Banner", "hulk@shield.com");
            
            System.out.println(c.getId());
            
            if(crud.save(c))
                System.out.println("Gespeichert.");
            
            
            System.out.println("----------");
            
            // find all
            List<Customer> lc = crud.find();
            for(Customer cur : lc) {
                System.out.println(cur);
            }
            
            System.out.println("----------");
            
            System.out.println(c.getId());
            c.setFirstName("David");
            
            if(crud.save(c))
                System.out.println("Gespeichert.");
            
//            
//            if(crud.insert(new Customer("Tony", "Stark", "ironman@shield.com")))
//                System.out.println("Gespeichert.");
//            
//            System.out.println("----------");
//            
//            // find one
//            Customer c = crud.find(1);
//            System.out.println(c);
            
            System.out.println("----------");
            
            // find all
            lc = crud.find();
            for(Customer cur : lc) {
                System.out.println(cur);
            }
        } 
        catch (SQLException ex) {
            System.out.println("Problem");
        }
        
    }
    
}
