// ShortestAndLongestWordFinder.java
package level2;

/*
 * Finds the shortest and longest
 * word lengths in a sentence.
 */
public class ShortestAndLongestWordFinder {

    // Finds manual length
    static int findLength(String s) {
        int i = 0;
        try {
            while (true) {
                s.charAt(i++);
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return i - 1;
    }

    // Splits sentence manually
    static String[] splitWords(String s) {
        int wc = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') wc++;
        }
        String[] w = new String[wc];
        int start = 0, idx = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                w[idx++] = s.substring(start, i);
                start = i + 1;
            }
        }
        w[idx] = s.substring(start);
        return w;
    }

    // Finds shortest and longest word length
    static int[] findMinMax(String[] words) {
        int min = findLength(words[0]);
        int max = min;
        for (int i = 1; i < words.length; i++) {
            int len = findLength(words[i]);
            if (len < min) min = len;
            if (len > max) max = len;
        }
        return new int[]{min, max};
    }

    // Program entry point
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String s = sc.nextLine();
        int[] res = findMinMax(splitWords(s));
        System.out.println("Shortest Length: " + res[0]);
        System.out.println("Longest Length: " + res[1]);
    }
}
