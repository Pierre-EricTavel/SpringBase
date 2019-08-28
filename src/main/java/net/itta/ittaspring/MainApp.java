

package net.itta.ittaspring;

import net.itta.ittaspring.components.ServiceUnique;
import lombok.extern.slf4j.Slf4j;
import net.itta.ittaspring.components.Lionceau;
import org.slf4j.*;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j(topic = "toto")
public class MainApp {
    
    //private static final Logger log =  LoggerFactory.getLogger(MainApp.class);
    
    public static void main(String[] args) throws InterruptedException {
      
       ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(ZooConf.class);
       log.info("logger d'info " );
       log.error("logger.error");
       
//       Animal lion = context.getBean("lion",Animal.class);
//       Animal lion2 = context.getBean("simba",Animal.class);
//       System.out.println(lion2.getNom());
       Lionne clarence = context.getBean(Lionne.class);
       AutoCage cage = context.getBean(AutoCage.class);
       cage.Crie();
       
       Animal lion2 = context.getBean("roidelajungle",Animal.class);
       System.out.println(lion2==cage.getAnimal());
       
       Lionceau lc = context.getBean(Lionceau.class);
       System.out.println(lc.getNom());
       
       
       ServiceUnique s1 = context.getBean(ServiceUnique.class);
       s1.setEtat(5);
       System.out.println(s1.getEtat());
       
       
       
       context.registerShutdownHook();
       
       
    }            

    static void xmlConf() throws BeansException {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring/beans.xml");
        
        // Animal lion1 = context.getBean("lion1",Lion.class);
        
//            CageIndividuelle cage1 = context.getBean("cageindividuelle",CageIndividuelle.class);
//            CageIndividuelle cage2 = context.getBean("cageindividuelle",CageIndividuelle.class);
//            
//            System.out.println(cage1==cage2);
//            System.out.println(cage1.getAnimal()==cage2.getAnimal());
            
//            Cage cage = context.getBean("cage",Cage.class);
//            cage.getAnimaux().forEach(a-> System.out.println (a.getNom()));

Feulement cri = context.getBean("cri",Feulement.class);
cri.doIt();
cri = context.getBean("cri2",Feulement.class);
cri.doIt();
    }
    
}
