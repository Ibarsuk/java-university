package task7.ex2;

public class BigDog extends Dog{

    public BigDog(String breed) {
        super(breed);
    }
    @Override
    void bark() {
        System.out.println("deep loud bark");
    }
}
