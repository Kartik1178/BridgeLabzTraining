package level2assignment;

import java.util.Scanner;

class QuotientAndRemainderCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        System.out.println("The Quotient is " + (number1 / number2) +
                " and Remainder is " + (number1 % number2));
    }
}
