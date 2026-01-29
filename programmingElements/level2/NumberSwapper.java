package level2assignment;

import java.util.Scanner;

class NumberSwapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("Swapped numbers are " + number1 + " and " + number2);
    }
}
