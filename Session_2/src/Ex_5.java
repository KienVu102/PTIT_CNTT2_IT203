import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Khởi tạo điểm uy tín ban đầu là 100
        int diemUyTin = 100;
        int ngayTre;

        System.out.println("--- HE THONG DANH GIA DOC GIA ---");
        System.out.println("(Nhap so ngay tre. Nhap 999 de ket thuc)");

        // 2. Sử dụng vòng lặp while để nhập dữ liệu liên tục
        while (true) {
            System.out.print("So ngay tre cua lan nay: ");
            ngayTre = sc.nextInt();

            // Kiểm tra mã thoát 999
            if (ngayTre == 999) {
                break;
            }

            // 3. Quy tắc tính điểm
            if (ngayTre <= 0) {
                // Trả đúng hạn hoặc sớm: Cộng 5 điểm
                diemUyTin += 5;
                System.out.println("-> Tra dung han: +5 diem.");
            } else {
                // Trả muộn: Trừ (số ngày trễ x 2) điểm
                int diemTru = ngayTre * 2;
                diemUyTin -= diemTru;
                System.out.println("-> Tra tre " + ngayTre + " ngay: -" + diemTru + " diem.");
            }
        }

        // 4. In tổng điểm và xếp loại
        System.out.println("---------------------------------");
        System.out.println("Tong diem uy tin: " + diemUyTin);

        System.out.print("Xep loai: ");
        if (diemUyTin > 120) {
            System.out.println("DOC GIA THAN THIET");
        } else if (diemUyTin >= 80) {
            System.out.println("DOC GIA TIEU CHUAN");
        } else {
            System.out.println("DOC GIA CAN LUU Y");
        }

        sc.close();
    }
}