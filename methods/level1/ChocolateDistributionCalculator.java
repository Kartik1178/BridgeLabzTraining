package Level1;

/*
 * Distributes chocolates equally
 * and calculates remainder.
 */
public class ChocolateDistribution {

    // Calculates distribution
    static int[] distribute(int chocolates, int children) {
        return new int[]{chocolates / children, chocolates % children};
    }

    // Program entry point
    public static void main(String[] args) {
        int[] res = distribute(
                Integer.parseInt(args[0]),
                Integer.parseInt(args[1])
        );
        System.out.println("Each child gets " + res[0]);
        System.out.println("Remaining " + res[1]);
    }
}
