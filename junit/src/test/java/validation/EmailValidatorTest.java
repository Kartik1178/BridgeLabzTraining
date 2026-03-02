
package validation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class EmailValidatorTest {
private final EmailValidator validator=new EmailValidator();
@Test
    void givenValidEmail(){
    assertTrue(validator.validate("kartik@gmail.com"));
}
@Test
     void givenInvalidEmail(){
    assertFalse(validator.validate("ee"));
}



}
