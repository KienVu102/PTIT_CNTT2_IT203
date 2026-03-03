package Mini_Test;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ProductRepository repo = new ProductRepository();

        repo.add(new ElectronicProduct("E01", "Laptop A", 15000000, 24));
        repo.add(new ElectronicProduct("E02", "Phone B", 8000000, 18));
        repo.add(new ElectronicProduct("E03", "Computer", 35000000, 36));
        repo.add(new FoodProduct("F01", "Hotdog", 20000, 10));
        repo.add(new FoodProduct("F02", "Hambuger", 30000, 25));

        System.out.println("Danh sách sản phẩm");
        for (Product p : repo.findAll()) {
            p.displayInfo();
            System.out.println("Thành tiền: " + p.calculateFinalPrice());
            System.out.println("\n");
        }

        System.out.println("Tìm kiếm ID: E03");
        Product found = repo.findById("E03");
        if (found != null) {
            found.displayInfo();
        }
        System.out.println("\n");

        List<Product> sortedList = repo.findAll();
        sortedList.sort(Comparator.comparing(Product::getPrice));
        System.out.println("Bảng giá sản phẩm đã đc sắp xếp theo thứ tự tăng dần");
        for(Product p: sortedList){
            p.displayInfo();
        }

        Map<String, Integer> stats = new HashMap<>();
        stats.put("Electronic", 0);
        stats.put("Food", 0);
        for (Product p : repo.findAll()) {
            if (p instanceof ElectronicProduct) {
                stats.put("Electronic", stats.get("Electronic") + 1);
            } else if (p instanceof FoodProduct) {
                stats.put("Food", stats.get("Food") + 1);
            }
        }
        System.out.println("\nThống kê");
        System.out.println(stats);

    }
}
