// StringEqualityChecker.java
package level1;

/*
 * Compares two strings for equality
 * using manual charAt comparison.
 */
public class StringEqualityChecker {

    // Compares two strings character by character
    static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    // Program entry point
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(compareUsingCharAt(s1, s2));
    }
}
