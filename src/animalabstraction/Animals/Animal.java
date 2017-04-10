package animalabstraction.Animals;

/**
 *
 * @author micha
 */
public abstract class Animal {

    private String name;

    /**
     * Animal Constructor
     *
     * @param name
     */
    public Animal(String name) {
        this.name = name;
    }

    /**
     * Get the name of the Animal.
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the Animal.
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Make eating sound.
     */
    public void eat() {
        System.out.println("Nom nom nom");
    }

    public abstract void makeSound();

}
