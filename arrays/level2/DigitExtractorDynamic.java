package Level2;

import java.util.Scanner;

/**
 * Extracts digits of a number using a dynamically growing array.
 */
public class DigitExtractorDynamic {

    // Entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int[] digits = new int[10];
        int size = 10, index = 0;

        while (number > 0) {
            if (index == size) {
                size += 10;
                int[] temp = new int[size];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;
            }
            digits[index++] = number % 10;
            number /= 10;
        }

        for (int i = 0; i < index; i++) {
            System.out.println(digits[i]);
        }
    }
}
