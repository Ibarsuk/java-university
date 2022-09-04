package task3.ex2;

public class Leg {
    private int fingers;
    private int length;

    public Leg(int fingers, int length) {
        this.fingers = fingers;
        this.length = length;
    }

    public int getFingers() {
        return this.fingers;
    }

    public void setFingers(int fingers) {
        this.fingers = fingers;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }


    public String toString() {
        return "Leg{"
                + "length='" + this.length + '\''
                + "fingers='" + this.fingers + '\''
                + '}';
    }

}
