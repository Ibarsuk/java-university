package task3.ex1;

import java.awt.*;

public class Circle {
    private Point center;
    private int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return this.center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    public String toString() {
        return "Circle{"
                + "radius='" + this.radius + '\''
                + ", center=" +  "x:" + this.center.x + " y:" + this.center.y
                + '}';
    }

}
