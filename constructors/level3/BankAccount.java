package level3;

/*
 * Represents bank account with
 * controlled access to balance.
 */
public class BankAccount {

    public long accountNumber;
    protected String accountHolder;
    private double balance;

    // Sets balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Gets balance
    public double getBalance() {
        return balance;
    }
}
