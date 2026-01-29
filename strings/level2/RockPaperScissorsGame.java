// RockPaperScissorsGame.java
package level2;

/*
 * Simulates Rock Paper Scissors
 * game and calculates statistics.
 */
public class RockPaperScissorsGame {

    // Gets computer choice
    static String computerChoice() {
        int r = (int)(Math.random() * 3);
        return r == 0 ? "Rock" : r == 1 ? "Paper" : "Scissors";
    }

    // Finds winner
    static String winner(String u, String c) {
        if (u.equals(c)) return "Tie";
        if ((u.equals("Rock") && c.equals("Scissors")) ||
                (u.equals("Paper") && c.equals("Rock")) ||
                (u.equals("Scissors") && c.equals("Paper")))
            return "User";
        return "Computer";
    }

    // Program entry point
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int rounds = sc.nextInt();
        for (int i = 0; i < rounds; i++) {
            String user = sc.next();
            String comp = computerChoice();
            System.out.println(user + " " + comp + " " + winner(user, comp));
        }
    }
}
