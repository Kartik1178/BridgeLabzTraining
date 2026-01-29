// FirstNonRepeatingCharacter.java
package level3;

/*
 * Finds the first non-repeating
 * character in a string.
 */
public class FirstNonRepeatingCharacter {

    // Finds first unique character
    static char find(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) return s.charAt(i);
        }
        return '\0';
    }

    // Program entry point
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        char c = find(sc.nextLine());
        System.out.println(c == '\0' ? "None" : c);
    }
}
