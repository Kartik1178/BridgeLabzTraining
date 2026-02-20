import java.util.*;

/*
 * StackUsingQueues
 * Implements stack behavior (LIFO) using two queues.
 */
public class StackUsingQueues {

    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    // Push element onto stack
    public void push(int x) {
        q2.add(x);
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Pop element from stack
    public int pop() {
        return q1.remove();
    }

    // Peek top element
    public int top() {
        return q1.peek();
    }

    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
    }
}
