package Ex_1;

public class Ex1_Main {
    public static void main(String[] args) {
        Circle firstCircle = new Circle(4.5);
        Rectangle firstRectangle = new Rectangle(3,7);

        System.out.println("Hình tròn: ");
        System.out.println("Diện tích hình tròn: " + Math.round(firstCircle.getArea()));
        System.out.println("Chu vi hình tròn: " + Math.round(firstCircle.getPerimeter()));

        System.out.println("\nHình chữ nhật: ");
        System.out.println("Diện tích hình chữ nhật: " + firstRectangle.getArea());
        System.out.println("Chu vi hình chữ nhật: " + firstRectangle.getPerimeter());

    }


}
