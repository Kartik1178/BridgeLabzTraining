import java.util.*;

public class SetToSortedList {

    public static List<Integer> convertToSortedList(Set<Integer> set) {
        List<Integer> sortedList = new ArrayList<>(set); // convert set to list
        Collections.sort(sortedList); // sort ascending
        return sortedList;
    }

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(5, 3, 9, 1));

        List<Integer> result = convertToSortedList(set);
        System.out.println(result); // Output: [1, 3, 5, 9]
    }
}
