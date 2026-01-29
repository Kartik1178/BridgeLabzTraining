package level2assignment;

import java.util.Scanner;

class CelsiusToFahrenheitConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double celsius = sc.nextDouble();
        System.out.println("Temperature in Fahrenheit is " +
                ((celsius * 9 / 5) + 32));
    }
}
