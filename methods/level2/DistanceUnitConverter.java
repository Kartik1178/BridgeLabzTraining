package Level2;

import java.util.Scanner;

/*
 * Converts between yards, feet,
 * meters, inches, and centimeters.
 */
public class DistanceUnitConverter {

    // Converts yards to feet
    static double yardsToFeet(double yards) {
        return yards * 3;
    }

    // Converts feet to yards
    static double feetToYards(double feet) {
        return feet * 0.333333;
    }

    // Converts meters to inches
    static double metersToInches(double meters) {
        return meters * 39.3701;
    }

    // Converts inches to meters
    static double inchesToMeters(double inches) {
        return inches * 0.0254;
    }

    // Converts inches to centimeters
    static double inchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    // Program entry point
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(yardsToFeet(sc.nextDouble()));
        System.out.println(feetToYards(sc.nextDouble()));
        System.out.println(metersToInches(sc.nextDouble()));
        System.out.println(inchesToMeters(sc.nextDouble()));
        System.out.println(inchesToCentimeters(sc.nextDouble()));
        sc.close();
    }
}
