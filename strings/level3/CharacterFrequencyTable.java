// CharacterFrequencyTable.java
package level3;

/*
 * Generates a frequency table
 * for characters in a string.
 */
public class CharacterFrequencyTable {

    // Builds frequency table
    static String[][] frequency(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;
        int count = 0;
        for (int f : freq) if (f > 0) count++;
        String[][] result = new String[count][2];
        int idx = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[idx][0] = String.valueOf((char) i);
                result[idx][1] = String.valueOf(freq[i]);
                idx++;
            }
        }
        return result;
    }

    // Program entry point
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        for (String[] row : frequency(sc.nextLine())) {
            System.out.println(row[0] + " " + row[1]);
        }
    }
}
