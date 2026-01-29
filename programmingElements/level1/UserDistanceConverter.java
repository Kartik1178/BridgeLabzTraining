import java.util.Scanner;

class UserDistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int km = input.nextInt();
        System.out.println("Miles: " + String.format("%.2f", km / 1.6));
    }
}
