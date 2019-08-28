/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.itta.ittaspring;

public class Feulement {
    
    private final Lion lion;
    private final String cri;

    public Lion getLion() {
        return lion;
    }

    public Feulement(Lion lion) {
       this( lion, null);
    }
    
    public Feulement(Lion lion, String cri) {
        this.lion = lion;
        this.cri=cri;
    }
    
    
    public void doIt(){
        if(cri==null)
            System.out.println( lion.getNom() +  " feule.");
        else
            System.out.println( lion.getNom() +  " fait " + cri);
    }
    
}
