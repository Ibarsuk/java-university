package task2.ex1;

public class Shape {
    private int width;
    private int height;

    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public String toString() {
        return "Shape{"
                + "width='" + this.width + '\''
                + ", height=" + this.height
                + '}';
    }



}
