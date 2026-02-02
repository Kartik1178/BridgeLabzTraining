/* Represents a generic Animal */
class Animal {
    protected String name;
    protected int age;

    // Produces a generic animal sound
    void makeSound() {
        System.out.println("sound");
    }
}

/* Represents a Dog which is a type of Animal */
class Dog extends Animal {

    // Produces a dog-specific sound
    void makeSound() {
        System.out.println("bark");
    }
}

/* Represents a Bird which is a type of Animal */
class Bird extends Animal {

    // Produces a bird-specific sound
    void makeSound() {
        System.out.println("tweet");
    }
}

/* Entry point of the program */
class Main {

    // Program execution starts here
    public static void main(String[] args) {

        Animal a = new Animal();
        a.makeSound();

        Bird b = new Bird();
        b.makeSound();
    }
}
