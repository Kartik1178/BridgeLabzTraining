/*
 * Book Management System
 * This class represents a Book in a library.
 * It demonstrates the use of static variables and methods,
 * the this keyword for constructor initialization,
 * a final variable for ISBN,
 * and the instanceof operator to check object type
 * before displaying book details.
 */

class Book{
    static String libraryName="lib";
    final private String isbn;
    private String title;
    private String author;
    Book(String title,String author,String isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }

    // Method to display book details after checking object type
    static void displayLibraryName(){
        System.out.println(libraryName);
    }
    public void displayDetails(Object o){
    if(o instanceof Book){
        System.out.println("Library Name: " + libraryName + ", Title: " + b.title + ", Author: " + b.author + ", ISBN: " + b.isbn
        );
    }
    else{
        System.out.println("Invalid object");
    }
    }
    public static void main(String[] args) {
        Book b1 = new Book("Clean Code", "Robert C. Martin", "12345");

        b1.displayDetails(b1);
        b1.displayDetails("test");
    }

}