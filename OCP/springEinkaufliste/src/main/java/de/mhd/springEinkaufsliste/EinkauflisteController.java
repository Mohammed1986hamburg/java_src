package de.mhd.springEinkaufsliste;

import de.mhd.springEinkaufsliste.Entity.Produkt;
import de.mhd.springEinkaufsliste.Entity.ProduktRepository;
import javax.validation.Valid;
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
 * @author mohammed
 */
@Controller
public class EinkauflisteController {

    @Autowired
    private ProduktRepository repo;

    @RequestMapping("/")
    public String doSomething(Model model) {

        model.addAttribute("produkte", repo.findAll());

        return "standard";
    }

    @RequestMapping("/new")
    public String newProduct(Produkt pro) {

        return "productForm";
    }

    @PostMapping("/add")
    public String addProduct(@Valid Produkt pro, BindingResult resulte, Model model) {
        
        if(resulte.hasErrors()){
            return "productForm";
        }

        repo.save(pro);

        model.addAttribute("produkte", repo.findAll());

        return "standard";

    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") int id, Model model) {

        repo.deleteById(id);

        model.addAttribute("produkte", repo.findAll());

        return "standard";

    }
    
    @GetMapping("/edit/{id}")
    public String editProduct(@PathVariable("id") int id, Model model) {

        Produkt produkt = repo.findById(id).orElseThrow(()-> new IllegalArgumentException("ID unbekannt"));
        

        model.addAttribute("produkt", produkt);

        return "productUpdateForm";

    }
    
    @PostMapping("/edit/{id}")
    public String updateProduct(@PathVariable("id") int id,@Valid Produkt produkt, BindingResult resulte, Model model) {

        if(resulte.hasErrors()){
            produkt.setId(id);
            return "productUpdateForm";
        }
        
       repo.save(produkt);
      
        model.addAttribute("produkte", repo.findAll());

        return "standard";


    }
    
    @RequestMapping("/ajax/new")
    public String ajaxNewProduct(Produkt pro) {

        return "ajax";
    }
}

