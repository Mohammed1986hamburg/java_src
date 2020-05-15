package de.gfn.java.ocp.springstart;

import javax.annotation.PostConstruct;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 *
 * @author mohammed
 */
@Lazy
@Service
public class ThingServiceImpl implements ThingService{
    
    private String info;

    @Override
    public Thing create() {
        Thing t =new Thing();
        t.setId(1);
        t.setActive(true);
        t.setName("mhd");
        return t;
    }

    @Override
    public String getInfo() {
        return info;
    }

    @Override
    public void setInf(String info) {
        this.info=info;
    }
    
    @PostConstruct
    public void onInint(){
        System.out.println("Service-Objekt erzeugt");
    }
    
}
