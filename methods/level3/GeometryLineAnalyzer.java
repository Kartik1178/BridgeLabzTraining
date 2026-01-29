package Level3;

/*
 * Computes distance and line
 * equation between two points.
 */
public class GeometryLineAnalyzer {

    // Calculates Euclidean distance
    static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Finds line equation
    static double[] lineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }

    // Program entry point
    public static void main(String[] args) {
        double[] line = lineEquation(1, 2, 3, 4);
        System.out.println("y = " + line[0] + "x + " + line[1]);
    }
}
