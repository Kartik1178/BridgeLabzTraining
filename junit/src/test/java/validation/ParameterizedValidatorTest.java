package validation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ParameterizedValidatorTest {
EmailValidator validator=new EmailValidator();
@ParameterizedTest
@CsvSource({
        "abc@yahoo.com, true", "abc-100@yahoo.com, true", "abc.100@yahoo.com, true", "abc111@abc.com, true", "abc-100@abc.net, true", "abc.100@abc.com.au, true",
        "abc, false", "abc@.com.my, false", "abc123@gmail.a, false", "abc123@.com, false", "abc..2002@gmail.com, false", "abc#gmail.com, false", "@gmail.com, false" })



void  validate(String email,boolean expectedResult){
    assertEquals(expectedResult,validator.validate(email));
}


}
