/*
 * Class Name: ReadFileUsingFileReader
 * This program reads a text file line by line using
 * FileReader and BufferedReader.
 */

import java.io.*;

class ReadFileUsingFileReader {

    // Method to read file line by line
    public static void readFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
// main method for testing
    public static void main(String[] args) {
        readFile("sample.txt");
    }
}
