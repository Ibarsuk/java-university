package task6.ex2;

import task4.ex2.Rectangle;
import task5.ex1.Movable;
import task5.ex1.MovablePoint;

public class MovableRectangle extends Rectangle implements Movable {
    private MovablePoint position;

    public MovableRectangle(int x, int y, int xSpeed, int ySpeed, double width, double length) {
        super(width, length);

        this.position = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public MovableRectangle(int x, int y, int xSpeed, int ySpeed, double width, double length, String color, boolean filled) {
        super(width, length, color, filled);

        this.position = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public void moveUp() {
        this.position.moveUp();
    }

    @Override
    public void moveDown() {
        this.position.moveDown();
    }

    @Override
    public void moveLeft() {
        this.position.moveLeft();
    }

    @Override
    public void moveRight() {
        this.moveRight();
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "position=" + position + '\''
                + "width='" + this.getWidth() + '\''
                + "length='" + this.getLength() + '\''
                + "filled='" + this.isFilled() + '\''
                + ", color=" + this.getColor()
                + "} ";
    }
}
