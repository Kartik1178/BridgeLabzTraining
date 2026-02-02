/*
 * Base class BankAccount
 * Represents common bank account properties
 */
class BankAccount {

    String accountNumber;
    double balance;

    // Initializes bank account details
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Displays account balance
    void displayBalance() {
        System.out.println("Balance: ₹" + balance);
    }
}

/*
 * SavingsAccount class
 * Adds interest rate feature
 */
class SavingsAccount extends BankAccount {

    double interestRate;

    // Initializes savings account
    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Displays account type
    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}

/*
 * CheckingAccount class
 * Adds withdrawal limit feature
 */
class CheckingAccount extends BankAccount {

    int withdrawalLimit;

    // Initializes checking account
    CheckingAccount(String accountNumber, double balance, int withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    // Displays account type
    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }
}

/*
 * FixedDepositAccount class
 * Adds lock-in period feature
 */
class FixedDepositAccount extends BankAccount {

    int lockInPeriod;

    // Initializes fixed deposit account
    FixedDepositAccount(String accountNumber, double balance, int lockInPeriod) {
        super(accountNumber, balance);
        this.lockInPeriod = lockInPeriod;
    }

    // Displays account type
    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }
}
