
package de.mhd.springEinkaufsliste.Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author mohammed
 */
@Getter
@Setter
@Entity
public class Produkt implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @NotNull
    @Size(min = 2, max = 30 , message = "{name.notvalid}")
    @Column(length = 5)
    private String name;
    
    @NotNull
    @Min(1)
    @Max(value = 20, message = "{anzahl.notvalid}")
    private int anzahl;
    
    
    
    
}
