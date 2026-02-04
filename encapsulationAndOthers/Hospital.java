package encapsulationAndOthers;

/*
 * Abstract patient class
 */
abstract class Patient {
    private int id;
    private String name;

    // Constructor for patient
    public Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Abstract bill calculation
    public abstract double calculateBill();
}

/*
 * Interface for medical records
 */
interface MedicalRecord {
    void addRecord(String record);
}

/*
 * In-patient implementation
 */
class InPatient extends Patient implements MedicalRecord {

    // Constructor for inpatient
    public InPatient(int id, String name) {
        super(id, name);
    }

    // Calculates bill
    public double calculateBill() {
        return 12000;
    }

    // Adds medical record
    public void addRecord(String record) {
        System.out.println("Record added");
    }
}

/*
 * Main class for hospital system
 */
class HospitalMain {
    public static void main(String[] args) {
        Patient p = new InPatient(101, "Kumar");
        System.out.println("Bill: " + p.calculateBill());
    }
}
