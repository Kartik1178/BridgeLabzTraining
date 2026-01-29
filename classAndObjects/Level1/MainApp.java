/*
 * Demonstrates usage of Circle,
 * Book, and Item classes.
 */
public class MainApp {

    // Program entry point
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.displayArea();
        c.displayCircumference();

        Book b = new Book("Java Basics", "James Gosling", 499.50);
        b.displayDetails();

        Item i = new Item(101, "Laptop", 55000);
        i.displayItemDetails();
        System.out.println("Total Cost: " + i.calculateTotalCost(2));
    }
}
