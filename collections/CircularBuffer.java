/*
 * CircularBuffer
 * Simulates a fixed-size circular buffer using an array.
 * When buffer is full, new insert overwrites the oldest element.
 */
class CircularBuffer {
    private int[] buffer;
    private int head = 0, size = 0;

    // Constructor to initialize buffer capacity
    public CircularBuffer(int capacity) {
        buffer = new int[capacity];
    }

    // Insert element into circular buffer
    public void insert(int val) {
        buffer[(head + size) % buffer.length] = val;
        if (size < buffer.length) size++;
        else head = (head + 1) % buffer.length;
    }

    // Display current buffer content
    public void printBuffer() {
        for (int i = 0; i < size; i++) {
            System.out.print(buffer[(head + i) % buffer.length] + " ");
        }
        System.out.println();
    }

    // Driver method to test circular buffer
    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.insert(4);
        cb.printBuffer(); // Output: 2 3 4
    }
}