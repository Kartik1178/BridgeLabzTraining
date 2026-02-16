import java.util.*;

/*
 * FrequencyCounter
 * Counts frequency of each string element in a List using Map.
 */
public class FrequencyCounter {

    // Method to count frequencies
    public static Map<String, Integer> countFrequency(List<String> list) {
        Map<String, Integer> map = new HashMap<>();

        for (String str : list) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        return map;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange");
        System.out.println(countFrequency(list));
    }
}
