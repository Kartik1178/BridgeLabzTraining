package Level2;

/*
 * Checks voting eligibility
 * of multiple students using array.
 */
public class VotingEligibilityArrayChecker {

    // Determines voting eligibility
    boolean canVote(int age) {
        return age >= 18;
    }

    // Program entry point
    public static void main(String[] args) {
        VotingEligibilityArrayChecker checker = new VotingEligibilityArrayChecker();

        for (int i = 0; i < args.length; i++) {
            int age = Integer.parseInt(args[i]);
            System.out.println("Student " + (i + 1) +
                    (checker.canVote(age) ? " can vote" : " cannot vote"));
        }
    }
}
