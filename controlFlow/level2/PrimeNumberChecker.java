package controlFlow.level2;

import java.util.Scanner;

/*
 * Determines whether a number is a prime number.
 */
public class PrimeNumberChecker {

    // Entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = num > 1;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);
    }
}
