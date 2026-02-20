import java.util.*;

/*
 * SetEqualityChecker
 * Compares two sets to check if they contain the same elements regardless of order.
 */
public class SetEqualityChecker {

    // Method to check equality of two sets
    public static <T> boolean areSetsEqual(Set<T> set1, Set<T> set2) {
        return set1.equals(set2);
    }
    //main method for testing
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));

        System.out.println(areSetsEqual(set1, set2));
    }
}
