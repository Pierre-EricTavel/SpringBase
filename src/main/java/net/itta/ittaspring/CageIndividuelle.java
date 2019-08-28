
package net.itta.ittaspring;


public class CageIndividuelle {
    private Animal animal;

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public CageIndividuelle() {
        System.out.println("Cage Individuelle construite");
    }

}
