package Level2;

import java.util.Scanner;

/*
 * Calculates BMI and categorizes
 * individuals based on BMI values.
 */
public class BMICategoryAnalyzer {

    // Calculates BMI
    static double calculateBMI(double h, double w) {
        return w / (h * h);
    }

    // Determines BMI category
    static int getStatus(double bmi) {
        if (bmi < 18.5) return 0;
        if (bmi < 25) return 1;
        if (bmi < 30) return 2;
        return 3;
    }

    // Program entry point
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            double h = sc.nextDouble();
            double w = sc.nextDouble();
            double bmi = calculateBMI(h, w);
            System.out.println("BMI: " + bmi + " Status: " + getStatus(bmi));
        }
        sc.close();
    }
}
