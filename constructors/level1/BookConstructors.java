package level1;

/*
 * Represents a book with title, author, and price.
 * Demonstrates default and parameterized constructors.
 */
public class BookConstructors {

    String title;
    String author;
    double price;

    // Default constructor
    BookConstructors() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor
    BookConstructors(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}
