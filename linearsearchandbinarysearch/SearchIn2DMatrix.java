/*
 * Class Name: SearchIn2DMatrix
 * --------------------------------
 * This program searches for a target value in a 2D sorted matrix
 * using Binary Search by treating it as a flattened 1D array.
 */

class SearchIn2DMatrix {

    // Method to search target in 2D matrix
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int row = mid / cols;
            int col = mid % cols;

            if (matrix[row][col] == target)
                return true;
            else if (matrix[row][col] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5},
                {7, 9, 11},
                {13, 15, 17}
        };
        System.out.println(searchMatrix(matrix, 9));
    }
}
