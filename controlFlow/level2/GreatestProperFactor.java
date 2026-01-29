package controlFlow.level2;

import java.util.Scanner;

/*
 * Finds the greatest proper factor of a number.
 */
public class GreatestProperFactor {

    // Entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int factor = 1;

        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                factor = i;
                break;
            }
        }
        System.out.println(factor);
    }
}
