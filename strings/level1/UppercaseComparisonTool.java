// UppercaseComparisonTool.java
package level1;

/*
 * Compares manually converted
 * uppercase string with built-in.
 */
public class UppercaseComparisonTool {

    // Converts string to uppercase manually
    static String manualUpper(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') c = (char)(c - 32);
            r += c;
        }
        return r;
    }

    // Compares two strings manually
    static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    // Program entry point
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(compare(manualUpper(s), s.toUpperCase()));
    }
}
