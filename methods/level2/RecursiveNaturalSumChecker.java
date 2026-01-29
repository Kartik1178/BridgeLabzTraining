package Level2;

import java.util.Scanner;

/*
 * Calculates sum of natural numbers
 * using recursion and verifies formula.
 */
public class RecursiveNaturalSum {

    // Recursively calculates sum
    static int sumOfNaturalNumbers(int n) {
        if (n == 0) return 0;
        return n + sumOfNaturalNumbers(n - 1);
    }

    // Program entry point
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean match = sumOfNaturalNumbers(number) == number * (number + 1) / 2;
        System.out.println("Sum is " + sumOfNaturalNumbers(number) + " Same as formula " + match);
        sc.close();
    }
}
