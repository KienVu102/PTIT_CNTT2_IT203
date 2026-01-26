import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id;

        do {
            System.out.print("Nhap ma ID sach moi (phai > 0): ");
            id = sc.nextInt();

            if (id <= 0) {
                System.out.println("Loi: ID phai la so duong. Moi nhap lai!");
                System.out.println();
            }

        } while (id <= 0);

        // 4. Khi thoát khỏi vòng lặp nghĩa là ID đã đúng
        System.out.println("Xac nhan: Ma sach " + id + " da duoc ghi nhan.");

        sc.close();
    }
}