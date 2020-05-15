package de.lubowiecki.webcustomers;

import de.lubowiecki.webcustomers.entity.Product;
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

@ManagedBean(name = "products")
@RequestScoped
public class ProductBean {
    
    private EntityManagerFactory factory = Persistence.createEntityManagerFactory("WebCustomersPU");
    private EntityManager em = factory.createEntityManager();

    private Product current = new Product();

    public Product getCurrent() {
        return current;
    }

    public void setCurrent(Product current) {
        this.current = current;
    }

    public List<Product> getProductList() {
        return em.createQuery("SELECT p FROM Product p", Product.class).getResultList();
    }
    
    public void save(Product p) {
        
        if(p != null) {
            if(p.getId() == 0) {
                insert(p);
            }
            else {
                update(p);
            }
        }
        current = new Product();
    }
    
    private void insert(Product p) {
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
    }
    
    private void update(Product p) {
        em.getTransaction().begin();
        em.merge(p);
        em.getTransaction().commit();
    }
    
    public String edit(Product p) {
        current = p;
        return "products";
    }
    
    public String delete(Product p) {
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();
        return "products";
    }
}
