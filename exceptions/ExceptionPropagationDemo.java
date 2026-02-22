/*
 * Class: ExceptionPropagationDemo
 * Demonstrates propagation of exceptions through method calls
 */
public class ExceptionPropagationDemo {
    // Throws ArithmeticException
    static void method1() {
        int x = 10 / 0;
    }
    // Calls method1
    static void method2() {
        method1();
    }
    // Handles propagated exception
    public static void main(String[] args) {
        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}