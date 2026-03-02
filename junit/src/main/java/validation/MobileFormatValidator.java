package validation;

public class MobileFormatValidator {
boolean validate(String number){
    return number.matches("^\\d{2}\\s\\d{10}$");

}
}
