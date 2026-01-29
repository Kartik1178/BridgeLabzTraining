import java.util.Scanner;

class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int base = input.nextInt();
        int height = input.nextInt();

        System.out.println("Area: " + (0.5 * base * height));
    }
}
