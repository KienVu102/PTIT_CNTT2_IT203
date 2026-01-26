import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma khu vuc (A, B, C, D): ");
        // Nếu nhập chữ thường sẽ chuyển thành chữ hoa
        char code = sc.next().toUpperCase().charAt(0);

        switch (code) {
            case 'A':
                System.out.println("Vi tri: Tang 1 - Sach Van hoc");
                break;
            case 'B':
                System.out.println("Vi tri: Tang 2 - Sach Khoa học");
                break;
            case 'C':
                System.out.println("Vi tri: Tang 3 - Sach Ngoai ngu");
                break;
            case 'D':
                System.out.println("Vi tri: Tang 4 - Sach Tin hoc");
                break;
            default:
                System.out.println("Loi: Ma khu vuc khong hop le!");
                break;
        }

        sc.close();
    }
}