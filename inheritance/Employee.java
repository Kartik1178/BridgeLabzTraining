/* Represents a generic Employee */
class Employee {
    String name;
    int id;
    double salary;

    // Initializes employee details
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Displays basic employee details
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: ₹" + salary);
    }
}

/* Represents a Manager who is a type of Employee */
class Manager extends Employee {
    private int teamSize;

    // Initializes manager details
    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    // Displays manager details including team size
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

/* Represents a Developer who is a type of Employee */
class Developer extends Employee {
    private String programmingLanguage;

    // Initializes developer details
    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Displays developer-specific details
    void displayDetails() {
        System.out.println("Developer Name: " + name);
        System.out.println("Developer ID: " + id);
        System.out.println("Salary: ₹" + salary);
        System.out.println("Programming Language " + programmingLanguage);
    }
}

/* Represents an Intern who is a type of Employee */
class Internship extends Employee {
    private int duration;

    // Initializes internship details
    Internship(String name, int id, double salary, int duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    // Displays internship details including duration
    void displayDetails() {
        super.displayDetails();
        System.out.println("duration " + duration);
    }
}

/* Entry point of the program */
class Main {

    // Program execution starts here
    public static void main(String[] args) {
        Employee e1 = new Internship("ee", 2, 22, 5);
        e1.displayDetails();
    }
}
