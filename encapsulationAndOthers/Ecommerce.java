package encapsulationAndOthers;

/*
 * Abstract product class
 */
abstract class Product {
    private int id;
    private String name;
    private double price;

    // Constructor to initialize product
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Abstract method for discount
    public abstract double calculateDiscount();

    // Getter for price
    public double getPrice() {
        return price;
    }
}

/*
 * Interface for tax calculation
 */
interface Taxable {
    double calculateTax();
}

/*
 * Electronics product implementation
 */
class Electronics extends Product implements Taxable {

    // Constructor for electronics
    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    // Calculates discount
    public double calculateDiscount() {
        return getPrice() * 0.10;
    }

    // Calculates tax
    public double calculateTax() {
        return getPrice() * 0.18;
    }
}

/*
 * Main class for e-commerce demo
 */
class EcommerceMain {
    public static void main(String[] args) {
        Product p = new Electronics(101, "Laptop", 60000);
        Taxable t = (Taxable) p;

        double finalPrice = p.getPrice() + t.calculateTax() - p.calculateDiscount();
        System.out.println("Final Price: " + finalPrice);
    }
}
