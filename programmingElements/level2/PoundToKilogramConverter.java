package level2assignment;

import java.util.Scanner;

class PoundToKilogramConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pound = sc.nextDouble();
        System.out.println("Weight in kg is " + (pound / 2.2));
    }
}
