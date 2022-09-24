package task7.ex2;

public class Main {
    public static void main(String[] args) {
        BigDog big = new BigDog("Some big breed");
        SmallDog small = new SmallDog("Some small breed");

        System.out.println(big.getBreed());
        big.bark();
        System.out.println(small.getBreed());
        small.bark();
    }
}
