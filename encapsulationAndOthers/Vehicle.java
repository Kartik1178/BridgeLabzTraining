package encapsulationAndOthers;

/*
 * Abstract vehicle class
 */
abstract class Vehicle {
    private String vehicleNo;
    private double rate;

    // Constructor to initialize vehicle
    public Vehicle(String vehicleNo, double rate) {
        this.vehicleNo = vehicleNo;
        this.rate = rate;
    }

    // Abstract rental calculation
    public abstract double calculateRentalCost(int days);

    // Getter for rate
    public double getRate() {
        return rate;
    }
}

/*
 * Interface for insurance
 */
interface Insurable {
    double calculateInsurance();
}

/*
 * Car implementation
 */
class Car extends Vehicle implements Insurable {

    // Constructor for car
    public Car(String no, double rate) {
        super(no, rate);
    }

    // Calculates rental cost
    public double calculateRentalCost(int days) {
        return getRate() * days;
    }

    // Calculates insurance
    public double calculateInsurance() {
        return 500;
    }
}

/*
 * Main class for vehicle rental
 */
class VehicleMain {
    public static void main(String[] args) {
        Vehicle v = new Car("TN10AB1234", 1000);
        Insurable i = (Insurable) v;

        System.out.println("Rental: " + v.calculateRentalCost(3));
        System.out.println("Insurance: " + i.calculateInsurance());
    }
}
