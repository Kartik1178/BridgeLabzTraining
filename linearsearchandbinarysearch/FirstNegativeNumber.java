/*
 * Class Name: FirstNegativeLinearSearch
 * --------------------------------------
 * This program finds the first negative number in an array
 * using linear search.
 */

class FirstNegativeLinearSearch {

    // Method to find first negative index
    public static int findFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i;
            }
        }
        return -1;
    }
    // main method for testing
    public static void main(String[] args) {
        int[] arr = {5, 8, 3, -2, 9};
        System.out.println("Index: " + findFirstNegative(arr));
    }
}
