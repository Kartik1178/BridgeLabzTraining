/*
 * Class Name: CompareBufferAndBuilder
 * ------------------------------------
 * This program compares performance of StringBuffer and StringBuilder
 * for large scale concatenation.
 */

class CompareBufferAndBuilder {

    // Method to test StringBuilder performance
    public static long testBuilder() {
        StringBuilder sb = new StringBuilder();
        long start = System.nanoTime();

        for (int i = 0; i < 1000000; i++) {
            sb.append("hello");
        }

        long end = System.nanoTime();
        return end - start;
    }

    // Method to test StringBuffer performance
    public static long testBuffer() {
        StringBuffer sb = new StringBuffer();
        long start = System.nanoTime();

        for (int i = 0; i < 1000000; i++) {
            sb.append("hello");
        }

        long end = System.nanoTime();
        return end - start;
    }
    //main method for testing
    public static void main(String[] args) {
        System.out.println("StringBuilder Time: " + testBuilder());
        System.out.println("StringBuffer Time: " + testBuffer());
    }
}
