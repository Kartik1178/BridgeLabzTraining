/*
 * Class Name: FullComparisonChallenge
 * This program:
 * 1. Compares StringBuilder and StringBuffer performance.
 * 2. Reads a file using FileReader and InputStreamReader.
 * 3. Counts total words in the file.
 */

import java.io.*;
class FullComparisonChallenge {
    // Method to compare StringBuilder and StringBuffer
    public static void compareStrings() {
        long start, end;

        StringBuilder builder = new StringBuilder();
        start = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            builder.append("hello");
        }
        end = System.nanoTime();
        System.out.println("StringBuilder Time: " + (end - start));

        StringBuffer buffer = new StringBuffer();
        start = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            buffer.append("hello");
        }
        end = System.nanoTime();
        System.out.println("StringBuffer Time: " + (end - start));
    }
    // Method to count words using FileReader
    public static int countWordsFileReader(String filePath) {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                count += line.split("\\s+").length;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return count;
    }
    // Method to count words using InputStreamReader
    public static int countWordsInputStreamReader(String filePath) {
        int count = 0;

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(filePath), "UTF-8"))) {

            String line;
            while ((line = br.readLine()) != null) {
                count += line.split("\\s+").length;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return count;
    }

    public static void main(String[] args) {

        compareStrings();
        System.out.println("Words (FileReader): "
                + countWordsFileReader("sample.txt"));
        System.out.println("Words (InputStreamReader): "
                + countWordsInputStreamReader("sample.txt"));
    }
}
