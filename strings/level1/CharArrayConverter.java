// CharArrayConverter.java
package level1;

/*
 * Converts a string into a
 * character array manually.
 */
public class CharArrayConverter {

    // Converts string to char array manually
    static char[] getCharsManually(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        return arr;
    }

    // Compares two character arrays
    static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    // Program entry point
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String s = sc.next();
        System.out.println(compareCharArrays(getCharsManually(s), s.toCharArray()));
    }
}
