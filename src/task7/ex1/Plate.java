package task7.ex1;

public class Plate extends Dish{
    private float radius;
    private  float deep;

    public Plate(String color, String material, float radius, float deep) {
        super(color, material);

        this.radius = radius;
        this.deep = deep;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getDeep() {
        return deep;
    }

    public void setDeep(float deep) {
        this.deep = deep;
    }

    @Override
    public void wash() {
        System.out.println("Протереть губкой и тд");
    }

    @Override
    public void clear() {
        System.out.println("Перевернуть над миской или мусорным ведром");
    }
}
