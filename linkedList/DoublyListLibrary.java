/*
 * Library Management System using Doubly Linked List
 *
 * Each node represents a Book with:
 * - Title
 * - Author
 * - Genre
 * - Book ID
 * - Availability Status
 *
 * The doubly linked list allows traversal in both
 * forward and reverse directions using next and prev pointers.
 */

class Book {

    String title;
    String author;
    String genre;
    int id;
    boolean available;
    Book next;
    Book prev;

    /*
     * Constructor to initialize a Book node
     */
    Book(String title, String author, String genre, int id, boolean available) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.id = id;
        this.available = available;
        this.next = null;
        this.prev = null;
    }
}

/*
 * Doubly Linked List implementation for Library Management
 */
public class LibraryManagementSystem {

    Book head;
    Book tail;

    /*
     * Add a book at the beginning
     */
    void addAtBeginning(String title, String author, String genre, int id, boolean available) {
        Book newBook = new Book(title, author, genre, id, available);

        if (head == null) {
            head = tail = newBook;
            return;
        }

        newBook.next = head;
        head.prev = newBook;
        head = newBook;
    }

    /*
     * Add a book at the end
     */
    void addAtEnd(String title, String author, String genre, int id, boolean available) {
        Book newBook = new Book(title, author, genre, id, available);

        if (head == null) {
            head = tail = newBook;
            return;
        }

        tail.next = newBook;
        newBook.prev = tail;
        tail = newBook;
    }

    /*
     * Add a book at a specific position (1-based index)
     */
    void addAtPosition(String title, String author, String genre, int id, boolean available, int position) {

        if (position == 1) {
            addAtBeginning(title, author, genre, id, available);
            return;
        }

        Book temp = head;
        int count = 1;

        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(title, author, genre, id, available);
            return;
        }

        Book newBook = new Book(title, author, genre, id, available);

        newBook.next = temp.next;
        newBook.prev = temp;
        temp.next.prev = newBook;
        temp.next = newBook;
    }

    /*
     * Remove a book by Book ID
     */
    void removeById(int id) {
        Book temp = head;

        while (temp != null) {
            if (temp.id == id) {

                if (temp == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                }
                else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                }
                else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                System.out.println("Book with ID " + id + " removed.");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book not found.");
    }

    /*
     * Search a book by title or author
     */
    void searchBook(String keyword) {
        Book temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(keyword) ||
                    temp.author.equalsIgnoreCase(keyword)) {

                displaySingleBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No matching book found.");
        }
    }

    /*
     * Update availability status of a book by ID
     */
    void updateAvailability(int id) {
        Book temp = head;

        while (temp != null) {
            if (temp.id == id) {
                temp.available = !temp.available;
                System.out.println("Availability updated for Book ID " + id);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book not found.");
    }

    /*
     * Display all books in forward order
     */
    void displayForward() {
        Book temp = head;

        if (temp == null) {
            System.out.println("Library is empty.");
            return;
        }

        while (temp != null) {
            displaySingleBook(temp);
            temp = temp.next;
        }
    }

    /*
     * Display all books in reverse order
     */
    void displayReverse() {
        Book temp = tail;

        if (temp == null) {
            System.out.println("Library is empty.");
            return;
        }

        while (temp != null) {
            displaySingleBook(temp);
            temp = temp.prev;
        }
    }

    /*
     * Count total number of books
     */
    int countBooks() {
        int count = 0;
        Book temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    /*
     * Display a single book's details
     */
    void displaySingleBook(Book book) {
        System.out.println("ID: " + book.id);
        System.out.println("Title: " + book.title);
        System.out.println("Author: " + book.author);
        System.out.println("Genre: " + book.genre);
        System.out.println("Available: " + book.available);
    }

    /*
     *  Main method for testing the functionality
     */
    public static void main(String[] args) {

        LibraryManagementSystem lib = new LibraryManagementSystem();

        lib.addAtEnd("1984", "George Orwell", "Dystopian", 1, true);
        lib.addAtBeginning("Clean Code", "Robert Martin", "Programming", 2, true);
        lib.addAtPosition("The Alchemist", "Paulo Coelho", "Fiction", 3, true, 2);

        System.out.println("Forward Display:");
        lib.displayForward();

        System.out.println("Reverse Display:");
        lib.displayReverse();

        lib.updateAvailability(2);
        lib.searchBook("George Orwell");

        lib.removeById(1);

        System.out.println("Total Books: " + lib.countBooks());
    }
}
