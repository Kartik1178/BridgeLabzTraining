/*
 * Interface Refuelable
 * Represents refueling capability
 */
interface Refuelable {

    // Refuels the vehicle
    void refuel();
}

/*
 * Base class Vehicle
 * Represents a generic vehicle
 */
class Vehicle {

    int maxSpeed;
    String model;

    // Initializes vehicle details
    Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}

/*
 * ElectricVehicle class
 * Represents an electric vehicle
 */
class ElectricVehicle extends Vehicle {

    // Initializes electric vehicle details
    ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    // Charges the electric vehicle
    void charge() {
        System.out.println("Electric vehicle is charging");
    }
}

/*
 * PetrolVehicle class
 * Represents a petrol vehicle with refueling ability
 */
class PetrolVehicle extends Vehicle implements Refuelable {

    // Initializes petrol vehicle details
    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    // Refuels the petrol vehicle
    public void refuel() {
        System.out.println("Petrol vehicle is refueling");
    }
}
