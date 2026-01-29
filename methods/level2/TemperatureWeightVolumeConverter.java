package Level2;

import java.util.Scanner;

/*
 * Converts temperature, weight,
 * and volume units.
 */
public class TemperatureWeightVolumeConverter {

    // Converts Fahrenheit to Celsius
    static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    // Converts Celsius to Fahrenheit
    static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    // Converts pounds to kilograms
    static double poundsToKg(double p) {
        return p * 0.453592;
    }

    // Converts kilograms to pounds
    static double kgToPounds(double kg) {
        return kg * 2.20462;
    }

    // Converts gallons to liters
    static double gallonsToLiters(double g) {
        return g * 3.78541;
    }

    // Converts liters to gallons
    static double litersToGallons(double l) {
        return l * 0.264172;
    }

    // Program entry point
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(fahrenheitToCelsius(sc.nextDouble()));
        System.out.println(celsiusToFahrenheit(sc.nextDouble()));
        System.out.println(poundsToKg(sc.nextDouble()));
        System.out.println(kgToPounds(sc.nextDouble()));
        System.out.println(gallonsToLiters(sc.nextDouble()));
        System.out.println(litersToGallons(sc.nextDouble()));
        sc.close();
    }
}
