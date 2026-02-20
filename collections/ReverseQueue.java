import java.util.*;

/*
 * ReverseQueue
 * Reverses a queue using only queue operations (add, remove, isEmpty).
 * Uses recursion to avoid stack data structure explicitly.
 */
public class ReverseQueue {

    // Method to reverse queue using recursion
    public static void reverseQueue(Queue<Integer> queue) {
        if (queue.isEmpty()) return;

        int front = queue.remove();
        reverseQueue(queue);
        queue.add(front);
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(10, 20, 30));
        reverseQueue(queue);
        System.out.println(queue);
    }
}
