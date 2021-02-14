/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.lubowiecki.webcustomers;

import de.lubowiecki.webcustomers.entity.Customer;
import de.lubowiecki.webcustomers.entity.Order;
import de.lubowiecki.webcustomers.entity.Product;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author tlubowiecki
 */
@ManagedBean(name = "orders")
@SessionScoped
public class OrderBean {
    
    private EntityManagerFactory factory = Persistence.createEntityManagerFactory("WebCustomersPU");
    private EntityManager em = factory.createEntityManager();
    
    private Order current = new Order();
    private Customer currentCustomer;

    public Order getCurrent() {
        return current;
    }

    public Customer getCurrentCustomer() {
        return currentCustomer;
    }

    public String addFor(Customer cust) {
        currentCustomer = cust;
        return "orders";
    }
    
    public void addOrder(Order order) {
        em.getTransaction().begin();
        em.merge(currentCustomer);
        currentCustomer.addOrder(order);
        em.getTransaction().commit();
    }
}
