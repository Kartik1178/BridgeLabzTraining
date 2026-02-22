import java.io.*;

/*
 * Class: TryWithResourcesExample
 * Demonstrates automatic resource closing using try-with-resources
 */
public class TryWithResourcesExample {
    // Reads first line of file using BufferedReader
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("info.txt"))) {
            String line = br.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}