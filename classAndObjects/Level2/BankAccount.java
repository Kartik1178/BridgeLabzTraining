/*
 * Simulates a bank account with
 * deposit and withdrawal operations.
 */
public class BankAccount {

    String accountHolder;
    long accountNumber;
    double balance;

    // Initializes bank account
    BankAccount(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposits amount into account
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraws amount from account
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Displays current balance
    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Program entry point
    public static void main(String[] args) {
        Student s = new Student("Rahul", 101, 82);
        s.displayDetails();

        BankAccount b = new BankAccount("Amit", 1234567890L, 5000);
        b.deposit(2000);
        b.withdraw(3000);
        b.displayBalance();
    }
}
