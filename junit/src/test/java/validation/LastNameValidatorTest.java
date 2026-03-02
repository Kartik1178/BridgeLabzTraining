package validation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LastNameValidatorTest {

    private final LastNameValidator validator = new LastNameValidator();

    @Test
    void checkForValid() {
        assertTrue(validator.validate("Pusapati"));
        assertTrue(validator.validate("Sharma"));
        assertTrue(validator.validate("Reddy"));
    }

    @Test
    void checkInvalid() {
        assertFalse(validator.validate("pusapati")); // lowercase start
        assertFalse(validator.validate("P"));        // too short
        assertFalse(validator.validate("Reddy123")); // numbers not allowed
        assertFalse(validator.validate("R@ddy"));    // special chars
        assertFalse(validator.validate(null));       // null input
    }
}