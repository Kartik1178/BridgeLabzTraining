/*
 * Base class Order
 * Represents a general order with basic details
 */
class Order {

    // Unique order ID
    String orderId;

    // Date when order was placed
    String orderDate;

    // Constructor to initialize order details
    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Returns the current order status
    String getOrderStatus() {
        return "Order Placed";
    }
}

/*
 * Subclass ShippedOrder
 * Adds shipping-related information
 */
class ShippedOrder extends Order {

    // Tracking number for shipment
    String trackingNumber;

    // Constructor to initialize shipped order details
    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    // Returns shipping status
    String getOrderStatus() {
        return "Order Shipped (Tracking No: " + trackingNumber + ")";
    }
}

/*
 * Subclass DeliveredOrder
 * Adds delivery-related information
 */
class DeliveredOrder extends ShippedOrder {

    // Date when order was delivered
    String deliveryDate;

    // Constructor to initialize delivered order details
    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    // Returns delivery status
    String getOrderStatus() {
        return "Order Delivered on " + deliveryDate;
    }
}

/*
 * Main class
 * Demonstrates multilevel inheritance and polymorphism
 */
class Main {

    // Program execution starts here
    public static void main(String[] args) {

        // Creating objects at different levels
        Order o1 = new Order("ORD101", "2024-01-10");
        Order o2 = new ShippedOrder("ORD102", "2024-01-11", "TRK5678");
        Order o3 = new DeliveredOrder("ORD103", "2024-01-12", "TRK9876", "2024-01-15");

        // Polymorphic method calls
        System.out.println(o1.getOrderStatus());
        System.out.println(o2.getOrderStatus());
        System.out.println(o3.getOrderStatus());
    }
}
