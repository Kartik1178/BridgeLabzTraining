package level1;

/*
 * Demonstrates copy constructor by cloning
 * another person's attributes.
 */
public class PersonCopyConstructor {

    String name;
    int age;

    // Parameterized constructor
    PersonCopyConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    PersonCopyConstructor(PersonCopyConstructor p) {
        this.name = p.name;
        this.age = p.age;
    }
}
