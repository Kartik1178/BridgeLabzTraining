package validation;

public class PasswordValidator {
 boolean validate(String password){
     return password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=[^-+@#&=$%^*!]*[-+@#&=$%^*!][^-+@#&=$%^*!]*$)[A-Za-z\\d@#+=^&%]{8,}$");
 }


}
