/*
 * Employee Management System
 * This class represents an Employee working in a company.
 * It demonstrates the use of static variables and methods,
 * the this keyword for constructor initialization,
 * a final variable for employee ID,
 * and the instanceof operator to ensure type safety
 * before displaying employee details.
 */
public class Employee {

    private static String companyName = "TechCorp";
    private static int totalEmployees = 0;

    private String name;
    private String designation;

    private final int id;

    // Constructor to initialize employee details using this
    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    // Method to display employee details after instanceof check
    public void displayDetails(Object obj) {
        if (obj instanceof Employee) {
            Employee e = (Employee) obj;
            System.out.println(
                    "Company Name: " + companyName +
                            ", ID: " + e.id +
                            ", Name: " + e.name +
                            ", Designation: " + e.designation
            );
        } else {
            System.out.println("Not a valid Employee object");
        }
    }

    // Static method to display total number of employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Rahul", "Developer");
        Employee e2 = new Employee(102, "Ananya", "Tester");

        e1.displayDetails(e1);
        e2.displayDetails(e2);

        String s = "test";
        e1.displayDetails(s);

        Employee.displayTotalEmployees();
    }
}
