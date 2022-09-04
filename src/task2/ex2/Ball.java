package task2.ex2;

public class Ball {
    private float radius;
    private float weight;
    private String material;

    public Ball(float radius, float weight, String material) {
        this.radius = radius;
        this.weight = weight;
        this.material = material;
    }

    public String toString() {
        return "Ball{"
                + "radius='" + this.radius + '\''
                + ", weight=" + this.weight
                + ", material=" + this.material
                + '}';
    }

}

