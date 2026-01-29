package controlFlow.level1;

import java.util.Scanner;

/*
 * Prints countdown using a while loop.
 */
public class CountdownUsingWhile {

    // Entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n >= 1) {
            System.out.println(n--);
        }
    }
}
