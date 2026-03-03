package Mini_Test;

public abstract class Product {
    protected String id;
    protected String name;
    protected double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateFinalPrice();

    public void displayInfo() {
        System.out.print("ID: " + id + ", Tên: " + name + ", Giá gốc: " + price);
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }
}