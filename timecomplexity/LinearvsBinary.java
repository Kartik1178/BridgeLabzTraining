import java.util.*;

/*
 * SearchPerformanceComparison
 *
 * Compares Linear Search O(N) and Binary Search O(log N)
 * on a large dataset using System.nanoTime().
 */
public class SearchPerformanceComparison {

    // Performs O(N) linear search
    public static boolean linearSearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) return true;
        }
        return false;
    }

    // Performs O(log N) binary search (array must be sorted)
    public static boolean binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) return true;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
    //main method
    public static void main(String[] args) {
        int size = 1000000;
        int[] data = new int[size];
        for (int i = 0; i < size; i++) data[i] = i;

        int target = size - 1;

        long start = System.nanoTime();
        linearSearch(data, target);
        long end = System.nanoTime();
        System.out.println("Linear Search Time: " + (end - start) + " ns");

        Arrays.sort(data);
        start = System.nanoTime();
        binarySearch(data, target);
        end = System.nanoTime();
        System.out.println("Binary Search Time: " + (end - start) + " ns");
    }
}
