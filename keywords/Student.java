/*
 * Student Management System
 * This class represents a Student enrolled in a university.
 * It demonstrates the use of static variables and methods,
 * the this keyword for constructor initialization,
 * a final variable for roll number,
 * and the instanceof operator to ensure type safety
 * before displaying or updating student details.
 */
public class Student {

    private static String universityName = "OpenAI University";
    private static int totalStudents = 0;

    private String name;
    private String grade;
    private final int rollNumber;

    // Constructor to initialize student details using this
    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    // Method to display student details after instanceof check
    public void displayDetails(Object obj) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            System.out.println(
                    "University: " + universityName +
                            ", Roll Number: " + s.rollNumber +
                            ", Name: " + s.name +
                            ", Grade: " + s.grade
            );
        } else {
            System.out.println("Not a valid Student object");
        }
    }

    // Method to update student grade after instanceof check
    public void updateGrade(Object obj, String newGrade) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            s.grade = newGrade;
            System.out.println("Grade updated successfully");
        } else {
            System.out.println("Cannot update grade. Invalid Student object");
        }
    }

    // Static method to display total number of students
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public static void main(String[] args) {

        Student s1 = new Student(1, "Rahul", "A");
        Student s2 = new Student(2, "Ananya", "B");

        s1.displayDetails(s1);
        s2.displayDetails(s2);

        s1.updateGrade(s1, "A+");
        s1.displayDetails(s1);

        String str = "test";
        s1.displayDetails(str);

        Student.displayTotalStudents();
    }
}
