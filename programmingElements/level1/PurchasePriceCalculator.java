import java.util.Scanner;

class PurchasePriceCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double price = input.nextDouble();
        int quantity = input.nextInt();

        System.out.println("Total price: INR " + (price * quantity));
    }
}
