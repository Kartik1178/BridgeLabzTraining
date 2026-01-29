package level2assignment;

import java.util.Scanner;

class DoubleArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.println("Results are: " +
                (a + b * c) + ", " +
                (a * b + c) + ", " +
                (c + a / b) + ", " +
                (a % b + c));
    }
}
