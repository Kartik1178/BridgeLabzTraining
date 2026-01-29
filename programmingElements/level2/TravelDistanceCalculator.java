package level2assignment;

import java.util.Scanner;

class TravelDistanceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        String fromCity = sc.next();
        String viaCity = sc.next();
        String toCity = sc.next();

        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double time = sc.nextDouble();

        System.out.println("The distance travelled by " + name +
                " from " + fromCity + " via " + viaCity +
                " to " + toCity + " is " + (d1 + d2) +
                " miles in " + time + " hours");
    }
}
