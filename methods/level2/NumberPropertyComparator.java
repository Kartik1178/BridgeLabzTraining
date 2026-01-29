package Level2;

/*
 * Evaluates number properties
 * and compares array elements.
 */
public class NumberPropertyComparator {

    // Checks if number is positive
    static boolean isPositive(int n) {
        return n >= 0;
    }

    // Checks if number is even
    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // Compares two numbers
    static int compare(int a, int b) {
        return Integer.compare(a, b);
    }

    // Program entry point
    public static void main(String[] args) {
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) nums[i] = Integer.parseInt(args[i]);

        for (int n : nums) {
            if (isPositive(n))
                System.out.println(n + (isEven(n) ? " Positive Even" : " Positive Odd"));
            else
                System.out.println(n + " Negative");
        }

        int result = compare(nums[0], nums[4]);
        System.out.println(result > 0 ? "First > Last" :
                result == 0 ? "First = Last" : "First < Last");
    }
}
