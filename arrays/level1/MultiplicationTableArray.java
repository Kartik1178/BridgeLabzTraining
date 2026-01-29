package Level1;

import java.util.Scanner;

/**
 * Determines whether numbers are negative, zero, even, or odd.
 */
public class NumberTypeChecker {

    // Entry point of the program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        for (int n : numbers) {
            if (n < 0) {
                System.out.println("Negative");
            } else if (n == 0) {
                System.out.println("Zero");
            } else if (n % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
    }
}
