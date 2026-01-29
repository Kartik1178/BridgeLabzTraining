/*
 * Represents a mobile phone
 * with brand, model, and price.
 */
public class MobilePhone {

    String brand;
    int model;
    int price;

    // Initializes mobile phone details
    MobilePhone(String brand, int model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Displays mobile phone details
    void displayItemDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    // Program entry point
    public static void main(String[] args) {
        MobilePhone mp = new MobilePhone("E", 2, 3333);
        mp.displayItemDetails();
    }
}
