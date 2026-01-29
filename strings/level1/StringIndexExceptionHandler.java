// StringIndexExceptionHandler.java
package level1;

/*
 * Demonstrates and handles
 * StringIndexOutOfBoundsException.
 */
public class StringIndexExceptionHandler {

    // Generates string index exception
    static void generateException(String s) {
        s.charAt(s.length());
    }

    // Handles the exception safely
    static void handleException(String s) {
        try {
            generateException(s);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled");
        }
    }

    // Program entry point
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        handleException(sc.next());
    }
}
