// BMITableGenerator.java
package level3;

/*
 * Calculates BMI for multiple people
 * and classifies their health status.
 */
public class BMITableGenerator {

    // Computes BMI and status table
    static String[][] compute(double[][] data) {
        String[][] result = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1] / 100;
            double bmi = weight / (height * height);
            String status = bmi < 18.5 ? "Underweight" :
                    bmi < 25 ? "Normal" :
                            bmi < 30 ? "Overweight" : "Obese";
            result[i][0] = String.valueOf(data[i][1]);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    // Displays BMI table
    static void display(String[][] table) {
        System.out.println("Height Weight BMI Status");
        for (String[] row : table) {
            System.out.println(row[0] + " " + row[1] + " " + row[2] + " " + row[3]);
        }
    }

    // Program entry point
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }
        display(compute(data));
    }
}
