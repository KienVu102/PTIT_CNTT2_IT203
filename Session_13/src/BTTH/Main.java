package BTTH;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CategoryManager categoryManager = new CategoryManager();
        BookManager bookManager = new BookManager();

        IManager<Category> categoryService = categoryManager;
        IManager<Book> bookService = bookManager;

        int choice;
        do {
            System.out.println("\n========== HE THONG QUAN LY THU VIEN ==========");
            System.out.println("1. Quan ly Danh muc");
            System.out.println("2. Quan ly Sach");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    showCategoryMenu(scanner, categoryService);
                    break;
                case 2:
                    showBookMenu(scanner, bookService, categoryManager);
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        } while (choice != 0);
    }

    private static void showCategoryMenu(Scanner scanner, IManager<Category> categoryService) {
        int choice;
        do {
            System.out.println("\n----- MENU QUAN LY DANH MUC -----");
            System.out.println("1. Them danh muc");
            System.out.println("2. Sua danh muc");
            System.out.println("3. Xoa danh muc");
            System.out.println("4. Hien thi tat ca danh muc");
            System.out.println("0. Quay lai");
            System.out.print("Nhap lua chon: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    categoryService.add(inputCategory(scanner));
                    break;
                case 2:
                    categoryService.update(inputCategory(scanner));
                    break;
                case 3:
                    System.out.print("Nhap ID danh muc can xoa: ");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    categoryService.delete(deleteId);
                    break;
                case 4:
                    categoryService.displayAll();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        } while (choice != 0);
    }

    private static void showBookMenu(Scanner scanner, IManager<Book> bookService, CategoryManager categoryManager) {
        int choice;
        do {
            System.out.println("\n----- MENU QUAN LY SACH -----");
            System.out.println("1. Them sach");
            System.out.println("2. Sua sach");
            System.out.println("3. Xoa sach");
            System.out.println("4. Hien thi tat ca sach");
            System.out.println("0. Quay lai");
            System.out.print("Nhap lua chon: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    Book newBook = inputBook(scanner, categoryManager);
                    if (newBook != null) {
                        bookService.add(newBook);
                    }
                    break;
                case 2:
                    Book updatedBook = inputBook(scanner, categoryManager);
                    if (updatedBook != null) {
                        bookService.update(updatedBook);
                    }
                    break;
                case 3:
                    System.out.print("Nhap ID sach can xoa: ");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    bookService.delete(deleteId);
                    break;
                case 4:
                    bookService.displayAll();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        } while (choice != 0);
    }

    private static Category inputCategory(Scanner scanner) {
        System.out.print("Nhap ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap ten danh muc: ");
        String name = scanner.nextLine();
        System.out.print("Nhap mo ta: ");
        String description = scanner.nextLine();
        return new Category(id, name, description);
    }

    private static Book inputBook(Scanner scanner, CategoryManager categoryManager) {
        if (categoryManager.isEmpty()) {
            System.out.println("Ban can them danh muc truoc khi them/sua sach.");
            return null;
        }

        System.out.println("Danh sach danh muc hien co:");
        categoryManager.displayAll();

        System.out.print("Nhap ID sach: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap tieu de: ");
        String title = scanner.nextLine();
        System.out.print("Nhap tac gia: ");
        String author = scanner.nextLine();
        System.out.print("Nhap categoryId: ");
        int categoryId = Integer.parseInt(scanner.nextLine());

        if (!categoryManager.existsId(categoryId)) {
            System.out.println("Loi: categoryId khong ton tai.");
            return null;
        }

        return new Book(id, title, author, categoryId);
    }
}
