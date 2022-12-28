package task18;

public class task18_2_3_4 {
    public void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (Exception e) {
            System.out.println("Поймали исключение Exception");
        } finally {
            System.out.println("Это в любом случае будет в консоли");
        }
    }

    public static void main(String[] args) {
        task18_2_3_4 task = new task18_2_3_4();
        task.exceptionDemo();
    }
}
