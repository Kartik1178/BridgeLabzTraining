import java.util.HashSet;

/*
 * Find length of Longest Consecutive Sequence
 */
class LCS {

    static int findLCS(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        // Step 1: Add all elements to the set
        for (int num : arr) {
            set.add(num);
        }

        int maxCount = 0;

        // Step 2: Find longest sequence
        for (int num : arr) {

            // Only start counting if num is the start of a sequence
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int count = 1;

                // Count consecutive numbers
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                maxCount = Math.max(maxCount, count);
            }
        }

        return maxCount;
    }
// method for testing the LCS method
    public static void main(String[] args) {

        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println(findLCS(arr)); // Output: 4
    }
}
