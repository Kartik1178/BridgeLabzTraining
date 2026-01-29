package level3;

/*
 * Subclass demonstrating access
 * to employee details.
 */
public class Manager extends Employee {

    // Displays manager details
    void display() {
        System.out.println(employeeID + " " + department);
    }
}
