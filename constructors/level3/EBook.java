package level3;

/*
 * Subclass accessing public and
 * protected members of Book.
 */
public class EBook extends Book {

    // Displays ebook details
    void display() {
        System.out.println(ISBN + " " + title);
    }
}
