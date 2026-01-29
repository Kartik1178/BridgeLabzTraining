import java.util.Scanner;

class SquarePerimeterCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int side = input.nextInt();
        System.out.println("Perimeter: " + (side * 4));
    }
}
