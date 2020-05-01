package de.gfn.java.ocp.jpakundenverwaltung;

import  de.gfn.java.ocp.jpakundenverwaltung.entity.*;
import java.time.LocalDateTime;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author tlubowiecki
 */
public class App {
    
    public static void main(String[] args) {
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("KundenverwaltungPU");
        EntityManager em = factory.createEntityManager();
        
        Customer c1 = new Customer();
        c1.setFirstname("Peter");
        c1.setLastname("Parker");
        
        Address address = new Address();
        address.setStreet1("Hamburgerstr.");
        address.setNr("17a");
        address.setZip("23456");
        address.setTown("Hamburg");
        address.setCountry("Deutschland");
        
        Product p = new Product();
        p.setName("Socken");
        p.setDescription("Sehr warm...");
        p.setPrice(15.99);
        
        Order o = new Order();
        o.addProduct(p);
        o.setOrderdAt(LocalDateTime.now());
        
        em.getTransaction().begin();
        em.persist(p);
        
        c1.addOrder(o);
        c1.setAddress(address);
        em.persist(c1);
        
        em.getTransaction().commit();

//        Customer c1 = em.find(Customer.class, 1);
////        System.out.println(c1.getFirstname() + " " + c1.getLastname());
////        System.out.println(c1.getAddress().getStreet1() + c1.getAddress().getNr());
//        
////        c1.setLastname("Banner");
////        c1.setBirthdate(LocalDate.now());
//        
//        em.getTransaction().begin();
//        em.remove(c1);
//        em.getTransaction().commit();
        
        em.close();
        factory.close();
    }
}

// jdbc:mysql://localhost:8889/jpa_kundenverwaltung?autoReconnect=true&serverTimezone=CET&useSSL=False&allowPublicKeyRetrieval=true