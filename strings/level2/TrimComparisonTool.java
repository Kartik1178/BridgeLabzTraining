// TrimComparisonTool.java
package level2;

/*
 * Trims leading and trailing
 * spaces manually and compares.
 */
public class TrimComparisonTool {

    // Finds trim indices
    static int[] findIndices(String s) {
        int start = 0, end = s.length() - 1;
        while (start <= end && s.charAt(start) == ' ') start++;
        while (end >= start && s.charAt(end) == ' ') end--;
        return new int[]{start, end};
    }

    // Generates substring manually
    static String manualTrim(String s, int start, int end) {
        String r = "";
        for (int i = start; i <= end; i++) r += s.charAt(i);
        return r;
    }

    // Compares two strings
    static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    // Program entry point
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String s = sc.nextLine();
        int[] idx = findIndices(s);
        System.out.println(compare(manualTrim(s, idx[0], idx[1]), s.trim()));
    }
}
