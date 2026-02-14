/*
 * FibonacciPerformanceComparison
 *
 * Compares Recursive Fibonacci O(2^N) vs Iterative Fibonacci O(N).
 */
public class FibonacciPerformanceComparison {

    // Recursive Fibonacci O(2^N)
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative Fibonacci O(N)
    public static int fibonacciIterative(int n) {
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int sum = a + b;
            a = b;
            b = sum;
        }
        return (n == 0) ? 0 : b;
    }
    //main method for entry
    public static void main(String[] args) {
        int n = 40;

        long start = System.nanoTime();
        fibonacciIterative(n);
        long end = System.nanoTime();
        System.out.println("Iterative Time: " + (end - start) + " ns");

        start = System.nanoTime();
        fibonacciRecursive(20);
        end = System.nanoTime();
        System.out.println("Recursive Time: " + (end - start) + " ns");
    }
}
