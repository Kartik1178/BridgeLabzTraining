/*
 * Represents a circle and calculates
 * its area and circumference.
 */
public class Circle {

    double radius;

    // Initializes radius
    Circle(double radius) {
        this.radius = radius;
    }

    // Displays area of the circle
    void displayArea() {
        System.out.println("Area: " + Math.PI * radius * radius);
    }

    // Displays circumference of the circle
    void displayCircumference() {
        System.out.println("Circumference: " + 2 * Math.PI * radius);
    }
}
