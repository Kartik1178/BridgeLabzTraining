package encapsulationAndOthers;

/*
 * Abstract library item
 */
abstract class LibraryItem {
    private int id;
    private String title;

    // Constructor for library item
    public LibraryItem(int id, String title) {
        this.id = id;
        this.title = title;
    }

    // Abstract loan duration
    public abstract int getLoanDuration();

    // Displays item details
    public void showDetails() {
        System.out.println(id + " | " + title);
    }
}

/*
 * Interface for reservable items
 */
interface Reservable {
    void reserve();
}

/*
 * Book implementation
 */
class Book extends LibraryItem implements Reservable {

    // Constructor for book
    public Book(int id, String title) {
        super(id, title);
    }

    // Returns loan duration
    public int getLoanDuration() {
        return 14;
    }

    // Reserves book
    public void reserve() {
        System.out.println("Book reserved");
    }
}

/*
 * Main class for library system
 */
class LibraryMain {
    public static void main(String[] args) {
        LibraryItem item = new Book(1, "Java OOP");
        item.showDetails();
        System.out.println("Loan Days: " + item.getLoanDuration());
    }
}
