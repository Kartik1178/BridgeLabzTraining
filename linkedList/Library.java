/*
 * Doubly Linked List Node representing a Book
 * Stores book details and pointers to next and previous nodes
 */
class Book {

    String title;
    String author;
    String genre;
    int bookId;
    boolean available;
    Book next;
    Book prev;

    Book(String title, String author, String genre, int bookId, boolean available) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.available = available;
        this.next = null;
        this.prev = null;
    }
}

/*
 * Library Management System using Doubly Linked List
 */
class LibrarySystem {

    private Book head;
    private Book tail;

    // Add book at beginning
    void addAtBeginning(String title, String author, String genre, int bookId, boolean available) {
        Book book = new Book(title, author, genre, bookId, available);

        if (head == null) {
            head = tail = book;
            return;
        }

        book.next = head;
        head.prev = book;
        head = book;
    }

    // Add book at end
    void addAtEnd(String title, String author, String genre, int bookId, boolean available) {
        Book book = new Book(title, author, genre, bookId, available);

        if (head == null) {
            head = tail = book;
            return;
        }

        tail.next = book;
        book.prev = tail;
        tail = book;
    }

    // Remove book by Book ID
    void removeById(int bookId) {
        if (head == null) {
            System.out.println("Library is empty");
            return;
        }

        Book temp = head;

        while (temp != null) {
            if (temp.bookId == bookId) {

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

                temp.next = null;
                temp.prev = null;
                System.out.println("Book removed successfully");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book not found");
    }

    // Search book by title or author
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
            System.out.println("No matching book found");
        }
    }

    // Update availability status
    void updateAvailability(int bookId) {
        Book temp = head;

        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.available = !temp.available;
                System.out.println("Availability updated");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book not found");
    }

    // Display books in forward order
    void displayForward() {
        if (head == null) {
            System.out.println("Library is empty");
            return;
        }

        Book temp = head;
        while (temp != null) {
            displaySingleBook(temp);
            temp = temp.next;
        }
    }

    // Display books in reverse order
    void displayReverse() {
        if (tail == null) {
            System.out.println("Library is empty");
            return;
        }

        Book temp = tail;
        while (temp != null) {
            displaySingleBook(temp);
            temp = temp.prev;
        }
    }

    // Count total books
    int countBooks() {
        int count = 0;
        Book temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Display a single book
    void displaySingleBook(Book book) {
        System.out.println("ID: " + book.bookId);
        System.out.println("Title: " + book.title);
        System.out.println("Author: " + book.author);
        System.out.println("Genre: " + book.genre);
        System.out.println("Available: " + book.available);
        System.out.println("-------------------------");
    }

    // Main method
    public static void main(String[] args) {

        LibrarySystem library = new LibrarySystem();

        library.addAtBeginning("1984", "George Orwell", "Dystopian", 101, true);
        library.addAtEnd("Clean Code", "Robert Martin", "Programming", 102, true);
        library.addAtEnd("The Alchemist", "Paulo Coelho", "Fiction", 103, true);

        System.out.println("Forward Display:");
        library.displayForward();

        System.out.println("Reverse Display:");
        library.displayReverse();

        library.updateAvailability(102);
        library.searchBook("George Orwell");

        library.removeById(101);

        System.out.println("Total Books: " + library.countBooks());
    }
}
