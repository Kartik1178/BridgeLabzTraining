
package level2assignment;

import java.util.Scanner;

class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();

        double si = (principal * rate * time) / 100;
        System.out.println("Simple Interest is " + si);
    }
}
