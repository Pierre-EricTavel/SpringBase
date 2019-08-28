/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.itta.initializer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 *
 * @author Administrator
 */
public class PostProcessor   implements BeanPostProcessor {
     @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
       // if(bean instanceof Animal)
            System.out.println("post after bean ="+beanName);
        return bean;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
       // if(bean instanceof Animal)
            System.out.println("post before bean="+beanName);
        return bean;
    }
    
    
    
    
}
