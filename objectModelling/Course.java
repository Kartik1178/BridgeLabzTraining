/* Represents Course */
class Course {
    String name;
}

/* Represents Student */
class Student {
    // Enrolls into course
    void enrollCourse(Course c) {
        System.out.println("Student enrolled");
    }
}

/* Represents Professor */
class Professor {
    // Assigned to course
    void assignProfessor(Course c) {
        System.out.println("Professor assigned");
    }
}
