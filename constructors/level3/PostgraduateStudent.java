package level3;

/*
 * Subclass demonstrating access
 * to protected members.
 */
public class PostgraduateStudent extends Student {

    // Displays postgraduate details
    void display() {
        System.out.println(rollNumber + " " + name);
    }
}
