/*
 * Class Name: LinearBinarySearchChallenge
 * This program:
 * 1. Uses Linear Search logic to find the first missing positive integer.
 * 2. Sorts the array.
 * 3. Uses Binary Search to find the index of a target number.
 */
import java.util.Arrays;
class LinearBinarySearchChallenge {
    // Method to find first missing positive integer using linear approach
    public static int findFirstMissingPositive(int[] arr) {

        int n = arr.length;

        boolean[] visited = new boolean[n + 1];

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0 && arr[i] <= n) {
                visited[arr[i]] = true;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                return i;
            }
        }
        return n + 1;
    }
    // Method to perform Binary Search on sorted array
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }
//Main method for testing
    public static void main(String[] args) {

        int[] arr = {3, 4, -1, 1};

        // Linear Search Part
        int missing = findFirstMissingPositive(arr);
        System.out.println("First Missing Positive: " + missing);

        // Binary Search Part
        Arrays.sort(arr);
        int target = 3;

        int index = binarySearch(arr, target);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Index of " + target + ": " + index);
    }
}
