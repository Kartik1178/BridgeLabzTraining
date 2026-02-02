/*
 * Vehicle Registration System
 * This class represents a vehicle registered with a common registration authority.
 * It demonstrates the use of static variables and methods, the this keyword,
 * final variables for unique identification, and the instanceof operator
 * for runtime type checking before displaying vehicle details.
 */
public class Vehicle {

    // Static variable common for all vehicles
    private static int registrationFee = 5000;

    // Instance variables
    private String ownerName;
    private String vehicleType;

    // Final variable for unique vehicle identification
    private final String registrationNumber;

    // Constructor to initialize vehicle details using this
    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Static method to update the registration fee
    public static void updateRegistrationFee(int newFee) {
        registrationFee = newFee;
    }

    // Method to display registration details using instanceof
    public void displayRegistrationDetails(Object obj) {
        if (obj instanceof Vehicle) {
            Vehicle v = (Vehicle) obj;
            System.out.println(
                    "Owner Name: " + v.ownerName +
                            ", Vehicle Type: " + v.vehicleType +
                            ", Registration Number: " + v.registrationNumber +
                            ", Registration Fee: " + registrationFee
            );
        } else {
            System.out.println("Invalid vehicle object");
        }
    }

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("TN10AB1234", "Rahul", "Car");
        Vehicle v2 = new Vehicle("KA05CD5678", "Ananya", "Bike");

        v1.displayRegistrationDetails(v1);
        v2.displayRegistrationDetails(v2);

        Vehicle.updateRegistrationFee(6000);

        v1.displayRegistrationDetails(v1);

        String s = "test";
        v1.displayRegistrationDetails(s);
    }
}