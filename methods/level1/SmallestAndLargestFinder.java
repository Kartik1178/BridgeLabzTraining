package Level1;

/*
 * Finds smallest and largest
 * among three numbers.
 */
public class SmallestAndLargestFinder {

    // Finds min and max
    static int[] find(int a, int b, int c) {
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        return new int[]{min, max};
    }

    // Program entry point
    public static void main(String[] args) {
        int[] res = find(
                Integer.parseInt(args[0]),
                Integer.parseInt(args[1]),
                Integer.parseInt(args[2])
        );
        System.out.println("Smallest=" + res[0]);
        System.out.println("Largest=" + res[1]);
    }
}
