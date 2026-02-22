import java.util.*;

/*
 * Class: ArrayAccessHandler
 * Demonstrates multiple catch blocks for array operations
 */
public class ArrayAccessHandler {
    // Retrieves element at index with exception handling
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter index: ");
            int index = sc.nextInt();
            System.out.println("Value at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}