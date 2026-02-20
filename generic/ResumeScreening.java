import java.util.*;

/*
 * ResumeScreeningSystem
 *
 * Demonstrates Generic Classes, Generic Methods,
 * Bounded Type Parameters, and Wildcards for resume processing.
 */
abstract class JobRole {
    String roleName;
    public JobRole(String roleName) { this.roleName = roleName; }
    public String toString() { return roleName; }
}

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer() { super("Software Engineer"); }
}

class DataScientist extends JobRole {
    public DataScientist() { super("Data Scientist"); }
}

class ProductManager extends JobRole {
    public ProductManager() { super("Product Manager"); }
}

class Resume<T extends JobRole> {
    String candidateName;
    T role;

    public Resume(String candidateName, T role) {
        this.candidateName = candidateName;
        this.role = role;
    }

    public String toString() {
        return candidateName + " applying for " + role;
    }
}

public class ResumeScreeningSystem {

    // Wildcard method for screening pipeline
    public static void screenRoles(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            System.out.println("Screening for role: " + role);
        }
    }
//Main method for testing
    public static void main(String[] args) {
        Resume<SoftwareEngineer> r1 = new Resume<>("Alice", new SoftwareEngineer());
        Resume<DataScientist> r2 = new Resume<>("Bob", new DataScientist());

        System.out.println(r1);
        System.out.println(r2);

        List<JobRole> roles = Arrays.asList(
                new SoftwareEngineer(),
                new DataScientist(),
                new ProductManager()
        );

        System.out.println("\nScreening Pipeline:");
        screenRoles(roles);
    }
}
