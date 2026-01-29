package controlFlow.level3;

import java.util.Scanner;

/*
 * Counts the number of digits in a given integer.
 */
public class DigitCounter {

    // Entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;

        while (number != 0) {
            number /= 10;
            count++;
        }

        System.out.println(count);
    }
}
