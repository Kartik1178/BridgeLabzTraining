/*
 * Represents an employee with basic details
 * such as name, id, and salary.
 */
public class Employee {

    String name;
    int id;
    int salary;

    // Initializes employee details
    Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Displays employee details
    void display() {
        System.out.println("Salary: " + salary);
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    // Program entry point
    public static void main(String[] args) {
        Employee e = new Employee("e", 4, 4000);
        e.display();
    }
}
