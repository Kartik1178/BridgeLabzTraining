package validation;

public class LastNameValidator {

    /**
     * Rules:
     * - Not null
     * - Only alphabets
     * - Length between 2 and 30
     * - First letter uppercase
     */
    public boolean validate(String lastName) {
        if (lastName == null) {
            return false;
        }
        return lastName.matches("^[A-Z][a-zA-Z]{1,29}$");
    }
}