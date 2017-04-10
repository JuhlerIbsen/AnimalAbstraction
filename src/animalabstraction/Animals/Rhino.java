package animalabstraction.Animals;

/**
 *
 * @author micha
 */
public class Rhino extends Animal {

    public Rhino(String name) {
        super(name);
    }

    /**
     * Rhino says Roooar.
     */
    @Override
    public void makeSound() {
        System.out.println("Rooar.");
    }

}
