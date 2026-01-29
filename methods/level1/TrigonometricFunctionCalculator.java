package Level1;

/*
 * Computes sine, cosine,
 * and tangent of an angle.
 */
public class TrigonometricFunctions {

    // Calculates trigonometric values
    static double[] calculate(double angle) {
        double r = Math.toRadians(angle);
        return new double[]{Math.sin(r), Math.cos(r), Math.tan(r)};
    }

    // Program entry point
    public static void main(String[] args) {
        double[] res = calculate(Double.parseDouble(args[0]));
        System.out.println(res[0] + ", " + res[1] + ", " + res[2]);
    }
}
do f