package products;

public class Accessory extends Product{
    private String color;
    private static int UUID = 3000;

    public Accessory(String title, double price, String color) {
        super(title, price);
        this.color = color;

    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    protected String generateId() {
        UUID++;
        return String.valueOf(UUID);
    }

    @Override
    public String toString() {
        return super.toString() + "Color: " + color;
    }

}
