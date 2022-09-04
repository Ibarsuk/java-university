package task2.ex4;

public class Dog {
    private int age;
    private String name;

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHumanLikeAge() {
        return this.age * 7;
    }

    public String toString() {
        return "Dog{"
                + "age='" + this.age + '\''
                + ", name=" + this.name
                + '}';
    }

}
