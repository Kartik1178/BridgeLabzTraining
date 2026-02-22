import java.util.*;

/*
 * Class: CustomAgeValidation
 * Uses user-defined exception to validate age
 */
public class CustomAgeValidation {
    // Validates age and throws custom exception
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("Access granted!");
    }
    // Takes input and calls validateAge
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}