/*
 * Class: BankAccountSystem
 * Simulates bank withdrawal with custom and checked exceptions
 */
public class BankAccountSystem {
    private double balance = 1000;
    // Withdraws amount with validation and throws exceptions
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
    // Handles exceptions during withdrawal
    public static void main(String[] args) {
        BankAccountSystem account = new BankAccountSystem();
        try {
            account.withdraw(1500);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}