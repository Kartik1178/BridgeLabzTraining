package encapsulationAndOthers;

/*
 * Abstract class representing a generic Employee
 * Defines common properties and behavior for all employees
 */
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    // Constructor to initialize employee details
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Abstract method to calculate salary
    public abstract double calculateSalary();

    // Displays employee details
    public void displayDetails() {
        System.out.println(employeeId + " | " + name + " | Salary: " + calculateSalary());
    }

    // Getter for base salary
    public double getBaseSalary() {
        return baseSalary;
    }
}

/*
 * Interface defining department behavior
 */
interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

/*
 * Represents a full-time employee
 */
class FullTimeEmployee extends Employee implements Department {
    private String department;

    // Constructor for full-time employee
    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    // Calculates salary for full-time employee
    public double calculateSalary() {
        return getBaseSalary();
    }

    // Assigns department
    public void assignDepartment(String dept) {
        this.department = dept;
    }

    // Returns department details
    public String getDepartmentDetails() {
        return department;
    }
}

/*
 * Represents a part-time employee
 */
class PartTimeEmployee extends Employee {
    private int hours;
    private double rate;

    // Constructor for part-time employee
    public PartTimeEmployee(int id, String name, int hours, double rate) {
        super(id, name, 0);
        this.hours = hours;
        this.rate = rate;
    }

    // Calculates salary for part-time employee
    public double calculateSalary() {
        return hours * rate;
    }
}

/*
 * Main class to demonstrate employee management
 */
 class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(1, "Arjun", 50000);
        Employee e2 = new PartTimeEmployee(2, "Ravi", 40, 500);

        e1.displayDetails();
        e2.displayDetails();
    }
}
