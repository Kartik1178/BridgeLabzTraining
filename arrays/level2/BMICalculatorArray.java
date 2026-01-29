package Level2;

import java.util.Scanner;

/**
 * Calculates BMI for multiple individuals using arrays.
 */
public class BMICalculatorArray {

    // Entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            double weight = sc.nextDouble();
            double height = sc.nextDouble();
            double bmi = weight / (height * height);
            System.out.println(bmi);
        }
    }
}
