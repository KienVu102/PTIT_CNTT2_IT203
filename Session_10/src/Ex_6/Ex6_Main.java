package Ex_6;

import java.text.NumberFormat;
import java.util.*;

public class Ex6_Main {
    public static void main(String[] args) {
        List<Product> listProduct = new ArrayList<>();

        Product product1 = new Product("Laptop Dell XP", 12000000);
        Product product2 = new Product("Samsung Galaxy A22", 32000000);
        Product product3 = new Product("Bàn phím cơ 351", 120000);
        Product product4 = new Product("Chuột không dây Logitech", 150000);

        listProduct.add(product1);
        listProduct.add(product2);
        listProduct.add(product3);
        listProduct.add(product4);

        // Sử dụng Anonymous Class
//        Collections.sort(listProduct, new Comparator<Product>() {
//            @Override
//            public int compare(Product p1, Product p2) {
//                return p1.getPrice().compareTo(p2.getPrice()); // ???
//            }
//        });

        // Sử dụng lambdaExpression
        NumberFormat nf = NumberFormat.getNumberInstance();
        listProduct.sort((p1,p2) -> p1.getName().compareTo(p2.getName()));
        for (Product product : listProduct){
            System.out.println(product.name + " - " + nf.format(product.price));
        }

    }
}
