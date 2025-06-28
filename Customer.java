package OnlineShopping;

public class Customer {
    String name;
    Cart cart = new Cart();

    Customer(String n) {
        this.name = n;
    }

    public static void main(String[] args) {
        Customer cus = new Customer("Chand");

        Product p1 = new Product("Laptop", 10);
        Product p2 = new Product("Desktop", 100);

        cus.cart.addProduct(p1);
        cus.cart.addProduct(p2);

        cus.cart.disCart(); // Optional: see what's in cart

        Order order1 = new Order(cus.cart.products);
        order1.display_order();
        
        
        Product p3 = new Product("Laptop", 350);
        Product p4 = new Product("Desktop", 300);

        cus.cart.addProduct(p3);
        cus.cart.addProduct(p4);

        cus.cart.disCart(); // Optional: see what's in cart

        Order order2 = new Order(cus.cart.products);
        order2.display_order();
    }
}