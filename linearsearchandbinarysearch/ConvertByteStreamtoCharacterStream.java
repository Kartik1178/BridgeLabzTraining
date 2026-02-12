/*
 * Class Name: ConvertByteToCharStream
 * This program reads binary data from a file using FileInputStream
 * and converts it into characters using InputStreamReader.
 */

import java.io.*;

class ConvertByteToCharStream {

    // Method to read file using InputStreamReader
    public static void readFile(String filePath) {
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(filePath), "UTF-8"))) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        readFile("sample.txt");
    }
}
