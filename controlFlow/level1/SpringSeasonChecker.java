package controlFlow.level1;

import java.util.Scanner;

/*
 * Checks whether a given date falls in the spring season.
 */
public class SpringSeasonChecker {

    // Entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();

        boolean isSpring =
                (month == 3 && day >= 20) ||
                        (month == 4) ||
                        (month == 5) ||
                        (month == 6 && day <= 20);

        System.out.println(isSpring);
    }
}
