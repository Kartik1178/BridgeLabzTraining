/*
 * Ticket node using circular linked list
 */
class TicketNode {
    int id;
    String customer, movie;
    TicketNode next;

    TicketNode(int id, String customer, String movie) {
        this.id = id;
        this.customer = customer;
        this.movie = movie;
    }
}

/*
 * Ticket Reservation System
 */
class TicketSystem {

    private TicketNode head;

    // Add ticket
    void addTicket(int id, String customer, String movie) {
        TicketNode node = new TicketNode(id, customer, movie);
        if (head == null) {
            head = node;
            node.next = head;
            return;
        }
        TicketNode temp = head;
        while (temp.next != head)
            temp = temp.next;
        temp.next = node;
        node.next = head;
    }

    // Display tickets
    void displayTickets() {
        if (head == null) return;
        TicketNode temp = head;
        do {
            System.out.println(temp.id + " " + temp.customer + " " + temp.movie);
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        TicketSystem ts = new TicketSystem();
        ts.addTicket(1, "Alice", "Inception");
        ts.addTicket(2, "Bob", "Interstellar");
        ts.displayTickets();
    }
}
