package controlFlow.level1;

import java.util.Scanner;

/*
 * Prints countdown using a for loop.
 */
public class CountdownUsingFor {

    // Entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
