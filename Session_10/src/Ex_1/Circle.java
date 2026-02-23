package Ex_1;

public class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
