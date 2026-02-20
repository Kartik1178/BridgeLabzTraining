import java.util.HashMap;
import java.util.Arrays;

/*
 * TwoSum
 * ------
 * This class finds two indices in an array
 * such that the elements at those indices
 * add up to a given target value.
 *
 * It uses a HashMap to store array values
 * and their indices to achieve O(n) time
 * complexity.
 */
class TwoSum {

    // This method returns indices of two numbers whose sum equals the target
    static int[] twoSum(int[] arr, int target) {

        HashMap<Integer, Integer> hashmap = new HashMap<>();

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {

            // Check if the required complement already exists
            if (hashmap.containsKey(target - arr[i])) {
                return new int[]{hashmap.get(target - arr[i]), i};
            }

            // Store the current element and its index
            hashmap.put(arr[i], i);
        }

        // Return -1, -1 if no valid pair is found
        return new int[]{-1, -1};
    }
// method for   finding the two sum of an array
    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(arr, target);

        System.out.println("Indices: " + Arrays.toString(result));
    }
}
