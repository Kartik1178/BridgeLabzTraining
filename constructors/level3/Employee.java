package level3;

/*
 * Represents employee records using
 * access modifiers.
 */
public class Employee {

    public int employeeID;
    protected String department;
    private double salary;

    // Updates salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Gets salary
    public double getSalary() {
        return salary;
    }
}
