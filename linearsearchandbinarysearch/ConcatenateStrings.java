/*
 * Class Name: ConcatenateUsingStringBuffer
 * ----------------------------------------
 * This program concatenates an array of strings efficiently
 * using StringBuffer.
 */

class ConcatenateUsingStringBuffer {

    // Method to concatenate strings using StringBuffer
    public static String concatenate(String[] arr) {
        StringBuffer sb = new StringBuffer();

        for (String str : arr) {
            sb.append(str);
        }

        return sb.toString();
    }
// main method for testing
    public static void main(String[] args) {
        String[] words = {"Java ", "is ", "powerful!"};
        System.out.println(concatenate(words));
    }
}
