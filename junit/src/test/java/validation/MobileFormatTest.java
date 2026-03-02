package validation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;
public class MobileFormatTest {
   MobileFormatValidator mobile=new MobileFormatValidator();
    @Test
    void validateValidEmail(){
    assertTrue(mobile.validate("91 9502061100"));

    }
    @Test
    void validateInvalidEmail(){
        assertFalse(mobile.validate("91"));

    }


}
