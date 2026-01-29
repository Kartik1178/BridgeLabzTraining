/*
 * Manages movie ticket booking
 * and display of ticket details.
 */
public class MovieTicket {

    String movieName;
    int seatNumber;
    double price;
    boolean isBooked;

    // Initializes movie ticket
    MovieTicket(String movieName) {
        this.movieName = movieName;
        this.isBooked = false;
    }

    // Books a movie ticket
    void bookTicket(int seatNumber, double price) {
        if (!isBooked) {
            this.seatNumber = seatNumber;
            this.price = price;
            isBooked = true;
        } else {
            System.out.println("Ticket already booked");
        }
    }

    // Displays ticket details
    void displayTicketDetails() {
        if (isBooked) {
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: " + price);
        } else {
            System.out.println("Ticket not booked yet");
        }
    }

    // Program entry point
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Inception");
        ticket.bookTicket(12, 250);
        ticket.displayTicketDetails();
    }
}
