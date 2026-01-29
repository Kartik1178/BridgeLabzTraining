package Level1;

/*
 * Calculates wind chill temperature
 * using standard formula.
 */
public class WindChillCalculator {

    // Calculates wind chill
    double calculate(double t, double v) {
        return 35.74 + 0.6215 * t +
                (0.4275 * t - 35.75) * Math.pow(v, 0.16);
    }

    // Program entry point
    public static void main(String[] args) {
        WindChillCalculator wc = new WindChillCalculator();
        System.out.println(
                wc.calculate(
                        Double.parseDouble(args[0]),
                        Double.parseDouble(args[1])
                )
        );
    }
}
