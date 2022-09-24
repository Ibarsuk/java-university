package task7.ex1;

public class Main {
    public static void main(String[] args) {
        Cup cup = new Cup("white", "silver", 250, "round");
        Plate plate = new Plate("green", "ceramics", 15, 6);

        System.out.println(cup.getMaterial());
        cup.clear();
        cup.wash();

        System.out.println(plate.getDeep());
        plate.clear();
        plate.wash();
    }
}
