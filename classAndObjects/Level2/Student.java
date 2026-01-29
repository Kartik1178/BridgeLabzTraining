/*
 * Represents a student and
 * calculates academic grade.
 */
public class Student {

    String name;
    int rollNumber;
    int marks;

    // Initializes student details
    Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Calculates grade based on marks
    char calculateGrade() {
        if (marks >= 90) return 'A';
        else if (marks >= 75) return 'B';
        else if (marks >= 60) return 'C';
        else if (marks >= 40) return 'D';
        else return 'F';
    }

    // Displays student details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}
