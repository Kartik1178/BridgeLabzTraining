package level2assignment;

import java.util.Scanner;

class AthleteRunningRoundsCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();

        double rounds = 5000 / (side1 + side2 + side3);
        System.out.println("Total rounds needed: " + rounds);
    }
}
