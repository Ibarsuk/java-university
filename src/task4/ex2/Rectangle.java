package task4.ex2;

public class Rectangle extends Shape {
    private double width = 0;
    private double length = 0;

    Rectangle() {}

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    @Override
    public String toString() {
        return "Rectangle{"
                + "width='" + this.width + '\''
                + "length='" + this.length + '\''
                + "filled='" + this.isFilled() + '\''
                + ", color=" + this.getColor()
                + '}';
    }
}
