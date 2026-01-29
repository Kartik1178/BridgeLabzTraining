package Level1;

import java.util.Scanner;

/**
 * Checks voting eligibility for a list of students based on their ages.
 */
public class VotingEligibilityChecker {

    // Entry point of the program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {
            ages[i] = input.nextInt();
        }

        for (int age : ages) {
            if (age > 18) {
                System.out.println("The student with the age " + age + " can vote");
            } else {
                System.out.println("The student with the age " + age + " cannot vote");
            }
        }
    }
}
