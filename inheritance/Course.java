/*
 * Base class Course
 * Represents a generic educational course
 */
class Course {

    String courseName;
    int duration; // duration in hours

    // Initializes course details
    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Displays basic course information
    void displayInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}

/*
 * OnlineCourse class
 * Extends Course and adds online-specific details
 */
class OnlineCourse extends Course {

    String platform;
    boolean isRecorded;

    // Initializes online course details
    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Displays online course information
    void displayInfo() {
        super.displayInfo();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + isRecorded);
    }
}

/*
 * PaidOnlineCourse class
 * Extends OnlineCourse and adds payment details
 */
class PaidOnlineCourse extends OnlineCourse {

    double fee;
    double discount;

    // Initializes paid online course details
    PaidOnlineCourse(String courseName, int duration, String platform,
                     boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    // Displays full course information
    void displayInfo() {
        super.displayInfo();
        System.out.println("Fee: ₹" + fee);
        System.out.println("Discount: " + discount + "%");
    }
}
