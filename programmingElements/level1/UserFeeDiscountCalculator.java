import java.util.Scanner;

class UserFeeDiscountCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int fees = input.nextInt();
        int discount = input.nextInt();

        System.out.println(fees - (fees * discount / 100.0));
    }
}
