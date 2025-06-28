package OnlineShopping;

public class Product {
    String name;
    int price;

    Product(String n, int p) {
        this.name = n;
        this.price = p;
    }

    void displayProduct() {
        System.out.println("-----Product-----");
        System.out.println("Name : " + name + "\nPrice : " + price);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Price: " + price;
    }
}