package Level1;

/*
 * Calculates sum of first
 * N natural numbers.
 */
public class NaturalNumberSumCalculator {

    // Calculates sum
    static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum;
    }

    // Program entry point
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(calculateSum(n));
    }
}
