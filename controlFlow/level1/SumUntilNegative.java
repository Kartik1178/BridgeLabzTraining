package controlFlow.level1;

import java.util.Scanner;

/*
 * Calculates sum of numbers until a negative number is entered.
 */
public class SumUntilNegative {

    // Entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        while (true) {
            double n = sc.nextDouble();
            if (n <= 0) break;
            sum += n;
        }
        System.out.println(sum);
    }
}
