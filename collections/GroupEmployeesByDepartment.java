import java.util.*;

/*
 * GroupEmployeesByDepartment
 * Groups Employee objects by department using Map<Dept,List<Employee>>.
 */
class GroupEmployeesByDepartment {

    static class Employee {
        String name, dept;
        Employee(String n, String d){ name=n; dept=d; }
        public String toString(){ return name; }
    }

    // Group employees
    public static Map<String,List<Employee>> group(List<Employee> list){
        Map<String,List<Employee>> map = new HashMap<>();
        for(Employee e : list){
            map.computeIfAbsent(e.dept, k->new ArrayList<>()).add(e);
        }
        return map;
    }

    // Main method
    public static void main(String[] args) {
        List<Employee> emps = List.of(
                new Employee("Alice","HR"),
                new Employee("Bob","IT"),
                new Employee("Carol","HR"));
        System.out.println(group(emps));
    }
}