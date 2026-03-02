package validation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PasswordValidatorTest {
PasswordValidator password=new PasswordValidator();

@Test
    void validateCorrectInput(){
    assertTrue(password.validate("hihi@Hfe4343"));

}
    @Test
    void validateWrongInput(){
        assertFalse(password.validate("hihife4343"));

    }

}
