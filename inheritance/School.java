/*
 * Base class Person
 * Represents a person in the school system
 */
class Person {

    String name;
    int age;

    // Initializes person details
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

/*
 * Teacher class
 * Represents a teacher role
 */
class Teacher extends Person {

    String subject;

    // Initializes teacher details
    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Displays teacher role
    void displayRole() {
        System.out.println("Role: Teacher | Subject: " + subject);
    }
}

/*
 * Student class
 * Represents a student role
 */
class Student extends Person {

    int grade;

    // Initializes student details
    Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    // Displays student role
    void displayRole() {
        System.out.println("Role: Student | Grade: " + grade);
    }
}

/*
 * Staff class
 * Represents staff role
 */
class Staff extends Person {

    String department;

    // Initializes staff details
    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    // Displays staff role
    void displayRole() {
        System.out.println("Role: Staff | Department: " + department);
    }
}
