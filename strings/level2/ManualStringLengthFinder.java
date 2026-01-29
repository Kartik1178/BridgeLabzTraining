// ManualStringLengthFinder.java
package level2;

/*
 * Finds the length of a string
 * without using length().
 */
public class ManualStringLengthFinder {

    // Calculates string length manually
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

    // Program entry point
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String input = sc.next();
        System.out.println(findLength(input));
    }
}
