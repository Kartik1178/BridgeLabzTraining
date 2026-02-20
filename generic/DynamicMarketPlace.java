/*
 * OnlineMarketplace
 *
 * Demonstrates Generic Classes, Generic Methods,
 * and Bounded Type Parameters for product catalog management.
 */
interface Category {}

class BookCategory implements Category {}
class ClothingCategory implements Category {}
class GadgetCategory implements Category {}

class Product<T extends Category> {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + " - $" + price;
    }
}

public class OnlineMarketplace {

    // Generic method to apply discount
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        product.price -= product.price * (percentage / 100);
    }

    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Book", 500);
        applyDiscount(book, 10);
        System.out.println("Discounted Product: " + book);
    }
}
