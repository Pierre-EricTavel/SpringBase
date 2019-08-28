

package net.itta.ittaspring.components;

import org.springframework.stereotype.Service;

@Service("ServiceUnique")
public class ServiceUnique {
    
    private int etat;

    public int getEtat() {
        return etat;
    }

    public synchronized void setEtat(int etat) {
        this.etat = etat;
    }
    
    
    public synchronized void incEtat(int etat) {
        this.etat++;
    }
    
    
    
}
