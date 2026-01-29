// UniqueCharacterExtractor.java
package level3;

/*
 * Extracts unique characters
 * from a given string.
 */
public class UniqueCharacterExtractor {

    // Finds unique characters
    static char[] extract(String s) {
        char[] temp = new char[s.length()];
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == c) {
                    found = true;
                    break;
                }
            }
            if (!found) temp[k++] = c;
        }
        char[] result = new char[k];
        System.arraycopy(temp, 0, result, 0, k);
        return result;
    }

    // Program entry point
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        char[] unique = extract(sc.nextLine());
        for (char c : unique) System.out.print(c + " ");
    }
}
