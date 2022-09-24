package task7.ex3;

public class Table extends Furniture{
    public Table(String color, String material) {
        super(color, material);
    }

    @Override
    public void spread() {
        System.out.println("Разложить " + this.getColor() + " стол");
    }
}
