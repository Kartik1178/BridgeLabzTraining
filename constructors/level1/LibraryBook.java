package level1;

/*
 * Represents a library book and allows
 * borrowing if available.
 */
public class LibraryBook {

    String title;
    String author;
    double price;
    boolean available;

    // Parameterized constructor
    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    // Borrows the book if available
    void borrowBook() {
        if (available) {
            available = false;
        }
    }
}
