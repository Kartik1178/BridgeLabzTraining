package Level3;

/*
 * Checks palindrome and duck
 * number properties.
 */
public class PalindromeDuckNumberChecker {

    // Reverses digits
    static int[] reverse(int[] digits) {
        int l = 0, r = digits.length - 1;
        while (l < r) {
            int t = digits[l];
            digits[l] = digits[r];
            digits[r] = t;
            l++;
            r--;
        }
        return digits;
    }

    // Checks palindrome
    static boolean isPalindrome(int[] digits) {
        int l = 0, r = digits.length - 1;
        while (l < r)
            if (digits[l++] != digits[r--]) return false;
        return true;
    }

    // Checks duck number
    static boolean isDuck(int[] digits) {
        for (int d : digits)
            if (d == 0) return true;
        return false;
    }

    // Program entry point
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        String s = String.valueOf(number);
        int[] digits = new int[s.length()];

        for (int i = 0; i < s.length(); i++)
            digits[i] = s.charAt(i) - '0';

        System.out.println("Palindrome: " + isPalindrome(digits));
        System.out.println("Duck Number: " + isDuck(digits));
    }
}
