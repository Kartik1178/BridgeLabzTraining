package controlFlow.level1;

import java.util.Scanner;

/*
 * Checks whether a given number is divisible by 5.
 */
public class DivisibleByFiveCheck {

    // Entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(number % 5 == 0);
    }
}
