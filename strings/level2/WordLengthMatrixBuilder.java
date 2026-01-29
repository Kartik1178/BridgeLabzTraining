// WordLengthMatrixBuilder.java
package level2;

/*
 * Creates a 2D array of words
 * and their corresponding lengths.
 */
public class WordLengthMatrixBuilder {

    // Forms words from a sentence
    static String[] formWords(String s) {
        int wc = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') wc++;
        }
        String[] res = new String[wc];
        int start = 0, idx = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                res[idx++] = s.substring(start, i);
                start = i + 1;
            }
        }
        res[idx] = s.substring(start);
        return res;
    }

    // Finds string length manually
    static int findLength(String s) {
        int i = 0;
        try {
            while (true) {
                s.charAt(i);
                i++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return i;
    }

    // Builds 2D word-length matrix
    static String[][] buildMatrix(String[] words) {
        String[][] res = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            res[i][0] = words[i];
            res[i][1] = String.valueOf(findLength(words[i]));
        }
        return res;
    }

    // Program entry point
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String sentence = sc.nextLine();
        String[][] matrix = buildMatrix(formWords(sentence));
        for (String[] row : matrix) {
            System.out.println(row[0] + " " + row[1]);
        }
    }
}
