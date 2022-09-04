package task2.ex4;


public class Main {
    public static void main(String[] args) {
        Kennels kennels = new Kennels();
        System.out.println(kennels);

        kennels.addDogs(new Dog(3, "Bjorn"), new Dog(12, "Ulf"));
        System.out.println(kennels);
    }
}

