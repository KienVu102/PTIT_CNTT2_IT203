package Mini_Project.models;

public class Pet {
    private String id;
    private String name;
    private String species;
    private int age;
    private double price;

    public Pet(String id, String name, String species, int age, double price) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.age = age;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | " + "Ten: " + name + " | " + "Loai: " + species + " | " + "Tuoi: " + age + " | "
                + "Gia: " + price;
    }
}
