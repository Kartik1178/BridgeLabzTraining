package level2;

/*
 * Manages product inventory using
 * instance and class variables.
 */
public class ProductInventory {

    String productName;
    double price;
    static int totalProducts = 0;

    // Parameterized constructor
    ProductInventory(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // Displays product details
    void displayProductDetails() {
        System.out.println(productName + " - " + price);
    }

    // Displays total number of products
    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}
