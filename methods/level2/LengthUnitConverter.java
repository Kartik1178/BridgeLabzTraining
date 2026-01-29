package Level2;

import java.util.Scanner;

/*
 * Converts between kilometers, miles,
 * meters, and feet.
 */
public class LengthUnitConverter {

    // Converts km to miles
    static double kmToMiles(double km) {
        return km * 0.621371;
    }

    // Converts miles to km
    static double milesToKm(double miles) {
        return miles * 1.60934;
    }

    // Converts meters to feet
    static double metersToFeet(double meters) {
        return meters * 3.28084;
    }

    // Converts feet to meters
    static double feetToMeters(double feet) {
        return feet * 0.3048;
    }

    // Program entry point
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(kmToMiles(sc.nextDouble()));
        System.out.println(milesToKm(sc.nextDouble()));
        System.out.println(metersToFeet(sc.nextDouble()));
        System.out.println(feetToMeters(sc.nextDouble()));
        sc.close();
    }
}
