package Level2;

import java.util.Scanner;

/**
 * Finds the second largest digit using a dynamically resized array.
 */
public class SecondLargestDigitFinderDynamic {

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

        int largest = -1, second = -1;
        for (int i = 0; i < index; i++) {
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
