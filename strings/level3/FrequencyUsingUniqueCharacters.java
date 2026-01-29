// FrequencyUsingUniqueCharacters.java
package level3;

/*
 * Computes character frequency
 * using unique character extraction.
 */
public class FrequencyUsingUniqueCharacters {

    // Extracts unique characters
    static char[] unique(String s) {
        char[] temp = new char[s.length()];
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean seen = false;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == c) {
                    seen = true;
                    break;
                }
            }
            if (!seen) temp[k++] = c;
        }
        char[] result = new char[k];
        System.arraycopy(temp, 0, result, 0, k);
        return result;
    }

    // Builds frequency table
    static String[][] build(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;
        char[] uniq = unique(s);
        String[][] result = new String[uniq.length][2];
        for (int i = 0; i < uniq.length; i++) {
            result[i][0] = String.valueOf(uniq[i]);
            result[i][1] = String.valueOf(freq[uniq[i]]);
        }
        return result;
    }

    // Program entry point
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        for (String[] row : build(sc.nextLine())) {
            System.out.println(row[0] + " " + row[1]);
        }
    }
}
