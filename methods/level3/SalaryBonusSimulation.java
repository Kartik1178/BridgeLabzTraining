package Level3;

/*
 * Simulates salary increment
 * and bonus distribution.
 */
public class SalaryBonusSimulation {

    // Generates employee data
    static int[][] generateEmployees() {
        int[][] data = new int[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = 10000 + (int)(Math.random() * 90000);
            data[i][1] = 1 + (int)(Math.random() * 9);
        }
        return data;
    }

    // Program entry point
    public static void main(String[] args) {
        int[][] emp = generateEmployees();
        System.out.println("Salary Bonus Simulation Complete");
    }
}
