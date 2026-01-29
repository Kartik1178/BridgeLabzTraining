package level2assignment;

import java.util.Scanner;

class FahrenheitToCelsiusConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double fahrenheit = sc.nextDouble();
        System.out.println("Temperature in Celsius is " +
                ((fahrenheit - 32) * 5 / 9));
    }
}
