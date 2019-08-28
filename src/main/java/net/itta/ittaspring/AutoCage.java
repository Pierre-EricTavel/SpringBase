
package net.itta.ittaspring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.*;


public class AutoCage {
    
    @Autowired
    private Animal simba;
    
    @Resource(name="roidelajungle")
    private Animal roi;
    
    private Animal reine;
    
    private final Animal dompteur;
    
    private Panthere sheba;
    
    @Autowired
    public void setPanthere(Panthere sheba){
        this.sheba =sheba;
    }

    @Autowired
    public AutoCage(Animal dompteur) {
        this.dompteur=dompteur;
    }
    
    @Autowired
    public void setReine(Animal reine) {
        this.reine = reine;
    }
    public void Crie(){
        System.out.println(dompteur.getNom()+ " dirige la cage.");
        new Feulement((Lion)simba).doIt();
        new Feulement((Lion)roi).doIt();
        new Feulement((Lion)reine).doIt();
        System.out.println(sheba);
    }
    
   

    public void nettoyer(){
        System.out.println("La cage est nettoyée");
    }

    Animal getAnimal() {
        return simba;
    }

    @PostConstruct
    public void preparer(){
        System.out.println("La cage est construite");
    }
    
    @PreDestroy
    public void ranger(){
        System.out.println("La cage est rangée");
    }
    
}
