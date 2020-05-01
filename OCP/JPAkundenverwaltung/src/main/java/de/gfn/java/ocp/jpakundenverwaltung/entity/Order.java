package de.gfn.java.ocp.jpakundenverwaltung.entity;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author tlubowiecki
 */

@Entity
@Table(name = "orders")
public class Order {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private LocalDateTime orderdAt;
    
    @ManyToOne
    private Customer customer;
    
    @ManyToMany
    private List<Product> products = new LinkedList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getOrderdAt() {
        return orderdAt;
    }

    public void setOrderdAt(LocalDateTime orderdAt) {
        this.orderdAt = orderdAt;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }
    
    public boolean removeProduct(Product product) {
        return this.products.remove(product);
    }
}
