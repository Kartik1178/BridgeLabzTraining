package validation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FirstNameValidatorTest {

    private final FirstNameValidator validator = new FirstNameValidator();

    @Test
    void givenValidFirstName() {
        assertTrue(validator.validate("Kartik"));
        assertTrue(validator.validate("John"));
        assertTrue(validator.validate("Arun"));
    }

    @Test
    void givenInvalidFirstName() {
        assertFalse(validator.validate("kartik"));   // lowercase start
        assertFalse(validator.validate("K"));        // too short
        assertFalse(validator.validate("John123"));  // numbers not allowed
        assertFalse(validator.validate("K@rtik"));   // special chars
        assertFalse(validator.validate(null));       // null
    }
}