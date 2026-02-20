/*
 * Class Name: ConsoleToFileWriter
 * This program reads user input from console using InputStreamReader
 * and writes it to a file until user types "exit".
 */

import java.io.*;
class ConsoleToFileWriter {

    // Method to read console input and write to file
    public static void writeToFile(String filePath) {
        try (
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(
                        new FileWriter(filePath))
        ) {
            String input;
            System.out.println("Enter text (type 'exit' to stop):");

            while (!(input = br.readLine()).equalsIgnoreCase("exit")) {
                bw.write(input);
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    //main method for testing
    public static void main(String[] args) {
        writeToFile("output.txt");
    }
}
