package level1;

/*
 * Represents a circle using constructor chaining
 * to initialize radius.
 */
public class CircleConstructorChaining {

    double radius;

    // Default constructor
    CircleConstructorChaining() {
        this(1.0);
    }

    // Parameterized constructor
    CircleConstructorChaining(double radius) {
        this.radius = radius;
    }
}
