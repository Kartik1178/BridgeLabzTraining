package level2assignment;

import java.util.Scanner;

class ChocolateDistributionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int chocolates = sc.nextInt();
        int children = sc.nextInt();

        System.out.println("Each child gets " + (chocolates / children) +
                " chocolates and remaining are " +
                (chocolates % children));
    }
}
