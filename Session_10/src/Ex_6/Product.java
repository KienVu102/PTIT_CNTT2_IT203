package Ex_6;

public class Product {
    public String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}