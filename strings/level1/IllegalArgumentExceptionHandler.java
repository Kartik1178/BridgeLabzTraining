// IllegalArgumentExceptionHandler.java
package level1;

/*
 * Demonstrates and handles
 * IllegalArgumentException.
 */
public class IllegalArgumentExceptionHandler {

    // Generates illegal argument exception
    static void generateException(String s) {
        s.substring(3, 2);
    }

    // Handles the exception safely
    static void handleException(String s) {
        try {
            generateException(s);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled");
        }
    }

    // Program entry point
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        handleException(sc.next());
    }
}
