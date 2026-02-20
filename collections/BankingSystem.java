import java.util.*;

/*
 * BankingSystem
 * HashMap stores accounts, TreeMap sorts by balance,
 * Queue processes withdrawal requests.
 */
class BankingSystem {

    HashMap<String,Integer> accounts=new HashMap<>();
    Queue<String> withdrawalQueue=new LinkedList<>();

    // Add account
    public void addAccount(String acc,int bal){
        accounts.put(acc,bal);
    }

    // Request withdrawal
    public void requestWithdrawal(String acc){
        withdrawalQueue.offer(acc);
    }

    // Process withdrawals
    public void processWithdrawals(){
        while(!withdrawalQueue.isEmpty()){
            String acc=withdrawalQueue.poll();
            accounts.put(acc,accounts.get(acc)-100);
        }
    }

    // Display sorted by balance
    public void displaySorted(){
        TreeMap<Integer,String> sorted=new TreeMap<>();
        for(String acc:accounts.keySet()){
            sorted.put(accounts.get(acc),acc);
        }
        System.out.println(sorted);
    }

    // Main method
    public static void main(String[] args) {
        BankingSystem bs=new BankingSystem();
        bs.addAccount("A1",1000);
        bs.addAccount("A2",2000);
        bs.requestWithdrawal("A1");
        bs.processWithdrawals();
        bs.displaySorted();
    }
}