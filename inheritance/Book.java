/*
 * Superclass Book
 * Represents a general book with basic details
 * This class acts as the base class in single inheritance
 */
class Book {

    // Title of the book
    String title;

    // Year the book was published
    int publicationYear;

    // Constructor to initialize book details
    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Displays basic book information
    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

/*
 * Subclass Author
 * Extends Book and adds author-specific details
 * Demonstrates single inheritance
 */
class Author extends Book {

    // Name of the author
    private String name;

    // Short biography of the author
    private String bio;

    // Constructor to initialize book and author details
    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // Call Book constructor
        this.name = name;
        this.bio = bio;
    }

    // Displays book and author information
    @Override
    void displayInfo() {
        super.displayInfo(); // Display book details first
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}

/*
 * Main class
 * Demonstrates single inheritance and method overriding
 */
class Main {

    // Main method – program execution starts here
    public static void main(String[] args) {

        // Creating an Author object using Book reference (polymorphism)
        Book book = new Author(
                "Clean Code",
                2008,
                "Robert C. Martin",
                "Software engineer and author known for Clean Code practices"
        );

        // Calling overridden method
        book.displayInfo();
    }
}
