/*
 * Interface Worker
 * Defines work-related behavior
 */
interface Worker {

    // Performs work duties
    void performDuties();
}

/*
 * Base class Person
 * Represents a person in the restaurant
 */
class Person {

    String name;
    int id;

    // Initializes person details
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

/*
 * Chef class
 * Inherits Person and implements Worker
 */
class Chef extends Person implements Worker {

    // Initializes chef details
    Chef(String name, int id) {
        super(name, id);
    }

    // Performs chef duties
    public void performDuties() {
        System.out.println("Chef is preparing food");
    }
}

/*
 * Waiter class
 * Inherits Person and implements Worker
 */
class Waiter extends Person implements Worker {

    // Initializes waiter details
    Waiter(String name, int id) {
        super(name, id);
    }

    // Performs waiter duties
    public void performDuties() {
        System.out.println("Waiter is serving customers");
    }
}
