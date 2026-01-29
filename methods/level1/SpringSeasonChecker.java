package Level1;

/*
 * Checks whether a given date
 * falls in spring season.
 */
public class SpringSeasonChecker {

    // Determines spring season
    static boolean isSpring(int month, int day) {
        return (month == 3 && day >= 20) ||
                (month == 6 && day <= 20) ||
                (month > 3 && month < 6);
    }

    // Program entry point
    public static void main(String[] args) {
        int day = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        System.out.println(isSpring(month, day));
    }
}
