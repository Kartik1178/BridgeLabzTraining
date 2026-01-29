// AnagramChecker.java
package level3;

/*
 * Checks whether two strings
 * are anagrams of each other.
 */
public class AnagramChecker {

    // Checks anagram using frequency
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        int[] freq = new int[256];
        for (int i = 0; i < a.length(); i++) {
            freq[a.charAt(i)]++;
            freq[b.charAt(i)]--;
        }
        for (int f : freq) if (f != 0) return false;
        return true;
    }

    // Program entry point
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println(isAnagram(sc.nextLine(), sc.nextLine()));
    }
}
