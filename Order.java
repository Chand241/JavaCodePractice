package OnlineShopping;

import java.util.ArrayList;
import java.util.List;

public class Order {
    int order_id;
    double total_amount;
    List<Product> list;

    static int o = 1;

    Order(List<Product> list) {
        this.order_id = o++;
        this.list = new ArrayList<>(list); // copy the products
        this.total_amount = invoice();
    }

    void display_order() {
        System.out.println("\n----Order ID: " + order_id + " ----");
        for (Product u : list) {
            System.out.println(u);
        }
        System.out.println("Total Amount : " + total_amount);
    }

    double invoice() {
        double sum = 0;
        for (Product u : list) {
            sum += u.price;
        }
        return sum;
    }
}
