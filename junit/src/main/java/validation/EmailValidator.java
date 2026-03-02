package validation;

public class EmailValidator {

    boolean validate(String email) {
        if (email == null) return false;

        return email.matches(
                "^[A-Za-z0-9]+([._+-][A-Za-z0-9]+)*@" +
                        "[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*\\.[A-Za-z]{2,}$"
        );
    }
}