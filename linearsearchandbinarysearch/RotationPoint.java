/*
 * Class Name: FindRotationPoint
 * --------------------------------
 * This program finds the index of the smallest element
 * in a rotated sorted array using Binary Search.
 */

class FindRotationPoint {

    // Method to find rotation index
    public static int findRotation(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right])
                left = mid + 1;
            else
                right = mid;
        }

        return left;
    }
    // main method for testing
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 1, 2, 3};
        System.out.println("Rotation Index: " + findRotation(arr));
    }
}
