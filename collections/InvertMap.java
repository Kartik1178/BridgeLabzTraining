import java.util.*;

/*
 * InvertMap
 * Inverts Map<K,V> into Map<V,List<K>> handling duplicate values.
 */
class InvertMap {

    // Invert map
    public static <K, V> Map<V, List<K>> invert(Map<K, V> map) {
        Map<V, List<K>> result = new HashMap<>();
        for (K key : map.keySet()) {
            V value = map.get(key);
            result.computeIfAbsent(value, k -> new ArrayList<>()).add(key);
        }
        return result;
    }

    // Main method
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A",1,"B",2,"C",1);
        System.out.println(invert(map));
    }
}