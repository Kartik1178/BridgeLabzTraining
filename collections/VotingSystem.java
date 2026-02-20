import java.util.*;

/*
 * VotingSystem
 * Uses HashMap to count votes, LinkedHashMap to maintain order,
 * and TreeMap to display sorted results.
 */
class VotingSystem {

    HashMap<String,Integer> voteCount=new HashMap<>();
    LinkedHashMap<String,Integer> voteOrder=new LinkedHashMap<>();

    // Cast vote
    public void vote(String candidate){
        voteCount.put(candidate,voteCount.getOrDefault(candidate,0)+1);
        voteOrder.put(candidate,voteCount.get(candidate));
    }

    // Display sorted results
    public void displaySorted(){
        TreeMap<String,Integer> sorted=new TreeMap<>(voteCount);
        System.out.println(sorted);
    }

    // Main method
    public static void main(String[] args) {
        VotingSystem vs=new VotingSystem();
        vs.vote("Alice");
        vs.vote("Bob");
        vs.vote("Alice");
        vs.displaySorted();
    }
}