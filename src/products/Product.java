package products;

public abstract class Product {
    private  String title;
    private double price;
    private String id;

    public Product(String title, double price, String id) {
        this.title = title;
        this.price = price;
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Title: " + title + ", Price: " + price;
    }

    protected abstract String generateId();


}
