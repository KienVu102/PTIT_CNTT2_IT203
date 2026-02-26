package BTTH;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager implements IManager<Category> {
    private final List<Category> categories = new ArrayList<>();

    @Override
    public void add(Category item) {
        if (existsId(item.getId())) {
            System.out.println("Loi: ID danh muc da ton tai.");
            return;
        }
        categories.add(item);
        System.out.println("Them danh muc thanh cong.");
    }

    @Override
    public void update(Category item) {
        for (int i = 0; i < categories.size(); i++) {
            if (categories.get(i).getId() == item.getId()) {
                categories.set(i, item);
                System.out.println("Cap nhat danh muc thanh cong.");
                return;
            }
        }
        System.out.println("Loi: Khong tim thay danh muc co ID " + item.getId());
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < categories.size(); i++) {
            if (categories.get(i).getId() == id) {
                categories.remove(i);
                System.out.println("Xoa danh muc thanh cong.");
                return;
            }
        }
        System.out.println("Loi: Khong tim thay danh muc co ID " + id);
    }

    @Override
    public void displayAll() {
        if (categories.isEmpty()) {
            System.out.println("Danh sach danh muc dang rong.");
            return;
        }
        System.out.println("--- DANH SACH DANH MUC ---");
        for (Category category : categories) {
            category.displayData();
        }
    }

    public boolean existsId(int id) {
        for (Category category : categories) {
            if (category.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return categories.isEmpty();
    }
}
