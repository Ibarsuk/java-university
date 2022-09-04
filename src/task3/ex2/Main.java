package task3.ex2;

public class Main {
    public static void main(String[] args) {
        Arm leftArm = new Arm(5, 52);
        Arm rightArm = new Arm(5, 51);

        Leg leftLeg = new Leg(5, 121);
        Leg rightLeg = new Leg(5, 121);

        Head head = new Head(20, 30);

        Human human = new Human(leftArm, rightArm, leftLeg ,rightLeg, head);

        System.out.println(human);
    }
}
