import java.util.HashMap;
import java.util.Map;

/*
 * MergeMaps
 * Merges two maps. If keys overlap, sum values.
 */
class MergeMaps {

    // Merge maps
    public static Map<String,Integer> merge(Map<String,Integer> m1, Map<String,Integer> m2) {
        Map<String,Integer> result = new HashMap<>(m1);
        for (String key : m2.keySet()) {
            result.put(key, result.getOrDefault(key,0) + m2.get(key));
        }
        return result;
    }

    // Main method
    public static void main(String[] args) {
        Map<String,Integer> m1 = Map.of("A",1,"B",2);
        Map<String,Integer> m2 = Map.of("B",3,"C",4);
        System.out.println(merge(m1,m2));
    }
}