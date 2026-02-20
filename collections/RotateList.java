import java.util.*;

/*
 * RotateList
 * Rotates elements of a list by k positions.
 */
public class RotateList {

    // Method to rotate list left by k positions
    public static <T> List<T> rotate(List<T> list, int k) {
        int n = list.size();
        k = k % n;

        List<T> result = new ArrayList<>();

        for (int i = k; i < n; i++) {
            result.add(list.get(i));
        }
        for (int i = 0; i < k; i++) {
            result.add(list.get(i));
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        System.out.println(rotate(list, 2));
    }
}
