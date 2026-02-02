/* Represents an Employee */
class Employee {
    String name;

    // Creates employee
    Employee(String name) {
        this.name = name;
    }
}

/* Represents a Department */
class Department {
    List<Employee> employees = new ArrayList<>();

    // Adds employee
    void addEmployee(Employee e) {
        employees.add(e);
    }
}

/* Represents a Company composed of departments */
class Company {
    List<Department> departments = new ArrayList<>();

    // Adds department
    void addDepartment(Department d) {
        departments.add(d);
    }
}
