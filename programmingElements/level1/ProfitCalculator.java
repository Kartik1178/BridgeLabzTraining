class ProfitCalculator {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;

        int profit = sellingPrice - costPrice;
        double profitPercentage = (profit * 100.0) / costPrice;

        System.out.println(
                "Cost Price: INR " + costPrice +
                        ", Selling Price: INR " + sellingPrice +
                        "\nProfit: INR " + profit +
                        ", Profit Percentage: " + String.format("%.2f", profitPercentage)
        );
    }
}
