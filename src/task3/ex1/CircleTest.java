package task3.ex1;

import java.awt.*;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(new Point(3, 6), 5);

        System.out.println(circle);

        circle.setRadius(4);
        circle.setCenter(new Point(1, 1));

        System.out.println(circle);
    }
}
