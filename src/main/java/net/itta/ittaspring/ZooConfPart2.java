package net.itta.ittaspring;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class ZooConfPart2 {
     
    @Bean(name="roidelajungle")
    Lion getKing(){
        return new Lion("roi de la jungle");
    }
    
    @Bean(name="reine")   
    @DependsOn("roidelajungle")
    Lion getQueen(){
        System.out.println("injection de reine");
        return new Lion("reine de la jungle");
    }
    
    @Bean(name="clarence")
    @Lazy  
    Lionne getClarence(){
        return new Lionne("Clarence");
    }
    
     @Bean(name = "simba")
    @DependsOn("roidelajungle")
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Lion getSimba(){
        return new Lion("Simba");
    }
    
    @Bean
    public Panthere sheba(){
        return Panthere.builder()
                .age(10)
                .nom("sheba")
                .build();
    }
}
