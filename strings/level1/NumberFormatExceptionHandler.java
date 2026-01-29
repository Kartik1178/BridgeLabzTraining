// NumberFormatExceptionHandler.java
package level1;

/*
 * Demonstrates and handles
 * NumberFormatException.
 */
public class NumberFormatExceptionHandler {

    // Generates number format exception
    static void generateException(String s) {
        Integer.parseInt(s);
    }

    // Handles the exception safely
    static void handleException(String s) {
        try {
            generateException(s);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");
        }
    }

    // Program entry point
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        handleException(sc.next());
    }
}
