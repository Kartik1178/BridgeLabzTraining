/*
 * Represents a shopping cart item
 * and calculates total cost.
 */
public class CartItem {

    String itemName;
    double price;
    int quantity;

    // Initializes cart item
    CartItem(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = 0;
    }

    // Adds quantity to cart
    void addItem(int qty) {
        if (qty > 0) quantity += qty;
    }

    // Removes quantity from cart
    void removeItem(int qty) {
        if (qty > 0 && qty <= quantity) quantity -= qty;
    }

    // Displays total cost
    void displayTotalCost() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + price * quantity);
    }

    // Program entry point
    public static void main(String[] args) {
        CartItem cart = new CartItem("Shoes", 1999);
        cart.addItem(2);
        cart.removeItem(1);
        cart.displayTotalCost();
    }
}
