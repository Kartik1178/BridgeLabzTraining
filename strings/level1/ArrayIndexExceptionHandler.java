// ArrayIndexExceptionHandler.java
package level1;

/*
 * Demonstrates and handles
 * ArrayIndexOutOfBoundsException.
 */
public class ArrayIndexExceptionHandler {

    // Generates array index exception
    static void generateException(String[] arr) {
        System.out.println(arr[arr.length]);
    }

    // Handles the exception safely
    static void handleException(String[] arr) {
        try {
            generateException(arr);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        }
    }

    // Program entry point
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) arr[i] = sc.next();
        handleException(arr);
    }
}
