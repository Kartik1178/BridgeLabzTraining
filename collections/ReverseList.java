import java.util.*;

/*
 * ReverseList
 * Reverses elements of a List without using built-in reverse methods.
 * Works for both ArrayList and LinkedList.
 */
public class ReverseList {

    // Method to reverse any List
    public static <T> List<T> reverse(List<T> list) {
        List<T> result = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            result.add(list.get(i));
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> linkedList = new LinkedList<>(Arrays.asList(1,2,3,4,5));

        System.out.println("Reversed ArrayList: " + reverse(arrayList));
        System.out.println("Reversed LinkedList: " + reverse(linkedList));
    }
}
+