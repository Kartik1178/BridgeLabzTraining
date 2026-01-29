/*
 * Hospital Management System
 * This class represents a Patient admitted to a hospital.
 * It demonstrates the use of static variables and methods,
 * the this keyword for constructor initialization,
 * final variables for unique patient identification,
 * and the instanceof operator for runtime type checking.
 */
public class Patient {

    // Static variable shared among all patients
    private static String hospitalName = "City Care Hospital";
    private static int totalPatients = 0;

    // Instance variables
    private String name;
    private int age;
    private String ailment;

    // Final variable for unique patient identification
    private final int patientID;

    // Constructor to initialize patient details using this
    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    // Method to display patient details using instanceof
    public void displayPatientDetails(Object obj) {
        if (obj instanceof Patient) {
            Patient p = (Patient) obj;
            System.out.println(
                    "Hospital Name: " + hospitalName +
                            ", Patient ID: " + p.patientID +
                            ", Name: " + p.name +
                            ", Age: " + p.age +
                            ", Ailment: " + p.ailment
            );
        } else {
            System.out.println("Invalid patient object");
        }
    }

    // Static method to get total number of patients
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    public static void main(String[] args) {

        Patient p1 = new Patient(1, "Rahul", 30, "Fever");
        Patient p2 = new Patient(2, "Ananya", 25, "Cold");

        p1.displayPatientDetails(p1);
        p2.displayPatientDetails(p2);

        String s = "test";
        p1.displayPatientDetails(s);

        Patient.getTotalPatients();
    }
}
