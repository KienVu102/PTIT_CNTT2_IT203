import java.util.Scanner;

public class Ex_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Khai báo các biến tạm
        int max = Integer.MIN_VALUE; // Gán giá trị nhỏ nhất có thể để tìm Max
        int min = Integer.MAX_VALUE; // Gán giá trị lớn nhất có thể để tìm Min
        double tongMuon = 0;
        int soNgayMoCua = 0;

        String[] ngayTrongTuan = {"Thu 2", "Thu 3", "Thu 4", "Thu 5", "Thu 6", "Thu 7", "Chu Nhat"};

        // 2. Vòng lặp for chạy 7 lần tương ứng 7 ngày
        for (int i = 0; i < 7; i++) {
            System.out.print("Nhap luot muon ngay " + ngayTrongTuan[i] + ": ");
            int luotMuon = sc.nextInt();

            // 3. Sử dụng continue nếu ngày đó không có lượt mượn (đóng cửa)
            if (luotMuon == 0) {
                continue;
            }

            // 4. Kỹ thuật tìm Max và Min
            if (luotMuon > max) {
                max = luotMuon;
            }
            if (luotMuon < min) {
                min = luotMuon;
            }

            // Tích lũy để tính trung bình
            tongMuon += luotMuon;
            soNgayMoCua++;
        }

        // 5. In kết quả thống kê
        System.out.println("\n--- KET QUA THONG KE ---");
        if (soNgayMoCua > 0) {
            System.out.println("Luot muon cao nhat: " + max);
            System.out.println("Luot muon thap nhat: " + min);
            System.out.println("Trung binh luot muon/ngay: " + (tongMuon / soNgayMoCua));
        } else {
            System.out.println("Thu vien khong mo cua ngay nao trong tuan.");
        }

        sc.close();
    }
}