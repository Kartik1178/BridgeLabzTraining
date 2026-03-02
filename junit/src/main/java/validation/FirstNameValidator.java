package validation;

public class FirstNameValidator {

    /**
     * Rules:
     * - Not null
     * - Only alphabets
     * - Length between 2 and 30
     * - First letter uppercase
     */
    public boolean validate(String firstName) {
        if (firstName == null) {
            return false;
        }
        return firstName.matches("^[A-Z][a-zA-Z]{1,29}$");
    }
}