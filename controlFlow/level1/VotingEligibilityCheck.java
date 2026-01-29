package controlFlow.level1;

import java.util.Scanner;

/*
 * Checks whether a person is eligible to vote based on age.
 */
public class VotingEligibilityCheck {

    // Entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(age >= 18);
    }
}
