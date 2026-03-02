import java.util.LinkedList;
import java.util.Queue;
/*
 * ProducerConsumerDemo
 * This program demonstrates the Producer-Consumer problem using a shared queue.
 * The producer generates integer tasks and adds them to the queue.
 * The consumer processes tasks by removing them from the queue.
 * Synchronization with wait() and notify() ensures safe communication.
 */
class ProducerConsumerDemo {
    private static final int MAX_SIZE = 5; // Maximum buffer size
    private final Queue<Integer> queue = new LinkedList<>();
    // Producer class generates tasks and adds to shared queue
    class Producer extends Thread {
        // run() continuously produces tasks
        public void run() {
            int value = 1;
            try {
                while (value <= 10) {
                    synchronized (queue) {
                        while (queue.size() == MAX_SIZE) {
                            queue.wait(); // Wait if queue is full
                        }
                        queue.add(value);
                        System.out.println("Produced: " + value);
                        value++;
                        queue.notify(); // Notify consumer
                    }
                    Thread.sleep(100);
                }
            } catch (Exception e) {
                System.out.println("Producer error: " + e.getMessage());
            }
        }
    }

    // Consumer class processes tasks from shared queue
    class Consumer extends Thread {
        // run() continuously consumes tasks
        public void run() {
            try {
                while (true) {
                    synchronized (queue) {
                        while (queue.isEmpty()) {
                            queue.wait(); // Wait if queue is empty
                        }
                        int task = queue.poll();
                        System.out.println("Consumed: " + task);
                        queue.notify(); // Notify producer
                    }
                    Thread.sleep(150);
                }
            } catch (Exception e) {
                System.out.println("Consumer error: " + e.getMessage());
            }
        }
    }

    // Main method initializes and starts producer & consumer threads
    public static void main(String[] args) {
        try {
            ProducerConsumerDemo demo = new ProducerConsumerDemo();
            Producer producer = demo.new Producer();
            Consumer consumer = demo.new Consumer();
            producer.start();
            consumer.start();
            producer.join();
            consumer.interrupt(); // Stop consumer after producer finishes
        } catch (Exception e) {
            System.out.println("Execution error: " + e.getMessage());
        }
    }
}