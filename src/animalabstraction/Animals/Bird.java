package animalabstraction.Animals;

/**
 *
 * @author micha
 */
public class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    /**
     * Birds squeek.
     */
    @Override
    public void makeSound() {
        System.out.println("Squeek squeek");
    }
    
}
