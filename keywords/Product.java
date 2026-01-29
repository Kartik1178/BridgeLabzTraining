/*
 * Product Management System
 * This class represents a product in a store.
 * It demonstrates the use of static variables and methods,
 * the this keyword for constructor initialization,
 * a final variable for unique product identification,
 * and the instanceof operator to verify object type
 * before displaying product details.
 */
class Product {

    static int discount;
    private String productName;
    private int price;
    private int quantity;
    final int productId;

    // Constructor to initialize product details using this
    Product(String productName, int price, int quantity, int productId) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productId = productId;
    }

    // Static method to update discount for all products
    static int updateDiscount(int newDiscount) {
        discount = newDiscount;
        return discount;
    }

    // Method to display product details after instanceof check
    void displayDetails(Object o) {
        if (o instanceof Product) {
            Product p = (Product) o;
            System.out.println(
                    "Product ID: " + p.productId +
                            ", Name: " + p.productName +
                            ", Price: " + p.price +
                            ", Quantity: " + p.quantity +
                            ", Discount: " + discount + "%"
            );
        } else {
            System.out.println("Not a valid product");
        }
    }

    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 50000, 2, 101);
        Product p2 = new Product("Phone", 30000, 1, 102);

        Product.updateDiscount(10);

        p1.displayDetails(p1);
        p2.displayDetails(p2);
    }
}
