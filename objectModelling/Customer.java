/* Represents Product */
class Product {
    String name;
}

/* Represents Order */
class Order {
    List<Product> products = new ArrayList<>();

    // Adds product to order
    void addProduct(Product p) {
        products.add(p);
    }
}

/* Represents Customer */
class Customer {
    // Places an order
    void placeOrder(Order o) {
        System.out.println("Order placed");
    }
}
