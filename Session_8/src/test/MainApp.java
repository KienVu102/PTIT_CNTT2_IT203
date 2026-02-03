package test;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        StudentManagement manager = new StudentManagement();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== HỆ THỐNG QUẢN LÝ SINH VIÊN =====");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Tìm kiếm sinh viên theo mã");
            System.out.println("4. Sắp xếp theo điểm TB (Giảm dần)");
            System.out.println("5. Xóa sinh viên");
            System.out.println("9. Thoát");
            System.out.print("Chọn chức năng: ");

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                choice = -1;
            }

            switch (choice) {
                case 1:
                    System.out.print("Mã SV: "); String id = sc.nextLine();
                    System.out.print("Họ tên: "); String name = sc.nextLine();
                    System.out.print("Tuổi: "); int age = Integer.parseInt(sc.nextLine());
                    System.out.print("Giới tính: "); String gender = sc.nextLine();
                    System.out.print("Điểm Toán: "); double m = Double.parseDouble(sc.nextLine());
                    System.out.print("Điểm Lý: "); double p = Double.parseDouble(sc.nextLine());
                    System.out.print("Điểm Hóa: "); double c = Double.parseDouble(sc.nextLine());

                    if (manager.addStudent(new Student(id, name, age, gender, m, p, c)))
                        System.out.println("=> Thêm thành công!");
                    else
                        System.out.println("=> Lỗi: Trùng mã hoặc bộ nhớ đầy!");
                    break;
                case 2:
                    manager.displayAll();
                    break;
                case 3:
                    System.out.print("Nhập mã cần tìm: ");
                    Student s = manager.findById(sc.nextLine());
                    System.out.println(s != null ? s : "=> Không tìm thấy!");
                    break;
                case 4:
                    manager.sortByAverageDescending();
                    System.out.println("=> Đã sắp xếp xong!");
                    break;
                case 5:
                    System.out.print("Nhập mã cần xóa: ");
                    if (manager.deleteById(sc.nextLine()))
                        System.out.println("=> Xóa thành công!");
                    else
                        System.out.println("=> Không tìm thấy mã sinh viên!");
                    break;
                case 9:
                    System.out.println("Đang thoát chương trình...");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 9);
    }
}
