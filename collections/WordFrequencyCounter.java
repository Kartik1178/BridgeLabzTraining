import java.util.*;

/*
 * WordFrequencyCounter
 * Reads text and counts frequency of each word.
 * Ignores case and punctuation using regex cleanup.
 */
class WordFrequencyCounter {

    // Main method to demonstrate word counting
    public static void main(String[] args) {
        String text = "Hello world, hello Java!";
        text = text.toLowerCase().replaceAll("[^a-z ]", "");

        Map<String, Integer> freq = new HashMap<>();

        for (String word : text.split("\\s+")) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        System.out.println(freq);
    }
}