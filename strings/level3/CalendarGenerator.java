// CalendarGenerator.java
package level3;

/*
 * Displays a formatted calendar
 * for a given month and year.
 */
public class CalendarGenerator {

    // Returns month name
    static String getMonthName(int m) {
        String[] months = {
                "January","February","March","April","May","June",
                "July","August","September","October","November","December"
        };
        return months[m - 1];
    }

    // Checks leap year
    static boolean isLeapYear(int y) {
        return (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
    }

    // Returns days in month
    static int getDays(int m, int y) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        return (m == 2 && isLeapYear(y)) ? 29 : days[m - 1];
    }

    // Finds first day of month
    static int getFirstDay(int m, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (1 + x + (31 * m0) / 12) % 7;
    }

    // Displays calendar
    static void display(int m, int y) {
        System.out.println(getMonthName(m) + " " + y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int first = getFirstDay(m, y);
        int days = getDays(m, y);
        for (int i = 0; i < first; i++) System.out.print("    ");
        for (int d = 1; d <= days; d++) {
            System.out.printf("%3d ", d);
            if ((d + first) % 7 == 0) System.out.println();
        }
    }

    // Program entry point
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        display(sc.nextInt(), sc.nextInt());
    }
}
