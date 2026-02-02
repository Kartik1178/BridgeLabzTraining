/*
 * Abstract superclass Vehicle
 * This class defines common properties and behavior
 * for all types of vehicles.
 * It cannot be instantiated directly.
 */
abstract class Vehicle {

    // Maximum speed of the vehicle
    int maxSpeed;

    // Fuel type of the vehicle (Petrol, Diesel, etc.)
    String fuelType;

    // Constructor to initialize common vehicle properties
    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Abstract method to display vehicle information
    abstract void displayInfo();
}

/*
 * Car class extends Vehicle
 * Represents a car with seat capacity as an extra feature
 */
class Car extends Vehicle {

    // Number of seats in the car
    private int seatCapacity;

    // Constructor for Car
    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType); // Call Vehicle constructor
        this.seatCapacity = seatCapacity;
    }

    // Displays car-specific information
    @Override
    void displayInfo() {
        System.out.println("Vehicle Type: Car");
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

/*
 * Truck class extends Vehicle
 * Represents a truck with total load weight
 */
class Truck extends Vehicle {

    // Total weight capacity of the truck
    private int totalWeight;

    // Constructor for Truck
    Truck(int maxSpeed, String fuelType, int totalWeight) {
        super(maxSpeed, fuelType); // Call Vehicle constructor
        this.totalWeight = totalWeight;
    }

    // Displays truck-specific information
    @Override
    void displayInfo() {
        System.out.println("Vehicle Type: Truck");
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Total Weight: " + totalWeight);
    }
}

/*
 * Motorcycle class extends Vehicle
 * Represents a motorcycle with a specific type
 */
class Motorcycle extends Vehicle {

    // Type of motorcycle (example: 1 = Sports, 2 = Cruiser)
    private int type;

    // Constructor for Motorcycle
    Motorcycle(int maxSpeed, String fuelType, int type) {
        super(maxSpeed, fuelType); // Call Vehicle constructor
        this.type = type;
    }

    // Displays motorcycle-specific information
    @Override
    void displayInfo() {
        System.out.println("Vehicle Type: Motorcycle");
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Motorcycle Type: " + type);
    }
}

/*
 * Main class
 * Demonstrates polymorphism using Vehicle references
 */
class Main {

    // Main method – program execution starts here
    public static void main(String[] args) {

        // Array of Vehicle references (polymorphism)
        Vehicle[] vehicles = new Vehicle[3];

        // Storing different subclass objects
        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 8000);
        vehicles[2] = new Motorcycle(140, "Petrol", 2);

        // Loop through vehicles and call overridden methods
        for (Vehicle v : vehicles) {
            v.displayInfo(); // Runtime polymorphism

        }
    }
}
