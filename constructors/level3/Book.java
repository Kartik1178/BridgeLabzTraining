package level3;

/*
 * Demonstrates access modifiers
 * in a book library system.
 */
public class Book {

    public String ISBN;
    protected String title;
    private String author;

    // Sets author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Gets author
    public String getAuthor() {
        return author;
    }
}
