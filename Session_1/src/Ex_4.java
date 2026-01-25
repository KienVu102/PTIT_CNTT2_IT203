import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final float EXCHANGE_RATE = 25450.0f;

        System.out.print("Nhập giá sách (USD - kiểu double): ");
        double priceUsd = sc.nextDouble();

        double totalVnd = priceUsd * EXCHANGE_RATE;

        long roundedVnd = (long) totalVnd;

        System.out.println("Tỷ giá hiện tại: " + EXCHANGE_RATE);
        System.out.println("Giá chính xác: " + totalVnd);
        System.out.println("Giá làm tròn để thanh toán: " + roundedVnd);

        sc.close();
    }
}