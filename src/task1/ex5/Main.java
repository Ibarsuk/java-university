package task1.ex5;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        float summ = 0;
        for (int i = 1; i <= n; i++) {
            summ += 1.0/i;
            System.out.println(i + ": " + summ + "\n");
        }
    }
}