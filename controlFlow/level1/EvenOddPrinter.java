package controlFlow.level1;

import java.util.Scanner;

/*
 * Prints whether numbers from 1 to N are even or odd.
 */
public class EvenOddPrinter {

    // Entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i + (i % 2 == 0 ? " Even" : " Odd"));
        }
    }
}
