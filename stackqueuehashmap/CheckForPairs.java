import java.util.HashSet;

/*
 * CheckForPairs
 * --------------
 * This class checks whether there exists
 * a pair of elements in an array whose sum
 * is equal to a given target value.
 *
 * It uses a HashSet to store previously
 * seen elements and achieves O(n) time complexity.
 */
class CheckForPairs {

    // This method checks if any two numbers in the array add up to the given sum
    static boolean checkForPairs(int[] arr, int sum) {

        HashSet<Integer> set = new HashSet<>();

        // Traverse each element in the array
        for (int num : arr) {

            // Calculate the required number to form the sum
            int remainder = sum - num;

            // If the remainder already exists, pair is found
            if (set.contains(remainder)) {
                return true;
            }

            // Store the current number in the set
            set.add(num);
        }

        // No valid pair found
        return false;
    }
//main method for testing
    public static void main(String[] args) {

        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;

        System.out.println(checkForPairs(arr, target));
    }
}
