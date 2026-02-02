/* Represents Faculty */
class Faculty {
    String name;
}

/* Represents Department */
class Department {
    String name;
}

/* Represents University */
class University {
    List<Department> departments = new ArrayList<>();
    List<Faculty> faculty = new ArrayList<>();

    // Adds department
    void addDepartment(Department d) {
        departments.add(d);
    }

    // Adds faculty
    void addFaculty(Faculty f) {
        faculty.add(f);
    }
}
