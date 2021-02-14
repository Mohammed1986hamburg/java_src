package mhd.wahba.kundenverwaltung;

import com.sun.corba.se.impl.io.IIOPInputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mohammed
 */
public class CustomerProvider {
    
    private List<Customer> customers = new ArrayList<>();
    
    private static final File DIR_NAME =new File(System.getProperty("user.home"), "Desktop/Kundenverwaltung") ;
    private static final File FILE_NAME = new File(DIR_NAME, "customers.db") ;
    

    public void init() throws Exception{

        
          loadFromFile();
    }
    
    public void add(Customer c) throws Exception{
        customers.add(c);
        saveToFile();
    }
    
    public List<Customer> getAll(){
        return customers;
    }
    
    private void saveToFile() throws Exception{
        
        if(!DIR_NAME.exists()){
            DIR_NAME.mkdir();
        }
        
        try(ObjectOutputStream oos= new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(FILE_NAME)))) {
            oos.writeObject(customers);
        } 
        
    }
    
    private void loadFromFile() throws Exception{
        try(ObjectInputStream oos= new ObjectInputStream(new BufferedInputStream(new FileInputStream(FILE_NAME)))) {
            customers =(List<Customer>)oos.readObject();
        } 
        
    }
        
}
