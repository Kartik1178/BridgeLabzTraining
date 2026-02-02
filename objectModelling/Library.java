/* Represents a Book entity */
class Book {
    String title;
    String author;

    // Creates a book with title and author
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

/* Represents a Library that aggregates books */
class Library {
    List<Book> books = new ArrayList<>();

    // Adds a book to the library
    void addBook(Book book) {
        books.add(book);
    }
}
