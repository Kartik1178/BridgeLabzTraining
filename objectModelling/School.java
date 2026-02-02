/* Represents a Course */
class Course {
    String name;
    List<Student> students = new ArrayList<>();

    // Adds student to course
    void addStudent(Student s) {
        students.add(s);
    }
}

/* Represents a Student */
class Student {
    String name;
    List<Course> courses = new ArrayList<>();

    // Enrolls student into course
    void enrollCourse(Course c) {
        courses.add(c);
        c.addStudent(this);
    }
}

/* Represents a School */
class School {
    List<Student> students = new ArrayList<>();

    // Adds student to school
    void addStudent(Student s) {
        students.add(s);
    }
}
