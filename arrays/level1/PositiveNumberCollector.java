package Level1;

import java.util.Scanner;

/**
 * Collects positive numbers until limit or negative input and calculates sum.
 */
public class PositiveNumberCollector {

    // Entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] values = new double[10];
        double sum = 0;
        int index = 0;

        while (index < 10) {
            double value = sc.nextDouble();
            if (value <= 0) break;
            values[index++] = value;
        }

        for (int i = 0; i < index; i++) {
            sum += values[i];
            System.out.println(values[i]);
        }

        System.out.println(sum);
    }
}
