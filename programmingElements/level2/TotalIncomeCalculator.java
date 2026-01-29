package level2assignment;

import java.util.Scanner;

class TotalIncomeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salary = sc.nextDouble();
        double bonus = sc.nextDouble();

        System.out.println("Total Income is INR " + (salary + bonus));
    }
}
