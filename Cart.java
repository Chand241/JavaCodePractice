package OnlineShopping;

import java.util.ArrayList;
public class Cart {
    ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product p) {
        products.add(p);
    }

    void removeProduct(Product p) {
        products.remove(p);
    }

    void disCart() {
        System.out.println("\n----------- Cart ----------");
        for (Product u : products) {
            System.out.println(u);
        }
    }
}