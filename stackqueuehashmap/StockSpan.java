import java.util.Stack;

/*
 * StockSpan
 * ---------
 * This class solves the Stock Span Problem.
 *
 * For each day, the stock span is the number of
 * consecutive days (including today) for which
 * the stock price was less than or equal to today's price.
 *
 * The solution uses a stack to achieve O(n) time complexity.
 */
class StockSpan {

    // This method calculates the stock span for each day
    static int[] calculateSpan(int[] price) {

        int n = price.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Span for the first day is always 1
        span[0] = 1;

        // Push index of first day onto stack
        stack.push(0);

        // Process remaining days
        for (int i = 1; i < n; i++) {

            // Pop indices while current price is higher or equal
            while (!stack.isEmpty() && price[stack.peek()] <= price[i]) {
                stack.pop();
            }

            // Calculate span based on stack state
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            // Push current day's index onto stack
            stack.push(i);
        }

        return span;
    }
// main method for   testing the stock span calculator
    public static void main(String[] args) {

        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] span = calculateSpan(prices);

        System.out.print("Stock Spans: ");
        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}
