/*
 * Class: InterestCalculator
 * Demonstrates throw vs throws and exception propagation
 */
public class InterestCalculator {
    // Calculates interest and throws exception for invalid inputs
    static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
        }
        return amount * rate * years / 100;
    }
    // Calls calculateInterest and handles propagated exception
    public static void main(String[] args) {
        try {
            double interest = calculateInterest(-1000, 5, 2);
            System.out.println("Interest: " + interest);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}