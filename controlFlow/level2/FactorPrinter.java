package controlFlow.level2;

import java.util.Scanner;

/*
 * Prints all factors of a given number.
 */
public class FactorPrinter {

    // Entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                System.out.println(i);
        }
    }
}
