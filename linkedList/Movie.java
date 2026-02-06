class MovieNode{
String movieTitle;
String director;
int yearOfRelease;
MovieNode next;
MovieNode prev;
MovieNode(String movieTitle,String director,int yearOfRelease){
    this.movieTitle=movieTitle;
    this.director=director;
    this.yearOfRelease=yearOfRelease;
    this.next=null;
    this.prev=null;
}
void display(){
    System.out.println("title: "+title);
    System.out.println("director: "+director);
    System.out.println("yearofRelease: "+yearofRelease);
}
}
class MovieDoublyLinkedList{
    private MovieNode head;
    private MovieNode tail;
    void addAtBeginning(String movieTitle,String director,int yearOfRelease){
        MovieNode newNode=new MovieNode(movieTitle, director, yearOfRelease);
        if(head==null){
            head=tail=newNode;
            return;

        }
newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
void addAtEnd(String movieTitle,String director,int yearOfRelease){
        MovieNode newNode=new MovieNode(movieTitle, director, yearOfRelease);
        if(tail==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;

}
void addAtPosition(String movieTitle,String director,int yearOfRelease,int position){
    if (position <= 0) {
        System.out.println("Invalid position!");
        return;
    }
        if(position==1){
            addAtBeginning(movieTitle, director, yearOfRelease);
       return;
        }
MovieNode temp=head;
 for(int i=0;i<position-1&&temp!=null;i++){
temp=temp.next;
 }
 if(temp==null){
     System.out.println("Out of bounds positon");
 return;
 }
 if(temp.next==null){
     addAtEnd(movieTitle, director, yearOfRelease);
 return;
 }
MovieNode newNode=new MovieNode(movieTitle, director, yearOfRelease);
newNode.next=temp.next;
newNode.prev=temp;
temp.next.prev=newNode;
temp.next=newNode;

}
public void removeTitle(String Title){
        if(head==null){
            return null;
        }
        MovieNode temp=head;
        while(temp!=null){
            if(temp.movieTitle.equals(Title)){
                if(temp==head){
                    head=head.next;
                    return;
                }
            if(temp==tail){
                tail=tail.prev;
                return;
            }
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev
            return;
            }
            temp=temp.next;

        }
System.out.println("Title not found");
        return;

}
    public void searchByRating(double rating) {
        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.rating == rating) {
                temp.display();
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("No movies found with rating: " + rating);
        }
    }

    public void updateRating(String title, double newRating) {
        MovieNode temp = head;

        while (temp != null) {
            if (temp.movieTitle().equalsIgnoreCase(title)) {
                temp.rating(newRating);
                System.out.println("Rating updated successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found!");
    }

    // Display forward
    public void displayForward() {
        if (head == null) {
            System.out.println("No movies available.");
            return;
        }

        MovieNode temp = head;
        while (temp != null) {
            temp.display();
            temp = temp.next;
        }
    }

    // Display reverse
    public void displayReverse() {
        if (tail == null) {
            System.out.println("No movies available.");
            return;
        }

        MovieNode temp = tail;
        while (temp != null) {
            temp.display();
            temp = temp.prev;
        }
    }
}

public class MovieManagementSystem {
    public static void main(String[] args) {

        MovieDoublyLinkedList movies = new MovieDoublyLinkedList();

        movies.addAtBeginning("Inception", "Christopher Nolan", 2010, 8.8);
        movies.addAtEnd("Interstellar", "Christopher Nolan", 2014, 8.6);
        movies.addAtEnd("Avatar", "James Cameron", 2009, 7.8);
        movies.addAtPosition(2, "Titanic", "James Cameron", 1997, 7.9);

        System.out.println("\nMovies (Forward):");
        movies.displayForward();

        System.out.println("\nMovies (Reverse):");
        movies.displayReverse();

        System.out.println("\nSearch by Director (Christopher Nolan):");
        movies.searchByDirector("Christopher Nolan");

        System.out.println("\nSearch by Rating (7.8):");
        movies.searchByRating(7.8);

        System.out.println("\nUpdating rating for Avatar:");
        movies.updateRating("Avatar", 8.2);

        System.out.println("\nRemoving Titanic:");
        movies.removeByTitle("Titanic");

        System.out.println("\nFinal Movie List:");
        movies.displayForward();
    }
}