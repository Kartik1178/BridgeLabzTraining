/*
 * Class Name: CountWordInFile
 * This program counts how many times a specific word
 * appears in a text file.
 */

import java.io.*;

class CountWordInFile {

    // Method to count word occurrences
    public static int countWord(String filePath, String target) {
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(target)) {
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return count;
    }
// main method for testing
    public static void main(String[] args) {
        System.out.println("Occurrences: " + countWord("sample.txt", "java"));
    }
}
