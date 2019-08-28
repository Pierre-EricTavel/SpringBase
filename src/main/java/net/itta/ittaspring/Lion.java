
package net.itta.ittaspring;


public class Lion implements Animal{
 
    private String nom;
    public Lion() {
        System.out.println("Lion construit");
    }

    Lion(String nom) {
        this.nom=nom;
        System.out.println("Lion "+nom+" construit");
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
    
}
