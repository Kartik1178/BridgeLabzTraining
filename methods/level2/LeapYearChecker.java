package Level2;

/*
 * Determines whether a given year
 * is a leap year or not.
 */
public class LeapYearChecker {

    // Checks leap year condition
    static boolean isLeapYear(int year) {
        if (year < 1582) return false;
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    // Program entry point
    public static void main(String[] args) {
        int year = Integer.parseInt(args[0]);
        System.out.println(isLeapYear(year) ? "Leap Year" : "Not a Leap Year");
    }
}
