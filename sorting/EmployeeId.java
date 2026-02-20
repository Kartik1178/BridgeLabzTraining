/*
 * Insertion Sort Implementation
 *
 * This class sorts an array using the Insertion Sort algorithm.
 * The algorithm builds the sorted portion of the array one element at a time
 * by inserting each element into its correct position.
 *
 * Time Complexity:
 * Best Case: O(n)
 * Worst Case: O(n^2)
 *
 * Space Complexity: O(1)
 * Stable: Yes
 */

class EmployeeId{
    // Sorts the array using insertion sort by shifting larger elements and inserting the key at correct position
    static void insertionSort(int[] arr){
        for(int i=0;i<arr.length;i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

    }
    //main method for testing
    public static void main(String[] args) {
        int[] arr = {4, 6, 42, 1, 3};
        insertionSort(arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }


    }
