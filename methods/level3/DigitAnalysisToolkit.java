package Level3;

import java.util.Scanner;

/*
 * Performs digit-based analysis such as
 * duck number, armstrong, and comparisons.
 */
public class DigitAnalysisToolkit {

    // Counts digits
    static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    // Extracts digits into array
    static int[] extractDigits(int number) {
        int size = countDigits(number);
        int[] digits = new int[size];
        int index = 0;
        while (number > 0) {
            digits[index++] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Checks duck number
    static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++)
            if (digits[i] == 0) return true;
        return false;
    }

    // Checks armstrong number
    static boolean isArmstrong(int[] digits, int number) {
        int sum = 0;
        for (int d : digits)
            sum += Math.pow(d, digits.length);
        return sum == number;
    }

    // Program entry point
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int[] digits = extractDigits(number);

        System.out.println("Digits count: " + countDigits(number));
        System.out.println("Duck Number: " + isDuckNumber(digits));
        System.out.println("Armstrong Number: " + isArmstrong(digits, number));

        sc.close();
    }
}
