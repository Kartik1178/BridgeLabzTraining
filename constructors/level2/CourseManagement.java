package level2;

/*
 * Represents an online course system
 * with shared institute name.
 */
public class CourseManagement {

    String courseName;
    int duration;
    double fee;
    static String instituteName = "Default Institute";

    // Parameterized constructor
    CourseManagement(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Displays course details
    void displayCourseDetails() {
        System.out.println(courseName + " " + duration + " " + fee);
    }

    // Updates institute name
    static void updateInstituteName(String name) {
        instituteName = name;
    }
}
