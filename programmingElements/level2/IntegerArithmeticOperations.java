package level2assignment;

import java.util.Scanner;

class IntegerArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Results are: " +
                (a + b * c) + ", " +
                (a * b + c) + ", " +
                (c + a / b) + ", " +
                (a % b + c));
    }
}
