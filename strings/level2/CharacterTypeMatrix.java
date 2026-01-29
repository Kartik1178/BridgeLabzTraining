// CharacterTypeMatrix.java
package level2;

/*
 * Classifies each character
 * as vowel, consonant or non-letter.
 */
public class CharacterTypeMatrix {

    // Identifies character type
    static String classify(char c) {
        if (c >= 'A' && c <= 'Z') c += 32;
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return "Vowel";
        if (c >= 'a' && c <= 'z') return "Consonant";
        return "Not a letter";
    }

    // Builds classification matrix
    static String[][] buildMatrix(String s) {
        String[][] res = new String[s.length()][2];
        for (int i = 0; i < s.length(); i++) {
            res[i][0] = String.valueOf(s.charAt(i));
            res[i][1] = classify(s.charAt(i));
        }
        return res;
    }

    // Program entry point
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String[][] matrix = buildMatrix(sc.next());
        for (String[] row : matrix) {
            System.out.println(row[0] + " " + row[1]);
        }
    }
}
