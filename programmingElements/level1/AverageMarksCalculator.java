class AverageMarksCalculator {
    public static void main(String[] args) {
        String name = "Sam";
        int mathMarks = 94;
        int physicsMarks = 95;
        int chemistryMarks = 96;

        float average = (mathMarks + physicsMarks + chemistryMarks) / 3.0f;
        System.out.println(name + "'s average mark in PCM is " + average);
    }
}
