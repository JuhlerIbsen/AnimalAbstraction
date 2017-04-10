package animalabstraction;

import animalabstraction.Animals.Animal;
import animalabstraction.Animals.Bird;
import animalabstraction.Animals.Rhino;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author micha
 */
public class AnimalAbstraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Animal> animalList = new ArrayList();

        animalList.add(new Rhino("Victor"));
        animalList.add(new Bird("Peep"));

        for (Animal animal : animalList) {
            animal.makeSound();
            animal.eat();
        }

    }

}
