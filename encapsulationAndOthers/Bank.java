package encapsulationAndOthers;

/*
 * Abstract bank account class
 */
abstract class BankAccount {
    private String accNo;
    private double balance;

    // Constructor to initialize account
    public BankAccount(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }
    // Deposits amount
    public void deposit(double amt) {
        balance += amt;
    }

    // Withdraws amount
    public void withdraw(double amt) {
        balance -= amt;
    }

    // Abstract interest calculation
    public abstract double calculateInterest();

    // Getter for balance
    public double getBalance() {
        return balance;
    }
}

/*
 * Interface for loan functionality
 */
interface Loanable {
    boolean isEligible();
}

/*
 * Savings account implementation
 */
class SavingsAccount extends BankAccount implements Loanable {

    // Constructor for savings account
    public SavingsAccount(String accNo, double bal) {
        super(accNo, bal);
    }

    // Calculates interest
    public double calculateInterest() {
        return getBalance() * 0.04;
    }

    // Checks loan eligibility
    public boolean isEligible() {
        return getBalance() > 5000;
    }
}
/*
 * Main class for banking system
 */
class BankingMain {
    public static void main(String[] args) {
        BankAccount acc = new SavingsAccount("SB1001", 10000);
        System.out.println("Interest: " + acc.calculateInterest());
    }
}
