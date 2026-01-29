class PenDistribution {
    public static void main(String[] args) {
        int pens = 14;
        int students = 3;

        System.out.println(
                "Pens per student: " + (pens / students) +
                        ", Remaining pens: " + (pens % students)
        );
    }
}
