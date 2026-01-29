import java.util.Scanner;

/*
 * Calculates and prints a person's age based on birth year and current year.
 */
class AgeCalculator {
    // Entry point to calculate age
    public static void main(String[] args) {
        String name = "Harry";
        int birthYear = 2000;
        int currentYear = 2024;
        int age = currentYear - birthYear;
        System.out.println(name + "'s age in " + currentYear + " is " + age);
    }
}

/*
 * Computes the average percentage marks of a student in PCM subjects.
 */
class AverageMarksCalculator {
    // Entry point to calculate average marks
    public static void main(String[] args) {
        String name = "Sam";
        int mathMarks = 94;
        int physicsMarks = 95;
        int chemistryMarks = 96;
        float average = (mathMarks + physicsMarks + chemistryMarks) / 3.0f;
        System.out.println(name + "'s average mark in PCM is " + average);
    }
}

/*
 * Converts distance from kilometers to miles.
 */
class DistanceConverterKmToMiles {
    // Entry point to convert distance
    public static void main(String[] args) {
        double distanceKm = 10.8;
        double distanceMiles = distanceKm / 1.6;
        System.out.println("The distance " + distanceKm + " km in miles is " + distanceMiles);
    }
}

/*
 * Calculates profit and profit percentage based on cost and selling price.
 */
class ProfitCalculator {
    // Entry point to calculate profit
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;
        int profit = sellingPrice - costPrice;
        double profitPercentage = (profit * 100.0) / costPrice;
        System.out.println(
                "Cost Price: INR " + costPrice +
                        ", Selling Price: INR " + sellingPrice +
                        "\nProfit: INR " + profit +
                        ", Profit Percentage: " + String.format("%.2f", profitPercentage)
        );
    }
}

/*
 * Distributes pens equally among students and finds remaining pens.
 */
class PenDistribution {
    // Entry point to distribute pens
    public static void main(String[] args) {
        int pens = 14;
        int students = 3;
        System.out.println(
                "Pens per student: " + (pens / students) +
                        ", Remaining pens: " + (pens % students)
        );
    }
}

/*
 * Calculates discounted fee amount.
 */
class FeeDiscountCalculator {
    // Entry point to calculate discounted fee
    public static void main(String[] args) {
        int fees = 125000;
        int discountPercent = 10;
        double finalAmount = fees - (fees * discountPercent / 100.0);
        System.out.println(finalAmount);
    }
}

/*
 * Calculates volume of the Earth in cubic kilometers and miles.
 */
class EarthVolumeCalculator {
    // Entry point to calculate earth volume
    public static void main(String[] args) {
        int radiusKm = 6378;
        double volumeKm = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles = volumeKm / Math.pow(1.6, 3);
        System.out.println(
                "Earth volume in cubic km: " + String.format("%.2f", volumeKm) +
                        ", cubic miles: " + String.format("%.2f", volumeMiles)
        );
    }
}

/*
 * Converts user-input kilometers to miles.
 */
class UserDistanceConverter {
    // Entry point for user-based distance conversion
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km = input.nextInt();
        System.out.println("Miles: " + String.format("%.2f", km / 1.6));
    }
}

/*
 * Calculates discounted fee based on user input.
 */
class UserFeeDiscountCalculator {
    // Entry point for user-based discount calculation
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fees = input.nextInt();
        int discount = input.nextInt();
        System.out.println(fees - (fees * discount / 100.0));
    }
}

/*
 * Converts height from centimeters to feet and inches.
 */
class HeightConverter {
    // Entry point to convert height
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int heightCm = input.nextInt();
        double inches = heightCm / 2.54;
        System.out.println(
                "Feet: " + Math.round(inches / 12) +
                        ", Inches: " + (inches % 12)
        );
    }
}

/*
 * Performs basic arithmetic operations on two numbers.
 */
class ArithmeticOperations {
    // Entry point for arithmetic operations
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        float b = input.nextFloat();
        System.out.println(
                "Add: " + (a + b) +
                        ", Sub: " + (a - b) +
                        ", Mul: " + (a * b) +
                        ", Div: " + (a / b)
        );
    }
}

/*
 * Converts distance from feet to miles and yards.
 */
class DistanceConverterFeet {
    // Entry point to convert feet distance
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int feet = input.nextInt();
        float yards = feet / 3.0f;
        int miles = (int) yards / 1760;
        float remainingYards = yards % 1760;
        System.out.printf(
                "Miles: %d, Yards: %.2f",
                miles, remainingYards
        );
    }
}

/*
 * Calculates perimeter of a square.
 */
class SquarePerimeterCalculator {
    // Entry point to calculate square perimeter
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int side = input.nextInt();
        System.out.println("Perimeter: " + (side * 4));
    }
}

/*
 * Calculates area of a triangle.
 */
class TriangleAreaCalculator {
    // Entry point to calculate triangle area
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        int height = input.nextInt();
        System.out.println("Area: " + (0.5 * base * height));
    }
}

/*
 * Calculates total purchase price.
 */
class PurchasePriceCalculator {
    // Entry point to calculate purchase price
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double price = input.nextDouble();
        int quantity = input.nextInt();
        System.out.println("Total price: INR " + (price * quantity));
    }
}

/*
 * Calculates total number of possible handshakes among students.
 */
class HandshakeCalculator {
    // Entry point to calculate handshakes
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int students = input.nextInt();
        System.out.println("Possible handshakes: " + (students * (students - 1) / 2.0));
    }
}
