/*
 * Class: InvalidAgeException
 * Custom exception thrown when age is below 18
 */
public class InvalidAgeException extends Exception {
    // Constructor with message
    public InvalidAgeException(String message) {
        super(message);
    }
}