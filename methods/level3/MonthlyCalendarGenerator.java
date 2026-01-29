package Level3;

/*
 * Generates a monthly calendar
 * for a given month and year.
 */
public class MonthlyCalendarGenerator {

    // Gets month name
    static String getMonth(int m) {
        String[] months = {
                "January","February","March","April","May","June",
                "July","August","September","October","November","December"
        };
        return months[m - 1];
    }

    // Gets number of days in month
    static int getDays(int m, int y) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (m == 2 && (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)))
            return 29;
        return days[m - 1];
    }

    // Program entry point
    public static void main(String[] args) {
        int year = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);

        System.out.println(getMonth(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
    }
}
