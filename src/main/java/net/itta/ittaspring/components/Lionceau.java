
package net.itta.ittaspring.components;

import java.util.Date;
import net.itta.ittaspring.Lion;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class Lionceau extends Lion {

    
    public Lionceau() {
        this("petit"+new Date());
    }
    
    public Lionceau(String nom) {
         super.setNom(nom);
         System.out.println("Lionceau "+nom+" construit");
    }

}
