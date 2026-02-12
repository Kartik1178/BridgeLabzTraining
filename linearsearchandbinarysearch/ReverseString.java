/*
 * Class Name: ReverseStringUsingStringBuilder
 * This program reverses a given string using StringBuilder.
 * It demonstrates efficient string manipulation using reverse().
 */

class ReverseStringUsingStringBuilder {

    // Method to reverse a string using StringBuilder
    public static String reverseString(String input) {
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        sb.reverse();
        return sb.toString();
    }
// main method for testing
    public static void main(String[] args) {
        String input = "hello";
        String reversed = reverseString(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }
}
