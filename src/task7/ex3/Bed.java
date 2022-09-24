package task7.ex3;

public class Bed extends  Furniture{
    public Bed(String color, String material) {
        super(color, material);
    }

    @Override
    public void spread() {
        System.out.println("Разложить " + this.getColor() + " кровать");
    }
}
