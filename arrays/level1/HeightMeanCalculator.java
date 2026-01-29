package Level1;

import java.util.Scanner;

/**
 * Calculates mean height from an array of heights.
 */
public class HeightMeanCalculator {

    // Entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0;

        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }

        System.out.println(sum / heights.length);
    }
}
