
package Level3;

/*
 * Analyzes height statistics such as
 * mean, tallest, and shortest values.
 */
public class HeightStatisticsAnalyzer {

    // Calculates mean height
    static double findMeanHeight(int[] heights) {
        int sum = 0;
        for (int h : heights) sum += h;
        return (double) sum / heights.length;
    }

    // Finds shortest height
    static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights)
            if (h < min) min = h;
        return min;
    }

    // Finds tallest height
    static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights)
            if (h > max) max = h;
        return max;
    }

    // Program entry point
    public static void main(String[] args) {
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++)
            heights[i] = 150 + (int) (Math.random() * 101);

        System.out.println("Tallest: " + findTallest(heights));
        System.out.println("Shortest: " + findShortest(heights));
        System.out.println("Mean: " + findMeanHeight(heights));
    }
}
