/*
 * Checks whether a given string
 * is a palindrome.
 */
public class PalindromeChecker {

    String text;

    // Initializes text
    PalindromeChecker(String text) {
        this.text = text;
    }

    // Checks palindrome condition
    boolean isPalindrome() {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    // Displays palindrome result
    void displayResult() {
        if (isPalindrome())
            System.out.println(text + " is a Palindrome");
        else
            System.out.println(text + " is NOT a Palindrome");
    }

    // Program entry point
    public static void main(String[] args) {
        PalindromeChecker p = new PalindromeChecker("madam");
        p.displayResult();
    }
}
