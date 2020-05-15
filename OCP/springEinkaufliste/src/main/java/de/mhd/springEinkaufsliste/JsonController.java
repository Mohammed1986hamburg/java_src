/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.mhd.springEinkaufsliste;


import de.mhd.springEinkaufsliste.Entity.Produkt;
import de.mhd.springEinkaufsliste.Entity.ProduktRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//XML
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 *
 * @author mohammed
 */
@RestController
public class JsonController {
      @Autowired
    private ProduktRepository repo;
      
      
     // json 
    @GetMapping("/products")
    public Iterable<Produkt> showProduct() {

        return repo.findAll();

    }
    
    @PostMapping("/rest/save")
    public Iterable<Produkt> saveProduct(@RequestBody Produkt pro) {
        repo.save(pro);

     return repo.findAll();

    }
    
    
//    // xml
//    @Mapping(value ="/productsxml", method = RequestMethod.GET, produces);
//    public Iterable<Produkt> xmlProduct() {
//
//        return repo.findAll();
//
//    }
//    
}
