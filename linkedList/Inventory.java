/*
 * Inventory node using singly linked list
 */
class ItemNode {
    int id;
    String name;
    int qty;
    double price;
    ItemNode next;

    ItemNode(int id, String name, int qty, double price) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }
}

/*
 * Inventory Management System
 */
class Inventory {

    private ItemNode head;

    // Add item
    void addItem(int id, String name, int qty, double price) {
        ItemNode node = new ItemNode(id, name, qty, price);
        node.next = head;
        head = node;
    }

    // Total inventory value
    void totalValue() {
        double sum = 0;
        ItemNode temp = head;
        while (temp != null) {
            sum += temp.qty * temp.price;
            temp = temp.next;
        }
        System.out.println("Total Value: " + sum);
    }

    public static void main(String[] args) {
        Inventory inv = new Inventory();
        inv.addItem(1, "Pen", 10, 5);
        inv.addItem(2, "Book", 5, 50);
        inv.totalValue();
    }
}
