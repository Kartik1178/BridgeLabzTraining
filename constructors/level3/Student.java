package level3;

/*
 * Demonstrates access modifiers in
 * a university management system.
 */
public class Student {

    public int rollNumber;
    protected String name;
    private double CGPA;

    // Sets CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    // Gets CGPA
    public double getCGPA() {
        return CGPA;
    }
}
