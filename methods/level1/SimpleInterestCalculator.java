package Level1;

/*
 * This class calculates Simple Interest
 * using Principal, Rate, and Time values.
 */
public class SimpleInterestCalculator {

    // Calculates simple interest
    static double calculateSimpleInterest(double principal, double rate, double time) {
        return principal * rate * time / 100;
    }

    // Entry point of the program
    public static void main(String[] args) {
        double p = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);

        System.out.println(
                "The Simple Interest is " +
                        calculateSimpleInterest(p, r, t)
        );
    }
}
