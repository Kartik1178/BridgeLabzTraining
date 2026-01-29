package Level2;

import java.util.Scanner;

/**
 * Identifies the youngest and tallest person among three individuals.
 */
public class YoungestAndTallestPerson {

    // Entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] age = new int[3];
        double[] height = new double[3];

        for (int i = 0; i < 3; i++) {
            age[i] = sc.nextInt();
            height[i] = sc.nextDouble();
        }

        int youngest = 0, tallest = 0;

        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngest]) youngest = i;
            if (height[i] > height[tallest]) tallest = i;
        }

        String[] names = {"Amar", "Akbar", "Anthony"};
        System.out.println(names[youngest]);
        System.out.println(names[tallest]);
    }
}
