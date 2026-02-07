/*
 * Circular Linked List node representing a Task
 */
class TaskNode {
    int id;
    String name;
    int priority;
    TaskNode next;

    TaskNode(int id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }
}

/*
 * Task Scheduler using Circular Linked List
 */
class TaskScheduler {

    private TaskNode head;

    // Add task at end
    void addTask(int id, String name, int priority) {
        TaskNode node = new TaskNode(id, name, priority);
        if (head == null) {
            head = node;
            node.next = head;
            return;
        }
        TaskNode temp = head;
        while (temp.next != head)
            temp = temp.next;
        temp.next = node;
        node.next = head;
    }

    // Display tasks
    void display() {
        if (head == null) return;
        TaskNode temp = head;
        do {
            System.out.println(temp.id + " " + temp.name);
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        TaskScheduler ts = new TaskScheduler();
        ts.addTask(1, "Task1", 1);
        ts.addTask(2, "Task2", 2);
        ts.display();
    }
}
