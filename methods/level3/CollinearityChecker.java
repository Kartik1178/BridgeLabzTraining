package Level3;

/*
 * Checks whether three points
 * are collinear.
 */
public class CollinearityChecker {

    // Checks collinearity using slope
    static boolean bySlope(double x1,double y1,double x2,double y2,double x3,double y3) {
        return (y2 - y1) / (x2 - x1) ==
                (y3 - y2) / (x3 - x2);
    }

    // Checks collinearity using area
    static boolean byArea(double x1,double y1,double x2,double y2,double x3,double y3) {
        return 0.5 * (x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2)) == 0;
    }
}
