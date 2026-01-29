package level3;

/*
 * Subclass demonstrating access
 * to inherited bank account fields.
 */
public class SavingsAccount extends BankAccount {

    // Displays account details
    void display() {
        System.out.println(accountNumber + " " + accountHolder);
    }
}
