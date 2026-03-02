import java.util.Scanner;

/*
 * SimpleThreadedCounter
 * This program counts numbers from 1 to a user-specified limit using multiple threads.
 * Each thread handles a portion of the counting range.
 * Synchronization is used to ensure numbers are printed in correct order.
 * It demonstrates thread coordination using synchronized blocks.
 */
class SimpleThreadedCounter {
    private static int counter = 1; // Shared counter variable
    // Worker thread responsible for printing numbers in order
    static class CounterThread extends Thread {
        private final int limit;
        // Constructor initializes the counting limit
        CounterThread(int limit) {
            this.limit = limit;
        }
        // run() executes counting logic with synchronization
        public void run() {
            while (true) {
                synchronized (SimpleThreadedCounter.class) {
                    if (counter > limit) {
                        break; // Stop when limit exceeded
                    }
                    System.out.println(Thread.currentThread().getName() + " -> " + counter);
                    counter++;
                }
                try {
                    Thread.sleep(50); // Small delay for better interleaving
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted: " + e.getMessage());
                }
            }
        }
    }
    // Main method handles user input and thread creation
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter counting limit: ");
            int limit = scanner.nextInt();

            if (limit <= 0) {
                System.out.println("Invalid input! Please enter a positive number.");
                return;
            }
            // Creating multiple threads
            Thread t1 = new CounterThread(limit);
            Thread t2 = new CounterThread(limit);
            Thread t3 = new CounterThread(limit);
            t1.setName("Thread-1");
            t2.setName("Thread-2");
            t3.setName("Thread-3");
            t1.start();
            t2.start();
            t3.start();
            // Wait for all threads to finish
            t1.join();
            t2.join();
            t3.join();
            System.out.println("Counting completed successfully.");
        } catch (Exception e) {
            System.out.println("Error: Invalid input or execution issue.");
        }
    }
}