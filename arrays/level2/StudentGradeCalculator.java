package Level2;

import java.util.Scanner;

/**
 * Calculates student grades based on marks.
 */
public class StudentGradeCalculator {

    // Entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();

        for (int i = 0; i < students; i++) {
            int total = sc.nextInt() + sc.nextInt() + sc.nextInt();
            double percentage = total / 3.0;
            System.out.println(percentage);
        }
    }
}
