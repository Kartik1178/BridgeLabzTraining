/*
 * Represents a store item and
 * calculates total cost.
 */
public class Item {

    int itemCode;
    String itemName;
    double price;

    // Initializes item details
    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Displays item details
    void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    // Calculates total cost based on quantity
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}
