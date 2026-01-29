package Level2;

/*
 * Performs factor-related operations such as
 * sum, product, and sum of squares of factors.
 */
public class FactorOperationsCalculator {

    // Finds all factors of a number
    static int[] findFactors(int number) {
        int[] factors = new int[100];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Calculates sum of factors
    static int findSum(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    // Calculates product of factors
    static int findProduct(int[] factors) {
        int product = 1;
        for (int f : factors)
            if (f != 0) product *= f;
        return product;
    }

    // Calculates sum of squares of factors
    static int findSumOfSquares(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += Math.pow(f, 2);
        return sum;
    }

    // Program entry point
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int[] factors = findFactors(number);
        System.out.println(findSum(factors) + " " +
                findProduct(factors) + " " +
                findSumOfSquares(factors));
    }
}
