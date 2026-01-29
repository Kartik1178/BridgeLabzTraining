// WordSplitterAndComparator.java
package level2;

/*
 * Splits a sentence into words
 * manually and compares with split().
 */
public class WordSplitterAndComparator {

    // Finds length of string manually
    static int lengthOfString(String s) {
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

    // Splits sentence into words manually
    static String[] getWords(String s) {
        int len = lengthOfString(s);
        int wc = 1;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') wc++;
        }
        String[] words = new String[wc];
        int start = 0, idx = 0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') {
                words[idx++] = s.substring(start, i);
                start = i + 1;
            }
        }
        words[idx] = s.substring(start);
        return words;
    }

    // Compares two string arrays
    static boolean compare(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    // Program entry point
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(compare(getWords(s), s.split(" ")));
    }
}
