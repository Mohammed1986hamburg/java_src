
package de.mhd.springEinkaufsliste.Entity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mohammed
 */
@Repository
public interface ProduktRepository extends CrudRepository<Produkt, Integer>{
    
}
