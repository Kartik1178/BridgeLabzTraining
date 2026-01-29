import java.util.Scanner;

class DistanceConverterFeet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int feet = input.nextInt();
        float yards = feet / 3.0f;

        int miles = (int) yards / 1760;
        float remainingYards = yards % 1760;

        System.out.printf("Miles: %d, Yards: %.2f", miles, remainingYards);
    }
}
