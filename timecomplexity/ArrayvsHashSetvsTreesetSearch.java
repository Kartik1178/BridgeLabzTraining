import java.util.*;

/*
 * DataStructureSearchComparison
 *
 * Compares searching performance of Array O(N),
 * HashSet O(1), and TreeSet O(log N).
 */
public class DataStructureSearchComparison {

    // Linear search in array O(N)
    public static boolean arraySearch(int[] arr, int target) {
        for (int num : arr) if (num == target) return true;
        return false;
    }

    // HashSet search O(1)
    public static boolean hashSetSearch(Set<Integer> set, int target) {
        return set.contains(target);
    }

    // TreeSet search O(log N)
    public static boolean treeSetSearch(Set<Integer> set, int target) {
        return set.contains(target);
    }
    //main method for entry
    public static void main(String[] args) {
        int size = 1000000;
        int[] array = new int[size];
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < size; i++) {
            array[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        int target = size - 1;

        long start = System.nanoTime();
        arraySearch(array, target);
        long end = System.nanoTime();
        System.out.println("Array Search Time: " + (end - start) + " ns");

        start = System.nanoTime();
        hashSetSearch(hashSet, target);
        end = System.nanoTime();
        System.out.println("HashSet Search Time: " + (end - start) + " ns");

        start = System.nanoTime();
        treeSetSearch(treeSet, target);
        end = System.nanoTime();
        System.out.println("TreeSet Search Time: " + (end - start) + " ns");
    }
}
