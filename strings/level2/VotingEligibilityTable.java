// VotingEligibilityTable.java
package level2;

/*
 * Generates random ages and
 * checks voting eligibility.
 */
public class VotingEligibilityTable {

    // Generates random ages
    static int[] generateAges(int n) {
        int[] a = new int[n];
        java.util.Random r = new java.util.Random();
        for (int i = 0; i < n; i++) a[i] = r.nextInt(90) - 10;
        return a;
    }

    // Builds eligibility table
    static String[][] buildTable(int[] ages) {
        String[][] res = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            res[i][0] = String.valueOf(ages[i]);
            res[i][1] = (ages[i] >= 18) ? "true" : "false";
        }
        return res;
    }

    // Displays table
    static void display(String[][] t) {
        System.out.println("Age CanVote");
        for (String[] r : t) {
            System.out.println(r[0] + " " + r[1]);
        }
    }

    // Program entry point
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        display(buildTable(generateAges(n)));
    }
}
