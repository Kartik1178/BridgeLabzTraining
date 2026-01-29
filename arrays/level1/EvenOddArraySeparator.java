package Level1;

import java.util.Scanner;

/**
 * Separates numbers into even and odd arrays.
 */
public class EvenOddArraySeparator {

    // Entry point of the program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int[] even = new int[number];
        int[] odd = new int[number];
        int e = 0, o = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) even[e++] = i;
            else odd[o++] = i;
        }

        for (int i = 0; i < o; i++) System.out.println(odd[i]);
        for (int i = 0; i < e; i++) System.out.println(even[i]);
    }
}
