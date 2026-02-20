import java.util.Map;

/*
 * MaxValueKeyFinder
 * Finds the key with highest value in Map<String,Integer>.
 */
class MaxValueKeyFinder {

    // Find key with max value
    public static String findMax(Map<String, Integer> map) {
        String maxKey = null;
        int maxVal = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() > maxVal) {
                maxVal = e.getValue();
                maxKey = e.getKey();
            }
        }
        return maxKey;
    }

    // Main method
    public static void main(String[] args) {
        Map<String,Integer> map = Map.of("A",10,"B",20,"C",15);
        System.out.println(findMax(map));
    }
}