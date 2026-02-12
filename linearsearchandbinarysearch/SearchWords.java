/*
 * Class Name: SearchWordInSentences
 * ----------------------------------
 * This program searches for the first sentence
 * containing a specific word.
 */

class SearchWordInSentences {

    // Method to search word in sentences
    public static String searchSentence(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;
            }
        }
        return "Not Found";
    }
    // main method for testing
    public static void main(String[] args) {
        String[] sentences = {
                "Java is powerful",
                "Python is easy",
                "C++ is fast"
        };

        System.out.println(searchSentence(sentences, "Python"));
    }
}
