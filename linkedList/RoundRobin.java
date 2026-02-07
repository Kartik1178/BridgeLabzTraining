/*
 * Circular Linked List implementation for
 * Round Robin CPU Scheduling Algorithm
 *
 * Each node represents a process with:
 * - Process ID
 * - Burst Time
 * - Priority
 *
 * The scheduler executes processes in a
 * circular manner using a fixed time quantum.
 */

class Process {

    int pid;
    int burstTime;
    int remainingTime;
    int priority;
    int waitingTime;
    int turnaroundTime;
    Process next;

    // Constructor
    Process(int pid, int burstTime, int priority) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.waitingTime = 0;
        this.turnaroundTime = 0;
        this.next = null;
    }
}

/*
 * Round Robin Scheduler using Circular Linked List
 */
class RoundRobinScheduler {

    private Process head = null;
    private int timeQuantum;

    // Constructor
    RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

    // Add process at end of circular list
    void addProcess(int pid, int burstTime, int priority) {
        Process newProcess = new Process(pid, burstTime, priority);

        if (head == null) {
            head = newProcess;
            newProcess.next = head;
            return;
        }

        Process temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newProcess;
        newProcess.next = head;
    }

    // Remove process by PID
    void removeProcess(int pid) {

        if (head == null)
            return;

        Process curr = head;
        Process prev = null;

        do {
            if (curr.pid == pid) {

                // Single node case
                if (curr.next == curr) {
                    head = null;
                    return;
                }

                // Head removal
                if (curr == head) {
                    prev = head;
                    while (prev.next != head)
                        prev = prev.next;

                    head = head.next;
                    prev.next = head;
                }
                else {
                    prev.next = curr.next;
                }
                return;
            }

            prev = curr;
            curr = curr.next;

        } while (curr != head);
    }

    // Simulate round robin scheduling
    void schedule() {

        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        int currentTime = 0;
        int completedProcesses = 0;
        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;

        Process current = head;

        while (head != null) {

            displayProcesses();

            if (current.remainingTime > 0) {

                int executionTime = Math.min(timeQuantum, current.remainingTime);
                current.remainingTime -= executionTime;
                currentTime += executionTime;

                // Update waiting time of other processes
                Process temp = head;
                do {
                    if (temp != current) {
                        temp.waitingTime += executionTime;
                    }
                    temp = temp.next;
                } while (temp != head);

                // Process completed
                if (current.remainingTime == 0) {
                    current.turnaroundTime = currentTime;
                    totalWaitingTime += current.waitingTime;
                    totalTurnaroundTime += current.turnaroundTime;
                    completedProcesses++;

                    int pidToRemove = current.pid;
                    current = current.next;
                    removeProcess(pidToRemove);
                    continue;
                }
            }

            current = current.next;
        }

        // Display averages
        System.out.println("\nScheduling Complete");
        System.out.println("Average Waiting Time: " +
                (double) totalWaitingTime / completedProcesses);
        System.out.println("Average Turnaround Time: " +
                (double) totalTurnaroundTime / completedProcesses);
    }

    // Display circular queue
    void displayProcesses() {

        if (head == null) {
            System.out.println("Process Queue Empty");
            return;
        }

        Process temp = head;
        System.out.print("Queue: ");

        do {
            System.out.print("[PID " + temp.pid +
                    " | Remaining " + temp.remainingTime + "] -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }

    // Main method for testing
    public static void main(String[] args) {

        RoundRobinScheduler scheduler = new RoundRobinScheduler(4);

        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 5, 2);
        scheduler.addProcess(3, 8, 3);

        scheduler.schedule();
    }
}
