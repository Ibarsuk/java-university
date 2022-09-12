package task4.ex2;

public class Square extends Rectangle{
    Square(){}

    Square(double side) {
        super(side, side);
    }

    Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return this.getWidth();
    }

    public void setSide(double side) {
        this.setWidth(side);
        this.setLength(side);
    }

    @Override
    public String toString() {
        return "Square{"
                + "side='" + this.getWidth() + '\''
                + "filled='" + this.isFilled() + '\''
                + ", color=" + this.getColor()
                + '}';
    }
}
