package Level1;

import java.util.Scanner;

/**
 * Generates and prints all factors of a given number.
 */
public class FactorListGenerator {

    // Entry point of the program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
