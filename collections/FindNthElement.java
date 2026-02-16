import java.util.*;

/*
 * NthFromEnd
 * Finds the Nth element from end of a LinkedList without calculating size.
 */
public class NthFromEnd {

    // Method to find nth element from end using two-pointer technique
    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        Iterator<T> fast = list.iterator();
        Iterator<T> slow = list.iterator();

        int count = 0;
        while (count < n && fast.hasNext()) {
            fast.next();
            count++;
        }

        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }

        return slow.next();
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A","B","C","D","E"));
        System.out.println(findNthFromEnd(list, 2));
    }
}
