/*
 * User node with friend list
 */
class UserNode {
    int id;
    String name;
    UserNode next;

    UserNode(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

/*
 * Social Media Friend Management
 */
class SocialMedia {

    private UserNode head;

    // Add user
    void addUser(int id, String name) {
        UserNode node = new UserNode(id, name);
        node.next = head;
        head = node;
    }

    // Display users
    void displayUsers() {
        UserNode temp = head;
        while (temp != null) {
            System.out.println(temp.id + " " + temp.name);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        SocialMedia sm = new SocialMedia();
        sm.addUser(1, "Alice");
        sm.addUser(2, "Bob");
        sm.displayUsers();
    }
}
