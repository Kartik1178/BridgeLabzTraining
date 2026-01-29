package Level1;

import java.util.Scanner;

/**
 * Converts a 2D matrix into a 1D array.
 */
public class MatrixToArrayConverter {

    // Entry point of the program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int cols = input.nextInt();

        int[][] matrix = new int[rows][cols];
        int[] flat = new int[rows * cols];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input.nextInt();
                flat[index++] = matrix[i][j];
            }
        }
    }
}
