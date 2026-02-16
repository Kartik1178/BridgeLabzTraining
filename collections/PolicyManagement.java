import java.time.LocalDate;
import java.util.*;

/*
 * PolicySetManager
 * Manages policies using HashSet, LinkedHashSet and TreeSet.
 * Provides retrieval filters and performance comparison.
 */
public class PolicySetManager {

    private Set<Policy> hashSet = new HashSet<>();
    private Set<Policy> linkedHashSet = new LinkedHashSet<>();
    private Set<Policy> treeSet = new TreeSet<>();

    // Add policy to all sets
    public void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    // Display all unique policies
    public void displayAllPolicies() {
        System.out.println("All Unique Policies:");
        for (Policy p : hashSet) {
            System.out.println(p);
        }
    }

    // Display policies expiring within next 30 days
    public void policiesExpiringSoon() {
        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        System.out.println("\nPolicies expiring within 30 days:");
        for (Policy p : hashSet) {
            if (!p.getExpiryDate().isBefore(today) && !p.getExpiryDate().isAfter(next30Days)) {
                System.out.println(p);
            }
        }
    }

    // Display policies by coverage type
    public void policiesByCoverage(String type) {
        System.out.println("\nPolicies with coverage: " + type);
        for (Policy p : hashSet) {
            if (p.getCoverageType().equalsIgnoreCase(type)) {
                System.out.println(p);
            }
        }
    }

    // Detect duplicate policy numbers
    public void detectDuplicates(List<Policy> list) {
        Set<String> seen = new HashSet<>();
        System.out.println("\nDuplicate Policies:");
        for (Policy p : list) {
            if (!seen.add(p.getPolicyNumber())) {
                System.out.println(p);
            }
        }
    }

    // Compare performance of add/search/remove
    public void performanceComparison(List<Policy> policies) {

        long start, end;

        // HashSet performance
        start = System.nanoTime();
        Set<Policy> hs = new HashSet<>();
        for (Policy p : policies) hs.add(p);
        hs.contains(policies.get(0));
        hs.remove(policies.get(0));
        end = System.nanoTime();
        System.out.println("\nHashSet time: " + (end - start) + " ns");

        // LinkedHashSet performance
        start = System.nanoTime();
        Set<Policy> lhs = new LinkedHashSet<>();
        for (Policy p : policies) lhs.add(p);
        lhs.contains(policies.get(0));
        lhs.remove(policies.get(0));
        end = System.nanoTime();
        System.out.println("LinkedHashSet time: " + (end - start) + " ns");

        // TreeSet performance
        start = System.nanoTime();
        Set<Policy> ts = new TreeSet<>();
        for (Policy p : policies) ts.add(p);
        ts.contains(policies.get(0));
        ts.remove(policies.get(0));
        end = System.nanoTime();
        System.out.println("TreeSet time: " + (end - start) + " ns");
    }

    public static void main(String[] args) {

        PolicySetManager manager = new PolicySetManager();

        Policy p1 = new Policy("P101", "Alice", LocalDate.now().plusDays(10), "Health", 5000);
        Policy p2 = new Policy("P102", "Bob", LocalDate.now().plusDays(40), "Auto", 7000);
        Policy p3 = new Policy("P103", "Carol", LocalDate.now().plusDays(20), "Home", 6000);
        Policy p4 = new Policy("P101", "Duplicate", LocalDate.now().plusDays(5), "Health", 5000); // duplicate

        manager.addPolicy(p1);
        manager.addPolicy(p2);
        manager.addPolicy(p3);
        manager.addPolicy(p4);

        manager.displayAllPolicies();
        manager.policiesExpiringSoon();
        manager.policiesByCoverage("Health");

        List<Policy> list = Arrays.asList(p1,p2,p3,p4);
        manager.detectDuplicates(list);
        manager.performanceComparison(list);
    }
}
