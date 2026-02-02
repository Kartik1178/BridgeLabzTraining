/*
 * Superclass Device
 * Represents a generic smart home device
 * Contains common attributes shared by all devices
 */
class Device {

    // Unique identifier for the device
    String deviceId;

    // Current status of the device (ON / OFF)
    String status;

    // Constructor to initialize device details
    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Displays the basic status of the device
    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

/*
 * Subclass Thermostat
 * Extends Device and adds temperature-specific behavior
 * Demonstrates single inheritance
 */
class Thermostat extends Device {

    // Temperature setting of the thermostat
    private int temperatureSetting;

    // Constructor to initialize thermostat details
    Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status); // Call Device constructor
        this.temperatureSetting = temperatureSetting;
    }

    // Displays the complete status of the thermostat
    @Override
    void displayStatus() {
        super.displayStatus(); // Display common device details
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

/*
 * Main class
 * Demonstrates single inheritance and method overriding
 */
class Main {

    // Main method – program execution starts here
    public static void main(String[] args) {

        // Creating a Thermostat object using Device reference (polymorphism)
        Device device = new Thermostat("TH-101", "ON", 24);

        // Calling overridden method
        device.displayStatus();
    }
}
