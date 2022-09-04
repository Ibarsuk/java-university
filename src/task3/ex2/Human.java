package task3.ex2;

public class Human {
    private Arm leftArm;
    private Arm rightArm;

    private Leg leftLeg;
    private Leg rightLeg;

    private Head head;

    public Human(Arm leftArm, Arm rightArm, Leg leftLeg, Leg rightLeg, Head head) {
        this.leftArm = leftArm;
        this.rightArm = rightArm;

        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;

        this.head = head;
    }

    public String toString() {
        return "Human{\n"
                + "leftArm=" + this.leftArm.toString() + '\n'
                + "rightArm=" + this.rightArm.toString() + '\n'

                + "leftLeg=" + this.leftLeg.toString() + '\n'
                + "rightLeg=" + this.rightLeg.toString() + '\n'

                + "head=" + this.head.toString() + '\n'
                + '}';
    }
}
