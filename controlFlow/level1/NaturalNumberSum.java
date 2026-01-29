package controlFlow.level1;

import java.util.Scanner;

/*
 * Calculates the sum of first N natural numbers using formula.
 */
public class NaturalNumberSum {

    // Entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 1) {
            System.out.println(n * (n + 1) / 2);
        }
    }
}
