package de.lubowiecki.springeinkaufsliste;

import de.lubowiecki.springeinkaufsliste.model.Produkt;
import de.lubowiecki.springeinkaufsliste.model.ProduktRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author tlubowiecki
 */

@Controller
public class EinkaufslisteController {
    
    @Autowired
    private ProduktRepository repo;
    
    // HTTP-Methoden: REQUEST, GET, POST, PUT, DELETE
    
    @RequestMapping("/")
    public String doSomething(Model model) { // model = Template-Objekt
        model.addAttribute("produkte", repo.findAll());
        return "standard";
    }
    
    @RequestMapping("/new")
    public String newProduct(Produkt produkt) {
        return "productForm";
    }
    
    @PostMapping("/add")
    public String addProduct(Produkt produkt, BindingResult result, Model model) {
        repo.save(produkt);
        model.addAttribute("produkte", repo.findAll());
        return "standard";
    }
    
    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") int id, Model model) {
        repo.deleteById(id);
        model.addAttribute("produkte", repo.findAll());
        return "standard";
    }
}
