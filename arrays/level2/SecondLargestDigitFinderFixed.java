package Level2;

import java.util.Scanner;

/**
 * Finds the second largest digit using a fixed-size array.
 */
public class SecondLargestDigitFinderFixed {

    // Entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int[] digits = new int[10];
        int count = 0;

        while (number > 0 && count < 10) {
            digits[count++] = number % 10;
            number /= 10;
        }

        int largest = -1, second = -1;
        for (int i = 0; i < count; i++) {
            if (digits[i] > largest) {
                second = largest;
                largest = digits[i];
            } else if (digits[i] > second && digits[i] != largest) {
                second = digits[i];
            }
        }

        System.out.println(largest);
        System.out.println(second);
    }
}
