package task7.ex3;

import task2.ex4.Dog;

import java.util.ArrayList;

public class FurnitureShop {
    private ArrayList<Furniture> furnitures = new ArrayList<>();

    public void addFurniture(Furniture... furnitureToAdd) {
        for (Furniture furniture : furnitureToAdd) {
            furnitures.add(furniture);
        }
    }

    public void spreadAll() {
        for (Furniture furniture : furnitures) {
            furniture.spread();
        }
    }
}
