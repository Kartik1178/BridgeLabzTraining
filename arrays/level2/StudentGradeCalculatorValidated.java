package Level2;

import java.util.Scanner;

/**
 * Calculates grades with validation for marks input.
 */
public class StudentGradeCalculatorValidated {

    // Entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();

        for (int i = 0; i < students; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                int m = sc.nextInt();
                if (m >= 0) sum += m;
                else j--;
            }
            System.out.println(sum / 3.0);
        }
    }
}
