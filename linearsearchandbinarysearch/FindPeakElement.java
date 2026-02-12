/*
 * Class Name: FindPeakElement
 * -----------------------------
 * This program finds a peak element in an array
 * using Binary Search.
 */

class FindPeakElement {

    // Method to find peak element
    public static int findPeak(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1])
                left = mid + 1;
            else
                right = mid;
        }

        return left;
    }

    // main method for testing
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 2};
        System.out.println("Peak Index: " + findPeak(arr));
    }
}
