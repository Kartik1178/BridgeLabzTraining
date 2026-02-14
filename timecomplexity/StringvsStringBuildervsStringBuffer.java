/*
 * StringConcatenationPerformance
 *
 * Compares String O(N^2), StringBuilder O(N), and StringBuffer O(N)
 * for large concatenation operations.
 */
public class StringConcatenationPerformance {

    // Concatenation using immutable String O(N^2)
    public static String usingString(int n) {
        String result = "";
        for (int i = 0; i < n; i++) result += "a";
        return result;
    }

    // Concatenation using StringBuilder O(N)
    public static String usingStringBuilder(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append("a");
        return sb.toString();
    }

    // Concatenation using StringBuffer O(N)
    public static String usingStringBuffer(int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) sb.append("a");
        return sb.toString();
    }

    public static void main(String[] args) {
        int n = 100000;

        long start = System.nanoTime();
        usingString(n);
        long end = System.nanoTime();
        System.out.println("String Time: " + (end - start) + " ns");

        start = System.nanoTime();
        usingStringBuilder(n);
        end = System.nanoTime();
        System.out.println("StringBuilder Time: " + (end - start) + " ns");

        start = System.nanoTime();
        usingStringBuffer(n);
        end = System.nanoTime();
        System.out.println("StringBuffer Time: " + (end - start) + " ns");
    }
}
