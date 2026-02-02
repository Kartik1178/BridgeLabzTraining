/* Represents a Bank */
class Bank {
    // Opens an account for a customer
    void openAccount(Customer customer) {
        System.out.println("Account opened for " + customer.name);
    }
}

/* Represents a Customer */
class Customer {
    String name;

    // Displays balance
    void viewBalance() {
        System.out.println("Viewing balance");
    }
}
