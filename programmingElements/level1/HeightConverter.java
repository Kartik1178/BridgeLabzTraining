import java.util.Scanner;

class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int heightCm = input.nextInt();
        double inches = heightCm / 2.54;

        System.out.println(
                "Feet: " + Math.round(inches / 12) +
                        ", Inches: " + (inches % 12)
        );
    }
}
