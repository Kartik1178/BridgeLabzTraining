class FeeDiscountCalculator {
    public static void main(String[] args) {
        int fees = 125000;
        int discountPercent = 10;

        double finalAmount = fees - (fees * discountPercent / 100.0);
        System.out.println(finalAmount);
    }
}
