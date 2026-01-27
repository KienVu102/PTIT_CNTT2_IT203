import java.util.Scanner;

public class Ex_2 {
    public static int searchBooks(String[] arr, String search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(search)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] books = {
                "Lap trinh Java",
                "Cau truc du lieu",
                "Giai thuat",
                "Co so du lieu",
                "Mang may tinh"
        };

        System.out.print("Nhap ten sach can tim: ");
        String search = sc.nextLine();

        int index = searchBooks(books, search);

        if (index != -1) {
            System.out.println("Tim thay tai vi tri " + index);
        } else {
            System.out.println("Sach khong ton tai");
        }

        sc.close();
    }
}