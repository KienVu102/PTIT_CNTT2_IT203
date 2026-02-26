package BTTH;

import java.util.ArrayList;
import java.util.List;

public class BookManager implements IManager<Book> {
    private final List<Book> books = new ArrayList<>();

    @Override
    public void add(Book item) {
        if (existsId(item.getId())) {
            System.out.println("Loi: ID sach da ton tai.");
            return;
        }
        books.add(item);
        System.out.println("Them sach thanh cong.");
    }

    @Override
    public void update(Book item) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == item.getId()) {
                books.set(i, item);
                System.out.println("Cap nhat sach thanh cong.");
                return;
            }
        }
        System.out.println("Loi: Khong tim thay sach co ID " + item.getId());
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == id) {
                books.remove(i);
                System.out.println("Xoa sach thanh cong.");
                return;
            }
        }
        System.out.println("Loi: Khong tim thay sach co ID " + id);
    }

    @Override
    public void displayAll() {
        if (books.isEmpty()) {
            System.out.println("Danh sach sach dang rong.");
            return;
        }
        System.out.println("--- DANH SACH SACH ---");
        for (Book book : books) {
            book.displayData();
        }
    }

    public boolean existsId(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return true;
            }
        }
        return false;
    }
}
