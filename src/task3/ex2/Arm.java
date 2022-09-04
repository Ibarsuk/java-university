package task3.ex2;

public class Arm {
    private int fingers;
    private int length;

    public Arm(int fingers, int length) {
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
        return "Arm{"
                + "length='" + this.length + '\''
                + "fingers='" + this.fingers + '\''
                + '}';
    }

}
