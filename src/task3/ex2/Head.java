package task3.ex2;

public class Head {
    private int width;
    private int height;

    public Head(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public String toString() {
        return "Head{"
                + "height='" + this.height + '\''
                + "width='" + this.width + '\''
                + '}';
    }

}
