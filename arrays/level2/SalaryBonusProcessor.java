package Level2;

import java.util.Scanner;

/**
 * Calculates bonus and updated salary based on years of service.
 */
public class SalaryBonusProcessor {

    // Entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalOld = 0, totalBonus = 0, totalNew = 0;

        for (int i = 0; i < 10; i++) {
            double salary = sc.nextDouble();
            double years = sc.nextDouble();

            double bonus = years > 5 ? salary * 0.05 : salary * 0.02;

            totalOld += salary;
            totalBonus += bonus;
            totalNew += salary + bonus;
        }

        System.out.println(totalOld);
        System.out.println(totalBonus);
        System.out.println(totalNew);
    }
}
