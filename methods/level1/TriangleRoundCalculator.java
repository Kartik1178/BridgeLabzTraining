package Level1;

/*
 * Calculates number of rounds needed
 * based on triangle perimeter.
 */
public class TriangleRoundCalculator {

    // Calculates required rounds
    static int calculateRounds(int a, int b, int c) {
        return (int) Math.ceil(5.0 / (a + b + c));
    }

    // Program entry point
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        System.out.println(calculateRounds(a, b, c));
    }
}
