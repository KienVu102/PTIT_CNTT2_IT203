import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int daily_fines = 5000;

        System.out.print("Nhap so luong sach tra muon: ");
        int n = sc.nextInt();

        long totalDayLate = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Nhap so ngay tre cua cuon thu " + i + ": ");
            int dayLate = sc.nextInt();

            totalDayLate += dayLate;
        }

        long tongTienPhat = totalDayLate * daily_fines;

        // 5. In kết quả cuối cùng
        System.out.println("===> Tong tien phat: " + tongTienPhat + " VND");

        sc.close();
    }
}