package Level3;

import java.util.Scanner;

/*
 * Checks special numbers such as
 * prime, neon, spy, automorphic, buzz.
 */
public class SpecialNumberChecker {

    // Checks prime number
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    // Checks neon number
    static boolean isNeon(int n) {
        int sq = n * n, sum = 0;
        while (sq > 0) {
            sum += sq % 10;
            sq /= 10;
        }
        return sum == n;
    }

    // Checks spy number
    static boolean isSpy(int n) {
        int sum = 0, product = 1;
        while (n > 0) {
            int d = n % 10;
            sum += d;
            product *= d;
            n /= 10;
        }
        return sum == product;
    }

    // Checks automorphic number
    static boolean isAutomorphic(int n) {
        int sq = n * n;
        while (n > 0) {
            if (sq % 10 != n % 10) return false;
            sq /= 10;
            n /= 10;
        }
        return true;
    }

    // Checks buzz number
    static boolean isBuzz(int n) {
        return n % 7 == 0 || n % 10 == 7;
    }

    // Program entry point
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Prime: " + isPrime(n));
        System.out.println("Neon: " + isNeon(n));
        System.out.println("Spy: " + isSpy(n));
        System.out.println("Automorphic: " + isAutomorphic(n));
        System.out.println("Buzz: " + isBuzz(n));

        sc.close();
    }
}
