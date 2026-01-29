package Level3;

import java.util.Scanner;

/*
 * Analyzes factor-based classifications
 * such as perfect, abundant, deficient.
 */
public class FactorClassificationAnalyzer {

    // Finds factors
    static int[] getFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) count++;

        int[] factors = new int[count];
        int idx = 0;

        for (int i = 1; i <= n; i++)
            if (n % i == 0) factors[idx++] = i;

        return factors;
    }

    // Checks perfect number
    static boolean isPerfect(int n, int[] f) {
        int sum = 0;
        for (int i = 0; i < f.length - 1; i++) sum += f[i];
        return sum == n;
    }

    // Program entry point
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] f = getFactors(n);

        System.out.println("Perfect Number: " + isPerfect(n, f));
        sc.close();
    }
}
