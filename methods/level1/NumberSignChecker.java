package Level1;

/*
 * This class checks whether a number
 * is positive, negative, or zero.
 */
public class NumberSignChecker {

    // Checks number sign
    static int checkNumber(int num) {
        if (num > 0) return 1;
        if (num < 0) return -1;
        return 0;
    }

    // Entry point
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int result = checkNumber(number);

        if (result == 1)
            System.out.println("The number is Positive");
        else if (result == -1)
            System.out.println("The number is Negative");
        else
            System.out.println("The number is Zero");
    }
}
