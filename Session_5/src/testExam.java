import java.util.Scanner;
import java.util.regex.Pattern;

public class testExam {
    static String[] studentIds = new String[100];
    static int currentSize = 0;
    static String regex = "^B\\d{7}$";
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            displayMenu();
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    showAll();
                    break;

                case 2:
                    addStudent();
                    break;

                case 3:
                    updateStudent();
                    break;

                case 4:
                    deleteStudent();
                    break;

                case 5:
                    searchStudent();
                    break;

                case 6:
                    System.out.println("Thoát chương trình.");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }


    public static void showAll() {
        if (currentSize == 0) {
            System.out.println("Danh sách trống!");
        } else {
            for (int i = 0; i < currentSize; i++) {
                System.out.printf("%d. %s\n", (i + 1), studentIds[i]);
            }
        }
    }

    public static void addStudent() {
        if (currentSize >= 100) {
            System.out.println("Mảng đã đầy!");
            return;
        }
        String id = inputValidId();
        studentIds[currentSize++] = id;
        System.out.println("Thêm thành công.");
    }

    public static void updateStudent() {
        System.out.print("Nhập vị trí (index) cần sửa: ");
        int index = Integer.parseInt(scanner.nextLine());
        if (index >= 0 && index < currentSize) {
            studentIds[index] = inputValidId();
            System.out.println("Cập nhật thành công.");
        } else {
            System.out.println("Vị trí không hợp lệ!");
        }
    }

    public static void deleteStudent() {
        System.out.print("Nhập MSSV cần xóa: ");
        String id = scanner.nextLine();
        int index = -1;
        for (int i = 0; i < currentSize; i++) {
            if (studentIds[i].equals(id)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < currentSize - 1; i++) {
                studentIds[i] = studentIds[i + 1];
            }
            studentIds[--currentSize] = null;
            System.out.println("Đã xóa và dồn mảng.");
        } else {
            System.out.println("Không tìm thấy MSSV.");
        }
    }

    public static void searchStudent() {
        System.out.print("Nhập chuỗi tìm kiếm: ");
        String keyword = scanner.nextLine().toLowerCase();
        for (int i = 0; i < currentSize; i++) {
            if (studentIds[i].toLowerCase().contains(keyword)) {
                System.out.println(studentIds[i]);
            }
        }
    }

    private static String inputValidId() {
        while (true) {
            System.out.print("Nhập MSSV (Nhập B + 7 số VD: B1234567): ");
            String id = scanner.nextLine();
            if (Pattern.matches(regex, id)) return id;
            System.out.println("Sai định dạng, nhập lại!");
        }
    }


    private static void displayMenu() {
        System.out.println("\n--- MENU QUẢN LÝ ---");
        System.out.println("1. Hiển thị | 2. Thêm | 3. Sửa | 4. Xóa | 5. Tìm | 6. Thoát");
        System.out.print("Chọn: ");
    }
}