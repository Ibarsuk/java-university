package task2.ex4;

import java.util.ArrayList;
import java.util.Collection;

public class Kennels {
    private ArrayList<Dog> dogs = new ArrayList<>();

    public void addDogs(Dog... dogsToAdd) {
        for (Dog dog : dogsToAdd) {
            dogs.add(dog);
        }
    }

    public String toString() {
        return "Kennels{"
                + "dogsNumber='" + this.dogs.size() + '\''
                + '}';
    }
}
