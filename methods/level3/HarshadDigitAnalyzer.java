package Level3;

/*
 * Analyzes digits and checks
 * Harshad number properties.
 */
public class HarshadDigitAnalyzer {

    // Counts digits
    static int countDigits(int n) {
        int c = 0;
        while (n > 0) {
            c++;
            n /= 10;
        }
        return c;
    }

    // Extracts digits
    static int[] getDigits(int n) {
        int[] digits = new int[countDigits(n)];
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    // Sums digits
    static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    // Checks Harshad number
    static boolean isHarshad(int number, int[] digits) {
        return number % sumOfDigits(digits) == 0;
    }

    // Program entry point
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int[] digits = getDigits(number);

        System.out.println("Harshad Number: " + isHarshad(number, digits));
    }
}
