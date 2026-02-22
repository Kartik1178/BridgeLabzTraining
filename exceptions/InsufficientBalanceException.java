/*
 * Class: InsufficientBalanceException
 * Custom exception for insufficient bank balance
 */
public class InsufficientBalanceException extends Exception {
    // Constructor with message
    public InsufficientBalanceException(String message) {
        super(message);
    }
}