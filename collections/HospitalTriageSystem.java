import java.util.*;

/*
 * HospitalTriageSystem
 * Simulates patient treatment based on severity using PriorityQueue.
 * Higher severity value means higher priority.
 */
class Patient {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}

public class HospitalTriageSystem {

    // Method to process patients by severity
    public static void processPatients(List<Patient> patients) {
        PriorityQueue<Patient> pq = new PriorityQueue<>(
                (a, b) -> b.severity - a.severity
        );
        pq.addAll(patients);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll().name);
        }
    }

    public static void main(String[] args) {
        List<Patient> list = Arrays.asList(
                new Patient("John", 3),
                new Patient("Alice", 5),
                new Patient("Bob", 2)
        );

        processPatients(list);
    }
}
