package Level2;

import java.util.Scanner;

/*
 * Identifies the youngest and
 * tallest among students.
 */
public class YoungestAndTallestFinder {

    // Finds index of youngest student
    static int findYoungest(int[] ages) {
        int min = ages[0], idx = 0;
        for (int i = 1; i < ages.length; i++)
            if (ages[i] < min) { min = ages[i]; idx = i; }
        return idx;
    }

    // Finds index of tallest student
    static int findTallest(int[] heights) {
        int max = heights[0], idx = 0;
        for (int i = 1; i < heights.length; i++)
            if (heights[i] > max) { max = heights[i]; idx = i; }
        return idx;
    }

    // Program entry point
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];

        for (int i = 0; i < 3; i++) ages[i] = sc.nextInt();
        for (int i = 0; i < 3; i++) heights[i] = sc.nextInt();

        System.out.println(names[findTallest(heights)] +
                " " + names[findYoungest(ages)]);
        sc.close();
    }
}
