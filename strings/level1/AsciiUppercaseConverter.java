// AsciiUppercaseConverter.java
package level1;

/*
 * Converts a string to uppercase
 * using ASCII manipulation.
 */
public class AsciiUppercaseConverter {

    // Converts string to uppercase manually
    static String convertToUpper(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') c = (char)(c - 32);
            r += c;
        }
        return r;
    }

    // Program entry point
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println(convertToUpper(sc.nextLine()));
    }
}
