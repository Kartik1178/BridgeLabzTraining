import java.util.*;

/*
 * BinaryNumberGenerator
 * Generates first N binary numbers using queue (BFS approach).
 */
public class BinaryNumberGenerator {

    // Method to generate binary numbers
    public static List<String> generateBinary(int n) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        queue.add("1");

        for (int i = 0; i < n; i++) {
            String current = queue.remove();
            result.add(current);

            queue.add(current + "0");
            queue.add(current + "1");
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(generateBinary(5));
    }
}
