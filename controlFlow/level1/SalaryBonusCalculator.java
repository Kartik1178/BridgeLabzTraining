package controlFlow.level1;

import java.util.Scanner;

/*
 * Calculates bonus based on years of service.
 */
public class SalaryBonusCalculator {

    // Entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        int years = sc.nextInt();

        if (years > 5) {
            System.out.println(salary * 0.05);
        } else {
            System.out.println(0);
        }
    }
}
