import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luaChon;
        int n = 0; // Biến n dùng chung cho các chức năng
        boolean daNhapN = false; // Kiểm tra xem người dùng đã nhập n chưa

        do {
            // Hiển thị Menu
            System.out.println("\n+------------------Menu---------------------+");
            System.out.println("|1. Nhap vao 1 so nguyen duong n            |");
            System.out.println("|2. Tinh tong cua so chan va tong so le < n |");
            System.out.println("|3. Tim cac so hoan hao < n                 |");
            System.out.println("|4. Tinh n!                                 |");
            System.out.println("|5. Thoat chuong trinh                      |");
            System.out.println("+-------------------------------------------+");
            System.out.print("Moi ban chon (1-5): ");
            luaChon = sc.nextInt();

            switch (luaChon) {
                case 1:
                    // Chức năng 1: Nhập số nguyên dương n
                    do {
                        System.out.print("Nhap n (phai la so duong): ");
                        n = sc.nextInt();
                        if (n <= 0) System.out.println("Loi: n phai lon hon 0!");
                    } while (n <= 0);
                    daNhapN = true;
                    System.out.println("Da luu n = " + n);
                    break;

                case 2:
                    // Chức năng 2: Tính tổng chẵn/lẻ < n
                    if (!daNhapN) {
                        System.out.println("Vui long chon muc 1 de nhap n truoc!");
                    } else {
                        int tongChan = 0, tongLe = 0;
                        for (int i = 1; i < n; i++) {
                            if (i % 2 == 0) tongChan += i;
                            else tongLe += i;
                        }
                        System.out.println("Tong cac so chan < " + n + " la: " + tongChan);
                        System.out.println("Tong cac so le < " + n + " la: " + tongLe);
                    }
                    break;

                case 3:
                    // Chức năng 3: Tìm số hoàn hảo < n
                    if (!daNhapN) {
                        System.out.println("Vui long nhap n truoc!");
                    } else {
                        System.out.print("Cac so hoan hao < " + n + " la: ");
                        boolean coSoHoanHao = false;
                        for (int i = 1; i < n; i++) {
                            int tongUoc = 0;
                            for (int j = 1; j <= i / 2; j++) {
                                if (i % j == 0) tongUoc += j;
                            }
                            if (tongUoc == i && i != 0) {
                                System.out.print(i + " ");
                                coSoHoanHao = true;
                            }
                        }
                        if (!coSoHoanHao) System.out.print("Khong co");
                        System.out.println();
                    }
                    break;

                case 4:
                    // Chức năng 4: Tính n! (Giai thừa)
                    if (!daNhapN) {
                        System.out.println("Vui long nhap n truoc!");
                    } else {
                        long giaiThua = 1;
                        for (int i = 1; i <= n; i++) {
                            giaiThua *= i;
                        }
                        System.out.println(n + "! = " + giaiThua);
                    }
                    break;

                case 5:
                    System.out.println("Chuong trinh ket thuc. Tam biet!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn từ 1-5!");
            }
        } while (luaChon != 5);

        sc.close();
    }
}