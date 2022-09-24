package task7.ex1;

public abstract class Dish {
    private String color;
    private String material;

    public Dish(String color, String material) {
        this.color = color;
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    abstract public void clear();
    abstract public void wash();
}
