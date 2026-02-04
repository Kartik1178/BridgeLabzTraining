package encapsulationAndOthers;

/*
 * Abstract ride vehicle
 */
abstract class RideVehicle {
    private String driver;
    private double rate;

    // Constructor for ride vehicle
    public RideVehicle(String driver, double rate) {
        this.driver = driver;
        this.rate = rate;
    }

    // Abstract fare calculation
    public abstract double calculateFare(double km);

    // Getter for rate
    protected double getRate() {
        return rate;
    }
}

/*
 * Interface for GPS tracking
 */
interface GPS {
    void updateLocation(String loc);
}

/*
 * Auto ride implementation
 */
class Auto extends RideVehicle implements GPS {
    private String location;

    // Constructor for auto
    public Auto(String driver, double rate) {
        super(driver, rate);
    }

    // Calculates fare
    public double calculateFare(double km) {
        return getRate() * km;
    }

    // Updates location
    public void updateLocation(String loc) {
        location = loc;
    }
}

/*
 * Main class for ride-hailing
 */
class RideMain {
    public static void main(String[] args) {
        RideVehicle ride = new Auto("Ramesh", 15);
        System.out.println("Fare: " + ride.calculateFare(10));
    }
}
