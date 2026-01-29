package Level3;

import java.util.Scanner;

/*
 * Performs matrix operations such as
 * addition, subtraction, multiplication,
 * transpose, determinant, and inverse.
 */
public class MatrixOperationsTool {

    // Creates matrix
    static int[][] createMatrix(int r, int c) {
        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m[i][j] = (int)(Math.random() * 10);
        return m;
    }

    // Displays matrix
    static void display(int[][] m) {
        for (int[] row : m) {
            for (int v : row) System.out.print(v + " ");
            System.out.println();
        }
    }

    // Program entry point
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        display(createMatrix(r, c));
        sc.close();
    }
}
