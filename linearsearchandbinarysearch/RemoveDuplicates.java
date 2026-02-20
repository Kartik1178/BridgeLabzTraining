/*
 * Class Name: RemoveDuplicatesUsingStringBuilder
 * This program removes duplicate characters from a string
 * while maintaining original order using StringBuilder and HashSet.
 */

import java.util.HashSet;

class RemoveDuplicatesUsingStringBuilder {

    // Method to remove duplicate characters
    public static String removeDuplicates(String input) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        for (char ch : input.toCharArray()) {
            if (!set.contains(ch)) {
                set.add(ch);
                sb.append(ch);
            }
        }

        return sb.toString();
    }
// main method for  testing
    public static void main(String[] args) {
        String input = "programming";
        System.out.println("Original: " + input);
        System.out.println("Without Duplicates: " + removeDuplicates(input));
    }
}
