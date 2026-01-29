package level2;

/*
 * Handles vehicle registration with
 * shared registration fee.
 */
public class VehicleRegistration {

    String ownerName;
    String vehicleType;
    static double registrationFee = 5000;

    // Parameterized constructor
    VehicleRegistration(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Displays vehicle details
    void displayVehicleDetails() {
        System.out.println(ownerName + " " + vehicleType);
    }

    // Updates registration fee
    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }
}
