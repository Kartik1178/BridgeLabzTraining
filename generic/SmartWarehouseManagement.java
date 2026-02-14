import java.util.ArrayList;
abstract class WarehouseItem{
    private String name;
    private double price;
    WarehouseItem(String name,double price){

        this.name=name;
        this.price=price;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public abstract String getCategory();

    public String toString() {
        return getCategory() + " | Name: " + name + " | Price: ₹" + price;
    }

}
class Electronics extends WarehouseItem{
    private int warrantyYears;
    public Electronics(String name,double price,int warrantyYears){
        super(name,price);
        this.warrantyYears=warrantyYears;

        public String getCategory(){
            return "Electronics";
        }
    }
}
class Groceries extends WarehouseItem {
    private String expiryDate;
    public Groceries(String name, double price, String expiryDate) {
        super(name, price);
        this.expiryDate = expiryDate;
    }
    @Override
    public String getCategory() {
        return "Groceries";
    }
}
class Furniture extends WarehouseItem {
    private String material;

    public Furniture(String name, double price, String material) {
        super(name, price);
        this.material = material;
    }

    @Override
    public String getCategory() {
        return "Furniture";
    }
}
class Storage<T extends WarehouseItem> {
    private List<T> items;

    public Storage() {
        items = new ArrayList<>();
    }

    public addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}
class WarehouseUtility{
    public static void displayAll(List<?extends WarehouseItem> items){
        for(WarehouseItem item:items){
            System.out.println(item);
        }


    }


}

   ============================ */
public class SmartWarehouseSystem {

    public static void main(String[] args) {

        // Electronics Storage
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", 75000, 2));
        electronicsStorage.addItem(new Electronics("Smartphone", 50000, 1));

        // Grocery Storage
        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("Rice", 50, "2026-12-01"));
        groceryStorage.addItem(new Groceries("Milk", 25, "2026-02-15"));

        // Furniture Storage
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", 2000, "Wood"));
        furnitureStorage.addItem(new Furniture("Table", 5000, "Metal"));

        System.out.println("========= ELECTRONICS =========");
        electronicsStorage.displayItems();

        System.out.println("\n========= GROCERIES =========");
        groceryStorage.displayItems();


        furnitureStorage.displayItems();


        WarehouseUtility.displayAll(electronicsStorage.getItems());
        WarehouseUtility.displayAll(groceryStorage.getItems());
        WarehouseUtility.displayAll(furnitureStorage.getItems());
    }
}
