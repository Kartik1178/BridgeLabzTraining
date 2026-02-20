import java.util.*;

/*
 * RemoveDuplicates
 * Removes duplicate elements from list while preserving insertion order.
 */
public class RemoveDuplicates {

    // Method to remove duplicates
    public static <T> List<T> removeDuplicates(List<T> list) {
        Set<T> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 1, 2, 2, 3, 4);
        System.out.println(removeDuplicates(list));
    }
}
