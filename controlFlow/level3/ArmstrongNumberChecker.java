package controlFlow.level2;

import java.util.Scanner;

/*
 * Prints multiples of a number from 100 down to 1.
 */
public class ReverseMultiplePrinter {

    // Entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 100; i >= 1; i--) {
            if (i % number == 0)
                System.out.println(i);
        }
    }
}
