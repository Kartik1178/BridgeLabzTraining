package level1;

/*
 * Represents a car rental system
 * and calculates total rental cost.
 */
public class CarRental {

    String customerName;
    String carModel;
    int rentalDays;

    // Parameterized constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Calculates total rental cost
    double calculateCost() {
        return rentalDays * 1000;
    }
}
