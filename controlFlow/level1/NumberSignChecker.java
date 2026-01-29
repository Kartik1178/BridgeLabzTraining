package controlFlow.level1;

import java.util.Scanner;

/*
 * Determines whether a number is positive, negative, or zero.
 */
public class NumberSignChecker {

    // Entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number > 0) System.out.println("Positive");
        else if (number < 0) System.out.println("Negative");
        else System.out.println("Zero");
    }
}
