import java.util.*;

/*
 * SubArraysWithZeroSum
 * -------------------
 * This class finds all subarrays in a given array
 * whose elements sum to zero.
 *
 * It uses a HashMap to store prefix sums and
 * the indices where those sums occur.
 *
 * If the same prefix sum appears again, the
 * elements between those indices form a
 * zero-sum subarray.
 */
class SubArraysWithZeroSum {

    // This method finds and prints all zero-sum subarrays
    static void findAllSubArrays(int[] arr) {

        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;

        // Store initial prefix sum 0 at index -1
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {

            // Update prefix sum
            sum += arr[i];

            // If prefix sum already exists, zero-sum subarray(s) found
            if (map.containsKey(sum)) {
                for (int startIndex : map.get(sum)) {
                    System.out.println(
                            "Subarray found from index " + (startIndex + 1) + " to " + i
                    );
                }
            }

            // Store the current index for this prefix sum
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
    }
    //main method  for testing
    public static void main(String[] args) {

        int[] arr = {1, -1, 2, -2, 3, -3};

        findAllSubArrays(arr);
    }
}
