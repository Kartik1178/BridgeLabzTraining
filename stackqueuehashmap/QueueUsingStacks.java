import java.util.Stack;


/*
 * Queue implementation using two stacks
 */
class QueueUsingStack {
    private Stack<Integer> stackEnq;
    private Stack<Integer> stackDeq;
// Constructor
    QueueUsingStack() {
        stackEnq = new Stack<>();
        stackDeq = new Stack<>();

    }
    // Enqueue operation
    void enqueue(int data) {
        stackEnq.push(data);
    }
    // Dequeue operation
    int dequeue() {
        if (stackEnq.isEmpty() && stackDeq.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        if (stackDeq.isEmpty()) {
            while (!stackEnq.isEmpty()) {
                stackDeq.push(stackEnq.pop());
            }
        }
        return stackDeq.pop();
    }
    // Peek front element
    int peek() {
        if (stackEnq.isEmpty() && stackDeq.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        if (stackDeq.isEmpty()) {
            while (!stackEnq.isEmpty()) {
                stackDeq.push(stackEnq.pop());

            }
        }
        return stackDeq.peek();
    }
    // Check if queue is empty
    boolean isEmpty() {
        return stackEnq.isEmpty() && stackDeq.isEmpty();
    }
    // Main method to test
    public static void main(String[] args) {
    QueueUsingStack queue=new QueueUsingStack();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Front: " + queue.peek());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());

    }
}
