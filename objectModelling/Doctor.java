/* Represents a Doctor */
class Doctor {
    String name;

    // Consults a patient
    void consult(Patient p) {
        System.out.println("Doctor consulting patient");
    }
}

/* Represents a Patient */
class Patient {
    String name;
}

/* Represents a Hospital */
class Hospital {
    List<Doctor> doctors = new ArrayList<>();
    List<Patient> patients = new ArrayList<>();
}
