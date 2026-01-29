package controlFlow.level2;

import java.util.Scanner;

/*
 * Finds the youngest age and tallest height among three people.
 */
public class YoungestAndTallestFinder {

    // Entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ageA = sc.nextInt();
        int ageB = sc.nextInt();
        int ageC = sc.nextInt();
        int hA = sc.nextInt();
        int hB = sc.nextInt();
        int hC = sc.nextInt();

        System.out.println(Math.min(ageA, Math.min(ageB, ageC)));
        System.out.println(Math.max(hA, Math.max(hB, hC)));
    }
}
