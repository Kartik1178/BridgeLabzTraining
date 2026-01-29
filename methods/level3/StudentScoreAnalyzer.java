package Level3;

import java.util.Scanner;

/*
 * Generates student scores and
 * calculates totals and averages.
 */
public class StudentScoreAnalyzer {

    // Generates random scores
    static double[][] generateScores(int n) {
        double[][] s = new double[n][3];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                s[i][j] = 10 + Math.random() * 90;
        return s;
    }

    // Program entry point
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        generateScores(n);
        System.out.println("Scores Generated");
        sc.close();
    }
}
