package controlFlow.level2;

import java.util.Scanner;

/*
 * Calculates power of a number using iteration.
 */
public class PowerCalculator {

    // Entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int power = sc.nextInt();
        int result = 1;

        for (int i = 1; i <= power; i++) {
            result *= base;
        }
        System.out.println(result);
    }
}
