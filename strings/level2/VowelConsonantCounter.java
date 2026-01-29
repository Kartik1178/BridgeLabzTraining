// VowelConsonantCounter.java
package level2;

/*
 * Counts vowels and consonants
 * in a given string.
 */
public class VowelConsonantCounter {

    // Checks character type
    static int checkCharacter(char c) {
        if (c >= 'A' && c <= 'Z') c += 32;
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return 1;
        if (c >= 'a' && c <= 'z') return 2;
        return 0;
    }

    // Counts vowels and consonants
    static int[] count(String s) {
        int v = 0, c = 0;
        for (char ch : s.toCharArray()) {
            int res = checkCharacter(ch);
            if (res == 1) v++;
            else if (res == 2) c++;
        }
        return new int[]{v, c};
    }

    // Program entry point
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] r = count(sc.next());
        System.out.println("Vowels: " + r[0]);
        System.out.println("Consonants: " + r[1]);
    }
}
