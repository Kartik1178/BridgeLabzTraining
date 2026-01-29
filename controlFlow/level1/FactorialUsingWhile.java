package controlFlow.level1;

import java.util.Scanner;

/*
 * Calculates factorial of a number using while loop.
 */
public class FactorialUsingWhile {

    // Entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1, i = 1;

        while (i <= n) {
            fact *= i++;
        }
        System.out.println(fact);
    }
}
