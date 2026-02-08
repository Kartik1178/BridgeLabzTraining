class CircularTour {

    static int findStartingPoint(int[] petrol, int[] distance) {
        int totalBalance = 0;    // total petrol - total distance
        int currentBalance = 0;  // balance while traversing
        int start = 0;           // candidate starting index

        for (int i = 0; i < petrol.length; i++) {
            int diff = petrol[i] - distance[i];

            totalBalance += diff;
            currentBalance += diff;

            // If we cannot reach the next pump
            if (currentBalance < 0) {
                start = i + 1;        // next pump becomes new start
                currentBalance = 0;  // reset balance
            }
        }

        // If total petrol is enough for total distance
        return (totalBalance >= 0) ? start : -1;
    }

    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int result = findStartingPoint(petrol, distance);
        System.out.println(result); // Output: 1
    }
}
