package de.lubowiecki.webcustomers;

import de.lubowiecki.webcustomers.entity.Customer;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author tlubowiecki
 */

@ManagedBean(name = "customer")
@RequestScoped
public class CustomerBean {
    
    private EntityManagerFactory factory = Persistence.createEntityManagerFactory("WebCustomersPU");
    private EntityManager em = factory.createEntityManager();
    
    private Customer curCastomer = new Customer();

    public Customer getCurCastomer() {
        return curCastomer;
    }

    public void setCurCastomer(Customer curCastomer) {
        this.curCastomer = curCastomer;
    }
    
    public List<Customer> getCustomerList() {
        // JPQL
        return em.createQuery("SELECT c FROM Customer c", Customer.class).getResultList();
    }
    
    public void save(Customer cust) {
        
        System.out.println(cust);
        
        if(cust != null) {
            if(cust.getId() == 0) {
                insert(cust);
            }
            else {
                update(cust);
            }
        }
        curCastomer = new Customer();
    }
    
    private void insert(Customer cust) {
        em.getTransaction().begin();
        em.persist(cust);
        em.getTransaction().commit();
    }
    
    private void update(Customer cust) {
        em.getTransaction().begin();
        em.merge(cust);
        em.getTransaction().commit();
    }
    
    public String edit(Customer cust) {
        curCastomer = cust;
        return "customers";
    }
    
    public String delete(Customer cust) {
        em.getTransaction().begin();
        em.remove(cust);
        em.getTransaction().commit();
        return "customers";
    }
}
