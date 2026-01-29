package controlFlow.level1;

import java.util.Scanner;

/*
 * Prints multiplication table for values from 6 to 9.
 */
public class MultiplicationTableRange {

    // Entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 6; i <= 9; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}
