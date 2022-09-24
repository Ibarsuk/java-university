package task7.ex2;

public class SmallDog extends Dog{

    public SmallDog(String breed) {
        super(breed);
    }
    @Override
    void bark() {
        System.out.println("High quiet bark");
    }
}
