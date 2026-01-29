package level2assignment;

import java.util.Scanner;

/*
 * This class calculates the quotient and remainder
 * when one integer is divided by another.
 */
class QuotientAndRemainderCalculator {

    // Main method to calculate quotient and remainder
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        System.out.println("The Quotient is " + (number1 / number2) +
                " and Remainder is " + (number1 % number2));
    }
}

/*
 * This class performs arithmetic operations
 * on three integer values.
 */
class IntegerArithmeticOperations {

    // Main method to perform integer arithmetic operations
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Results are: " +
                (a + b * c) + ", " +
                (a * b + c) + ", " +
                (c + a / b) + ", " +
                (a % b + c));
    }
}

/*
 * This class performs arithmetic operations
 * on three double values.
 */
class DoubleArithmeticOperations {

    // Main method to perform double arithmetic operations
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.println("Results are: " +
                (a + b * c) + ", " +
                (a * b + c) + ", " +
                (c + a / b) + ", " +
                (a % b + c));
    }
}

/*
 * This class converts temperature
 * from Celsius to Fahrenheit.
 */
class CelsiusToFahrenheitConverter {

    // Main method to convert Celsius to Fahrenheit
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
        System.out.println("Temperature in Fahrenheit is " +
                ((celsius * 9 / 5) + 32));
    }
}

/*
 * This class converts temperature
 * from Fahrenheit to Celsius.
 */
class FahrenheitToCelsiusConverter {

    // Main method to convert Fahrenheit to Celsius
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit = sc.nextDouble();
        System.out.println("Temperature in Celsius is " +
                ((fahrenheit - 32) * 5 / 9));
    }
}

/*
 * This class calculates total income
 * using salary and bonus.
 */
class TotalIncomeCalculator {

    // Main method to calculate total income
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        double bonus = sc.nextDouble();
        System.out.println("Total Income is INR " + (salary + bonus));
    }
}

/*
 * This class swaps two integer numbers
 * using a temporary variable.
 */
class NumberSwapper {

    // Main method to swap two numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("Swapped numbers are " + number1 + " and " + number2);
    }
}

/*
 * This class calculates the total distance travelled
 * and displays travel details.
 */
class TravelDistanceCalculator {

    // Main method to calculate travel distance
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        String fromCity = sc.next();
        String viaCity = sc.next();
        String toCity = sc.next();

        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double time = sc.nextDouble();

        System.out.println("The distance travelled by " + name +
                " from " + fromCity + " via " + viaCity +
                " to " + toCity + " is " + (d1 + d2) +
                " miles in " + time + " hours");
    }
}

/*
 * This class calculates the number of rounds
 * an athlete must run to complete 5 km.
 */
class AthleteRunningRoundsCalculator {

    // Main method to calculate running rounds
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();

        double rounds = 5000 / (side1 + side2 + side3);
        System.out.println("Total rounds needed: " + rounds);
    }
}

/*
 * This class distributes chocolates among children
 * and calculates remaining chocolates.
 */
class ChocolateDistributionCalculator {

    // Main method to calculate chocolate distribution
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chocolates = sc.nextInt();
        int children = sc.nextInt();

        System.out.println("Each child gets " + (chocolates / children) +
                " chocolates and remaining are " +
                (chocolates % children));
    }
}

/*
 * This class calculates simple interest
 * using principal, rate, and time.
 */
class SimpleInterestCalculator {

    // Main method to calculate simple interest
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();

        double si = (principal * rate * time) / 100;
        System.out.println("Simple Interest is " + si);
    }
}

/*
 * This class converts weight
 * from pounds to kilograms.
 */
class PoundToKilogramConverter {

    // Main method to convert pounds to kilograms
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pound = sc.nextDouble();
        System.out.println("Weight in kg is " + (pound / 2.2));
    }
}
