import java.util.*;

/*
 * SmartWarehouseSystem
 *
 * Demonstrates Generic Classes, Bounded Type Parameters,
 * and Wildcards for managing warehouse items safely.
 */
abstract class WarehouseItem {
    String name;
    public WarehouseItem(String name) { this.name = name; }
    public String toString() { return name; }
}

class Electronics extends WarehouseItem {
    public Electronics(String name) { super(name); }
}

class Groceries extends WarehouseItem {
    public Groceries(String name) { super(name); }
}

class Furniture extends WarehouseItem {
    public Furniture(String name) { super(name); }
}

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    // Adds item safely
    public void addItem(T item) { items.add(item); }

    // Returns stored items
    public List<T> getItems() { return items; }
}

public class SmartWarehouseSystem {

    // Displays all items using wildcard
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item);
        }
    }
// main method for  testing
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Smartphone"));

        System.out.println("Warehouse Items:");
        displayItems(electronicsStorage.getItems());
    }
}
