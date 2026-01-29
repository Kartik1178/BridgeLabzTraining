// ManualSubstringCreator.java
package level1;

/*
 * Creates a substring manually
 * using charAt and compares it.
 */
public class ManualSubstringCreator {

    // Creates substring manually
    static String createUsingCharAt(String s, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += s.charAt(i);
        }
        return result;
    }

    // Compares two strings manually
    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    // Program entry point
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String s = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        String manual = createUsingCharAt(s, start, end);
        String builtIn = s.substring(start, end);
        System.out.println(compareStrings(manual, builtIn));
    }
}
