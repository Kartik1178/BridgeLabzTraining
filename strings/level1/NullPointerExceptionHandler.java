// NullPointerExceptionHandler.java
package level1;

/*
 * Demonstrates and handles
 * NullPointerException.
 */
public class NullPointerExceptionHandler {

    // Generates a null pointer exception
    static void generateException() {
        String s = null;
        s.length();
    }

    // Handles the exception safely
    static void handleException() {
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }
    }

    // Program entry point
    public static void main(String[] args) {
        handleException();
    }
}
