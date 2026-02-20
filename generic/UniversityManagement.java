import java.util.*;

/*
 * UniversityCourseSystem
 *
 * Demonstrates Generic Classes, Wildcards,
 * and Bounded Type Parameters for course handling.
 */
abstract class CourseType {
    String courseName;
    public CourseType(String name) { this.courseName = name; }
    public String toString() { return courseName; }
}

class ExamCourse extends CourseType {
    public ExamCourse(String name) { super(name); }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String name) { super(name); }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String name) { super(name); }
}

class Course<T extends CourseType> {
    T courseType;
    public Course(T courseType) { this.courseType = courseType; }
    public T getCourseType() { return courseType; }
}

public class UniversityCourseSystem {

    // Wildcard method for any course type
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            System.out.println(c);
        }
    }
//main method for  testing
    public static void main(String[] args) {
        List<CourseType> courses = Arrays.asList(
                new ExamCourse("Math Exam"),
                new AssignmentCourse("Programming Assignment"),
                new ResearchCourse("AI Research")
        );

        System.out.println("Courses Offered:");
        displayCourses(courses);
    }
}
