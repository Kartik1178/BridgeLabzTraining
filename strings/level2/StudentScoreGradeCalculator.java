// StudentScoreGradeCalculator.java
package level2;

/*
 * Generates marks, calculates
 * totals, averages and grades.
 */
public class StudentScoreGradeCalculator {

    // Generates random marks
    static int[][] generateScores(int n) {
        int[][] a = new int[n][3];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                a[i][j] = (int)(Math.random() * 90) + 10;
        return a;
    }

    // Calculates statistics
    static double[][] calculateStats(int[][] a) {
        double[][] r = new double[a.length][3];
        for (int i = 0; i < a.length; i++) {
            int t = a[i][0] + a[i][1] + a[i][2];
            r[i][0] = t;
            r[i][1] = t / 3.0;
            r[i][2] = t / 300.0 * 100;
        }
        return r;
    }

    // Program entry point
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[][] scores = generateScores(n);
        double[][] stats = calculateStats(scores);
        for (int i = 0; i < n; i++) {
            System.out.println(scores[i][0] + " " + scores[i][1] + " " + scores[i][2] +
                    " " + stats[i][0] + " " + stats[i][1] + " " + stats[i][2]);
        }
    }
}
