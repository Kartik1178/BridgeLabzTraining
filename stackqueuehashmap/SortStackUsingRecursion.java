import java.util.Stack;

/*
 * SortStackUsingRecursion
 * ----------------------
 * This class demonstrates how to sort a stack
 * using recursion without using any extra
 * data structure.
 *
 * The idea is:
 * 1. Pop elements one by one using recursion
 * 2. Insert each element back into the stack
 *    at its correct sorted position
 */
class SortStackUsingRecursion {

    // This method sorts the stack using recursion
    static void sortStack(Stack<Integer> stack) {

        // Base case: if stack is empty, return
        if (stack.isEmpty()) {
            return;
        }

        // Remove the top element
        int top = stack.pop();

        // Recursively sort the remaining stack
        sortStack(stack);

        // Insert the popped element back in sorted order
        insertElement(stack, top);
    }

    // This method inserts an element into the sorted stack
    static void insertElement(Stack<Integer> stack, int top) {

        // If stack is empty or top element is smaller, push the element
        if (stack.isEmpty() || stack.peek() <= top) {
            stack.push(top);
            return;
        }

        // Remove the top element
        int peek = stack.pop();

        // Recursively find the correct position
        insertElement(stack, top);

        // Push the removed element back
        stack.push(peek);
    }
    //main method for testing
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Original Stack: " + stack);

        sortStack(stack);

        System.out.println("Sorted Stack:   " + stack);
    }
}
