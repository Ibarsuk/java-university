package task7.ex1;

public class Cup extends  Dish {
    private float volume;
    private String handle;

    public Cup(String color, String material, float volume, String handle) {
        super(color, material);

        this.volume = volume;
        this.handle = handle;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    @Override
    public void wash() {
        System.out.println("Налить внутрь воды и тд");
    }

    @Override
    public void clear() {
        System.out.println("Вылить в раковину");
    }
}
