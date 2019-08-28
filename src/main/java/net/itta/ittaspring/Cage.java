/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.itta.ittaspring;

import java.util.List;


/**
 *
 * @author Administrator
 */
public class Cage{
    
    List<Animal> animaux;

    public List<Animal> getAnimaux() {
        return animaux;
    }

    public void setAnimaux(List<Animal> animaux) {
        this.animaux = animaux;
    }

    public Cage() {
        System.out.println("Cage construite");
    }
    
    public void nettoyer(){
        System.out.println("La cage est nettoyée");
    }

}
