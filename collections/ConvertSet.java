import java.util.*;

/*
 * SetToSortedList
 * Converts a HashSet of integers into a sorted List in ascending order.
 */
public class SetToSortedList {

    // Method to convert set to sorted list
    public static List<Integer> convertAndSort(Set<Integer> set) {
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(5,3,9,1));
        System.out.println(convertAndSort(set));
    }
}
