package controlFlow.level2;

import java.util.Scanner;

/*
 * Calculates grade based on average marks of three subjects.
 */
public class GradeCalculator {

    // Entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double c = sc.nextDouble();
        double m = sc.nextDouble();

        double avg = (p + c + m) / 3;
        System.out.println(avg);

        if (avg >= 80) System.out.println("A");
        else if (avg >= 70) System.out.println("B");
        else if (avg >= 60) System.out.println("C");
        else if (avg >= 50) System.out.println("D");
        else if (avg >= 40) System.out.println("E");
        else System.out.println("R");
    }
}
