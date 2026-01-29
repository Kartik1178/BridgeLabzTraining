package Level1;

/*
 * This class calculates the number of handshakes
 * possible among a given number of people.
 */
public class HandshakeCounter {

    // Calculates handshake count
    static int calculateHandshakes(int n) {
        return n * (n - 1) / 2;
    }

    // Entry point
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        System.out.println(calculateHandshakes(number));
    }
}
