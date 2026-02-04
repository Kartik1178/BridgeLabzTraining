package encapsulationAndOthers;

/*
 * Abstract food item
 */
abstract class FoodItem {
    private String name;
    private double price;
    private int qty;

    // Constructor for food item
    public FoodItem(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    // Abstract price calculation
    public abstract double calculateTotal();

    // Getter for total price
    protected double basePrice() {
        return price * qty;
    }
}

/*
 * Interface for discounts
 */
interface Discountable {
    double applyDiscount();
}

/*
 * Veg food implementation
 */
class VegItem extends FoodItem implements Discountable {

    // Constructor for veg item
    public VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    // Calculates total price
    public double calculateTotal() {
        return basePrice() - applyDiscount();
    }
    public double applyDiscount() {
        return basePrice() * 0.05;
    }
}

/*
 * Main class for food delivery
 */
class FoodMain {
    public static void main(String[] args) {
        FoodItem item = new VegItem("Paneer", 200, 2);
        System.out.println("Total: " + item.calculateTotal());
    }
}
