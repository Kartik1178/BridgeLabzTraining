package Level2;

import java.util.Scanner;

/**
 * Calculates BMI with validation for height input.
 */
public class BMICalculatorValidated {

    // Entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int persons = sc.nextInt();

        for (int i = 0; i < persons; i++) {
            double height = sc.nextDouble();
            while (height <= 0) height = sc.nextDouble();
            double weight = sc.nextDouble();

            double bmi = weight / (height * height);
            System.out.println(bmi);
        }
    }
}
