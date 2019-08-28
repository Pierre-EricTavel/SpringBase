
package net.itta.ittaspring;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.core.type.AnnotatedTypeMetadata;



@Configuration
//@ComponentScan("net.itta.ittaspring.lions")
@ComponentScan(useDefaultFilters = false,
        includeFilters = @ComponentScan.Filter(type=FilterType.REGEX, pattern = "net\\.itta\\.ittaspring\\.components\\.[LS].*")
        , excludeFilters = @ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE, classes=Feulement.class)
        )
@Import(ZooConfPart2.class)
public class ZooConf {
    
    @Bean(name = "lion")
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Lion lion(){
        return new Lion();
    }
    
   
    @MonAnnotation
    @Bean(initMethod = "nettoyer", destroyMethod = "nettoyer")
    @Conditional(MaCondition.class)
    AutoCage getAutoCage(){
        return new AutoCage(new Animal(){
            @Override
            public String getNom() {
                return "Loyal";
            }
            String nom;
            @Override
            public void setNom(String nom) {
               this.nom=nom;
            }
            {
                System.out.println("Dompteur construit");
            }
            
        });
    }

   
   
  
}
 class MaCondition implements Condition {

        @Override
        public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
           return metadata.isAnnotated("net.itta.ittaspring.MonAnnotation");
        }
    }
