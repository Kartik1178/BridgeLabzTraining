// PalindromeChecker.java
package level3;

/*
 * Checks whether a string
 * is a palindrome using multiple methods.
 */
public class PalindromeChecker {

    // Iterative palindrome check
    static boolean iterative(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }

    // Recursive palindrome check
    static boolean recursive(String s, int i, int j) {
        if (i >= j) return true;
        if (s.charAt(i) != s.charAt(j)) return false;
        return recursive(s, i + 1, j - 1);
    }

    // Array-based palindrome check
    static boolean arrayCheck(String s) {
        char[] a = s.toCharArray();
        char[] b = new char[a.length];
        for (int i = 0; i < a.length; i++) b[i] = a[a.length - 1 - i];
        for (int i = 0; i < a.length; i++) if (a[i] != b[i]) return false;
        return true;
    }

    // Program entry point
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(iterative(s));
        System.out.println(recursive(s, 0, s.length() - 1));
        System.out.println(arrayCheck(s));
    }
}
