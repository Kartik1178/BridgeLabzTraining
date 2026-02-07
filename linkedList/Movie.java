/*
 * Doubly Linked List node representing a Movie
 */
class MovieNode {
    String title, director;
    int year;
    double rating;
    MovieNode next, prev;

    MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }
}

/*
 * Movie management using doubly linked list
 */
class MovieList {

    private MovieNode head, tail;

    // Add movie at end
    void addMovie(String title, String director, int year, double rating) {
        MovieNode node = new MovieNode(title, director, year, rating);
        if (head == null) {
            head = tail = node;
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    // Remove by title
    void removeMovie(String title) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                if (temp.prev != null) temp.prev.next = temp.next;
                else head = temp.next;

                if (temp.next != null) temp.next.prev = temp.prev;
                else tail = temp.prev;
                return;
            }
            temp = temp.next;
        }
    }

    // Search by director
    void searchByDirector(String director) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.director.equals(director))
                System.out.println(temp.title + " " + temp.rating);
            temp = temp.next;
        }
    }

    // Display forward
    void displayForward() {
        MovieNode temp = head;
        while (temp != null) {
            System.out.println(temp.title + " " + temp.rating);
            temp = temp.next;
        }
    }

    // Display reverse
    void displayReverse() {
        MovieNode temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " " + temp.rating);
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {
        MovieList list = new MovieList();
        list.addMovie("Inception", "Nolan", 2010, 9.0);
        list.addMovie("Interstellar", "Nolan", 2014, 8.8);
        list.displayForward();
        list.displayReverse();
    }
}
