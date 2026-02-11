/*
 * MergeSort Algorithm Implementation
 *
 * This class implements the Merge Sort algorithm using recursion.
 * Merge Sort is a divide-and-conquer algorithm that:
 * 1. Divides the array into two halves
 * 2. Recursively sorts each half
 * 3. Merges the sorted halves back together
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 * Stable: Yes
 */

class MergeSort {

    // Recursively divides the array into halves and sorts them
    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);      // Sort left half
            mergeSort(arr, mid + 1, right); // Sort right half
            merge(arr, left, mid, right);   // Merge both halves
        }
    }

    // Merges two sorted subarrays into a single sorted array
    static void merge(int[] arr, int left, int mid, int right) {
        int n1 = (mid + 1 - left);  // Size of left subarray
        int n2 = right - mid;       // Size of right subarray

        int[] L = new int[n1];
        int[] R = new int[n2];
        // Copy data to left temporary array
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }

        // Copy data to right temporary array
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }
        int i = 0, j = 0, k = left;
        // Merge the two temporary arrays back into arr[]
        while (i < n1 && j < n2) {
            if (R[j] < L[i]) {
                arr[k++] = R[j++];
            } else {
                arr[k++] = L[i++];
            }
        }

        // Copy remaining elements of L[]
        while (i < n1) {
            arr[k++] = L[i++];
        }

        // Copy remaining elements of R[]
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    // Main method to test merge sort
    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 3, 5, 1, 3, 7, 7, 3, 52, 4};

        mergeSort(arr, 0, arr.length - 1);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
