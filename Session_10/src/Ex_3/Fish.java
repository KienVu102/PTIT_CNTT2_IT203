package Ex_3;

public class Fish extends Animal implements Swimmable{
    public Fish(String name) {
        super(name);
    }

    @Override
    public String swim() {
        return "Có thể bơi";
    }
}
