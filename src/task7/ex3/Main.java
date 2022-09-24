package task7.ex3;

public class Main {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop();

        shop.addFurniture(new Bed("white", "wood"));
        shop.addFurniture(new Table("black", "plastic"));

        shop.spreadAll();
    }
}
