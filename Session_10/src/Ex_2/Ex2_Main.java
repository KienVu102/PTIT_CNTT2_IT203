package Ex_2;

public class Ex2_Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Volvo");
        Vehicle bicycle = new Bicycle("Thong Nhat");

        System.out.print(car.brand + " - Cách di chuyển: ");
        car.move();

        System.out.print(bicycle.brand + " - Cách di chuyển: ");
        bicycle.move();
    }
}
