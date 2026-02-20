import java.io.*;

/*
 * FileReadingPerformanceComparison
 *
 * Compares FileReader vs InputStreamReader for reading large files.
 */
public class FileReadingPerformanceComparison {

    // Reads file using FileReader
    public static void readWithFileReader(String file) throws Exception {
        FileReader fr = new FileReader(file);
        while (fr.read() != -1) {}
        fr.close();
    }

    // Reads file using InputStreamReader
    public static void readWithInputStreamReader(String file) throws Exception {
        InputStreamReader isr = new InputStreamReader(new FileInputStream(file));
        while (isr.read() != -1) {}
        isr.close();
    }
    //main method for testing
    public static void main(String[] args) throws Exception {
        String filePath = "largefile.txt"; // provide path

        long start = System.nanoTime();
        readWithFileReader(filePath);
        long end = System.nanoTime();
        System.out.println("FileReader Time: " + (end - start) + " ns");

        start = System.nanoTime();
        readWithInputStreamReader(filePath);
        end = System.nanoTime();
        System.out.println("InputStreamReader Time: " + (end - start) + " ns");
    }
}
